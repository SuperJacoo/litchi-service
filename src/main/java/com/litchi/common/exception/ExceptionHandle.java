package com.litchi.common.exception;

import com.litchi.bean.vo.Result;
import com.litchi.common.constant.ResultCodeMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gehuadong
 * @create 2018-05-23 15:40
 **/
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        if (e instanceof RuntimeException){
            CheckException checkException = (CheckException)e;
            return Result.error(checkException.getCode().toString(),checkException.getMessage());
        }
        logger.error("系统异常：{}",e);
        return Result.error(ResultCodeMenu.NKNOW_ERROR.getCode(),ResultCodeMenu.NKNOW_ERROR.getMessage());
    }
}
