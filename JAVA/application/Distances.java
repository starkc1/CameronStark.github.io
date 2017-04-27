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
		} else if ((dAirport == "KDAB" && aAirport == "KSEA") || (dAirport == "KSEA" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KSEA;
		} else if ((dAirport == "KDAB" && aAirport == "KPHX") || (dAirport == "KPHX" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KPHX;
		} else if ((dAirport == "KDAB" && aAirport == "KEWR") || (dAirport == "KEWR" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KEWR;
		} else if ((dAirport == "KDAB" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KDAB")) {
			Distance = DistanceInfo.KDAB_KMCI;
			
			
			
		} else if ((dAirport == "KMCO" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KMCO;
		} else if ((dAirport == "KMCO" && aAirport == "KTPA") || (dAirport == "KTPA" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KTPA;
		} else if ((dAirport == "KMCO" && aAirport == "KDCA") || (dAirport == "KDCA" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KDCA;
		} else if ((dAirport == "KMCO" && aAirport == "KSEA") || (dAirport == "KSEA" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KSEA;
		} else if ((dAirport == "KMCO" && aAirport == "KPHX") || (dAirport == "KPHX" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KPHX;
		} else if ((dAirport == "KMCO" && aAirport == "KEWR") || (dAirport == "KEWR" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KEWR;
		} else if ((dAirport == "KMCO" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KMCO")) {
			Distance = DistanceInfo.KMCO_KMCI;
			
			

		} else if ((dAirport == "KDCA" && aAirport == "KCA")) {
			Distance = DistanceInfo.KDCA_KDCA;
		} else if ((dAirport == "KDCA" && aAirport == "KTPA") || (dAirport == "KTPA" && aAirport == "KDCA")) {
			Distance = DistanceInfo.KDCA_KTPA;
		} else if ((dAirport == "KDCA" && aAirport == "KSEA") || (dAirport == "KSEA" && aAirport == "KDCA")) {
			Distance = DistanceInfo.KDCA_KSEA;
		}  else if ((dAirport == "KDCA" && aAirport == "KPHX") || (dAirport == "KPHX" && aAirport == "KDCA")) {
			Distance = DistanceInfo.KDCA_KPHX;
		} else if ((dAirport == "KDCA" && aAirport == "KEWR") || (dAirport == "KEWR" && aAirport == "KDCA")) {
			Distance = DistanceInfo.KDCA_KEWR;
		} else if ((dAirport == "KDCA" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KDCA")) {
			Distance = DistanceInfo.KDCA_KMCI;
			
			
		} else if ((dAirport == "KTPA" && aAirport == "KTPA")) {
			Distance = DistanceInfo.KTPA_KTPA;
		} else if ((dAirport == "KTPA" && aAirport == "KSEA") || (dAirport == "KSEA" && aAirport == "KTPA")) {
			Distance = DistanceInfo.KTPA_KSEA;
		} else if ((dAirport == "KTPA" && aAirport == "KPHX") || (dAirport == "KPHX" && aAirport == "KTPA")) {
			Distance = DistanceInfo.KTPA_KPHX;
		} else if ((dAirport == "KTPA" && aAirport == "KEWR") || (dAirport == "KEWR" && aAirport == "KTPA")) {
			Distance = DistanceInfo.KTPA_KEWR;
		} else if ((dAirport == "KTPA" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KTPA")) {
			Distance = DistanceInfo.KTPA_KMCI;
			
			
			
			
		} else if ((dAirport == "KSEA" && aAirport == "KSEA")) {
			Distance = DistanceInfo.KSEA_KSEA;
		} else if ((dAirport == "KSEA" && aAirport == "KPHX") || (dAirport == "KPHX" && aAirport == "KSEA")) {
			Distance = DistanceInfo.KSEA_KPHX;
		} else if ((dAirport == "KSEA" && aAirport == "KEWR") || (dAirport == "KEWR" && aAirport == "KSEA")) {
			Distance = DistanceInfo.KSEA_KEWR;
		} else if ((dAirport == "KSEA" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KSEA")) {
			Distance = DistanceInfo.KSEA_KMCI;
			
			
		} else if ((dAirport == "KPHX" && aAirport == "KPHX")) {
			Distance = DistanceInfo.KPHX_KPHX;
		} else if ((dAirport == "KPHX" && aAirport == "KEWR") || (dAirport == "KEWR" && aAirport == "KPHX")) {
			Distance = DistanceInfo.KPHX_KEWR;
		} else if ((dAirport == "KPHX" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KPHX")) {
			Distance = DistanceInfo.KPHX_KMCI; 
			
			
			
		} else if ((dAirport == "KEWR" && aAirport == "KEWR")) {
			Distance = DistanceInfo.KEWR_KEWR;
		} else if ((dAirport == "KEWR" && aAirport == "KMCI") || (dAirport == "KMCI" && aAirport == "KEWR")) {
			Distance = DistanceInfo.KEWR_KMCI;
			
			
		} else if ((dAirport == "KMCI" && aAirport == "KMCI")) {
			Distance = DistanceInfo.KMCI_KMCI;
		}
		

			
			
			
			
			
			
			
			
			
		
		
		return Distance;
	}
	
}