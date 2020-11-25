package eip.integrations.vehicle.model;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class VehicleCategory  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6551950078832286048L;
	@Schema(description = "Category ID",example = "1")
	private int id;
	@Schema(description = "Category Name in English",example = "XYZ")
	private String nameEn;
	@Schema(description = "Category Name in Arabic",example = "XYZA")
	private String nameAr;
	private VehicleCategoryDetails categoryDetails;
	private String createdBy;
	@Schema(description = "Created Time",example = "2006-07-02T00:00:00.000Z")
	private Date createdTime;
	@Schema(description = "Updated By",example = "4321")
	private String updatedBy;
	@Schema(description = "Updated Time",example = "2006-07-02T00:00:00.000Z")
	private Date updatedTime;
}
