package od;

import java.awt.Toolkit;

import graphics.screen.SPanel;
import od.screens.*;

public class Panel extends SPanel{
	
	public static Panel instance;
	
	public Panel() {
		instance=this;
		addScreen(new TitleScreen(),"title");
		addScreen(new GameScreen(),"game");
		setScreen("title");
		start();
	}
	
	public static int getCenterX() {
		return Toolkit.getDefaultToolkit().getScreenSize().width/2;
	}
	
	public static int getCenterY() {
		return Toolkit.getDefaultToolkit().getScreenSize().height/2;
	}
}
