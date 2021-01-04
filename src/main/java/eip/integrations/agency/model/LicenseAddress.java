package eip.integrations.agency.model;

import javax.xml.bind.JAXBElement;

import ae.rta.activematrix.degintegration.tradelicense._1_0.*;

@lombok.Data
public class LicenseAddress {
	private JAXBElement<String> ParcelID;
	private JAXBElement<String> Address ;
	private Area Area;
	private SubArea SubArea; 
	private Community Community;
	private Unit Unit;
	private Building Building;
	private Street Street;
	private JAXBElement<String> Longitude;
	private JAXBElement<String> Latitude;
	private JAXBElement<String>  QRCode;
	private JAXBElement<String> RentContractNo;

}
