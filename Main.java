package application;
	
import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.control.Hyperlink;

public class Main extends Application {
	String path = "/Users/grest/Desktop/bgm.mp3";
	Media media = new Media(new File(path).toURI().toString());
	MediaPlayer bgm = new MediaPlayer(media);
	
	String x, x2, x3;
	Scene scene;
	Stage window;
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			window.setTitle("ShowStop");
			bgm.setCycleCount(MediaPlayer.INDEFINITE);
			bgm.play();
			
			GridPane homepage = new GridPane();
			homepage.setVgap(10);
			homepage.setHgap(10);
			homepage.setId("home");
			
//menu on home screen		
			ComboBox<String> movielist = new ComboBox<>();
			movielist.getItems().addAll(
					"The First Omen",
					"Kingdom Of The Planet Of The Apes",
					"Mr and Mrs Mahi",
					"The Garfield Movie",
					"Furiosa: A Mad Max Saga",
					"The Fall Guy",
					"IF"
				);
			movielist.setPromptText("Select Movie");
			GridPane.setConstraints(movielist, 17, 24);
					
//The First Omen page
			GridPane first = new GridPane();
			first.setId("thefirstlayout");
			first.setPadding(new Insets( 10, 10, 10, 10));
			first.setVgap(10);
			first.setHgap(10);
			
			Label country = new Label("Select your City");
			GridPane.setConstraints(country, 0, 2);
			country.setId("citylabel");
			ChoiceBox<String> cityf = new ChoiceBox<>();
			cityf.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			cityf.setMinWidth(60);
			GridPane.setConstraints(cityf,0,3);
			
			Button firstbtn = new Button("Enter");
			
			firstbtn.setOnAction(e-> {
				if(cityf.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/the-first-omen/ET00382581";
					x2 = "";
					x3 = "";
				}if(cityf.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/the-first-omen/ET00382581";
					x2 = "";
					x3 = "";
				}if(cityf.getValue()=="Ahmedabad") {
					x = "https://in.bookmyshow.com/ahmedabad/movies/the-first-omen/ET00382581";
					x2 = "";
					x3 = "";
				}if(cityf.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/the-first-omen/ET00382581";
					x2 = "";
					x3 = "";
				}
				fristomen.display(x,x2,x3);
			});
			
			String pathvideo1 = "/Users/grest/Desktop/TheFirstOmen.mp4";
			Media media = new Media(new File(pathvideo1).toURI().toString());
			MediaPlayer firstomen = new MediaPlayer(media);
			firstomen.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView omentrailer = new MediaView(firstomen);
			omentrailer.setFitHeight(450);
			omentrailer.setFitWidth(400);
			GridPane.setConstraints(omentrailer,1,17);
			
			Button backf = new Button("Back to Home");
			backf.setOnAction(e-> {
				backbutton();
				firstomen.pause();
				bgm.play();
			});
			GridPane.setConstraints(backf, 0, 4);
			
			GridPane.setConstraints(firstbtn, 1, 3 );
			first.getChildren().addAll(country,omentrailer,backf,firstbtn,cityf,movielist);
			Scene firstscene = new Scene(first,700,700);
			firstscene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());

//Kingdom of the Planet of the apes scene
			GridPane Apes = new GridPane();
			Apes.setId("apelayout");
			Apes.setPadding(new Insets( 10, 10, 10, 10));
			Apes.setVgap(10);
			Apes.setHgap(10);
			
			Label countryapes = new Label("Select your City");
			countryapes.setTextFill(Color.BLACK);
			GridPane.setConstraints(countryapes, 0, 2);
			countryapes.setId("apecitylabel");
			ChoiceBox<String> cityapes = new ChoiceBox<>();
			cityapes.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			cityapes.setMinWidth(60);
			GridPane.setConstraints(cityapes,0,3);
			
			Button apesbtn = new Button("Enter");
			
			apesbtn.setOnAction(e-> {
				if(cityapes.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/kingdom-of-the-planet-of-the-apes/ET00374973";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Mumbai/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
					x3 = "https://www.inoxmovies.com/moviesessions/-Mumbai/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
				}if(cityapes.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/kingdom-of-the-planet-of-the-apes/ET00374973";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Hyderabad/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
					x3 = "https://www.inoxmovies.com/moviesessions/Hyderabad/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
				}if(cityapes.getValue()=="Ahmedabad") {
					x = "https://in.bookmyshow.com/ahmedabad/movies/kingdom-of-the-planet-of-the-apes/ET00374973";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Ahmedabad/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
					x3 = "https://www.inoxmovies.com/moviesessions/Ahmedabad/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
				}if(cityapes.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/kingdom-of-the-planet-of-the-apes/ET00374973";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Delhi-NCR/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
					x3 = "https://www.inoxmovies.com/moviesessions/-Delhi-NCR/KINGDOM-OF-THE-PLANET-OF-THE-APES/28559";
				}
				fristomen.display(x,x2,x3);
			});
			
			String pathvideo2 = "/Users/grest/Desktop/KingApe.mp4";
			Media media2 = new Media(new File(pathvideo2).toURI().toString());
			MediaPlayer kingapesound  = new MediaPlayer(media2);
			kingapesound.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView kingapetrailer = new MediaView(kingapesound);
			kingapetrailer.setFitHeight(700);
			kingapetrailer.setFitWidth(400);
			GridPane.setConstraints(kingapetrailer,1,20);
			
			Button backa = new Button("Back to Home");
			backa.setOnAction(e-> {
				backbutton();
				kingapesound.pause();
				bgm.play();
			});
			GridPane.setConstraints(backa, 0, 4);
			
			GridPane.setConstraints(apesbtn, 1, 3 );
			Apes.getChildren().addAll(countryapes,kingapetrailer,backa,apesbtn,cityapes);
			Scene apescene = new Scene(Apes,700,700);
			apescene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			
//Mr and Mrs Mahi page
			GridPane mahi = new GridPane();
			mahi.setId("mahi");
			mahi.setPadding(new Insets( 10, 10, 10, 10));
			mahi.setVgap(10);
			mahi.setHgap(10);
			
			Label countrymahi = new Label("Select your City");
			GridPane.setConstraints(countrymahi, 0, 2);
			countrymahi.setId("citylabel");
			ChoiceBox<String> citymahi = new ChoiceBox<>();
			citymahi.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			citymahi.setMinWidth(60);
			GridPane.setConstraints(citymahi,0,3);
			
			Button mahibtn = new Button("Enter");
			
			mahibtn.setOnAction(e-> {
				if(citymahi.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/mr-mrs-mahi/ET00318249";
					x2 = "https://www.pvrcinemas.com/moviesessions/Mumbai/MR-AND-MRS-MAHI/28571";
					x3 = "https://www.inoxmovies.com/moviesessions/Mumbai/MR-AND-MRS-MAHI/28571";
				}if(citymahi.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/mr-mrs-mahi/ET00318249";
					x2 = "";
					x3 = "";
				}if(citymahi.getValue()=="Ahmedabad") {
					x = "https://in.bookmyshow.com/ahmedabad/movies/mr-mrs-mahi/ET00318249";
					x2 = "https://www.pvrcinemas.com/moviesessions/Ahmedabad/MR-AND-MRS-MAHI/28571";
					x3 = "https://www.inoxmovies.com/moviesessions/Ahmedabad/MR-AND-MRS-MAHI/28571";
				}if(citymahi.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/mr-mrs-mahi/ET00318249";
					x2 = "https://www.pvrcinemas.com/moviesessions/Delhi-NCR/MR-AND-MRS-MAHI/28571";
					x3 = "https://www.inoxmovies.com/moviesessions/Delhi-NCR/MR-AND-MRS-MAHI/28571";
				}
				fristomen.display(x,x2,x3);
			});
			
			String pathvideo3 = "/Users/grest/Desktop/mahi.mp4";
			Media media3 = new Media(new File(pathvideo3).toURI().toString());
			MediaPlayer mahisound = new MediaPlayer(media3);
			mahisound.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView mahitrailer = new MediaView(mahisound);
			mahitrailer.setFitHeight(350);
			mahitrailer.setFitWidth(400);
			GridPane.setConstraints(mahitrailer,1,13);
			
			Button backm = new Button("Back to Home");
			backm.setOnAction(e-> {
				backbutton();
				mahisound.pause();
				bgm.play();
			});
			GridPane.setConstraints(backm, 0, 4);
			
			GridPane.setConstraints(mahibtn, 1, 3 );
			mahi.getChildren().addAll(countrymahi,mahitrailer,backm,mahibtn,citymahi,movielist);
			Scene mahiscene = new Scene(mahi,700,700);
			mahiscene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			
//The Garfeild movie page
			GridPane cat = new GridPane();
			cat.setId("catlayout");
			cat.setPadding(new Insets( 10, 10, 10, 10));
			cat.setVgap(10);
			cat.setHgap(10);
			
			Label countrygarfield = new Label("Select your City");
			countrygarfield.setTextFill(Color.BLACK);
			GridPane.setConstraints(countrygarfield, 0, 2);
			countrygarfield.setId("garcitylabel");
			ChoiceBox<String> cityg = new ChoiceBox<>();
			cityg.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			cityg.setMinWidth(60);
			GridPane.setConstraints(cityg,0,3);
			
			Button garfieldbtn = new Button("Enter");
			
			garfieldbtn.setOnAction(e-> {
				if(cityg.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/the-garfield-movie/ET00376330";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Mumbai-All/THE-GARFIELD-MOVIE/28557";
					x3 = "https://www.inoxmovies.com/moviesessions/-Mumbai-All/THE-GARFIELD-MOVIE/28557";
				}if(cityg.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/the-garfield-movie/ET00376330";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Hyderabad/THE-GARFIELD-MOVIE/28557";
					x3 = "https://www.inoxmovies.com/moviesessions/-Hyderabad/THE-GARFIELD-MOVIE/28557";
				}if(cityg.getValue()=="Ahmedabad") {
					x = "https://in.bookmyshow.com/ahmedabad/movies/the-garfield-movie/ET00376330";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Ahmedabad/THE-GARFIELD-MOVIE/28557";
					x3 = "https://www.inoxmovies.com/moviesessions/-Ahmedabad/THE-GARFIELD-MOVIE/28557";
				}if(cityg.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/the-garfield-movie/ET00376330";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Delhi-NCR/THE-GARFIELD-MOVIE/28557";
					x3 = "https://www.inoxmovies.com/moviesessions/-Delhi-NCR/THE-GARFIELD-MOVIE/28557";
				}
				fristomen.display(x,x2,x3);
			});
			
			String pathvideo4 = "/Users/grest/Desktop/Garfield.mp4";
			Media media4 = new Media(new File(pathvideo4).toURI().toString());
			MediaPlayer garfieldsound = new MediaPlayer(media4);
			garfieldsound.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView garfieldtrailer = new MediaView(garfieldsound);
			garfieldtrailer.setFitHeight(350);
			garfieldtrailer.setFitWidth(400);
			GridPane.setConstraints(garfieldtrailer,1,17);
			
			Button backg = new Button("Back to Home");
			backg.setOnAction(e-> {
				backbutton();
				garfieldsound.pause();
				bgm.play();
			});
			GridPane.setConstraints(backg, 0, 4);
			
			GridPane.setConstraints(garfieldbtn, 1, 3 );
			cat.getChildren().addAll(countrygarfield,garfieldtrailer,backg,garfieldbtn,cityg,movielist);
			Scene garfieldscene = new Scene(cat,700,700);
			garfieldscene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			
//Furiosa page
			
			GridPane furiosa = new GridPane();
			furiosa.setId("furioslayout");
			furiosa.setPadding(new Insets( 10, 10, 10, 10));
			furiosa.setVgap(10);
			furiosa.setHgap(10);
			
			Label countryfuriosa = new Label("Select your City");
			GridPane.setConstraints(countryfuriosa, 0, 2);
			countryfuriosa.setId("citylabel");
			ChoiceBox<String> cityfuriosa = new ChoiceBox<>();
			cityfuriosa.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			cityfuriosa.setMinWidth(60);
			GridPane.setConstraints(cityfuriosa,0,3);
			
			Button furiosabtn = new Button("Enter");
			
			furiosabtn.setOnAction(e-> {
				if(cityfuriosa.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/furiosa-a-mad-max-saga/ET00377865";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Mumbai-All/FURIOSA:-A-MAD-MAX-SAGA/28560";
					x3 = "https://www.inoxmovies.com/moviesessions/-Mumbai-All/FURIOSA:-A-MAD-MAX-SAGA/28560";
				}if(cityfuriosa.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/furiosa-a-mad-max-saga/ET00377865";
					x2 = "https://www.pvrcinemas.com/moviesessions/Hyderabad/FURIOSA:-A-MAD-MAX-SAGA/28560";
					x3 = "https://www.inoxmovies.com/moviesessions/Hyderabad/FURIOSA:-A-MAD-MAX-SAGA/28560";
				}if(cityfuriosa.getValue()=="Ahmedabad") {
					x = "https://in.bookmyshow.com/ahmedabad/movies/furiosa-a-mad-max-saga/ET00377865";
					x2 = "https://www.pvrcinemas.com/moviesessions/Ahmedabad/FURIOSA:-A-MAD-MAX-SAGA/28560";
					x3 = "https://www.inoxmovies.com/moviesessions/Ahmedabad/FURIOSA:-A-MAD-MAX-SAGA/28560";
				}if(cityfuriosa.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/furiosa-a-mad-max-saga/ET00377865";
					x2 = "https://www.pvrcinemas.com/moviesessions/Delhi-NCR/FURIOSA:-A-MAD-MAX-SAGA/28560";
					x3 = "https://www.inoxmovies.com/moviesessions/Delhi-NCR/FURIOSA:-A-MAD-MAX-SAGA/28560";
				}
				fristomen.display(x,x2,x3);
			});
			
			String pathvideo5 = "/Users/grest/Desktop/Furiosa.mp4";
			Media media5  = new Media(new File(pathvideo5).toURI().toString());
			MediaPlayer furiosasound = new MediaPlayer(media5);
			furiosasound.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView furiosatrailer = new MediaView(furiosasound);
			furiosatrailer.setFitHeight(400);
			furiosatrailer.setFitWidth(400);
			GridPane.setConstraints(furiosatrailer,1,17);
			
			Button backfr = new Button("Back to Home");
			backfr.setOnAction(e-> {
				backbutton();
				furiosasound.pause();
				bgm.play();
			});
			GridPane.setConstraints(backfr, 0, 4);
			
			GridPane.setConstraints(furiosabtn, 1, 3 );
			furiosa.getChildren().addAll(countryfuriosa,furiosatrailer,backfr,furiosabtn,cityfuriosa,movielist);
			Scene furiosascene = new Scene(furiosa,700,700);
			furiosascene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
	
//the fall guy page
			GridPane fall = new GridPane();
			fall.setId("falllayout");
			fall.setPadding(new Insets( 10, 10, 10, 10));
			fall.setVgap(10);
			fall.setHgap(10);
			
			Label countryfall = new Label("Select your City");
			GridPane.setConstraints(countryfall, 0, 2);
			countryfall.setId("fallcitylabel");
			countryfall.setTextFill(Color.BLACK);
			ChoiceBox<String> cityfall = new ChoiceBox<>();
			cityfall.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			cityfall.setMinWidth(60);
			GridPane.setConstraints(cityfall,0,3);
			
			Button fallbtn = new Button("Enter");
			
			fallbtn.setOnAction(e-> {
				if(cityfall.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/the-fall-guy/ET00375399";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Mumbai-All/THE-FALL-GUY/28705";
					x3 = "https://www.inoxmovies.com/moviesessions/-Mumbai-All/THE-FALL-GUY/28705";
				}if(cityfall.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/the-fall-guy/ET00375399";
					x2 = "";
					x3 = "";
				}if(cityfall.getValue()=="Ahmedabad") {
					x = "";
					x2 = "";
					x3 = "";
				}if(cityfall.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/the-fall-guy/ET00375399";
					x2 = "https://www.pvrcinemas.com/moviesessions/-Delhi-NCR/THE-FALL-GUY/28705";
					x3 = "https://www.inoxmovies.com/moviesessions/-Delhi-NCR/THE-FALL-GUY/28705";
				}
				fristomen.display(x,x2,x3);
			});
			
			String pathvideo6  = "/Users/grest/Desktop/FallGuy.mp4";
			Media  media6 = new Media(new File(pathvideo6).toURI().toString());
			MediaPlayer fallsound = new MediaPlayer(media6);
			fallsound.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView falltrailer = new MediaView(fallsound);
			falltrailer.setFitHeight(350);
			falltrailer.setFitWidth(450);
			GridPane.setConstraints(falltrailer,1,17);
			
			Button backfall = new Button("Back to Home");
			backfall.setOnAction(e-> {
				backbutton();
				fallsound.pause();
				bgm.play();
			});
			GridPane.setConstraints(backfall, 0, 4);
			
			GridPane.setConstraints(fallbtn, 1, 3 );
			fall.getChildren().addAll(countryfall,falltrailer,backfall,fallbtn,cityfall,movielist);
			Scene fallscene = new Scene(fall,700,700);
			fallscene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());

			
//If page
			GridPane IF = new GridPane();
			IF.setId("iflayout");
			IF.setPadding(new Insets( 10, 10, 10, 10));
			IF.setVgap(10);
			IF.setHgap(10);
			
			Label countryIF = new Label("Select your City");
			countryIF.setId("IFcitylabel");
			countryIF.setTextFill(Color.CYAN);
			GridPane.setConstraints(countryIF, 0, 2);
			ChoiceBox<String> cityIF = new ChoiceBox<>();
			cityIF.getItems().addAll(
					"Mumbai",
					"Hyderabad",
					"Ahmedabad",
					"Delhi"
				);
			cityIF.setMinWidth(60);
			GridPane.setConstraints(cityIF,0,3);
			
			Button IFbtn = new Button("Enter");
			
			IFbtn.setOnAction(e-> {
				if(cityIF.getValue()=="Mumbai") {
					x = "https://in.bookmyshow.com/mumbai/movies/if-2024/ET00390798";
					x2 = "https://www.pvrcinemas.com/moviesessions/Mumbai-All/IF/28748";
					x3 = "https://www.inoxmovies.com/moviesessions/Mumbai-All/IF/28748";
				}if(cityIF.getValue()=="Hyderabad") {
					x = "https://in.bookmyshow.com/hyderabad/movies/if-2024/ET00390798";
					x2 = "https://www.pvrcinemas.com/moviesessions/Hyderabad/IF/28748";
					x3 = "https://www.inoxmovies.com/moviesessions/Hyderabad/IF/28748";
				}if(cityIF.getValue()=="Ahmedabad") {
					x = "https://in.bookmyshow.com/ahmedabad/movies/if-2024/ET00390798";
					x2 = "";
					x3 = "";
				}if(cityIF.getValue()=="Delhi") {
					x = "https://in.bookmyshow.com/national-capital-region-ncr/movies/if-2024/ET00390798";
					x2 = "https://www.pvrcinemas.com/moviesessions/Delhi-NCR/IF/28748";
					x3 = "https://www.inoxmovies.com/moviesessions/Delhi-NCR/IF/28748";
				}
				fristomen.display(x,x2,x3);
			});
			
			String  pathvideo7 = "/Users/grest/Desktop/IF.mp4";
			Media media7 = new Media(new File(pathvideo7).toURI().toString());
			MediaPlayer IFsound = new MediaPlayer(media7);
			IFsound.setCycleCount(MediaPlayer.INDEFINITE);
			MediaView IFtrailer = new MediaView(IFsound);
			IFtrailer.setFitHeight(350);
			IFtrailer.setFitWidth(450);
			GridPane.setConstraints(IFtrailer,1,10);
			
			Button backIF = new Button("Back to Home");
			backIF.setOnAction(e-> {
				backbutton();
				IFsound.pause();
				bgm.play();
			});
			GridPane.setConstraints(backIF, 0, 4);
			
			GridPane.setConstraints(IFbtn, 1, 3 );
			IF.getChildren().addAll(countryIF,IFtrailer,backIF,IFbtn,cityIF,movielist);
			Scene IFscene = new Scene(IF,700,700);
			IFscene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			
			
			movielist.setOnAction(e-> {
				if(movielist.getValue()=="The First Omen") {
					bgm.pause();
					firstomen.play();
					window.setScene(firstscene);
				}
				if(movielist.getValue()=="Kingdom Of The Planet Of The Apes") {
					bgm.pause();
					kingapesound.play();
					window.setScene(apescene);
				}
				if(movielist.getValue()=="Mr and Mrs Mahi") {
					bgm.pause();
					mahisound.play();
					window.setScene(mahiscene);
				}
				if(movielist.getValue()=="The Garfield Movie") {
					bgm.pause();
					garfieldsound.play();
					window.setScene(garfieldscene);
				}
				if(movielist.getValue()=="Furiosa: A Mad Max Saga") {
					bgm.pause();
					furiosasound.play();
					window.setScene(furiosascene);
				}
				if(movielist.getValue()=="The Fall Guy") {
					bgm.pause();
					fallsound.play();
					window.setScene(fallscene);
				}
				if(movielist.getValue()=="IF") {
					bgm.pause();
					IFsound.play();
					window.setScene(IFscene);
				}
				
			});
			
			
			homepage.getChildren().add (movielist);
			scene = new Scene(homepage,600,600);
			
			FileInputStream input = new FileInputStream("/Users/grest/Desktop/showstopbg.jpg");
			Image image = new Image(input);
			BackgroundImage bgimg = new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
			Background bg = new Background(bgimg);
			homepage.setBackground(bg);
			
			window.setOnCloseRequest(e-> {
				bgm.pause();
				bye.display();
				window.close();
			});
			
			
			scene.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void backbutton() {
		window.setScene(scene);
	}

}
