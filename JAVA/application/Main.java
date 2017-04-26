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
	
	public BorderPane planePane = new BorderPane();
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
		scene.getStylesheets().add(getClass().getResource("Component.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("Departure.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("Arrival.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("Flight.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("Pilot.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("DepartureInfo.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("ArrivalInfo.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("PlaneInfo.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("RiskInfo.css").toExternalForm());
		scene.getStylesheets().add(getClass().getResource("Planes.css").toExternalForm());
		
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
		dAirportFld.setPromptText(dAirport);
		dAirportFld.setId("dDropdown");
		dAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		Label dairport = new Label("Departure Airport");
		dairport.setId("dairport");
		vbox.getChildren().addAll(dairport, dAirportFld);
		
		//Entry Field for departure Time
		TextField dTimeFld = new TextField();
		dTimeFld.setPromptText(dTime);
		dTimeFld.setId("dTimeFld");
		Label dtime = new Label("Departure Time (24hr 0000)");
		dtime.setId("dtime");
		vbox.getChildren().addAll(dtime, dTimeFld);
		
		//Entry Field for departure Wind
		TextField dWindFld = new TextField();
		dWindFld.setPromptText(dWind);
		dWindFld.setId("dWindFld");
		Label dwind = new Label("Departure Wind (KNOTS)");
		dwind.setId("dwind");
		vbox.getChildren().addAll(dwind, dWindFld);
		
		//Entry Field for departure Visibility
		TextField dVisibilityFld = new TextField();
		dVisibilityFld.setPromptText(dVis);
		dVisibilityFld.setId("dVisibilityFld");
		Label dvis = new Label("Departure Visibility (Nautical Miles)");
		dvis.setId("dvis");
		vbox.getChildren().addAll(dvis, dVisibilityFld);
		
		TextField dCeilingFld = new TextField();
		dCeilingFld.setPromptText(dCeil);
		dCeilingFld.setId("dCeilingFld");
		Label dceil = new Label("Departure Ceiling (Feet)");
		dceil.setId("dceil");
		vbox.getChildren().addAll(dceil, dCeilingFld);
		
		//Entry Field for departure Temperature
		TextField dTempFld = new TextField();
		dTempFld.setPromptText(dTemp);
		dTempFld.setId("dTempFld");
		Label dtemp = new Label("Departure Temperature (Degrees F)");
		dtemp.setId("dtemp");
		vbox.getChildren().addAll(dtemp, dTempFld);
		
		//Entry Field for departure Altimeter
		TextField dAltimeterFld = new TextField();
		dAltimeterFld.setPromptText(dAltimeter);
		dAltimeterFld.setId("dAltimeterFld");
		Label dalt = new Label("Departure Altimeter (Feet)");
		dalt.setId("dalt");
		vbox.getChildren().addAll(dalt, dAltimeterFld);
		
		//Entry Field for departure Dew
		TextField dDewFld = new TextField();
		dDewFld.setPromptText(dDew);
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
		aAirportFld.setPromptText(aAirport);
		aAirportFld.setId("aDropdown");
		aAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		Label aairport = new Label("Arrival Airport");
		aairport.setId("aairport");
		vbox.getChildren().addAll(aairport, aAirportFld);
		
		//Entry Field for Arrival Time
		TextField aTimeFld = new TextField();
		aTimeFld.setPromptText(aTime);
		aTimeFld.setId("aTimeFld");
		Label atime = new Label("Arrival Time (24hr 0000)");
		atime.setId("atime");
		vbox.getChildren().addAll(atime, aTimeFld);
		
		//Entry Field for Arrival Wind
		TextField aWindFld = new TextField();
		aWindFld.setPromptText(aWind);
		aWindFld.setId("aWindFld");
		Label awind = new Label("Arrival Wind (KNOTS)");
		awind.setId("awind");
		vbox.getChildren().addAll(awind, aWindFld);
		
		//Entry Field for Arrival Visibility
		TextField aVisibilityFld = new TextField();
		aVisibilityFld.setPromptText(aVis);
		aVisibilityFld.setId("aVisibilityFld");
		Label avis = new Label("Arrival Visibility (Nautical Miles)");
		avis.setId("avis");
		vbox.getChildren().addAll(avis, aVisibilityFld);
		
		//Entry Field for Arrival Ceiling
		TextField aCeilingFld = new TextField();
		aCeilingFld.setPromptText(aCeil);
		aCeilingFld.setId("aCeilingFld");
		Label aceil = new Label("Arrival Ceiling (Feet)");
		aceil.setId("aceil");
		vbox.getChildren().addAll(aceil, aCeilingFld);
		
		//Entry Field for Arrival Temperature
		TextField aTempFld = new TextField();
		aTempFld.setPromptText(aTemp);
		aTempFld.setId("aTempFld");
		Label atemp = new Label("Arrival Temperature (Degreess F)");
		atemp.setId("atemp");
		vbox.getChildren().addAll(atemp, aTempFld);
		
		//Entry Field for Arrival Altimeter
		TextField aAltimeterFld = new TextField();
		aAltimeterFld.setPromptText(aAltimeter);
		aAltimeterFld.setId("aAltimeterFld");
		Label aalt = new Label("Arrival Altimeter (Feet)");
		aalt.setId("aalt");
		vbox.getChildren().addAll(aalt, aAltimeterFld);
		
		//Entry Field for Arrival Dew
		TextField aDewFld = new TextField();
		aDewFld.setPromptText(aDew);
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
		hbox.setId("fHbox");
		
		VBox vbox = new VBox(15);
		vbox.setId("fVbox");
		vbox.setPadding(new Insets(10));
		
		Label fTitle = new Label("Flight Information");
		fTitle.setId("fTitle");
		vbox.getChildren().add(fTitle);
		
		
		ComboBox<String> planeFld = new ComboBox<>();
		planeFld.setPromptText(plane);
		planeFld.setId("fDropdown");
		planeFld.getItems().addAll("Choose For Me", "737-700","737-800", "737-900ER", "747-400", "747-800", "777-300ER","787-800", "787-900", "787-10", "A320");
		Label planeUsed = new Label("Plane Used");
		planeUsed.setId("plane");
		vbox.getChildren().addAll(planeUsed, planeFld);
		
		TextField trueSpeedFld = new TextField();
		trueSpeedFld.setPromptText(trueSpeed);
		trueSpeedFld.setId("trueSpeedFld");
		Label trueSpeedlbl = new Label("True Airspeed (KNOTS)");
		trueSpeedlbl.setId("trueSpeed");
		vbox.getChildren().addAll(trueSpeedlbl, trueSpeedFld);
		
		TextField typeFld = new TextField();
		typeFld.setPromptText(type);
		typeFld.setId("typeFld");
		Label typelbl = new Label("Type of Flight (VFR or IFR)");
		typelbl.setId("type");
		vbox.getChildren().addAll(typelbl, typeFld);
		
		TextField cruiseAltFld = new TextField();
		cruiseAltFld.setPromptText(cruiseAlt);
		cruiseAltFld.setId("cruiseAltFld");
		Label cruiseAltlbl = new Label("Cruising Altitude (Feet)");
		cruiseAltlbl.setId("cruiseAlt");
		vbox.getChildren().addAll(cruiseAltlbl, cruiseAltFld);
		
		TextField timeFld = new TextField();
		timeFld.setPromptText(time);
		timeFld.setId("timeFld");
		Label timelbl = new Label("Flight Time (hrs)");
		timelbl.setId("time");
		vbox.getChildren().addAll(timelbl, timeFld);
		
		TextField fuelFld = new TextField();
		fuelFld.setPromptText(fuel);
		fuelFld.setId("fuelFld");
		Label fuellbl = new Label("Fuel On Board (Gallons)");
		fuellbl.setId("fuel");
		vbox.getChildren().addAll(fuellbl, fuelFld);
		
		TextField passengerWeightFld = new TextField();
		passengerWeightFld.setPromptText(passengerWeight);
		passengerWeightFld.setId("passengerWeightFld");
		Label passengerWeightlbl = new Label("Passenger Weight (lbs)");
		passengerWeightlbl.setId("passengerWeight");
		vbox.getChildren().addAll(passengerWeightlbl, passengerWeightFld);
		
		TextField passengerNumberFld = new TextField();
		passengerNumberFld.setPromptText(passengerNumber);
		passengerNumberFld.setId("passengerNumberFld");
		Label passengerNumberlbl = new Label("Passenger Number");
		passengerNumberlbl.setId("passengerNumber");
		vbox.getChildren().addAll(passengerNumberlbl, passengerNumberFld);
		
		Button fSaveBtn = new Button("Save Information");
		fSaveBtn.setId("fSaveBtn");
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
		hbox.setId("pHbox");
		
		VBox vbox = new VBox(15);
		vbox.setId("pVbox");
		vbox.setPadding(new Insets(10));
		
		Label pTitle = new Label("Pilot Information");
		pTitle.setId("pTitle");
		vbox.getChildren().add(pTitle);
		
		
		TextField dualsoloFld = new TextField();
		dualsoloFld.setPromptText(crewNumber);
		dualsoloFld.setId("dualsoloFld");
		Label dualsolo = new Label("Dual or Solo");
		dualsolo.setId("crew");
		vbox.getChildren().addAll(dualsolo, dualsoloFld);
		
		TextField ratingFld = new TextField();
		ratingFld.setPromptText(rating);
		ratingFld.setId("ratingFld");
		Label ratinglbl = new Label("Rating held (Private, Instrument, etc.)");
		ratinglbl.setId("rating");
		vbox.getChildren().addAll(ratinglbl, ratingFld);
		
		TextField restFld = new TextField();
		restFld.setPromptText(rest);
		restFld.setId("restFld");
		Label restlbl = new Label("Rest in the last 24hr");
		restlbl.setId("rest");
		vbox.getChildren().addAll(restlbl, restFld);
		
		TextField hrsTypeFld = new TextField();
		hrsTypeFld.setPromptText(hrsType);
		hrsTypeFld.setId("hrsTypeFld");
		Label hrsTypelbl = new Label("Hours aircraft type");
		hrsTypelbl.setId("hrsType");
		vbox.getChildren().addAll(hrsTypelbl, hrsTypeFld);
		
		TextField hrsDaysFld = new TextField();
		hrsDaysFld.setPromptText(hrsDays);
		hrsDaysFld.setId("hrsDaysFld");
		Label hrsDayslbl = new Label("Hours in the last 90 days");
		hrsDayslbl.setId("hrsDays");
		vbox.getChildren().addAll(hrsDayslbl, hrsDaysFld);
		
		TextField totalHrsFld = new TextField();
		totalHrsFld.setPromptText(totalHrs);
		totalHrsFld.setId("totalHrsFld");
		Label totalHrslbl = new Label("Total flight hours");
		totalHrslbl.setId("totalHrs");
		vbox.getChildren().addAll(totalHrslbl, totalHrsFld);
		
		Button pSaveBtn = new Button("Save Information");
		pSaveBtn.setId("pSaveBtn");
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
		borderPane.setId("borderPane");
		
		//Orient Layout of main Components
		VBox vBoxInfoDepart = new VBox(10);
		vBoxInfoDepart.setAlignment(Pos.TOP_LEFT);
		
		VBox vBoxInfoArrival = new VBox(10);
		vBoxInfoArrival.setAlignment(Pos.CENTER_LEFT);
		
		VBox vBoxPlaneInfo = new VBox(10);
		vBoxPlaneInfo.setAlignment(Pos.TOP_LEFT);
		
		BorderPane RiskPane = new BorderPane();
		
		
		VBox vBoxInfo = new VBox(20);
		
		//Create the tile of the information
		Label titleText = new Label("Flight From " + dAirport + " To " + aAirport);
		titleText.setId("titleText");
		borderPane.setTop(titleText);
		borderPane.setAlignment(titleText, Pos.CENTER);
		
		//DEPARTURE INFORMATION`
		vBoxInfoDepart = DepartureInfo();
		//DEPARTURE INFORMATION
		
		//ARRIVAL INFORMAITON
		vBoxInfoArrival = ArrivalInfo();
		//ARRIVAL INFORMATION
		
		//PLANE INFORMATION
		if (plane == "Choose For Me") {
			vBoxPlaneInfo = ChoosePlanes();
			planePane.setCenter(vBoxPlaneInfo);
			borderPane.setRight(planePane);
		} else {
			vBoxPlaneInfo = PlaneInfo();
			borderPane.setRight(vBoxPlaneInfo);
		}
		//Plane Information
		vBoxPlaneInfo.setAlignment(Pos.TOP_CENTER);
		
		//Risk Assignment
		RiskPane = RiskAssignment();
		//Risk Assignment
		
		vBoxInfo.getChildren().addAll(vBoxInfoDepart, vBoxInfoArrival);	
		borderPane.setLeft(vBoxInfo);
		
		
		
		
		
		borderPane.setCenter(RiskPane);
		
		//Return the information to the GUI constructor
		return borderPane;
	}
	
	//Method for collecting the Departure Airport Information
	public VBox DepartureInfo() {
		
		VBox DepartureInfo = new VBox(10);
		DepartureInfo.setPadding(new Insets( 0, 0, 0, 20));
		DepartureInfo.setAlignment(Pos.TOP_CENTER);
		
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
		Label departAirportText = new Label(dAirportName);
		departAirportText.setId("departAirport");
		
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
		Label dTowerText = new Label("ATC Tower: " + dAirportTower);
		dTowerText.setId("dTowerlbl");

		Label dARTCCText = new Label("ARTCC: " + dAirportARTCC);
		dARTCCText.setId("dARTCC");
		
		Label dElevationText = new Label("Airport Elevation: " + dAirportElevation);
		dElevationText.setId("dElevation");
		
		Label dUnicomText = new Label("Unicom Frequency: " + dAirportUNICOM);
		dUnicomText.setId("dUnicom");
		
		Label dAtisText = new Label("Atis Frequency: " + dAirportATIS);
		dAtisText.setId("dAtis");
		
		Label dGroundText = new Label("Ground Frequency: " + dAirportGround);
		dGroundText.setId("dGround");
		
		Label dTowerFreqText = new Label("Tower Frequency: " + dAirportTowerFreq);
		dTowerFreqText.setId("dFreq");
		
		DepartureInfo.getChildren().addAll(departAirportText, departureMapBtn, dTowerText, dARTCCText, dElevationText, dUnicomText, dAtisText, dGroundText, dTowerFreqText);
		
		return DepartureInfo;
	}
	
	//Method for collecting the Arrival Airport Information
	public VBox ArrivalInfo() {
		
		VBox ArrivalInfo = new VBox(10);
		ArrivalInfo.setPadding(new Insets(0, 0, 0, 20));
		ArrivalInfo.setAlignment(Pos.BOTTOM_CENTER);
		
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
		Label arrivalAirportText = new Label(aAirportName);
		arrivalAirportText.setId("arrivalAirport");
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
		Label aTowerText = new Label("ATC Tower: " + aAirportTower);
		aTowerText.setId("aTower");
		
		Label aARTCCText = new Label("ARTCC: " + aAirportARTCC);
		aARTCCText.setId("aARTCC");
		
		Label aElevationText = new Label("Airport Elevation: " + aAirportElevation);
		aElevationText.setId("aElevation");
		
		Label aUnicomText = new Label("UNICOM Frequency: " + aAirportUNICOM);
		aUnicomText.setId("aUnicom");
		
		Label aAtisText = new Label("ATIS Frequency: " + aAirportATIS);
		aAtisText.setId("aAtis");
		
		Label aGroundText = new Label("Ground Frequency: " + aAirportGround);
		aGroundText.setId("aGround");
		
		Label aTowerFreqText = new Label("Tower Frequency: " + aAirportTowerFreq);
		aTowerFreqText.setId("aFreq");
		
		
		ArrivalInfo.getChildren().addAll(arrivalAirportText, arrivalMapBtn, aTowerText, aARTCCText, aElevationText, aUnicomText, aAtisText, aGroundText, aTowerFreqText);
		
		return ArrivalInfo;
	}

	//Method for collecting the Plane Information
	public VBox PlaneInfo() {
		
		VBox PlaneInfo = new VBox(10);
		PlaneInfo.setPadding(new Insets(0, 20, 0, 0));
		
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
		
		Label planeText = new Label(planeName);
		planeText.setId("planeTitle");
		
		
		Label planeCrewText = new Label("Crew: " + planeCrew);
		planeCrewText.setId("planeCrew");
		
		Label planeLengthText = new Label("Plane Length: " + planeLength);
		planeLengthText.setId("planeLength");
		
		Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
		planeSpanText.setId("planeSpan");
		
		Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
		planeWidthText.setId("planeWidth");
		
		Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
		planeLandWeightText.setId("planeLand");
		
		Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
		planeTakeWeightText.setId("planeTakeWeight");
		
		Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
		planeTakeDisText.setId("planeTakeDis");
		
		Label planeRangeText = new Label("Plane Range: " + planeRange);
		planeRangeText.setId("planeRange");
		
		
		PlaneInfo.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
		
		return PlaneInfo;
	}
	
	//Method for providing a list of Plane Options
	public VBox ChoosePlanes() {
		VBox choosePlanes = new VBox(10);
		
		int Distance = Distances.distanceInfo(dAirport, aAirport);
		Label travelDistance = new Label("Total Travel Distance: " + Distance);
		
		VBox Planes = CollectPlanes(Distance);
		
		
		
		choosePlanes.getChildren().addAll(travelDistance, Planes);
		
		
		
		
		return choosePlanes;
	}
	
	
	public VBox CollectPlanes(int Distance) {
		VBox planes = new VBox(10);
		planes.setPadding(new Insets(10,0,0,0));
		planes.setAlignment(Pos.TOP_CENTER);
		
		int passengers = Integer.parseInt(passengerNumber);
		
		int B737_700_Range = Integer.parseInt(PlaneInfo.B737_700[8]);
		int B737_700_Seat = Integer.parseInt(PlaneInfo.B737_700[9]);
		
		int B737_800_Range = Integer.parseInt(PlaneInfo.B737_800[8]);
		int B737_800_Seat = Integer.parseInt(PlaneInfo.B737_800[9]);
		
		int B737_900ER_Range = Integer.parseInt(PlaneInfo.B737_900ER[8]);
		int B737_900ER_Seat =Integer.parseInt(PlaneInfo.B737_900ER[9]);
		
		int B747_400_Range = Integer.parseInt(PlaneInfo.B747_400[8]);
		int B747_400_Seat = Integer.parseInt(PlaneInfo.B747_400[9]);
		
		int B747_800_Range = Integer.parseInt(PlaneInfo.B747_800[8]);
		int B747_800_Seat = Integer.parseInt(PlaneInfo.B747_800[9]);
		
		int B777_300ER_Range = Integer.parseInt(PlaneInfo.B777_300ER[8]);
		int B777_300ER_Seat = Integer.parseInt(PlaneInfo.B777_300ER[9]);
		
		int B787_800_Range = Integer.parseInt(PlaneInfo.B787_800[8]);
		int B787_800_Seat = Integer.parseInt(PlaneInfo.B787_800[9]);
		
		int B787_900_Range = Integer.parseInt(PlaneInfo.B787_900[8]);
		int B787_900_Seat = Integer.parseInt(PlaneInfo.B787_900[9]);
		
		int B787_10_Range = Integer.parseInt(PlaneInfo.B787_10[8]);
		int B787_10_Seat = Integer.parseInt(PlaneInfo.B787_10[9]);
		
		int A320_Range = Integer.parseInt(PlaneInfo.A320[8]);
		int A320_Seat = Integer.parseInt(PlaneInfo.A320[9]);
		
		if (B737_700_Range > Distance && B737_700_Seat > passengers) {   
			Button planeA_Info = new Button("Boeing 737-700");
			planeA_Info.setId("planeABtn");
			
			planeA_Info.setOnAction(e -> {
				VBox PlaneA = new VBox(10);
				PlaneA.setPadding(new Insets(0, 10, 20, 0));
				PlaneA.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("737-700");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneA.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneA);
				
			});
			
			planes.getChildren().addAll(planeA_Info);
		}
		
		
		if (B737_800_Range > Distance && B737_800_Seat > passengers) {
			Button planeB_Info = new Button("Boeing 737-800");
			planeB_Info.setId("planeBBtn");
			
			planeB_Info.setOnAction(e -> {
				VBox PlaneB = new VBox(10);
				PlaneB.setPadding(new Insets(0, 10, 20, 0));
				PlaneB.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("737-800");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneB.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneB);
				
			});
			
			
			planes.getChildren().addAll(planeB_Info);
		}
		
		
		if (B737_900ER_Range > Distance && B737_900ER_Seat > passengers) {
			Button planeC_Info = new Button("Boeing 737-900ER");
			planeC_Info.setId("planeCBtn");
			
			planeC_Info.setOnAction(e -> {
				VBox PlaneC = new VBox(10);
				PlaneC.setPadding(new Insets(0, 10, 20, 0));
				PlaneC.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("737-900ER");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneC.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneC);
				
			});
			
			planes.getChildren().addAll(planeC_Info);
		}
		if (B747_400_Range > Distance && B747_400_Seat > passengers) {
			Button planeD_Info = new Button("Boeing 747-400");
			planeD_Info.setId("planeDBtn");
			
			
			planeD_Info.setOnAction(e -> {
				VBox PlaneD = new VBox(10);
				PlaneD.setPadding(new Insets(0, 10, 20, 0));
				PlaneD.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("747-400");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneD.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneD);
				
			});
			
			planes.getChildren().addAll(planeD_Info);
		}
		if (B747_800_Range > Distance && B747_800_Seat > passengers) {
			Button planeE_Info = new Button("Boeing 747-800");
			planeE_Info.setId("planeEBtn");
			
			planeE_Info.setOnAction(e -> {
				VBox PlaneE = new VBox(10);
				PlaneE.setPadding(new Insets(0, 10, 20, 0));
				PlaneE.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("747-800");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneE.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneE);
				
			});
			planes.getChildren().addAll(planeE_Info);
		}
		if (B777_300ER_Range > Distance && B777_300ER_Seat > passengers) {
			Button planeF_Info = new Button("Boeing 777-300ER");
			planeF_Info.setId("planeFBtn");
			
			
			planeF_Info.setOnAction(e -> {
				VBox PlaneF = new VBox(10);
				PlaneF.setPadding(new Insets(0, 10, 20, 0));
				PlaneF.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("777-300ER");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneF.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneF);
				
			});
			
			planes.getChildren().addAll(planeF_Info);
		}
		if (B787_800_Range > Distance && B787_800_Seat > passengers) {
			Button planeG_Info = new Button("Boeing 787-800");
			planeG_Info.setId("planeGBtn");
			
			planeG_Info.setOnAction(e -> {
				VBox PlaneG = new VBox(10);
				PlaneG.setPadding(new Insets(0, 10, 20, 0));
				PlaneG.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("787-800");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneG.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneG);
				
			});
			
			planes.getChildren().addAll(planeG_Info);
		}
		if (B787_900_Range > Distance && B787_900_Seat > passengers) {
			Button planeH_Info = new Button("Boeing 787-900");
			planeH_Info.setId("planeHBtn");
			
			planeH_Info.setOnAction(e -> {
				VBox PlaneH = new VBox(10);
				PlaneH.setPadding(new Insets(0, 10, 20, 0));
				PlaneH.setAlignment(Pos.CENTER);
				
				String[] PlaneInfo;
				PlaneInfo = Plane.planeInfo("787-900");
				
				planeName = PlaneInfo[0];
				planeCrew = PlaneInfo[1];
				planeLength = PlaneInfo[2];
				planeSpan = PlaneInfo[3];
				planeWidth = PlaneInfo[4];
				planeMaxLandWeight = PlaneInfo[5];
				planeMaxTakeOffWeight = PlaneInfo[6];
				planeTakeOffDis = PlaneInfo[7];
				planeRange = PlaneInfo[8];
				
				Label planeText = new Label(planeName);
				planeText.setId("planeTitle");
				
				
				Label planeCrewText = new Label("Crew: " + planeCrew);
				planeCrewText.setId("planeCrew");
				
				Label planeLengthText = new Label("Plane Length: " + planeLength);
				planeLengthText.setId("planeLength");
				
				Label planeSpanText = new Label("Plane Wing Span: " + planeSpan);
				planeSpanText.setId("planeSpan");
				
				Label planeWidthText = new Label("Plane Fuesalge Width: " + planeWidth);
				planeWidthText.setId("planeWidth");
				
				Label planeLandWeightText = new Label("Plane Max Landing Weight: " + planeMaxLandWeight);
				planeLandWeightText.setId("planeLand");
				
				Label planeTakeWeightText = new Label("Plane Max Take Off Weight: " + planeMaxTakeOffWeight);
				planeTakeWeightText.setId("planeTakeWeight");
				
				Label planeTakeDisText = new Label("Plane Take Off Distance: " + planeTakeOffDis);
				planeTakeDisText.setId("planeTakeDis");
				
				Label planeRangeText = new Label("Plane Range: " + planeRange);
				planeRangeText.setId("planeRange");
				
				
				PlaneH.getChildren().addAll(planeText, planeCrewText, planeLengthText, planeSpanText, planeWidthText, planeLandWeightText, planeTakeWeightText, planeTakeDisText, planeRangeText);
				
				planePane.setBottom(PlaneH);
				
			});
			
			planes.getChildren().addAll(planeH_Info);
		}
		
		
		
		
		
		
		
		
		return planes;
	}
	
	//Method for Assigning risk to the parameters
	public BorderPane RiskAssignment() {
		
		
		BorderPane riskPane = new BorderPane();
		
		
		VBox riskTitle = new VBox(10);
		riskTitle.setAlignment(Pos.CENTER);
		riskTitle.setPadding(new Insets(10));
		
		VBox riskFlight = new VBox(10);
		riskFlight.setAlignment(Pos.TOP_CENTER);
		riskFlight.setPadding(new Insets(10));
		
		VBox riskAirport = new VBox(10);
		riskAirport.setAlignment(Pos.TOP_CENTER);
		riskAirport.setPadding(new Insets(10));
		
		VBox riskPilot = new VBox(10);
		riskPilot.setAlignment(Pos.TOP_CENTER);
		riskPilot.setPadding(new Insets(10));
		
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
		
		Label totalRiskText = new Label("The Total Flight Risk is: " + totalRisk);
		totalRiskText.setId("totalText");
		
		String risk = null;
		Label riskAdvisement = new Label(null);
		if (totalRisk < 7){
			risk = "Flight Risk is Minimal";
			riskAdvisement = new Label(risk);
			riskAdvisement.setId("riskMinmal");
			
		} else if (totalRisk >= 7 && totalRisk <= 10) {
			risk = "Flight Risk is Low";
			riskAdvisement = new Label(risk);
			riskAdvisement.setId("riskLow");
			
		} else if (totalRisk >= 11 && totalRisk <= 15) {
			risk = "Flight Risk is Medium";
			riskAdvisement = new Label(risk);
			riskAdvisement.setId("riskMedium");
			
		} else if (totalRisk > 15) {
			risk = "Flight Risk is High";
			riskAdvisement = new Label(risk);
			riskAdvisement.setId("riskHigh");
		}
		
		Label flightTitle = new Label("Flight Risk Ratings");
		flightTitle.setId("flightTitle");
		
		Label timeRiskText = new Label("Time of Day Rating: " + timeRisk);
		timeRiskText.setId("timeRisk");
		
		Label windRiskText = new Label("Wind Rating: " + windRisk);
		windRiskText.setId("windRisk");
		
		Label visRiskText = new Label("Visiblity Rating: " + visRisk);
		visRiskText.setId("visRisk");
		
		Label tempRiskText = new Label("Temperature Rating: " + tempRisk);
		tempRiskText.setId("tempRisk");
		
		Label flightTimeText = new Label("Time Rating: " + flightRisk);
		flightTimeText.setId("durationRisk");
		
		Label flightCeilingText = new Label("Ceiling Rating: " + ceilingRisk);
		flightCeilingText.setId("ceilingRisk");
		
		Label flightDewText = new Label("Dew Point Rating: " + dewRisk);
		flightDewText.setId("dewRisk");
		
		
		
		Label airportTitle = new Label("Airport Risk Ratings");
		airportTitle.setId("airportTitle");
		
		Label airportTowerText = new Label("Tower Rating: " + airportTowerRisk);
		airportTowerText.setId("towerRisk");
		
		Label airportElevText = new Label("Elevation Rating: " + airportElevRisk);
		airportElevText.setId("elevRisk");
		
		Label airportInternationalText = new Label("International Rating: " + internationalRisk);
		airportInternationalText.setId("internationalRisk");
		
		
		
		
		
		Label pilotTitle = new Label("Pilot Risk Ratings");
		pilotTitle.setId("pilotTitle");
		
		Label typeRiskText = new Label("Hours in Aircraft Type Rating: " + typeRisk);
		typeRiskText.setId("typeRisk");
		
		Label hrsDaysText = new Label("Hours in Last 90 Days Rating: " + hrsDaysRisk);
		hrsDaysText.setId("hrsDaysRisk");
		
		Label crewNumText = new Label("Crew Number Rating: " + crewNumRisk);
		crewNumText.setId("crewNumRisk");
		
		Label restRiskText = new Label("Rest in the last 24hrs Rating: " + restRisk);
		restRiskText.setId("restRisk");
		
		riskTitle.getChildren().addAll(totalRiskText, riskAdvisement);
		riskFlight.getChildren().addAll(flightTitle, timeRiskText, windRiskText, visRiskText, tempRiskText, flightTimeText, flightCeilingText, flightDewText);
		riskAirport.getChildren().addAll(airportTitle, airportTowerText, airportElevText, airportInternationalText);
		riskPilot.getChildren().addAll(pilotTitle, typeRiskText, hrsDaysText, crewNumText, restRiskText);
		
		
		
		riskPane.setTop(riskTitle);
		riskPane.setLeft(riskAirport);
		riskPane.setCenter(riskFlight);
		riskPane.setRight(riskPilot);
		
		return riskPane;
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