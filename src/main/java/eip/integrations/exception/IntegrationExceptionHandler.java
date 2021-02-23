package eip.integrations.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import eip.integrations.constants.Constants;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class IntegrationExceptionHandler {

    @ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorModel> commonException(Exception ex, WebRequest req) {
		ErrorModel errorResponse = new ErrorModel("500", Constants.INTERNAL_SERVER_ERROR, ex.getMessage());
		ex.printStackTrace();
		return new ResponseEntity<ErrorModel>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler({ NoHandlerFoundException.class, NotFoundException.class })
	public ResponseEntity<ErrorModel> httpException(Exception ex, WebRequest req) {
		ErrorModel errorResponse = new ErrorModel("404", Constants.NOT_FOUND, ex.getMessage());
		return new ResponseEntity<ErrorModel>(errorResponse, HttpStatus.NOT_FOUND);
	}
}