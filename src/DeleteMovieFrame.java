import javax.swing.*;
import java.awt.*;

public class DeleteMovieFrame extends JFrame {


    private JPanel panel;
    private JLabel titlePrompt;
    private JComboBox titleField;
    private JButton deleteButton;
    private String[] movies = {"", "John Wick 1", "John Wick 2", "John Wick 3", "Snowden", "Snowden", "Snowden", "Snowden"};

    public DeleteMovieFrame() {

        panel = new JPanel();

        titlePrompt = new JLabel("Τίτλος");
        titleField = new JComboBox(movies);
        titleField.setMaximumRowCount(5);
        deleteButton = new JButton("Διαγραφή");




        panel.setLayout(null);

        titlePrompt.setBounds(20,20,100,25);
        titleField.setBounds(100,20,200,20);

        panel.add(titlePrompt);
        panel.add(titleField);

        deleteButton.setBounds(280,80,100,25);
        panel.add(deleteButton);


        this.setContentPane(panel);
        this.setTitle("Διαγραφή Ταινίας");
        this.setVisible(true);
        this.setSize(400, 150);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
