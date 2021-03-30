
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Entry_Gui extends JFrame{

	
	private JTextField TitleField;
	private JLabel TitleLabel;
	private JLabel CategoryLabel;
	private JLabel MovieScreeningsLabel;
	private JPanel Panel;
	
	
	public Entry_Gui()
	{
		//ΑΡΧΙΚΟΠΟΙΗΣΗ ΣΤΟΙΧΕΙΩΝ ΠΑΝΕΛ
		
		//Container contentPane = this.getContentPane();
		
		TitleField = new JTextField();
		TitleLabel = new JLabel("Τίτλος");
		CategoryLabel = new JLabel("Κατηγορία");
		MovieScreeningsLabel = new JLabel("Προβολές");
		Panel = new JPanel();
		
		//Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
		Panel.setLayout(new GridLayout(3, 2));
		
		Panel.add(TitleLabel);
	//	TitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Panel.add(TitleField);
		
		//TitleField.setMinimumSize( TitleField.getPreferredSize() );	
		
		Panel.add(CategoryLabel);
	//	CategoryLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Panel.add(MovieScreeningsLabel); 
	//	ProbolesLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		


		
		this.setContentPane(Panel);
		this.setVisible(true);
		this.setResizable(true);
		this.setSize(300, 300);
		this.setTitle("Καταχώρηση Ταινίας");
		this.setDefaultCloseOperation(Entry_Gui.EXIT_ON_CLOSE);
		
		
	}
}
