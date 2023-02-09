import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ChildBirthRecordUI extends JFrame {

    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelDateOfBirth;
    private JTextField textFieldDateOfBirth;
    private JButton buttonSubmit;

    public ChildBirthRecordUI() {
        setLayout(new FlowLayout());
        setSize(500, 200);
        setTitle("Child Birth Record");

        labelName = new JLabel("Name: ");
        add(labelName);

        textFieldName = new JTextField(20);
        add(textFieldName);

        labelDateOfBirth = new JLabel("Date of Birth: ");
        add(labelDateOfBirth);

        textFieldDateOfBirth = new JTextField(20);
        add(textFieldDateOfBirth);

        buttonSubmit = new JButton("Submit");
        add(buttonSubmit);

        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add code to insert new birth record into the database
                // using the data entered by the user in the text fields
            }
        });
    }

    public static void main(String[] args) {
        ChildBirthRecordUI frame = new ChildBirthRecordUI();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
