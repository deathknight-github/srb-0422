package com.atguigu.common.exception;

import com.atguigu.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Slf4j
public abstract class Assert {
    public static void notNull(Object object, ResponseEnum responseEnum) {
        if (object == null) {
            log.debug(object + "的值为空......");
            throw new BusinessException(responseEnum);
        }
    }
}
