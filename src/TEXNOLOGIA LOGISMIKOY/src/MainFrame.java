import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame  extends JFrame implements ActionListener{
	
	private JPanel Panel,panel1,panel2,panel3,panel4;
	private JLabel field1,field2,field3;
	private JButton LOGIN1,LOGIN2,EXITBUTTON; 
	


	
	
	MainFrame() {
		Panel = new JPanel();
		Panel.setLayout(new BorderLayout(20,20));
		Panel.setBackground(Color.white);
		//ImageIcon  icon1 = new ImageIcon("exit-icon-graphic-design-template-vector-23546904.jpg");
		
		panel1 = new JPanel();
			panel1.setPreferredSize(new Dimension(200,200));
			panel1.setBackground(Color.white);
				panel2 = new JPanel(new GridLayout(2,2,10,10)) ;
				panel2.setPreferredSize(new Dimension(100,100));
					panel2.setBackground(Color.white);
						panel3 = new JPanel();
							panel3.setBackground(Color.white);
								
				
		LOGIN1 = new JButton("Staff Log In");
			LOGIN1.setPreferredSize(new Dimension(20,60));
			LOGIN2 = new JButton("Admin Log In");
				EXITBUTTON =  new JButton("EXIT");
			
		field1 = new JLabel();
			field1.setBackground(Color.white);
				field1.setText("      WELCOME TO THE CINEMA MANAGMENT SYSTEM");
					field1.setForeground(Color.black);
		
		field2 = new JLabel();
			field2.setBackground(Color.white);		
				field2.setText("MEMBER OF STAFF");
					field2.setForeground(Color.black);
				
		field3 = new JLabel();
			field3.setBackground(Color.white);
				field3.setText("ADMINISTRATOR");
					field3.setForeground(Color.black);
	
		panel1.add(field1,panel1.CENTER_ALIGNMENT);	
			Panel.add(field1,BorderLayout.NORTH);
		
		panel2.setPreferredSize(new Dimension(100,100));
			panel2.add(field2);
				panel2.add(LOGIN1);
					panel2.add(field3);
						panel2.add(LOGIN2);
							Panel.add(panel2,BorderLayout.CENTER);
						
		panel3.setPreferredSize(new Dimension(50,50));
			panel3.add(EXITBUTTON,panel3.CENTER_ALIGNMENT);
				Panel.add(panel3,BorderLayout.SOUTH);
		
		ImageIcon  icon = new ImageIcon("cinema-logo_23-2147503279.jpg");
		
		this.setSize(450,350);
		this.setIconImage(icon.getImage());
		this.setContentPane(Panel);
		this.setVisible(true);
		this.pack();
		this.setResizable(false);
		this.setTitle("Entrance Frame");
		this.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
