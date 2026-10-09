package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class JPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal window = new JPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JMenuBar menuBar = new JMenuBar();
		springLayout.putConstraint(SpringLayout.NORTH, menuBar, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, menuBar, 0, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(menuBar);
		
		JButton btnNewButton_1 = new JButton("Crear Personaje");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Personajes");
		menuBar.add(btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 4, SpringLayout.SOUTH, menuBar);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -88, SpringLayout.EAST, frame.getContentPane());
		
		JButton btnNewButton_2 = new JButton("Mundo");
		menuBar.add(btnNewButton_2);
	}
}
