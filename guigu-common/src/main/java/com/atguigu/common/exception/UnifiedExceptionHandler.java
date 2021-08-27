package com.atguigu.common.exception;

import com.atguigu.common.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Slf4j
@Component
@RestControllerAdvice
public class UnifiedExceptionHandler {
    @ExceptionHandler(Exception.class)
    public R handlerException(Exception e){
        log.debug(e.getMessage());
        return R.error();
    }
    @ExceptionHandler(BusinessException.class)
    public R handlerBusinessException(BusinessException e){
        log.debug(e.getMessage());
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}
