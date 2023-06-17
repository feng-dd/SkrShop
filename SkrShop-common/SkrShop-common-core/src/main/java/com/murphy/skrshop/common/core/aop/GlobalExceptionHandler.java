package com.murphy.skrshop.common.core.aop;

import com.murphy.skrshop.common.core.enums.ResponseStatusEnum;
import com.murphy.skrshop.common.core.vo.BasicResultVO;
import lombok.extern.slf4j.Slf4j;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义错误处理器，除了授权只要请求服务器成功，就返回200，错误根据错误码前端进行处理
 *
 * @author FrozenWatermelon
 * @date 2020/7/11
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class})
    public BasicResultVO<List<String>> methodArgumentNotValidExceptionHandler(Exception e) {
        log.error("methodArgumentNotValidExceptionHandler", e);
        List<FieldError> fieldErrors = null;
        if (e instanceof MethodArgumentNotValidException) {
            fieldErrors = ((MethodArgumentNotValidException) e).getBindingResult().getFieldErrors();
        }
        if (e instanceof BindException) {
            fieldErrors = ((BindException) e).getBindingResult().getFieldErrors();
        }
        if (fieldErrors == null) {
            return BasicResultVO.fail(ResponseStatusEnum.METHOD_ARGUMENT_NOT_VALID.getMsg());
        }

        List<String> defaultMessages = new ArrayList<>(fieldErrors.size());
        for (FieldError fieldError : fieldErrors) {
            defaultMessages.add(fieldError.getField() + ":" + fieldError.getDefaultMessage());
        }
        return BasicResultVO.fail(ResponseStatusEnum.METHOD_ARGUMENT_NOT_VALID, defaultMessages);
    }

//	@ExceptionHandler({ HttpMessageNotReadableException.class })
//	public ResponseEntity<BasicResultVO<List<FieldError>>> methodArgumentNotValidExceptionHandler(
//			HttpMessageNotReadableException e) {
//		log.error("methodArgumentNotValidExceptionHandler", e);
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(BasicResultVO.fail(ResponseStatusEnum.HTTP_MESSAGE_NOT_READABLE));
//	}

//	@ExceptionHandler(Mall4cloudException.class)
//	public ResponseEntity<ServerResponseEntity<Object>> mall4cloudExceptionHandler(Mall4cloudException e) {
//		logger.error("mall4cloudExceptionHandler", e);
//
//		ResponseEnum responseEnum = e.getResponseEnum();
//		// 失败返回失败消息 + 状态码
//		if (responseEnum != null) {
//			return ResponseEntity.status(HttpStatus.OK).body(ServerResponseEntity.fail(responseEnum, e.getObject()));
//		}
//		// 失败返回消息 状态码固定为直接显示消息的状态码
//		return ResponseEntity.status(HttpStatus.OK).body(ServerResponseEntity.showFailMsg(e.getMessage()));
//	}
//
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ServerResponseEntity<Object>> exceptionHandler(Exception e) throws TransactionException {
//		logger.error("exceptionHandler", e);
//		logger.info("RootContext.getXID(): " + RootContext.getXID());
//		if (StrUtil.isNotBlank(RootContext.getXID())) {
//			GlobalTransactionContext.reload(RootContext.getXID()).rollback();
//		}
//		return ResponseEntity.status(HttpStatus.OK).body(ServerResponseEntity.fail(ResponseEnum.EXCEPTION));
//	}
}
