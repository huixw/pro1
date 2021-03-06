package com.huixw.web.common;

public class IResult<T> {
	private CommonCode.RespCode code;
	private String message;
	private T data;
	
	public IResult(CommonCode.RespCode code) {
		this.code = code;
	}
	public IResult(CommonCode.RespCode code , T data) {
		this.code = code;
		this.data = data;
	}
	
	public static <D> IResult<D> createSucc(D data) {
		return new IResult<D>(CommonCode.RespCode.sucess, data);
	}
	
	public CommonCode.RespCode getCode(){
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Object getData(){
		return data;
	}
}
