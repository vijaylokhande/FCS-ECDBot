package com.fcs.ecdb.exception;

public class WrongCaptchaException extends Exception {
	private static final long serialVersionUID = -2713680888455001581L;

	public WrongCaptchaException(String s) {
		super(s);
	}
}
