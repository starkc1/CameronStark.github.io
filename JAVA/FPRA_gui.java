import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		
		
		TextField dAirportFld = new TextField();
		dAirportFld.setPromptText(dAirport);
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
			dAirport = dAirportFld.getText();
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
		
		
		TextField aAirportFld = new TextField();
		aAirportFld.setPromptText(aAirport);
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
			aAirport = aAirportFld.getText();
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
		
		
		TextField planeFld = new TextField();
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
		vBoxInfoDepart.setAlignment(Pos.TOP_RIGHT);
		VBox vBoxInfoArrival = new VBox(10);
		
		Text titleText = new Text(10, 50, "Flight From " + dAirport + " To " + aAirport);
		titleText.setFont(new Font(20));
		borderPane.setTop(titleText);
		borderPane.setAlignment(titleText, Pos.CENTER);
		
		//DEPARTURE INFORMATION
		Button departureMapBtn = new Button();
		departureMapBtn.setMinHeight(100);
		departureMapBtn.setMinWidth(100);
		switch (dAirport) {
		
			case "KDAB" :
				String[] KDAB = AirportInfo.kdabArray;
				dAirportName = KDAB[0];
				dAirportMap = KDAB[1];
				dAirportTower = KDAB[2];
				dAirportARTCC = KDAB[3];
				dAirportElevation = KDAB[4];
				dAirportUNICOM = KDAB[5];
				dAirportATIS = KDAB[6];
				dAirportGround = KDAB[7];
				dAirportTowerFreq = KDAB[8];
				departureMapBtn.setStyle("-fx-background-image: url(images/KDAB.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
				
			case "KTPA" :
				String[] KTPA = AirportInfo.ktpaArray;
				dAirportName = KTPA[0];
				dAirportMap = KTPA[1];
				dAirportTower = KTPA[2];
				dAirportARTCC = KTPA[3];
				dAirportElevation = KTPA[4];
				dAirportUNICOM = KTPA[5];
				dAirportATIS = KTPA[6];
				dAirportGround = KTPA[7];
				dAirportTowerFreq = KTPA[8];
				departureMapBtn.setStyle("-fx-background-image: url(images/KTPA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
				
			case "KDCA" :
				String[] KDCA = AirportInfo.kdcaArray;
				dAirportName = KDCA[0];
				dAirportMap = KDCA[1];
				dAirportTower = KDCA[2];
				dAirportARTCC = KDCA[3];
				dAirportElevation = KDCA[4];
				dAirportUNICOM = KDCA[5];
				dAirportATIS = KDCA[6];
				dAirportGround = KDCA[7];
				dAirportTowerFreq = KDCA[8];
				departureMapBtn.setStyle("-fx-background-image: url(images/KDCA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
				
			case "KMCO" :
				String[] KMCO = AirportInfo.kmcoArray;
				dAirportName = KMCO[0];
				dAirportMap = KMCO[1];
				dAirportTower = KMCO[2];
				dAirportARTCC = KMCO[3];
				dAirportElevation = KMCO[4];
				dAirportUNICOM = KMCO[5];
				dAirportATIS = KMCO[6];
				dAirportGround = KMCO[7];
				dAirportTowerFreq = KMCO[8];
				departureMapBtn.setStyle("-fx-background-image: url(images/KMCO.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
			
				
			
		}
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
		
		vBoxInfoDepart.getChildren().addAll(departAirportText, departureMapBtn, dTowerText, dARTCCText, dElevationText, dUnicomText, dAtisText, dGroundText, dTowerFreqText);
		//Departure Map
		
		vBoxInfoDepart.setPrefWidth(100);
		borderPane.setLeft(vBoxInfoDepart);
		//DEPARTURE INFORMATION
		
		//ARRIVAL INFORMAITON
		Button arrivalMapBtn = new Button();
		arrivalMapBtn.setMinHeight(100);
		arrivalMapBtn.setMinWidth(100);
		switch (aAirport) {
		
			case "KDAB" :
				String[] KDAB = AirportInfo.kdabArray;
				aAirportName = KDAB[0];
				aAirportMap = KDAB[1];
				aAirportTower = KDAB[2];
				aAirportARTCC = KDAB[3];
				aAirportElevation = KDAB[4];
				aAirportUNICOM = KDAB[5];
				aAirportATIS = KDAB[6];
				aAirportGround = KDAB[7];
				aAirportTowerFreq = KDAB[8];
				arrivalMapBtn.setStyle("-fx-background-image: url(images/KDAB.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
				
			case "KTPA" :
				String[] KTPA = AirportInfo.ktpaArray;
				aAirportName = KTPA[0];
				aAirportMap = KTPA[1];
				aAirportTower = KTPA[2];
				aAirportARTCC = KTPA[3];
				aAirportElevation = KTPA[4];
				aAirportUNICOM = KTPA[5];
				aAirportATIS = KTPA[6];
				aAirportGround = KTPA[7];
				aAirportTowerFreq = KTPA[8];
				arrivalMapBtn.setStyle("-fx-background-image: url(images/KTPA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
				
			case "KDCA" :
				String[] KDCA = AirportInfo.kdcaArray;
				aAirportName = KDCA[0];
				aAirportMap = KDCA[1];
				aAirportTower = KDCA[2];
				aAirportARTCC = KDCA[3];
				aAirportElevation = KDCA[4];
				aAirportUNICOM = KDCA[5];
				aAirportATIS = KDCA[6];
				aAirportGround = KDCA[7];
				aAirportTowerFreq = KDCA[8];
				arrivalMapBtn.setStyle("-fx-background-image: url(images/KDCA.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
			
			case "KMCO" :
				String[] KMCO = AirportInfo.kmcoArray;
				aAirportName = KMCO[0];
				aAirportMap = KMCO[1];
				aAirportTower = KMCO[2];
				aAirportARTCC = KMCO[3];
				aAirportElevation = KMCO[4];
				aAirportUNICOM = KMCO[5];
				aAirportATIS = KMCO[6];
				aAirportGround = KMCO[7];
				aAirportTowerFreq = KMCO[8];
				arrivalMapBtn.setStyle("-fx-background-image: url(images/KMCO.jpg); -fx-background-size: 400px 400px; -fx-background-position: center");
				break;
				
				
		}
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
		Text aUnicomText = new Text("Unicom Frequency: " + aAirportUNICOM);
		Text aAtisText = new Text("Atis Frequency: " + aAirportATIS);
		Text aGroundText = new Text("Ground Frequency: " + aAirportGround);
		Text aTowerFreqText = new Text("Tower Frequency: " + aAirportTowerFreq);
		
		
		vBoxInfoArrival.getChildren().addAll(arrivalAirportText, arrivalMapBtn, aTowerText, aARTCCText, aElevationText, aUnicomText, aAtisText, aGroundText, aTowerFreqText);
		vBoxInfoArrival.setPrefWidth(100);
		borderPane.setRight(vBoxInfoArrival);
		borderPane.setAlignment(vBoxInfoArrival, Pos.CENTER);
		//ARRIVAL INFORMATION
	
		return borderPane;
	}
	

	


	
}