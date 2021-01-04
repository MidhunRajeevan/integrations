package eip.integrations.shared.model;

import java.io.Serializable;

import eip.integrations.agency.model.Location;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Address implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Schema(description = "Address Label", example = "work")
  private String label;

  @Schema(description = "Address Text", example = "Emarat Atrium Building, Block B, 3rd floor")
  private LanguageMapper address;

  @Schema(description = "Makani Number", example = "24330 87031")
  private String makani;

  @Schema(description = "PO Box Number", example = "9226")
  private String poBox;

  @Schema(description = "Area", example = "Al Wasl")
  private CodeName area;

  @Schema(description = "Sub Area", example = "Al Wasl")
  private CodeName subArea;

  @Schema(description = "Community", example = "232")
  private CodeName community;

  @Schema(description = "Unit Number", example = "Block B")
  private CodeName unit;

  @Schema(description = "Building Name", example = "Emarat Atrium Building")
  private CodeName building;

  @Schema(description = "Street Name", example = "Street 45")
  private CodeName street;

  @Schema(description = "City Name")
  private CodeName city;

  @Schema(description = "Region")
  private CodeName region;

  @Schema(description = "Country")
  private CodeName country;

  @Schema(description = "Postal Code", example = "9226")
  private String postalCode;

  @Schema(description = "Emirate")
  private CodeName emirate;

  @Schema(description = "Geolocation")
  private Location geoLocation;

  @Schema(description = "Preferred Phone Flag", example = "true")
  private Boolean preferred;
}
