/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipfinal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.FlowPane;
import java.lang.String;


/**
 *
 * @author renaldohyacinthe
 */
public class Battleshipfinal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FlowPane pane = new FlowPane();
        pane.setVgap(18);
        pane.setHgap(18);
        for (int i = 1; i < 101; i++)
        {
            pane.getChildren().add(new Button(String.valueOf(i)));
        }
        
        
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("BattleShip Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        FlowPane pane2 = new FlowPane();
        pane2.setVgap(20);
        pane2.setHgap(20);
        Circle circarray[] = new Circle[100];
        
        for (int i = 0; i < 100; i++)
        {
        circarray[i] = new Circle();
        circarray[i].setCenterX(i*10);
        circarray[i].setCenterY(i * 10);
        circarray[i].setRadius(20);
        circarray[i].setStroke(Color.BLACK);
        circarray[i].setFill(Color.RED);
        pane2.getChildren().add(circarray[i]);
        
        }
        Scene scene2 = new Scene(pane2, 500,500);
        Stage SecondStage= new Stage();
        SecondStage.setTitle("Battleships Display");
        SecondStage.setScene(scene2);
        SecondStage.show();
        
        }
        
    }


