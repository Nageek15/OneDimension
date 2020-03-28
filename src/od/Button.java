package od;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Button {
	
	Image image;
	Rectangle r;
	
	public Button(Image i,Rectangle r) {
		image=i;
		this.r=r;
	}
	
	public Button(Image i,int x,int y) {
		image=i;
		r=new Rectangle(x,y,image.getWidth(null),image.getHeight(null));
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, r.x, r.y, r.width, r.height, null);
	}
	
	public Rectangle getRectangle() {
		return r;
	}
	
	public Image getImage() {
		return image;
	}
}
