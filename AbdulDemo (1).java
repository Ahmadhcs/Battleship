package battleshipfinal;

	
import java.awt.Rectangle;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ButtonBar;



public class AbdulDemo extends Application {
        int mode;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("BattleShip Game!!!!!");
		
		PaneOrganizer myGrid = new PaneOrganizer();
		Scene scene = new Scene(myGrid.getRoot());
		
		primaryStage.setScene(scene);
		
                Pane modeasker = new Pane();
                ButtonType yes = new ButtonType("Player Versus", ButtonBar.ButtonData.YES);
                ButtonType no = new ButtonType("Computer Versus", ButtonBar.ButtonData.NO);
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Mode!");
                alert.setContentText("Choose your mode");
                alert.getButtonTypes().setAll(yes, no);
                alert.showAndWait().ifPresent(type -> {
                
		if (type == yes) 
                {
                    mode = 0;
                }
                 else {
                    mode = 1;
                      }
	
                });
	
	primaryStage.show();
        Stage second = new Stage();
        second.setTitle("BattleShip Game!!!!!");
		
		PaneOrganizer myGrid2 = new PaneOrganizer();
		Scene scene2 = new Scene(myGrid2.getRoot());
		
		second.setScene(scene2);
		
                Pane modeasker2 = new Pane();
                
        primaryStage.show();
        if (mode == 0)
            second.show();
}
}


