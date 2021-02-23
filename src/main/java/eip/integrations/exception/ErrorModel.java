package eip.integrations.exception;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorModel {
    
    private String httpCode;
	private String httpMessage;
	private String moreInformation;	
}
