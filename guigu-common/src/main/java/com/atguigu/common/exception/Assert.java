package com.atguigu.common.exception;

import com.atguigu.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Slf4j
public abstract class Assert {
    public static void notNull(Object object, ResponseEnum responseEnum) {
        if (object == null) {
            log.info(object + "的值为空......");
            throw new BusinessException(responseEnum);
        }
    }


    /**
     * 断言对象为空
     * 如果对象obj不为空，则抛出异常
     * @param object
     * @param responseEnum
     */
    public static void isNull(Object object, ResponseEnum responseEnum) {
        if (object != null) {
            log.info("obj is not null......");
            throw new BusinessException(responseEnum);
        }
    }

    /**
     * 断言表达式为真
     * 如果不为真，则抛出异常
     *
     * @param expression 是否成功
     */
    public static void isTrue(boolean expression, ResponseEnum responseEnum) {
        if (!expression) {
            log.info("fail...............");
            throw new BusinessException(responseEnum);
        }
    }

    /**
     * 断言两个对象不相等
     * 如果相等，则抛出异常
     * @param m1
     * @param m2
     * @param responseEnum
     */
    public static void notEquals(Object m1, Object m2,  ResponseEnum responseEnum) {
        if (m1.equals(m2)) {
            log.info("equals...............");
            throw new BusinessException(responseEnum);
        }
    }

    /**
     * 断言两个对象相等
     * 如果不相等，则抛出异常
     * @param m1
     * @param m2
     * @param responseEnum
     */
    public static void equals(Object m1, Object m2,  ResponseEnum responseEnum) {
        if (!m1.equals(m2)) {
            log.info("not equals...............");
            throw new BusinessException(responseEnum);
        }
    }

    /**
     * 断言参数不为空
     * 如果为空，则抛出异常
     * @param s
     * @param responseEnum
     */
    public static void notEmpty(String s, ResponseEnum responseEnum) {
        if (StringUtils.isEmpty(s)) {
            log.info("is empty...............");
            throw new BusinessException(responseEnum);
        }
    }
}
