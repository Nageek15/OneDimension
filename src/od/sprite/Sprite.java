package od.sprite;

import java.awt.Color;

import gameutil.geom.g1D.Point1D;
import gameutil.geom.g1D.Vector1D;

public class Sprite {
	
	protected Point1D pos;
	protected Color color;
	
	public Sprite(Point1D pos) {
		this.pos=pos;
		color=Color.black;
	}
	
	public Sprite(Point1D pos,Color color) {
		this.color=color;
	}
	
	public void move(Vector1D v) {
		pos=new Point1D(pos.getX()+v.getMagnetude());
	}
	
	public Color getColor() {
		return color;
	}
	
	public Point1D pos() {
		return (Point1D) pos.clone();
	}
}
