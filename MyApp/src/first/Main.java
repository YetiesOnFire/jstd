package first;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main implements ActionListener {
		JButton button;
		
		
	public static void main(String[] args) {
	Main gui = new Main();
	gui.go();
	}
	public void go() {
		 JFrame frame = new JFrame();
		 button = new JButton("Start");
		 button.addActionListener(this);
		 
		 
		 frame.getContentPane().add(button);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(300,300);
		 frame.setVisible(true);
		 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		button.setText("clicked");
		
	}
	
}
