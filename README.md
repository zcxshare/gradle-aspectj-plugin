# ZcxAspectj
aspectj gradle plugin
ZcxAspectj提供在gradle中使用aspectj编译的插件,让gradle工程支持aop编程,如果仅使用gradle的aspectj插件也可以使用[https://github.com/HujiangTechnology/gradle_plugin_android_aspectjx](https://github.com/HujiangTechnology/gradle_plugin_android_aspectjx "gradle_plugin_android_aspectjx")
# 依赖
项目的根build.gradle中添加
~~~java
buildscript {
    repositories {
        maven { url 'https://www.jitpack.io' }
    }
    dependencies {
        classpath 'com.github.xiaoXiangGuo:ZcxAspectj:1.0.1'
    }
}
~~~
使用aspectj的model的build.gradle中
~~~java
apply plugin: 'zcx-aspectj-plugin'
~~~
# 使用
网上有很多使用教程[https://www.jianshu.com/p/27b997677149](https://www.jianshu.com/p/27b997677149 "AspectJ基本用法"),这里随便找的一个
