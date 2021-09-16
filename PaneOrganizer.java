package battleshipfinal;
import javafx.event.EventHandler;


import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

public class PaneOrganizer {
	ShipCreator s = new ShipCreator();
	private BorderPane main;
	
	public PaneOrganizer() {
		main = new BorderPane();
		main.setStyle("-fx-background-color: grey);");
		main.setPrefHeight(500);
		main.setPrefWidth(500);
		createGrid();
		
		
	}

	private void createGrid() {
		
		GridPane playerGrid = new GridPane();
		for(int i=0; i<10;i++)
		{
			playerGrid.getColumnConstraints().add(new ColumnConstraints(50));
			playerGrid.getRowConstraints().add(new RowConstraints(50));
			
		}
		// i is the y and j is the x
		for(int i=0; i<10;i++)	
                    
			for(int j=0; j<10;j++)
			{
				Button button = new Button();
				button.setPrefHeight(50);
				button.setPrefWidth(50);
				GridPane.setConstraints(button, j,i);
                                if (s.panetruth(j, i))
                                {
                                    button.setStyle("-fx-background-color: green;");
                                }
				playerGrid.getChildren().add(button);
				button.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						button.setStyle("-fx-background-color: red;");
					}
					});
					
			}

                    
		
				
			
		main.getChildren().add(playerGrid);
		
	}

	public Pane getRoot() {
		return main;
	}
	

}