# gradle-aspectj-plugin
gradle-aspectj-plugin提供在gradle中使用aspectj编译的插件,让gradle工程支持aop编程,如果仅使用gradle的aspectj插件也可以使用[https://github.com/HujiangTechnology/gradle_plugin_android_aspectjx](https://github.com/HujiangTechnology/gradle_plugin_android_aspectjx "gradle_plugin_android_aspectjx")
# 依赖[![](https://jitpack.io/v/zcxshare/gradle-aspectj-plugin.svg)](https://jitpack.io/#zcxshare/gradle-aspectj-plugin)
项目的根build.gradle中添加
~~~java
buildscript {
    repositories {
        maven { url 'https://www.jitpack.io' }
    }
    dependencies {
        classpath 'com.github.zcxshare:gradle-aspectj-plugin:1.0.3'
    }
}
~~~
**(注:或者直接只添加classpath 'com.github.zcxshare:aspectj_plugin:1.0.3'也可以)**

使用aspectj的model的build.gradle中
~~~java
apply plugin: 'aspectj-plugin'

android {
    compileOptions {//防止报android N的错
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
~~~

# 使用
网上有很多使用教程[https://www.jianshu.com/p/27b997677149](https://www.jianshu.com/p/27b997677149 "AspectJ基本用法"),这里随便找的一个
