package shehe.cache.annotation;


import shehe.cache.support.CacheScopeEnum;

import java.lang.annotation.*;

/**
 * 缓存注解
 * @author guoxk
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {


    /**
     * 缓存前缀
     */
    String prefix() default "";


    /**
     * 缓存范围，默认级别JVM
     */
    CacheScopeEnum scope() default CacheScopeEnum.JVM;

    /**
     * 缓存key值，支持spel表达式
     */
    String key();

    /**
     * 缓存过期时间
     */
    int ttl() default 0;

}


