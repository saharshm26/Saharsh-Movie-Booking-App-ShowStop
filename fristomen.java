package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.TextField;
import javafx.scene.control.Hyperlink;
import javafx.scene.web.WebView;
public class fristomen {
	
	static Stage window = new Stage();
	public static void display(String x,String x2, String x3) {
		WebView webView = new WebView();
		try {
		window.setTitle("Book Now!");
		
		VBox layout = new VBox();
		Hyperlink book = new Hyperlink(x);
		Hyperlink book2 = new Hyperlink(x2);
		Hyperlink book3 = new Hyperlink(x3);
		if(x=="") {
			book.setText("");
		}else {
			book.setText("Book on BookMyShow");
		}
		if(x2=="") {
			book2.setText("");
		}else {
			book2.setText("Book on PVR Cinemas");
		}
		if(x3=="") {
			book3.setText("");
		}else {
			book3.setText("Book on INOX Cinemas");
		}
		
		Button btn = new Button("Back");
		btn.setOnAction(e-> {
			window.close();
		});
		book.setOnAction(e-> {
			webView.getEngine().load(x);
			
		});
		book2.setOnAction(e-> {
			webView.getEngine().load(x2);
			
		});
		book3.setOnAction(e-> {
			webView.getEngine().load(x3);
			
		});
		if(x=="" && x2=="" && x3==""){
			Label label = new Label("No Bookings found");
			label.setId("error");
			layout.getChildren().add(label);
		}
		
		layout.getChildren().addAll(book,book2,book3,webView,btn);
		Scene scene = new Scene(layout,1000,1000);
		
		
		window.setScene(scene);
		window.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
