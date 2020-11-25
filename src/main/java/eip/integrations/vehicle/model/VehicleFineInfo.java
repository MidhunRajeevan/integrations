package eip.integrations.vehicle.model;

import eip.integrations.shared.model.CodeName;
import eip.integrations.shared.model.LanguageMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleFineInfo {
	  private String Id;
    private String ticketNo;
    private String ticketDate;
    private String ticketTime;
    private String ticketFine;
    private String totalTicketFine;
    private String penaltyFine;
    private String isPayable;
    private Plate plate;
    private CodeName location;
    private String regulations;
    private String insideDubai;
    private String knowledgeFee;
    private String vehicleSpeed;
    private String ticketDescription;
    private String ticketTypeNo;
    private String ticketType;
    private String ticketAmount;
    private String ticketStatus;
    private LanguageMapper ticketStatusDesc;
    private String ticketStatusDate;
    private String createdBy;
    private String creationDate;
}
