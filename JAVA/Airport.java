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
		}
		
		
		return airport;
	}
	
	public static String airportMap(String airportName) {
		
		String airportMap = null;
		
		switch (airportName) {
		
		case "KDAB" :
			String[] KDAB = AirportInfo.kdabArray;
			airportMap = "-fx-background-image: url(images/KDAB.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
		
		case "KTPA" :
			String[] KTPA = AirportInfo.ktpaArray;
			airportMap = "-fx-background-image: url(images/KTPA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
		
		case "KDCA" :
			String[] KDCA = AirportInfo.kdcaArray;
			airportMap = "-fx-background-image: url(images/KDCA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;
		
		case "KMCO" :
			String[] KMCO = AirportInfo.kmcoArray;
			airportMap = "-fx-background-image: url(images/KMCO.jpg); -fx-background-size: 400px 400px; -fx-background-position: center";
			break;	
	}
		
		
		return airportMap;
	}
	
}
