package gui;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javafx.fxml.FXML;

import javafx.scene.shape.Line;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.Pane;

public class StartFXMLController {
	@FXML
	private Pane buttonMenu;
	@FXML
	private Line lineOne;
	@FXML
	private Line lineTwo;
	@FXML
	private Line lineThree;
	@FXML
	private Pane sidePane;
	
	
	
	private boolean sidePaneActive = false;
	private Timer timer;
	
	// Event Listener on Pane[#buttonMenu].onMouseClicked
	@FXML
	public void menuAction(MouseEvent event) throws InterruptedException {
		timer = new Timer();
	
		
			if(!sidePaneActive)
			{		
				timer.schedule(new AsidePaneAnimation(sidePane, lineOne, lineTwo, lineThree, sidePaneActive, timer), 300);			
				sidePaneActive = true;			
			}
			else
			{
				timer.schedule(new AsidePaneAnimation(sidePane, lineOne, lineTwo, lineThree, sidePaneActive, timer), 300);
				sidePaneActive = false;								
			}
	}
}
