package eip.integrations.agency.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eip.integrations.agency.model.AgencyInfo;
import eip.integrations.agency.service.AgencyService;
import io.swagger.v3.oas.annotations.Operation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class AgencyAPI {

	private static final Logger LOG = LogManager.getLogger(AgencyAPI.class);
    
    @Autowired
    private AgencyService agencyService;
    
    @GetMapping("/commericalinstitue-details/{trafficFileNumber}/agencies/{tradeLicenseNumber}")
	@Operation(summary = "Get Agency Details From TIBCO CommericalInstitueDetails")
	public ResponseEntity<AgencyInfo> getCommericalInstitueDetails(@PathVariable long trafficFileNumber,@PathVariable String tradeLicenseNumber)
			throws ParseException {
				LOG.info("Entering getCommericalInstitueDetails trafficFileNumber" + trafficFileNumber);
		return new ResponseEntity<AgencyInfo>(agencyService.getCommericalInstitueDetails(trafficFileNumber,tradeLicenseNumber), HttpStatus.OK);
	}
}
