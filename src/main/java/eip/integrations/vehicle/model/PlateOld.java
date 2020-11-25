package eip.integrations.vehicle.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapperWithID;
import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class PlateOld  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2281302936062096231L;
	@Schema(description = "Vehicle Plate ID", example = "4645555")
    private String id;
    @Schema(description = "Vehicle Plate Number", example = "27151")
    private String number;
    @Schema(description = "Vehicle Plate Status", example = "4")
    private String status;
    @Schema(description = "Plate Status Description", example = "على مركبة")
    private String statusDesc;
    @Schema(description = "Plate Info in Arabic", example = "27151 T خصوصي")
    private String infoAr;
    @Schema(description = "Plate Info in English", example = "27151 Private T")
    private String infoEn;
    @Schema(description = "Vehicle Front Plate Size Id", example = "1")
    private String frontPlateSizeId;
    @Schema(description = "Vehicle Back Plate Size Id", example = "2")
    private String backPlateSizeId;   
    @Schema(description = "Plate Source Details", example = "")
    private LanguageMapperWithID source;
    @Schema(description = "PlateCategory Details", example = "")
    private CategoryAndCode category;
    @Schema(description = "Plate Code Details", example = "")
    private CategoryAndCode code;
}
