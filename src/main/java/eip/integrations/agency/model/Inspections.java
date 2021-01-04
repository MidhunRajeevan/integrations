package eip.integrations.agency.model;

import java.io.Serializable;

import eip.integrations.shared.model.LanguageMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Inspections implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7628569137402721210L;
	private LanguageMapper inspectorName;
	@Schema(description = "Agency  Inspections inspectionDate ", example = "2020-12-12")
	private String inspectionDate;
	@Schema(description = "Agency  Inspections rentedVehicleCount ", example = "12")
	private int rentedVehicleCount;
	@Schema(description = "Agency  Inspections availableVehicleCount ", example = "10")
	private int availableVehicleCount;
	@Schema(description = "Agency  Inspections lentVehicleCount ", example = "10")
	private int lentVehicleCount;
	@Schema(description = "Agency  Inspections nrvVehicleCount ", example = "10")
	private int nrvVehicleCount;
	@Schema(description = "Agency  Inspections maintenanceVehicleCount ", example = "10")
	private int maintenanceVehicleCount;
	@Schema(description = "Agency  Inspections regExpiredVehicleCount ", example = "10")
	private int regExpiredVehicleCount;
	@Schema(description = "Agency  Inspections totalVehicleCount ", example = "10")
	private int totalVehicleCount;	
	@Schema(description = "Agency  Inspections contractCount ", example = "10")
	private int contractCount;	
	@Schema(description = "Agency  Inspections inspectionFollowUpDate ", example = "inspectionFollowUpDate")
	private int inspectionFollowUpDate;	
	@Schema(description = "Agency  Inspections remarks ", example = "Remark")
	private String remarks;	
	@Schema(description = "Agency  Inspections defectCategory ", example = "Top")
	private String defectCategory;	
	@Schema(description = "Agency  Inspections defectName ", example = "defectName")
	private String defectName;	
	@Schema(description = "Agency  Organization location ", example = "Dubail")
	private String location;

}
