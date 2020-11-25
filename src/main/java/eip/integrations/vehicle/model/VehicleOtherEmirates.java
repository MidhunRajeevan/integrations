package eip.integrations.vehicle.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;

@lombok.Data
public class VehicleOtherEmirates {
    
    @Schema(description = "Traffic File Number", example = "50015305")
    @NotNull
	private String trafficFileNumber;
    @Valid
    @NotEmpty
	private List<RequriedVehicleInfoOtherEmirates> vehicleInfo;
}