import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class GUI extends Application {
	
	//Establish Variables
	private BorderPane root;

	public String dAirport;
	public String dTime;
	public String dWind;
	public String dVis;
	public String dTemp;
	public String dAltimeter;
	public String dDew;
	public String dTower;
	public String dAirportName;
	public String dAirportMap;
	public String dAirportTower;
	public String dAirportARTCC;
	public String dAirportElevation;
	public String dAirportUNICOM;
	public String dAirportATIS;
	public String dAirportGround;
	public String dAirportTowerFreq;

	public String aAirport;
	public String aTime;
	public String aWind;
	public String aVis;
	public String aTemp;
	public String aAltimeter;
	public String aDew;
	public String aTower;
	public String aAirportName;
	public String aAirportMap;
	public String aAirportTower;
	public String aAirportARTCC;
	public String aAirportElevation;
	public String aAirportUNICOM;
	public String aAirportATIS;
	public String aAirportGround;
	public String aAirportTowerFreq;
	
	public String plane;
	public String trueSpeed;
	public String type;
	public String cruiseAlt;
	public String time;
	public String fuel;
	public String passengerWeight;
	public String passengerNumber;
	
	public int timeRisk;
	public int windRisk;
	
	
	
	
	
	
	//Establish Variables
	
	//Establish Application
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	//Create GUI
	@Override
	public void start(Stage primaryStage) {
		
		// create BorderPane
		root = new BorderPane();
		root.setTop(getMenu());
		
		
		//Create Scene
		Scene scene = new Scene(root, 1500, 750);
		primaryStage.setTitle("Flight Project and Risk Assessment Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	//Method for creating the MenuBar
	public MenuBar getMenu() {
		
		//establish MenuBar
		MenuBar menuBar = new MenuBar();
		
		//Departure Begin
		Menu menuDeparture = new Menu("Departure Information");
		MenuItem editDeparture = new MenuItem("Edit Information");
		menuDeparture.getItems().add(editDeparture);
		
		//Manage button click
		editDeparture.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsDeparture());
			}
		});
		//Departure End
		
		//Arrival Begin
		Menu menuArrival = new Menu("Arrival Information");
		MenuItem editArrival = new MenuItem("Edit Information");
		menuArrival.getItems().add(editArrival);
		
		//Manage button click
		editArrival.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsArrival());
			}
		});
		//Arrival End
		
		//Flight Begin
		Menu menuFlight = new Menu("Flight Information");
		MenuItem editFlight = new MenuItem("Edit Information");
		menuFlight.getItems().add(editFlight);
		
		//Manage button click
		editFlight.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsFlight());
			}
		});
		//Flight End
		
		//Pilot Begin
		Menu menuPilot = new Menu("Pilot Information");
		MenuItem editPilot = new MenuItem("Edit Information");
		menuPilot.getItems().add(editPilot);
		
		//Manage button click
		editPilot.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsPilot());
			}
		});
		//Pilot End
		
		//Display Begin
		Menu menuDisplayInfo = new Menu("Simulation");
		MenuItem runSim = new MenuItem("Run Simulation");
		menuDisplayInfo.getItems().add(runSim);
		
		//Manage button click
		runSim.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setCenter(getSimInfo());	
			}
		});
		//Display End
		
		//Add all buttons to the MenuBar field
		menuBar.getMenus().addAll(menuDeparture, menuArrival, menuFlight, menuPilot, menuDisplayInfo);
		
		//Return the establish MenuBar
		return menuBar;
	}
	
	//Method for gathering Departure Data
	public HBox getInputsDeparture() {
		
		//Establish Departure HBox
		HBox hbox = new HBox();
		
		//Establish Depature VBox
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		//Create Section Label
		Text text = new Text("Departure Information");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(text);
		
		//Create ComboBox for the possible airports
		ComboBox<String> dAirportFld = new ComboBox<>();
		dAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		vbox.getChildren().addAll(new Label("Departure Airport:"), dAirportFld);
		
		//Entry Field for departure Time
		TextField dTimeFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Time (24hr 0000):"), dTimeFld);
		
		//Entry Field for departure Wind
		TextField dWindFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Wind (KNOTS):"), dWindFld);
		
		//Entry Field for departure Visibility
		TextField dVisibilityFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Visibility (Nautical Miles):"), dVisibilityFld);
		
		//Entry Field for departure Temperature
		TextField dTempFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Temperature (Degrees F):"), dTempFld);
		
		//Entry Field for departure Altimeter
		TextField dAltimeterFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Altimeter (Feet):"), dAltimeterFld);
		
		//Entry Field for departure Dew
		TextField dDewFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Dew Point (Degrees F):"), dDewFld);
		
		//Create button for saving data
		Button dSaveBtn = new Button("Save Information");
		vbox.getChildren().add(dSaveBtn);
		
		//Collect the inputed data
		dSaveBtn.setOnAction(e -> {
			dAirport = dAirportFld.getValue();
			dTime = dTimeFld.getText();
			dWind = dWindFld.getText();
			dVis = dVisibilityFld.getText();
			dTemp = dTempFld.getText();
			dAltimeter = dAltimeterFld.getText();
			dDew = dDewFld.getText();
		});
		
		//create a scrollpane and embed the vbox
		ScrollPane scroll = new ScrollPane(vbox);
		
		//add fields to hbox
		hbox.getChildren().addAll(scroll, new Separator(Orientation.VERTICAL));
		
		//return hbox to gui contstructor
		return hbox;
	}
	
	//Mehtod for gathering Arrival Data
	public HBox getInputsArrival() {
		
		//Establish Hbox
		HBox hbox = new HBox();
		
		//Establish Vbox
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		//Create section label
		Text text = new Text("Arrival Information");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(text);
		
		//Create ComboBox for possible airports
		ComboBox<String> aAirportFld = new ComboBox<>();
		aAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		vbox.getChildren().addAll(new Label("Arrival Airport:"), aAirportFld);
		
		//Entry Field for Arrival Time
		TextField aTimeFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Time:"), aTimeFld);
		
		//Entry Field for Arrival Wind
		TextField aWindFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Wind:"), aWindFld);
		
		//Entry Field for Arrival Visibility
		TextField aVisibilityFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Visibility:"), aVisibilityFld);
		
		//Entry Field for Arrival Temperature
		TextField aTempFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Temperature:"), aTempFld);
		
		//Entry Field for Arrival Altimeter
		TextField aAltimeterFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Altimeter:"), aAltimeterFld);
		
		//Entry Field for Arrival Dew
		TextField aDewFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Dew Point:"), aDewFld);
		
		//Create button for saving data entries
		Button aSaveBtn = new Button("Save Information");
		vbox.getChildren().add(aSaveBtn);
		
		//Collect inputed data
		aSaveBtn.setOnAction(e -> {
			aAirport = aAirportFld.getValue();
			aTime = aTimeFld.getText();
			aWind = aWindFld.getText();
			aVis = aVisibilityFld.getText();
			aTemp = aTempFld.getText();
			aAltimeter = aAltimeterFld.getText();
			aDew = aDewFld.getText();
		});
		
		//Create ScrollPane and add entry vbox
		ScrollPane scroll = new ScrollPane(vbox);
		
		//Add scrollpane with entry fields to hbox
		hbox.getChildren().addAll(scroll, new Separator(Orientation.VERTICAL));
		
		//Return hbox to GUI contstructor
		return hbox;
	}
	
	//Method for gathering Flight Data
	public HBox getInputsFlight() {
		
		HBox hbox = new HBox();
		
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		Text text = new Text("Flight Information");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(text);
		
		
		ComboBox<String> planeFld = new ComboBox<>();
		planeFld.getItems().addAll("737-700","737-800", "737-900ER", "747-400", "747-800", "777-300ER","787-800", "787-900", "787-10", "A320", "A330", "A350", "A380", "CRJ200", "ERJ-190");
		vbox.getChildren().addAll(new Label("Plane Used:"), planeFld);
		
		TextField trueSpeedFld = new TextField();
		vbox.getChildren().addAll(new Label("True Airspeed:"), trueSpeedFld);
		
		TextField typeFld = new TextField();
		vbox.getChildren().addAll(new Label("Type Of Flight:"), typeFld);
		
		TextField cruiseAltFld = new TextField();
		vbox.getChildren().addAll(new Label("Cruising Altitude:"), cruiseAltFld);
		
		TextField timeFld = new TextField();
		vbox.getChildren().addAll(new Label("Flight Time:"), timeFld);
		
		TextField fuelFld = new TextField();
		vbox.getChildren().addAll(new Label("Fuel On Board:"), fuelFld);
		
		TextField passengerWeightFld = new TextField();
		vbox.getChildren().addAll(new Label("Passenger Weight:"), passengerWeightFld);
		
		TextField passengerNumberFld = new TextField();
		vbox.getChildren().addAll(new Label("Passenger Number:"), passengerNumberFld);
		
		Button fSaveBtn = new Button("Save Information");
		vbox.getChildren().add(fSaveBtn);
		
		fSaveBtn.setOnAction(e -> {
			plane = planeFld.getValue();
			trueSpeed = trueSpeedFld.getText();
			type = typeFld.getText();
			cruiseAlt = cruiseAltFld.getText();
			time = timeFld.getText();
			fuel = fuelFld.getText();
			passengerWeight = passengerWeightFld.getText();
			passengerNumber = passengerNumberFld.getText();
		});
		
		
		ScrollPane scroll = new ScrollPane(vbox);
		
		hbox.getChildren().addAll(scroll, new Separator(Orientation.VERTICAL));
		
		return hbox;
	}
	
	//Method for gathering Pilot Data
	public HBox getInputsPilot() {
		
		HBox hbox = new HBox();
		
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		Text text = new Text("Pilot Information");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(text);
		
		
		TextField dualsoloFld = new TextField();
		vbox.getChildren().addAll(new Label("Dual or Solo:"), dualsoloFld);
		
		TextField daynightFld = new TextField();
		vbox.getChildren().addAll(new Label("Day or Night"), daynightFld);
		
		TextField ratingFld = new TextField();
		vbox.getChildren().addAll(new Label("Rating held"), ratingFld);
		
		TextField restFld = new TextField();
		vbox.getChildren().addAll(new Label("Rest in the last 24hr"), restFld);
		
		TextField ceilingFld = new TextField();
		vbox.getChildren().addAll(new Label("Allowed Cieling"), ceilingFld);
		
		TextField hrsTypeFld = new TextField();
		vbox.getChildren().addAll(new Label("Hours aircraft type"), hrsTypeFld);
		
		TextField hrsDaysFld = new TextField();
		vbox.getChildren().addAll(new Label("Hours in the last 90 days"), hrsDaysFld);
		
		TextField totalHrsFld = new TextField();
		vbox.getChildren().addAll(new Label("Total flight hours"), totalHrsFld);
		
		Button pSaveBtn = new Button("Save Information");
		vbox.getChildren().add(pSaveBtn);
		
		ScrollPane scroll = new ScrollPane(vbox);
		
		hbox.getChildren().addAll(scroll, new Separator(Orientation.VERTICAL));
		
		return hbox;
	}

	//Method for gathering and displaying all of the information
	public BorderPane getSimInfo() {
		
		BorderPane borderPane = new BorderPane();
		
		//Orient Layout of main Components
		VBox vBoxInfoDepart = new VBox(10);
		vBoxInfoDepart.setAlignment(Pos.TOP_LEFT);
		
		VBox vBoxInfoArrival = new VBox(10);
		vBoxInfoArrival.setAlignment(Pos.CENTER_LEFT);
		
		VBox vBoxRiskAssign = new VBox(10);
		vBoxRiskAssign.setAlignment(Pos.TOP_RIGHT);
		
		VBox vBoxInfo = new VBox(40);
		
		//Create the tile of the information
		Text titleText = new Text(10, 50, "Flight From " + dAirport + " To " + aAirport);
		titleText.setFont(new Font(20));
		borderPane.setTop(titleText);
		borderPane.setAlignment(titleText, Pos.CENTER);
		
		//DEPARTURE INFORMATION`
		vBoxInfoDepart = DepartureInfo();
		//DEPARTURE INFORMATION
		
		//ARRIVAL INFORMAITON
		vBoxInfoArrival = ArrivalInfo();
		//ARRIVAL INFORMATION
		
		//Risk Assignment
		vBoxRiskAssign = RiskAssignment();
		//Risk Assignment
		
		vBoxInfo.getChildren().addAll(vBoxInfoDepart, vBoxInfoArrival);	
		borderPane.setLeft(vBoxInfo);
		
		//Return the information to the GUI constructor
		return borderPane;
	}
	
	//Method for collecting the Departure Airport Information
	public VBox DepartureInfo() {
		
		VBox DepartureInfo = new VBox(10);
		
		Button departureMapBtn = new Button();
		departureMapBtn.setMinHeight(100);
		departureMapBtn.setMinWidth(100);
		
		//Get the Airport Information from the respected array
		String[] dAirportInfo;
		dAirportInfo = Airport.airportInfo(dAirport); 	
		String dAirportMapBtn;
		dAirportMapBtn = Airport.airportMap(dAirport);
		
		//Assign information to variable
		dAirportName = dAirportInfo[0];
		dAirportMap = dAirportInfo[1];
		dAirportTower = dAirportInfo[2];
		dAirportARTCC = dAirportInfo[3];
		dAirportElevation = dAirportInfo[4];
		dAirportUNICOM = dAirportInfo[5];
		dAirportATIS = dAirportInfo[6];
		dAirportGround = dAirportInfo[7];
		dAirportTowerFreq = dAirportInfo[8];
		departureMapBtn.setStyle(dAirportMapBtn);

		//Departure Map
		Text departAirportText = new Text(dAirportName);
		departAirportText.setFont(Font.font("Arial", FontWeight.BOLD, 12));
		
		departureMapBtn.setOnAction(e -> {
			Stage stage = new Stage();
			
			Image image = new Image(dAirportMap);
			ImageView imageView = new ImageView(image);
			imageView.setFitHeight(1000);
			imageView.setFitWidth(800);
			StackPane Image = new StackPane();
			
			Scene scene2 = new Scene(Image, 800, 1000);
			Image.getChildren().add(imageView);
			
			stage.setScene(scene2);
			stage.setTitle(dAirport);
			stage.show();
			
		});
		Text dTowerText = new Text("ATC Tower: " + dAirportTower);
		Text dARTCCText = new Text("ARTCC: " + dAirportARTCC);
		Text dElevationText = new Text("Airport Elevation: " + dAirportElevation);
		Text dUnicomText = new Text("Unicom Frequency: " + dAirportUNICOM);
		Text dAtisText = new Text("Atis Frequency: " + dAirportATIS);
		Text dGroundText = new Text("Ground Frequency: " + dAirportGround);
		Text dTowerFreqText = new Text("Tower Frequency: " + dAirportTowerFreq);
		
		DepartureInfo.getChildren().addAll(departAirportText, departureMapBtn, dTowerText, dARTCCText, dElevationText, dUnicomText, dAtisText, dGroundText, dTowerFreqText);
		
		return DepartureInfo;
	}

	//Method for collecting the Arrival Airport Information
	public VBox ArrivalInfo() {
		
		VBox ArrivalInfo = new VBox(10);
		
		Button arrivalMapBtn = new Button();
		arrivalMapBtn.setMinHeight(100);
		arrivalMapBtn.setMinWidth(100);
		
		String[] aAirportInfo;
		aAirportInfo = Airport.airportInfo(aAirport);
		
		String aAirportMapBtn;
		aAirportMapBtn = Airport.airportMap(aAirport);
		
		aAirportName = aAirportInfo[0];
		aAirportMap = aAirportInfo[1];
		aAirportTower = aAirportInfo[2];
		aAirportARTCC = aAirportInfo[3];
		aAirportElevation = aAirportInfo[4];
		aAirportUNICOM = aAirportInfo[5];
		aAirportATIS = aAirportInfo[6];
		aAirportGround = aAirportInfo[7];
		aAirportTowerFreq = aAirportInfo[8];
		arrivalMapBtn.setStyle(aAirportMapBtn);
		
		//Arrival Map
		Text arrivalAirportText = new Text(aAirportName);
		arrivalAirportText.setFont(Font.font("Arial", FontWeight.BOLD, 12));
		arrivalMapBtn.setOnAction(e -> {
			Stage stage = new Stage();
			
			Image image = new Image(aAirportMap);
			ImageView imageView = new ImageView(image);
			imageView.setFitHeight(1000);
			imageView.setFitWidth(800);
			StackPane Image = new StackPane();
			
			Scene scene2 = new Scene(Image, 800, 1000);
			Image.getChildren().add(imageView);
			
			stage.setScene(scene2);
			stage.setTitle(dAirport);
			stage.show();
			
		});
		Text aTowerText = new Text("ATC Tower: " + aAirportTower);
		Text aARTCCText = new Text("ARTCC: " + aAirportARTCC);
		Text aElevationText = new Text("Airport Elevation: " + aAirportElevation);
		Text aUnicomText = new Text("UNICOM Frequency: " + aAirportUNICOM);
		Text aAtisText = new Text("ATIS Frequency: " + aAirportATIS);
		Text aGroundText = new Text("Ground Frequency: " + aAirportGround);
		Text aTowerFreqText = new Text("Tower Frequency: " + aAirportTowerFreq);
		
		
		ArrivalInfo.getChildren().addAll(arrivalAirportText, arrivalMapBtn, aTowerText, aARTCCText, aElevationText, aUnicomText, aAtisText, aGroundText, aTowerFreqText);
		
		return ArrivalInfo;
	}
	
	public VBox RiskAssignment() {
		
		VBox vBoxRisk = new VBox(10);
		
		int DTime = Integer.parseInt(dTime);
		int ATime = Integer.parseInt(aTime);
		
		if (DTime < 0600 && ATime < 0600) {
			timeRisk = 5;
			//System.out.println("Night Flight");
		} else if (DTime < 0600 && ATime > 0600) {
			timeRisk = 3;
			//System.out.println("Partial Night Flight");
		} else if (DTime > 0600 && DTime < 2000 && ATime > 0600 && ATime < 2000) {
			timeRisk = 0;
			//System.out.println("Day flight");
		} else if (DTime > 0600 || DTime < 2000 && ATime > 2000) {
			timeRisk = 3;
			//System.out.println("Partial Night Flight");
		} else if (DTime > 2000 && ATime > 2000 || ATime < 0600) {
			timeRisk = 5;
			//System.out.println("Night Flight");
		} else {
			//System.out.println("Enter correct value");
		}
			
		
		int DWind = Integer.parseInt(dWind);
		int AWind = Integer.parseInt(aWind);
		
		if (DWind > 15 && AWind > 15) {
			windRisk = 4;
			//System.out.println("High Wind");
		} else if (DWind > 15 && AWind < 15) {
			windRisk = 2;
			//System.out.println("High D Wind");
		} else if (DWind < 15 && AWind > 15) {
			windRisk = 2;
			//System.out.println("High A Wind");
		} else if (DWind < 15 && AWind < 15) {
			windRisk = 0;
			//System.out.println("Low Wind");
		}
		
		
		return vBoxRisk;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}