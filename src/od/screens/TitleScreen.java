package od.screens;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import graphics.screen.Screen;
import od.Assets;
import od.Button;
import od.Panel;

public class TitleScreen extends Screen {
	
	Button ExitButton=new Button(Assets.EXIT_BUTTON,Panel.getCenterX()-Assets.EXIT_BUTTON.getWidth(null)/2,Panel.getCenterY()+Assets.LOGO.getHeight(null)/2+50);
	Button PlayButton=new Button(Assets.PLAY_BUTTON,Panel.getCenterX()-Assets.PLAY_BUTTON.getWidth(null)/2,Panel.getCenterY()-Assets.LOGO.getHeight(null)/2-75);
	
	@Override
	public void paint(Graphics g) {
		ExitButton.paint(g);
		PlayButton.paint(g);
		g.drawImage(Assets.LOGO, Panel.getCenterX()-Assets.LOGO.getWidth(null)/2, Panel.getCenterY()-Assets.LOGO.getHeight(null)/2, Panel.instance);
		g.drawImage(Assets.ONE_DIMENSION, Panel.getCenterX()-Assets.ONE_DIMENSION.getWidth(null)/2, Panel.getCenterY()-Assets.ONE_DIMENSION.getHeight(null)/2-300, Panel.instance);
	}

	@Override
	public void update() {
		
	}
	
	public void mousePressed(MouseEvent e) {
		if (e.getButton()==MouseEvent.BUTTON1) {
			if (ExitButton.getRectangle().contains(e.getPoint())){
				System.exit(0);
			}
		}
	}
	
	@Override
	public void setInit() {
		Panel.instance.setBackground(Color.GRAY);
	}

}
