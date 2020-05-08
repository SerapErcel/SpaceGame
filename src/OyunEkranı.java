//-----------------------------------UZAY OYUNU 2-----------------------------------------
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OyunEkraný extends JFrame {

	public OyunEkraný(String title) {
		super(title);
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		OyunEkraný ekran=new OyunEkraný("uzay Oyunu");
		ekran.setResizable(false);
		ekran.setFocusable(false);
		ekran.setSize(800,600);
		ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		oyun oyun=new oyun();
		oyun.requestFocus();
		oyun.addKeyListener(oyun);
		oyun.setFocusable(true);
		oyun.setFocusTraversalKeysEnabled(false);
		
		ekran.add(oyun);
		ekran.setVisible(true);
	}
}

