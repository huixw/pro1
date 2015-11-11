package com.huixw.web.common;

public interface CommonCode {
	public enum RespCode{
		sucess(200,"成功"),
		fail(500,"失败"),
		process(300,"处理中");
		
		int code;
		String name;
		private RespCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}
}
