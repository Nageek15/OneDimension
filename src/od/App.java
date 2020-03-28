package od;

import java.awt.Toolkit;

import javax.swing.JFrame;

import gameutil.text.Console;

public class App {
	static JFrame f;
	
	public static void main(String[] unicorns) {
		new Panel();
		f=new JFrame();
		f.setAlwaysOnTop(true);
		f.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		f.setUndecorated(true);
		f.add(Panel.instance);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	
}
