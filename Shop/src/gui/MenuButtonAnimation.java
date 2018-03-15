package gui;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class MenuButtonAnimation {
	

	
	MenuButtonAnimation(Line one, Line two, Line three, boolean active)
	{
		animationSwitch(one, two, three, active);
	}

	
	
	public void animationSwitch(Line one, Line two, Line three, boolean active) {
	
		if(!active)
		{
			FadeTransition ft1 = new FadeTransition(Duration.seconds(0.0), two);	
			ft1.setToValue(0);
			TranslateTransition tt2 = new TranslateTransition(Duration.seconds(0.3), one);
			tt2.setToY(6);
			TranslateTransition tt3 = new TranslateTransition(Duration.seconds(0.3), three);
			tt3.setToY(-6);
			RotateTransition rt1 = new RotateTransition(Duration.seconds(0.3), one);
			rt1.setToAngle(45);
			RotateTransition rt2 = new RotateTransition(Duration.seconds(0.3), three);
			rt2.setToAngle(-45);			
			ParallelTransition pt = new ParallelTransition(ft1, tt2, tt3, rt1, rt2);
			pt.play();
		
		}
		
		if(active)
		{
			FadeTransition ft1 = new FadeTransition(Duration.seconds(0.3), two);	
			ft1.setToValue(1);
			TranslateTransition tt2 = new TranslateTransition(Duration.seconds(0.3), one);
			tt2.setToY(0);
			TranslateTransition tt3 = new TranslateTransition(Duration.seconds(0.3), three);
			tt3.setToY(0);
			RotateTransition rt1 = new RotateTransition(Duration.seconds(0.3), one);
			rt1.setToAngle(0);
			RotateTransition rt2 = new RotateTransition(Duration.seconds(0.3), three);
			rt2.setToAngle(0);			
			ParallelTransition pt = new ParallelTransition(ft1, tt2, tt3, rt1, rt2);
			pt.play();	
		
			
		}
		
	}
}
