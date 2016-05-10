package com.minglangx.springmvc.exception;


/**
 * 

　　* @ClassName: BusinessException

　　* @Description: (异常信息类)

　　* @author minglangx

　　* @date 2016年5月10日 下午5:31:32

　　*


　　
 */
public class BusinessException extends Exception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BusinessException(String message) {
		super();
		this.message = message;
	}
	
	
}
