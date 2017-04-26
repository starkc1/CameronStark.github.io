package application;
public class Plane {
	
	public static String[] planeInfo(String planeName) {
		
		String[] plane = null;
		
		switch (planeName) {
			case "737-700":
				plane = PlaneInfo.B737_700;
				break;
				
			case "737-800":
				plane = PlaneInfo.B737_800;
				break;
				
			case "737-900ER":
				plane = PlaneInfo.B737_900ER;
				break;
				
			case "747-400":
				plane = PlaneInfo.B747_400;
				break;
				
			case "747-800":
				plane = PlaneInfo.B747_800;
				break;
				
			case "777-300ER":
				plane = PlaneInfo.B777_300ER;
				break;
				
			case "787-800":
				plane = PlaneInfo.B787_800;
				break;
				
			case "787-900":
				plane = PlaneInfo.B787_900;
				break;
				
			case "787-10":
				plane = PlaneInfo.B787_10;
				break;
				
			case "A320":
				plane = PlaneInfo.A320;
				break;
				
		}
		
		
		return plane;
	}
}