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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class FPRA_gui extends Application {

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
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		root = new BorderPane();
		root.setTop(getMenu());
		
		
		Scene scene = new Scene(root, 1500, 750);
		primaryStage.setTitle("Flight Project and Risk Assessment Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public MenuBar getMenu() {
		
		MenuBar menuBar = new MenuBar();
		
		//Departure Begin
		Menu menuDeparture = new Menu("Departure Information");
		MenuItem editDeparture = new MenuItem("Edit Information");
		menuDeparture.getItems().add(editDeparture);
		
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
		
		runSim.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				root.setCenter(getSimInfo());
				
			}
		});
		//Display End
		
		
		menuBar.getMenus().addAll(menuDeparture, menuArrival, menuFlight, menuPilot, menuDisplayInfo);
		
		return menuBar;
	}
	
	public HBox getInputsDeparture() {
		
		HBox hbox = new HBox();
		
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		Text text = new Text("Departure Information");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(text);
		

		ComboBox<String> dAirportFld = new ComboBox<>();
		dAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		vbox.getChildren().addAll(new Label("Departure Airport:"), dAirportFld);
		
		TextField dTimeFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Time:"), dTimeFld);
		
		TextField dWindFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Wind:"), dWindFld);
		
		TextField dVisibilityFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Visibility:"), dVisibilityFld);
		
		TextField dTempFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Temperature:"), dTempFld);
		
		TextField dAltimeterFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Time:"), dAltimeterFld);
		
		TextField dDewFld = new TextField();
		vbox.getChildren().addAll(new Label("Departure Dew Point:"), dDewFld);
		
		Button dSaveBtn = new Button("Save Information");
		vbox.getChildren().add(dSaveBtn);
		
		dSaveBtn.setOnAction(e -> {
			dAirport = dAirportFld.getValue();
			dTime = dTimeFld.getText();
			dWind = dWindFld.getText();
			dVis = dVisibilityFld.getText();
			dTemp = dTempFld.getText();
			dAltimeter = dAltimeterFld.getText();
			dDew = dDewFld.getText();
		});
		
		ScrollPane scroll = new ScrollPane(vbox);
		
		hbox.getChildren().addAll(scroll, new Separator(Orientation.VERTICAL));
		
		return hbox;
	}
	
	public HBox getInputsArrival() {
		
		HBox hbox = new HBox();
		
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(10));
		
		Text text = new Text("Arrival Information");
		text.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(text);
		
		
		ComboBox<String> aAirportFld = new ComboBox<>();
		aAirportFld.getItems().addAll("KDAB", "KTPA", "KMCO", "KDCA");
		vbox.getChildren().addAll(new Label("Arrival Airport:"), aAirportFld);
		
		TextField aTimeFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Time:"), aTimeFld);
		
		TextField aWindFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Wind:"), aWindFld);
		
		TextField aVisibilityFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Visibility:"), aVisibilityFld);
		
		TextField aTempFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Temperature:"), aTempFld);
		
		TextField aAltimeterFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Time:"), aAltimeterFld);
		
		TextField aDewFld = new TextField();
		vbox.getChildren().addAll(new Label("Arrival Dew Point:"), aDewFld);
		
		Button aSaveBtn = new Button("Save Information");
		vbox.getChildren().add(aSaveBtn);
		
		aSaveBtn.setOnAction(e -> {
			aAirport = aAirportFld.getValue();
		});
		
		ScrollPane scroll = new ScrollPane(vbox);
		
		hbox.getChildren().addAll(scroll, new Separator(Orientation.VERTICAL));
		
		return hbox;
	}
	
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

	public BorderPane getSimInfo() {
		
		BorderPane borderPane = new BorderPane();
		
		VBox vBoxInfoDepart = new VBox(10);
		vBoxInfoDepart.setAlignment(Pos.TOP_LEFT);
		
		VBox vBoxInfoArrival = new VBox(10);
		vBoxInfoArrival.setAlignment(Pos.CENTER_LEFT);
		
		VBox vBoxInfo = new VBox(40);
		
		Text titleText = new Text(10, 50, "Flight From " + dAirport + " To " + aAirport);
		titleText.setFont(new Font(20));
		borderPane.setTop(titleText);
		borderPane.setAlignment(titleText, Pos.CENTER);
		
		//DEPARTURE INFORMATION
		vBoxInfoDepart = DepartureInfo();
		//DEPARTURE INFORMATION
		
		//ARRIVAL INFORMAITON
		vBoxInfoArrival = ArrivalInfo();
		//ARRIVAL INFORMATION
		
		vBoxInfo.getChildren().addAll(vBoxInfoDepart, vBoxInfoArrival);	
		borderPane.setLeft(vBoxInfo);
		
	
		return borderPane;
	}
	
	public VBox DepartureInfo() {
		
		VBox DepartureInfo = new VBox(10);
		
		Button departureMapBtn = new Button();
		departureMapBtn.setMinHeight(100);
		departureMapBtn.setMinWidth(100);
		
		String[] dAirportInfo;
		dAirportInfo = Airport.airportInfo(dAirport); 	
		String dAirportMapBtn;
		dAirportMapBtn = Airport.airportMap(dAirport);
		
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
	


	
}