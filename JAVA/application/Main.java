package application;


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


public class Main extends Application {
	
	//Establish Variables
	private BorderPane root;

	public String dAirport;
	public String dTime;
	public String dWind;
	public String dVis;
	public String dCeil;
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
	public String dAirportInternational;

	public String aAirport;
	public String aTime;
	public String aWind;
	public String aVis;
	public String aCeil;
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
	public String aAirportInternational;
	
	public String plane;
	public String trueSpeed;
	public String type;
	public String cruiseAlt;
	public String time;
	public String fuel;
	public String passengerWeight;
	public String passengerNumber;
	public String planeName;
	public String planeCrew;
	public String planeLength;
	public String planeSpan;
	public String planeWidth;
	public String planeMaxLandWeight;
	public String planeMaxTakeOffWeight;
	public String planeTakeOffDis;
	public String planeRange;
	
	public String crewNumber;
	public String rating;
	public String rest;
	public String ceiling;
	public String hrsType;
	public String hrsDays;
	public String totalHrs;
	
	public int timeRisk;
	public int windRisk;
	public int visRisk;
	public int tempRisk;
	public int typeRisk;
	public int hrsDaysRisk;
	public int crewNumRisk;
	public int flightRisk;
	public int restRisk;
	public int airportTowerRisk;
	public int airportElevRisk;
	public int internationalRisk;
	public int weatherRisk;
	public int ceilingRisk;
	public int dewRisk;
	
	
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
		Scene scene = new Scene(root, 1100, 750);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		
		primaryStage.setTitle("Flight Projection and Risk Assessment Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	//Method for creating the MenuBar
	public MenuBar getMenu() {
		
		//estabslish MenuBar
		MenuBar menuBar = new MenuBar();
		Label Temp = new Label("Fill out Departure, Arrival, Flight and Pilot Information, then run simulation");
		Temp.setId("Temp");
		root.setCenter(Temp);
		
		//Departure Begin
		Menu menuDeparture = new Menu(""); 

	    Label departure = new Label("Departure Information");
	    menuDeparture.setGraphic(departure);
	    departure.setId("departure");
		
	    
		MenuItem editDeparture = new MenuItem("");
		
		Label editD = new Label("Edit Information");
		editD.setId("editD");
		editDeparture.setGraphic(editD);
		menuDeparture.getItems().add(editDeparture);
		
		//Manage button click
		editDeparture.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsDeparture());
			}
		});
		//Departure End
		
		//Arrival Begin
		Menu menuArrival = new Menu("");
		
		Label arrival = new Label("Arrival Information");
		menuArrival.setGraphic(arrival);
		arrival.setId("arrival");
		
		MenuItem editArrival = new MenuItem("");
		
		Label editA = new Label("Edit Information");
		editArrival.setGraphic(editA);
		menuArrival.getItems().add(editArrival);
		
		
		//Manage button click
		editArrival.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsArrival());
			}
		});
		//Arrival End
		
		//Flight Begin
		Menu menuFlight = new Menu("");
		
		Label flight = new Label("Flight Information");
		menuFlight.setGraphic(flight);
		flight.setId("flight");
		
		MenuItem editFlight = new MenuItem("");
		
		Label editF = new Label("Edit Information");
		editFlight.setGraphic(editF);
		menuFlight.getItems().add(editFlight);
		
		//Manage button click
		editFlight.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsFlight());
			}
		});
		//Flight End
		
		//Pilot Begin
		Menu menuPilot = new Menu("");
		
		Label pilot = new Label("Pilot Information");
		menuPilot.setGraphic(pilot);
		pilot.setId("pilot");
		
		MenuItem editPilot = new MenuItem("");
		
		Label editP = new Label("Edit Information");
		editPilot.setGraphic(editP);
		menuPilot.getItems().add(editPilot);
		
		//Manage button click
		editPilot.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(getInputsPilot());
			}
		});
		//Pilot End
		
		//Display Begin
		Menu menuDisplayInfo = new Menu("");
		
		Label info = new Label("Simulation");
		menuDisplayInfo.setGraphic(info);
		info.setId("info");
		
		MenuItem runSim = new MenuItem("");
		
		Label run = new Label("Run Simulation");
		runSim.setGraphic(run);
		menuDisplayInfo.getItems().add(runSim);
		
		//Manage button click
		runSim.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setLeft(null);
				root.setCenter(getSimInfo());	
			}
		});
		//Display End
		
		//Add all buttons to the MenuBar field
		menuBar.getMenus().addAll(menuDeparture, menuArrival, menuFlight, menuPilot, menuDisplayInfo);
		
		
		

		
		//Return the established MenuBar
		return menuBar;
	}
	
	//Method for gathering Departure Data
	public HBox getInputsDeparture() {
		
		//Establish Departure HBox
		HBox hbox = new HBox();
		hbox.setId("dHbox");
		
		//Establish Depature VBox
		VBox vbox = new VBox(15);
		vbox.setId("dVbox");
		vbox.setPadding(new Insets(10));
		
		//Create Section Label
		Label title = new Label("Departure Information");
		title.setId("dTitle");
		vbox.getChildren().add(title);
		
		//Create ComboBox for the possible airports
		ComboBox<String> dAirportFld = new ComboBox<>();
		dAirportFld.setId("dDropdown");
		dAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		Label dairport = new Label("Departure Airport");
		dairport.setId("dairport");
		vbox.getChildren().addAll(dairport, dAirportFld);
		
		//Entry Field for departure Time
		TextField dTimeFld = new TextField();
		dTimeFld.setId("dTimeFld");
		Label dtime = new Label("Departure Time (24hr 0000)");
		dtime.setId("dtime");
		vbox.getChildren().addAll(dtime, dTimeFld);
		
		//Entry Field for departure Wind
		TextField dWindFld = new TextField();
		dWindFld.setId("dWindFld");
		Label dwind = new Label("Departure Wind (KNOTS)");
		dwind.setId("dwind");
		vbox.getChildren().addAll(dwind, dWindFld);
		
		//Entry Field for departure Visibility
		TextField dVisibilityFld = new TextField();
		dVisibilityFld.setId("dVisibilityFld");
		Label dvis = new Label("Departure Visibility (Nautical Miles)");
		dvis.setId("dvis");
		vbox.getChildren().addAll(dvis, dVisibilityFld);
		
		TextField dCeilingFld = new TextField();
		dCeilingFld.setId("dCeilingFld");
		Label dceil = new Label("Departure Ceiling (Feet)");
		dceil.setId("dceil");
		vbox.getChildren().addAll(dceil, dCeilingFld);
		
		//Entry Field for departure Temperature
		TextField dTempFld = new TextField();
		dTempFld.setId("dTempFld");
		Label dtemp = new Label("Departure Temperature (Degrees F)");
		dtemp.setId("dtemp");
		vbox.getChildren().addAll(dtemp, dTempFld);
		
		//Entry Field for departure Altimeter
		TextField dAltimeterFld = new TextField();
		dAltimeterFld.setId("dAltimeterFld");
		Label dalt = new Label("Departure Altimeter (Feet)");
		dalt.setId("dalt");
		vbox.getChildren().addAll(dalt, dAltimeterFld);
		
		//Entry Field for departure Dew
		TextField dDewFld = new TextField();
		dDewFld.setId("dDewFld");
		Label ddew = new Label("Departure Dew Point (Degrees F)");
		ddew.setId("ddew");
		vbox.getChildren().addAll(ddew, dDewFld);
		
		//Create button for saving data
		Button dSaveBtn = new Button("Save Information");
		dSaveBtn.setId("dSaveBtn");
		vbox.getChildren().add(dSaveBtn);
		
		//Collect the inputed data
		dSaveBtn.setOnAction(e -> {
			dAirport = dAirportFld.getValue();
			dTime = dTimeFld.getText();
			dWind = dWindFld.getText();
			dVis = dVisibilityFld.getText();
			dCeil = dCeilingFld.getText();
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
		hbox.setId("aHbox");
		
		//Establish Vbox
		VBox vbox = new VBox(15);
		vbox.setId("aVbox");
		vbox.setPadding(new Insets(10));
		
		//Create section label
		Label title = new Label("Arrival Information");
		title.setId("aTitle");
		vbox.getChildren().add(title);
		
		//Create ComboBox for possible airports
		ComboBox<String> aAirportFld = new ComboBox<>();
		aAirportFld.setId("aDropdown");
		aAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		Label aairport = new Label("Arrival Airport");
		aairport.setId("aairport");
		vbox.getChildren().addAll(aairport, aAirportFld);
		
		//Entry Field for Arrival Time
		TextField aTimeFld = new TextField();
		aTimeFld.setId("aTimeFld");
		Label atime = new Label("Arrival Time (24hr 0000)");
		atime.setId("atime");
		vbox.getChildren().addAll(atime, aTimeFld);
		
		//Entry Field for Arrival Wind
		TextField aWindFld = new TextField();
		aWindFld.setId("aWindFld");
		Label awind = new Label("Arrival Wind (KNOTS)");
		awind.setId("awind");
		vbox.getChildren().addAll(awind, aWindFld);
		
		//Entry Field for Arrival Visibility
		TextField aVisibilityFld = new TextField();
		aVisibilityFld.setId("aVisibilityFld");
		Label avis = new Label("Arrival Visibility (Nautical Miles)");
		avis.setId("avis");
		vbox.getChildren().addAll(avis, aVisibilityFld);
		
		//Entry Field for Arrival Ceiling
		TextField aCeilingFld = new TextField();
		aCeilingFld.setId("aCeilingFld");
		Label aceil = new Label("Arrival Ceiling (Feet)");
		aceil.setId("aceil");
		vbox.getChildren().addAll(aceil, aCeilingFld);
		
		//Entry Field for Arrival Temperature
		TextField aTempFld = new TextField();
		aTempFld.setId("aTempFld");
		Label atemp = new Label("Arrival Temperature (Degreess F)");
		atemp.setId("atemp");
		vbox.getChildren().addAll(atemp, aTempFld);
		
		//Entry Field for Arrival Altimeter
		TextField aAltimeterFld = new TextField();
		aAltimeterFld.setId("aAltimeterFld");
		Label aalt = new Label("Arrival Altimeter (Feet)");
		aalt.setId("aalt");
		vbox.getChildren().addAll(aalt, aAltimeterFld);
		
		//Entry Field for Arrival Dew
		TextField aDewFld = new TextField();
		aDewFld.setId("aDewFld");
		Label adew = new Label("Arrival Dew Point (Degrees F)");
		adew.setId("adew");
		vbox.getChildren().addAll(adew, aDewFld);
		
		//Create button for saving data entries
		Button aSaveBtn = new Button("Save Information");
		aSaveBtn.setId("aSaveBtn");
		vbox.getChildren().add(aSaveBtn);
		
		//Collect inputed data
		aSaveBtn.setOnAction(e -> {
			aAirport = aAirportFld.getValue();
			aTime = aTimeFld.getText();
			aWind = aWindFld.getText();
			aVis = aVisibilityFld.getText();
			aCeil = aCeilingFld.getText();
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
		vbox.getChildren().addAll(new Label("True Airspeed (KNOTS):"), trueSpeedFld);
		
		TextField typeFld = new TextField();
		vbox.getChildren().addAll(new Label("Type Of Flight (VFR or IFR):"), typeFld);
		
		TextField cruiseAltFld = new TextField();
		vbox.getChildren().addAll(new Label("Cruising Altitude (Feet):"), cruiseAltFld);
		
		TextField timeFld = new TextField();
		vbox.getChildren().addAll(new Label("Flight Time (hrs):"), timeFld);
		
		TextField fuelFld = new TextField();
		vbox.getChildren().addAll(new Label("Fuel On Board (Gallons):"), fuelFld);
		
		TextField passengerWeightFld = new TextField();
		vbox.getChildren().addAll(new Label("Passenger Weight (lbs):"), passengerWeightFld);
		
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
		
		TextField ratingFld = new TextField();
		vbox.getChildren().addAll(new Label("Rating held (Private, Instrument, etc.)"), ratingFld);
		
		TextField restFld = new TextField();
		vbox.getChildren().addAll(new Label("Rest in the last 24hr"), restFld);
		
		TextField hrsTypeFld = new TextField();
		vbox.getChildren().addAll(new Label("Hours aircraft type"), hrsTypeFld);
		
		TextField hrsDaysFld = new TextField();
		vbox.getChildren().addAll(new Label("Hours in the last 90 days"), hrsDaysFld);
		
		TextField totalHrsFld = new TextField();
		vbox.getChildren().addAll(new Label("Total flight hours"), totalHrsFld);
		
		Button pSaveBtn = new Button("Save Information");
		vbox.getChildren().add(pSaveBtn);
		
		pSaveBtn.setOnAction(e -> {
			crewNumber = dualsoloFld.getText();
			rating = ratingFld.getText();
			rest = restFld.getText();
			hrsType = hrsTypeFld.getText();
			hrsDays = hrsDaysFld.getText();
			totalHrs = totalHrsFld.getText();
		});
		
		
		
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
		
		VBox vBoxPlaneInfo = new VBox(10);
		vBoxPlaneInfo.setAlignment(Pos.TOP_LEFT);
		
		VBox vBoxRiskAssign = new VBox(10);
		vBoxRiskAssign.setAlignment(Pos.TOP_CENTER);
		
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
		
		//PLANE INFORMATION
		vBoxPlaneInfo = PlaneInfo();
		
		//Risk Assignment
		vBoxRiskAssign = RiskAssignment();
		//Risk Assignment
		
		vBoxInfo.getChildren().addAll(vBoxInfoDepart, vBoxInfoArrival);	
		borderPane.setLeft(vBoxInfo);
		borderPane.setRight(vBoxPlaneInfo);
		
		BorderPane centerPane = new BorderPane();
		centerPane.setCenter(vBoxRiskAssign);
		borderPane.setCenter(centerPane);
		
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
		dAirportInternational = dAirportInfo[9];
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
		aAirportInternational = aAirportInfo[9];
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
	
	public VBox PlaneInfo() {
		
		VBox PlaneInfo = new VBox(10);
		
		String[] planeInfo;
		planeInfo = Plane.planeInfo(plane);
		
		planeName = planeInfo[0];
		planeCrew = planeInfo[1];
		planeLength = planeInfo[2];
		planeSpan = planeInfo[3];
		planeWidth = planeInfo[4];
		planeMaxLandWeight = planeInfo[5];
		planeMaxTakeOffWeight = planeInfo[6];
		planeTakeOffDis = planeInfo[7];
		planeRange = planeInfo[8];
		
		Text planeText = new Text(planeName);
		planeText.setFont(Font.font("Arial", FontWeight.BOLD, 12));
		
		Text planeCrewText = new Text("Crew: " + planeCrew);
		Text planeLengthText = new Text("Plane Length: " + planeLength);
		Text planeSpanText = new Text("Plane Wing Span: " + planeSpan);
		Text planeWidthText = new Text("Plane Fuesalge Width: " + planeWidth);
		Text planeLandWeightText = new Text("Plane Max Landing Weight: " + planeMaxLandWeight);
		Text planeTakeWeightText = new Text("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
		Text planeTakeDisText = new Text("Plane Take Off Distance: " + planeTakeOffDis);
		Text planeRangeText = new Text("Plane Range: " + planeRange);
		
		
		
		PlaneInfo.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
		
		return PlaneInfo;
	}
	
	//Method for Assigning risk to the parameters
	public VBox RiskAssignment() {
		
		VBox vBoxRisk = new VBox(10);
		
		timeRisk = TimeRisk();		
		windRisk = WindRisk();		
		visRisk = VisRisk();		
		tempRisk = TempRisk();		
		typeRisk = TypeRisk();		
		hrsDaysRisk = FlightTimeDaysRisk();	
		crewNumRisk = CrewRisk();	
		flightRisk = FlightTimeRisk();
		restRisk = RestTimeRisk();
		airportTowerRisk = TowerRisk();
		airportElevRisk = ElevationRisk();
		internationalRisk = InternationalRisk();
		ceilingRisk = CeilingRisk();
		dewRisk = DewRisk();
		
		int totalRisk;
		totalRisk = timeRisk + windRisk + visRisk + tempRisk + typeRisk + hrsDaysRisk + crewNumRisk + 
				flightRisk + restRisk + airportTowerRisk + airportElevRisk + internationalRisk + ceilingRisk
				+ dewRisk;
		
		Text totalRiskText = new Text("    The Total Flight Risk is: " + totalRisk);
		
		String risk = null;
		if (totalRisk < 7){
			risk = "    Flight Risk is Minimal";
			
		} else if (totalRisk >= 7 && totalRisk <= 10) {
			risk = "    Flight Risk is Low";
			
		} else if (totalRisk >= 11 && totalRisk <= 15) {
			risk = "    Flight Risk is Medium";
			
		} else if (totalRisk > 15) {
			risk = "    Flight Risk is High";
		}
		Text riskAdvisement = new Text(risk);
		
		Text timeRiskText = new Text("    Flight Time of Day Rating: " + timeRisk);
		Text windRiskText = new Text("    Flight Wind Rating: " + windRisk);
		Text visRiskText = new Text("    Flight Visiblity Rating: " + visRisk);
		Text tempRiskText = new Text("    Flight Temperature Rating: " + tempRisk);
		Text flightTimeText = new Text("    Flight Time Rating: " + flightRisk);
		Text flightCeilingText = new Text("    Flight Ceiling Rating: " + ceilingRisk);
		Text flightDewText = new Text("    Flight Dew Point Rating: " + dewRisk);
		
		Text airportTowerText = new Text("    Airport Tower Rating: " + airportTowerRisk);
		Text airportElevText = new Text("    Airport Elevation Rating: " + airportElevRisk);
		Text airportInternationalText = new Text("    Airport International Rating: " + internationalRisk);
	
		
		
		Text typeRiskText = new Text("    Pilot Hours in Aircraft Type Rating: " + typeRisk);
		Text hrsDaysText = new Text("    Pilot Hours in Last 90 Days Rating: " + hrsDaysRisk);
		Text crewNumText = new Text("    Crew Number Rating: " + crewNumRisk);
		Text restRiskText = new Text("    Pilot Rest in the last 24hrs Rating: " + restRisk);
		
		
		
		
		vBoxRisk.getChildren().addAll(totalRiskText, riskAdvisement, timeRiskText, windRiskText, visRiskText, tempRiskText
				, flightTimeText, flightCeilingText, flightDewText);
		vBoxRisk.getChildren().addAll(airportTowerText, airportElevText, airportInternationalText);
		vBoxRisk.getChildren().addAll(typeRiskText, hrsDaysText, crewNumText, restRiskText);
		
		return vBoxRisk;
	}

	
	public int TimeRisk() {

		int DTime = Integer.parseInt(dTime);
		int ATime = Integer.parseInt(aTime);
		
		if (DTime < 0600 && ATime < 0600) {
			timeRisk = 5;
			//System.out.println("Night Flight");
		} else if (DTime <= 0600 && ATime >= 0600) {
			timeRisk = 3;
			//System.out.println("Partial Night Flight");
		} else if (DTime >= 0600 && DTime <= 2000 && ATime >= 0600 && ATime <= 2000) {
			timeRisk = 0;
			//System.out.println("Day flight");
		} else if (DTime >= 0600 || DTime <= 2000 && ATime >= 2000) {
			timeRisk = 3;
			//System.out.println("Partial Night Flight");
		} else if (DTime >= 2000 && ATime >= 2000 || ATime <= 0600) {
			timeRisk = 5;
			//System.out.println("Night Flight");
		} else {
			//System.out.println("Enter correct value");
		}
		
		return timeRisk;
	}
	
	public int WindRisk() {
		
		int DWind = Integer.parseInt(dWind);
		int AWind = Integer.parseInt(aWind);
		
		if (DWind >= 15 && AWind >= 15) {
			windRisk = 4;
			//System.out.println("High Wind");
		} else if (DWind >= 15 && AWind <= 15) {
			windRisk = 2;
			//System.out.println("High D Wind");
		} else if (DWind <= 15 && AWind >= 15) {
			windRisk = 2;
			//System.out.println("High A Wind");
		} else if (DWind <= 15 && AWind <= 15) {
			windRisk = 0;
			//System.out.println("Low Wind");
		}
		
		return windRisk;
	}
	
	public int VisRisk() {
		int DVis = Integer.parseInt(dVis);
		int AVis = Integer.parseInt(aVis);
		
		if (DVis >= 3 && DVis < 5 || AVis >= 3 && AVis < 5) {
			switch (type) {
				case "VFR":
					visRisk = 2;
					break;
				case "IFR":
					visRisk = 0;
					break;
			}
		} else if (DVis >= 1 && DVis < 3 || AVis >= 1  && AVis < 3) {
			switch (type) {
				case "VFR":
					visRisk = 5;
					break;
				case "IFR":
					visRisk = 0;
					break;
			}
		} else if (DVis < 1 || AVis < 1) {
			switch (type) {
				case "VFR":
					visRisk = 5;
					break;
				case "IFR":
					visRisk = 0;
					break;
			}
		}
		
		return visRisk;
	}
	
	public int TempRisk() {
		
		int DTemp = Integer.parseInt(dTemp);
		int ATemp = Integer.parseInt(aTemp);
		
		if (DTemp > 32 && ATemp > 32) {
			tempRisk = 0;
		} else if (DTemp < 32 || ATemp < 32) {
			tempRisk = 3;
		} else if (DTemp < 32 && ATemp < 32) {
			tempRisk = 5;
		}
		
		return tempRisk;
	}
	
	public int TypeRisk() {
		int typeTime = Integer.parseInt(hrsType);
		
		if (typeTime > 200) {
			typeRisk = 0;
		} else if (typeTime < 200) {
			typeRisk = 5;
		}
		
		return typeRisk;
	}
	
	public int FlightTimeDaysRisk() {
		int flightTimeDays = Integer.parseInt(hrsDays);
		
		if (flightTimeDays > 100) {
			hrsDaysRisk = 0;
		} else if (flightTimeDays < 100) {
			hrsDaysRisk = 3;
		}
		
		return hrsDaysRisk;
	}
	
	public int CrewRisk() {
		switch (crewNumber) {
			case "Dual":
				crewNumRisk = 0;
				break;
			
			case "Solo":
				crewNumRisk = 5;
				break;
		}
		
		return crewNumRisk;
	}
	
	public int FlightTimeRisk() {
		int flightTime = Integer.parseInt(time);
		
		if (flightTime > 8) {
			flightRisk = 4;
		} else if (flightTime < 8) {
			flightRisk = 0;
		}
		
		return flightRisk;
	}
	
	public int RestTimeRisk() {
		
		int restTime = Integer.parseInt(rest);
		
		if (restTime > 10) {
			restRisk = 0;
		} else if (restTime < 10) {
			restRisk = 5;
		}
		
		return restRisk;
	}
	
	public int TowerRisk() {
		
		switch (dAirportTower) {
			case "Yes":
				switch (aAirportTower) {
					case "Yes":
						airportTowerRisk = 0;
						break;
					case "No":
						airportTowerRisk = 3;
						break;
				}
				break;
			
			case "No": 
				switch (aAirportTower) {
					case "Yes":
						airportTowerRisk = 3;
						break;
					case "No":
						airportTowerRisk = 5;
						break;
				}
				break;
		}
		
		return airportTowerRisk;
	}
	
	public int ElevationRisk() {
		System.out.println(dAirportElevation);
		
		int dElev = Integer.parseInt(dAirportElevation);
		int aElev = Integer.parseInt(aAirportElevation);
		
		if (dElev > 5000 && aElev < 5000) {
			airportElevRisk = 1;
		} else if (dElev < 5000 && aElev > 5000) {
			airportElevRisk = 1;
		} else if (dElev > 5000 && aElev > 5000) {
			airportElevRisk = 3;
		} else if (dElev < 5000 && aElev < 5000) {
			airportElevRisk = 0;
		}
		
		return airportElevRisk;
		
	}
	
	public int InternationalRisk() {
		
		switch (dAirportInternational) {
			case "Yes":
				internationalRisk = 1;
				break;
			case "No": 
				internationalRisk = 0;
				break;
		}
		
		switch (aAirportInternational) {
			case "Yes":
				internationalRisk = 1;
				break;
			case "No":
				internationalRisk = 0;
				break;
		}
		
		return internationalRisk;
 	}
	
	public int CeilingRisk() {
		
		int DCeil = Integer.parseInt(dCeil);
		int ACeil = Integer.parseInt(aCeil);
		
		if (DCeil >= 3000 && ACeil >= 3000) {
			ceilingRisk = 0;
		} else if (DCeil < 3000 || ACeil < 3000) {
			switch (type) {
				case "VFR":
					ceilingRisk = 3;
					break;
				case "IFR":
					ceilingRisk = 0;
					break;
			}
		} else if (DCeil < 1000 || ACeil < 1000) {
			switch (type) {
				case "VFR":
					ceilingRisk = 3;
					break;
				case "IFR":
					ceilingRisk = 1;
					break;
			}
		} else if (DCeil < 500 || ACeil < 500) {
			switch (type) {
				case "VFR":
					ceilingRisk = 3;
					break;
				case "IFR":
					ceilingRisk = 2;
					break;
			}
		}
		
		
		return ceilingRisk;
	}
	
	public int DewRisk() {
		
		int DDew = Integer.parseInt(dDew);
		int ADew = Integer.parseInt(aDew);
		
		if (DDew >= 3 || ADew >= 3) {
			dewRisk = 0;
		} else if (DDew < 3 || ADew < 3){
			switch (type) {
				case "VFR":
					dewRisk = 5;
					break;
				case "IFR":
					dewRisk = 1;
					break;
			}
		}
		
		return dewRisk;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}