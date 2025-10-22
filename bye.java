package application;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class bye {
	static Stage window = new Stage();;
	public static void display() {
		window.setTitle("THANK YOU FOR USING ShowStop");
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(0,0,0,0));
		layout.setVgap(0);
		layout.setHgap(0);
		String path = "/Users/grest/Desktop/byebye2.mp4";
		Media byebyesound = new Media(new File(path).toURI().toString());
		MediaPlayer mediaplayer = new MediaPlayer(byebyesound);
		MediaView video = new MediaView(mediaplayer);
		video.autosize();
		
		mediaplayer.play();
		
		layout.getChildren().add(video);
		Scene scene = new Scene(layout,1279,689);
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				Platform.runLater(() -> window.close());
			}
			
		};
		
		timer.schedule(task, 2000l);
		
		window.setScene(scene);
		window.show();
		
	}
}
