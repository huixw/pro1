package com.huixw.web.common;

public interface CommonCode {
	public enum RespCode{
		sucess(200,"�ɹ�"),
		fail(500,"ʧ��"),
		process(300,"������");
		
		int code;
		String name;
		private RespCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}
}
