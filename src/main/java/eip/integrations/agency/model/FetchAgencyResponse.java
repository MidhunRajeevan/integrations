package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.Response;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class FetchAgencyResponse  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7134247986293710538L;
	private Response response;
	private AgencyInfo agencyInfo;

}
