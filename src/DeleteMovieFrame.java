import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteMovieFrame extends JFrame {

    private JPanel panel;
    private JLabel titlePrompt;
    private JComboBox<String> titleCombo;
    private JButton deleteButton;
    private ButtonListener listener;
    private String[] movies = {"Movie1", "Movie1", "Movie1", "Movie1", "Movie1", "Movie1", "Movie1"};

    DeleteMovieFrame(){
        panel = new JPanel();
        listener = new ButtonListener();


        titlePrompt = new JLabel("Τίτλος");
        //titlePrompt.setBounds(10, 10, 100, 100);

        titleCombo = new JComboBox<>(movies);
        titleCombo.setMaximumRowCount(5);

        deleteButton = new JButton("Διαγραφή");
        deleteButton.addActionListener(listener);



        panel.add(titlePrompt);
        panel.add(titleCombo);
        panel.add(deleteButton);

        this.setContentPane(panel);
        this.setTitle("Διαγραφή Ταινίας");
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(deleteButton)){

                JOptionPane.showConfirmDialog(panel, "Are you sure you want to delete this movie?");
            }
        }
    }

}
