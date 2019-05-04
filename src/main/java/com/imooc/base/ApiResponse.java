package com.imooc.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class ApiResponse {

	private int code;

	private String message;

	private Object data;

	private boolean more;

	public ApiResponse(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public ApiResponse() {
		this.code = Status.SUCCESS.getCode();
		this.message = Status.SUCCESS.getMessage();
	}

	public static ApiResponse ofMessage(int code, String message) {
		return new ApiResponse(code, message, null);
	}

	public static ApiResponse ofSuccess(Object data) {
		return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getMessage(), data);
	}

	public static ApiResponse ofStatus(Status status) {
		return new ApiResponse(status.getCode(), status.getMessage(), null);
	}

	@AllArgsConstructor
	@Getter
	public enum Status {
		SUCCESS(200, "OK"),
		BAD_REQUEST(400, "Bad Request"),
		INTERNAL_SERVER_ERROR(500, "Unknow Internal Error"),
		NOT_VALID_PARAM(40005, "Not Valid Params"),
		NOT_SUPPORTED_OPERATION(40006, "Operation Not Supported"),
		NOT_LOGIN(50000, "Not Login")
		;

		private int code;
		private String message;

	}

}
