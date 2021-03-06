package com.github.xsonorg.generator;

import com.github.xsonorg.XsonException;

public class XsonGeneratorException extends XsonException {

	private static final long serialVersionUID = -4218548535452419428L;

	public XsonGeneratorException(String message) {
		super(message);
	}

	public XsonGeneratorException(Throwable cause) {
		super(cause);
	}

	public XsonGeneratorException(String message, Throwable cause) {
		super(message, cause);
	}

}
