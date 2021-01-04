package eip.integrations.agency.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyLicenseAddress {
	
	@Schema(description = "Parcel Id", example = "12")
	private String parcelId;
	@Schema(description = "Address")
	private String address;
	@Schema(description = "Area Name", example = "ÏíÑÉ")
	private String area;
	@Schema(description = "Sub Area Name", example = "ÚíÇá äÇÕÑ")
	private String subArea;
	@Schema(description = "Community", example = "abc")
	private String community;
	@Schema(description = "Unit Name", example = "abc")
	private String unit;
	@Schema(description = "Unit Number", example = "12")
	private String unitNumber;
	@Schema(description = "Building Number", example = "12")
	private String buildingNumber;
	@Schema(description = "Building Name", example = "abc")
	private String building;
	@Schema(description = "Street No", example = "12")
	private String streetNumber;
	@Schema(description = "Street Name", example = "abc")
	private String street;
	@Schema(description = "Longitude", example = "123")
	private String longitude;
	@Schema(description = "Latitude", example = "123")
	private String latitude;
	@Schema(description = "QR Code", example = "aweqe32x32423s")
	private String qRCode;
	@Schema(description = "Rent Contract Number", example = "1323")
	private String rentContractNo;

}
