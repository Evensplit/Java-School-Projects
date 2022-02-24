package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;


public class ColorChange extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	   public void start(Stage primaryStage) {
		primaryStage.setTitle("Color Change!");
		Button btn = new Button();
		btn.setText("Color Change");
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 400, 300));
		primaryStage.show();
		
			
			
			/*Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
		
			
			
			
			btn.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					btn.setTextFill(Paint.valueOf("Red"));
					btn.setText("Red");
				}
			});
			
			
			
		
		}
	}
	
	
	

