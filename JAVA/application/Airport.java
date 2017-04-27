package application;
public class Airport {
	
	public static String[] airportInfo(String airportName) {
		
		String[] airport = null;
		
		switch (airportName) {
		
			case "KDAB" :
				String[] KDAB = AirportInfo.kdabArray;
				airport = KDAB;
				break;
			
			case "KTPA" :
				String[] KTPA = AirportInfo.ktpaArray;
				airport = KTPA;
				break;
			
			case "KDCA" :
				String[] KDCA = AirportInfo.kdcaArray;
				airport = KDCA;
				break;
			
			case "KMCO" :
				String[] KMCO = AirportInfo.kmcoArray;
				airport = KMCO;
				break;	
			
			case "KSEA" :
				String[] KSEA = AirportInfo.kseaArray;
				airport = KSEA;
				break;
			
			case "KPHX" :
				String[] KPHX = AirportInfo.kphxArray;
				airport = KPHX;
				break;
			
			case "KEWR" :
				String[] KEWR = AirportInfo.kewrArray;
				airport = KEWR;
				break;
			
			case "KMCI" :
				String[] KMCI = AirportInfo.kmciArray;
				airport = KMCI;
				break;
		}
		
		
		return airport;
	}
	
	public static String airportMap(String airportName) {
		
		String airportMap = null;
		
		switch (airportName) {
		
		case "KDAB" :
			airportMap = "-fx-background-image: url(images/KDAB.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
		
		case "KTPA" :
			airportMap = "-fx-background-image: url(images/KTPA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
		
		case "KDCA" :
			airportMap = "-fx-background-image: url(images/KDCA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
		
		case "KMCO" :
			airportMap = "-fx-background-image: url(images/KMCO.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;	

		case "KSEA" :
			airportMap = "-fx-background-image: url(images/KSEA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
			
		case "KPHX" :
			airportMap = "-fx-background-image: url(images/KPHX.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
			
		case "KEWR" :
			airportMap = "-fx-background-image: url(images/KMCO.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
			
		case "KMCI" :
			airportMap = "-fx-background-image: url(images/KMCO.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
	}
		
		
		return airportMap;
	}
	
}
