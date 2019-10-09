package com.zcx.zcxaspectj.aspect;

import android.util.Log;

import com.zcx.zcxaspectj.anno.TestA;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * author:  zhouchaoxiang
 * date:    2019/9/30
 * explain:
 */
@Aspect
public class TestAspect {
    private static final String TAG = "TestAspect";

    @Pointcut("execution(@com.zcx.zcxaspectj.anno.TestA * * (..)) " +
            "&& @annotation(com.zcx.zcxaspectj.anno.TestA)")
    public void requestPermissionPointcut() {
    }

    @Around("requestPermissionPointcut()")
    public void requestPermissionAround(final ProceedingJoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        TestA testA = signature.getMethod().getAnnotation(TestA.class);
        Log.i(TAG, "requestPermissionAround: 进入切面 value:"+testA.value());
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
             //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
