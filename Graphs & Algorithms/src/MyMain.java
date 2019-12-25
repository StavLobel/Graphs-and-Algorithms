import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMain extends JFrame{

	public static void main(String[] args) {
		MyMain m1 = new MyMain();
		m1.setSize(600, 600);
		m1.setResizable(false);
		m1.setTitle("My Frame !!!");
		JLabel l1 = new JLabel("Hello World !!!");
		m1.add(l1);
		m1.setVisible(true);
	}

}
