package application;

public class Distances {
	
	public static int distanceInfo(String dAirport, String aAirport) {
		
		int Distance = 0;
		
		if ((dAirport == "KDAB" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KDAB;
		} else if ((dAirport == "KDAB" && aAirport == "KDCA") || (dAirport == "KDCA" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KDCA;
		} else if ((dAirport == "KDAB" && aAirport == "KTPA") || (dAirport == "KTPA" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KTPA;
		} else if ((dAirport == "KDAB" && aAirport == "KMCO") || (dAirport == "KMCO" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KMCO;
			
			
			
			
		} else if ((dAirport == "KMCO" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KMCO;
		} else if ((dAirport == "KMCO" && aAirport == "KTPA") || (dAirport == "KTPA" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KTPA;
		} else if ((dAirport == "KMCO" && aAirport == "KDCA") || (dAirport == "KDCA" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KDCA;
			
			
			
		} else if ((dAirport == "KDCA" && aAirport == "KCA")) {
			Distance = DistanceInfo.KDCA_KDCA;
		} else if ((dAirport == "KDCA" && aAirport == "KTPA") || (dAirport == "KTPA" && aAirport == "KDCA")) {
			Distance = DistanceInfo.KDCA_KTPA;
		
		
		} else if ((dAirport == "KTPA" && aAirport == "KTPA")) {
			Distance = DistanceInfo.KTPA_KTPA;
		}
		
		
		
		return Distance;
	}
	
}