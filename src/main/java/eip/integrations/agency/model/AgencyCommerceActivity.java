package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapperWithID;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyCommerceActivity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1718951075648757232L;
	@Schema(description = "Agency Commerce Activity Code", example = "513933")
	private String activityCode;
	@Schema(description = "Agency Commerce Activity Code description in Arabic", example = "ÊÌÇÑÉ áÚÈ ÇáÇØÝÇá")
	private String nameAr;
	@Schema(description = "Agency Commerce Activity Code description in English", example = "Toys &amp; Games Trading")
	private String nameEn;
	private LanguageMapperWithID status;
	@Schema(description = "Agency Commerce Activity Cancel Date", example = "1991-10-14T00:00:00+04:00")
	private String cancelDatetime;
	@Schema(description = "Agency Commerce Activity Added Date", example = "1991-10-14T00:00:00+04:00")
	private String addDatetime;

}
