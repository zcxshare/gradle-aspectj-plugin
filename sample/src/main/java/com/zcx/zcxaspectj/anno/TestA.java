package com.zcx.zcxaspectj.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author:  zhouchaoxiang
 * date:    2019/9/30
 * explain: 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@Documented
public    @interface TestA {
    String value();
}
