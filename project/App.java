package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class App {

	private JFrame frame;
	private JLabel ArrayLables[][];
	private int playerturn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ArrayLables= new JLabel[6][7];
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		ConnectFour Game = new ConnectFour();
		
		JLabel lblTurnPlayer = new JLabel("Turn : Player 1");
		lblTurnPlayer.setFont(new Font("Nanum Gothic", Font.BOLD, 16));
		lblTurnPlayer.setBounds(292, 72, 144, 29);
		frame.getContentPane().add(lblTurnPlayer);
		
		JButton btnColumn0 = new JButton("Put");
		btnColumn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Game.addcoin(0);
				
				JLabel temp = ArrayLables[Game.lowestindex][0];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(0) == true) {
					btnColumn0.setVisible(false);
				}
			}
		});
		btnColumn0.setBounds(100, 533, 56, 29);
		frame.getContentPane().add(btnColumn0);
		
		JButton btnColumn1 = new JButton("Put");
		btnColumn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Game.addcoin(1);
				
				JLabel temp = ArrayLables[Game.lowestindex][1];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(1) == true) {
					btnColumn1.setVisible(false);
				}
			}
		});
		btnColumn1.setBounds(170, 533, 56, 29);
		frame.getContentPane().add(btnColumn1);
		
		JButton btnColumn2 = new JButton("Put");
		btnColumn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Game.addcoin(2);
				
				JLabel temp = ArrayLables[Game.lowestindex][2];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(2) == true) {
					btnColumn2.setVisible(false);
				}
			}
		});
		btnColumn2.setBounds(240, 533, 56, 29);
		frame.getContentPane().add(btnColumn2);
		
		JButton btnColumn3 = new JButton("Put");
		btnColumn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Game.addcoin(3);
				
				JLabel temp = ArrayLables[Game.lowestindex][3];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(3) == true) {
					btnColumn3.setVisible(false);
				}
			}
		});
		btnColumn3.setBounds(310, 533, 56, 29);
		frame.getContentPane().add(btnColumn3);
		
		JButton btnColumn4 = new JButton("Put");
		btnColumn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Game.addcoin(4);
				
				JLabel temp = ArrayLables[Game.lowestindex][4];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(4) == true) {
					btnColumn4.setVisible(false);
				}
			}
		});
		btnColumn4.setBounds(380, 533, 56, 29);
		frame.getContentPane().add(btnColumn4);
		
		JButton btnColumn5 = new JButton("Put");
		btnColumn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Game.addcoin(5);
				
				JLabel temp = ArrayLables[Game.lowestindex][5];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(5) == true) {
					btnColumn5.setVisible(false);
				}
			}
		});
		btnColumn5.setBounds(450, 533, 56, 29);
		frame.getContentPane().add(btnColumn5);
		
		JButton btnColumn6 = new JButton("Put");
		btnColumn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Game.addcoin(6);
				
				JLabel temp = ArrayLables[Game.lowestindex][6];
				if(Game.getCount() == 1) {
					temp.setIcon(new ImageIcon(App.class.getResource("/BlackBoard.png")));
				}
				else if(Game.getCount() == 2){
					temp.setIcon(new ImageIcon(App.class.getResource("/RedBoard.png")));
					
				}
				setTurnLabel(lblTurnPlayer, Game.getCount());
				if(Game.isFull(6) == true) {
					btnColumn6.setVisible(false);
				}
			}
		});
		btnColumn6.setBounds(520, 533, 56, 29);
		frame.getContentPane().add(btnColumn6);
		
		
		
		
		
		
		
		int x;
		int y = 50;
		for(int r = 0; r < 6; r++) {
			y = y + 66;
			x = 100;
			for(int c = 0; c < 7; c++) {
				JLabel temp = new JLabel("");
				temp.setBounds(x,y,70,70);
				frame.getContentPane().add(temp);
				temp.setIcon(new ImageIcon(App.class.getResource("/BlankBoard.png")));
				ArrayLables[r][c] = temp;
				x += 68;

			}
		}
		
		
		
		
		
		
		
	}
	public void setTurnLabel(JLabel label , int num){
		
	
		int nextPlayer = 0;
		
		if(num == 1 ) {
			nextPlayer = 2;
		}
		else if(num == 2) {
			nextPlayer = 1;
		}
		
		String temp = "Turn : Player " + nextPlayer;
		label.setText(temp);
	}
}
