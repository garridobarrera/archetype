#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exception;

public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = -1377320326421132805L;
	
	public BusinessException(String message){
		super(message);
	}
	
	 public BusinessException(String message, Throwable cause) {
	        super(message, cause);
	    }
	
	
}
