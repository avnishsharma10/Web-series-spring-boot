package com.webseries.Exception;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(WebseriesException.class)
	public @ResponseBody ErrorInfo handler(WebseriesException exp,HttpServletRequest request)
	{
		LocalDateTime timestamp=LocalDateTime.now();
		String message=exp.getMessage();
		String uri=request.getRequestURI();
		ErrorInfo error=new ErrorInfo(timestamp,message,uri);
		return error;
	}

	

}
