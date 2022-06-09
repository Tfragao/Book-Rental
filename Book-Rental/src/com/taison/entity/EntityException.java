package com.taison.entity;

public class EntityException extends RuntimeException {
	
	private static final long serialVersionUID = 710074885445174180L;

	public EntityException() {
		super();
		
	}

	public EntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public EntityException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EntityException(String message) {
		super(message);
		
	}

	public EntityException(Throwable cause) {
		super(cause);
		
	}


}
