package gui;

import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class AsidePaneAnimation extends TimerTask {

	private Pane sidePane;
	private Line one;
	private Line two;
	private Line three;
	private boolean active;
	Timer timer;
	
	AsidePaneAnimation(Pane sidePane, Line one, Line two, Line three, boolean active, Timer timer)
	{
			this.sidePane = sidePane;
			this.one = one;
			this.two = two;
			this.three = three;
			this.active = active;
			this.timer = timer;
	}
	
	public void run ()
	{
		SlidePaneAnimation slidePaneAnimation = new SlidePaneAnimation(sidePane, active);
		MenuButtonAnimation menuButtonAnimation = new MenuButtonAnimation(one, two, three, active);	
		timer.cancel();
	}
	
}
