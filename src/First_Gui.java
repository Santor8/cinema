import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class First_Gui extends JFrame {
	private JButton EntryButton;
	private JButton ReserveButton;
	private JButton CancelButton;
	private JLabel Label;
	private JPanel Panel;
	

	public First_Gui()
	{
		//ΑΡΧΙΚΟΠΟΙΗΣΗ ΣΤΟΙΧΕΙΩΝ ΠΑΝΕΛ
	   
	
		EntryButton = new JButton("Καταχώρηση Ταινίας");
		ReserveButton = new JButton("Κράτηση Εισητηρίου");
		CancelButton = new JButton("Ακύρωση Κράτησης");
		Label = new JLabel("Σύστημα Διαχείρισης Κινηματογράφου");
		Panel = new JPanel();
		
		
		
		//ΤΟΠΟΘΕΤΗΣΗ ΣΤΗ ΜΕΣΗ ΣΕ ΛΙΣΤΑ
		Panel.add(Label);
		Label.setAlignmentX(Component.CENTER_ALIGNMENT);
		Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
		EntryButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		Panel.add(EntryButton);
		ReserveButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		Panel.add(ReserveButton);
		CancelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		Panel.add(CancelButton);
		
		
		
		
		ButtonListener listener = new ButtonListener();
		EntryButton.addActionListener(listener);
		ReserveButton.addActionListener(listener);
		ReserveButton.addActionListener(listener);	
		
		
		
		
		
	
	
		this.setContentPane(Panel);
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(400, 300);
		this.setTitle("Κύρια Οθόνη");
		this.getContentPane().setBackground(Color.YELLOW);
		this.setDefaultCloseOperation(First_Gui.EXIT_ON_CLOSE);
		
			
	}
	
	class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(EntryButton))
			{
				new Entry_Gui();
			}
			else if (e.getSource().equals(ReserveButton))
			{
				
			}
			else if (e.getSource().equals(CancelButton))
			{
				
			}
		}
		
	}
	

}
