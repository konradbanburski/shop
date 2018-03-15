package gui;

import javafx.animation.TranslateTransition;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class SlidePaneAnimation {
	
	SlidePaneAnimation(Pane sidePane, boolean active)
	{
		animationSlide(sidePane, active);
	}

	public void animationSlide(Pane sidePane, boolean active)
	{
		if(!active)
		{
			TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), sidePane);	
			tt1.setToX(-200);
			tt1.play();
		}
		if(active)
		{
			TranslateTransition tt1 = new TranslateTransition(Duration.seconds(0.5), sidePane);	
			tt1.setToX(200);
			tt1.play();
		}
	}
}
