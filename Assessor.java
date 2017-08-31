/**
 * Created by CTN on 8/29/17.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assessor extends JPanel implements ActionListener {

    int status = 0;
    private JPanel firstPanel;

    // if status=1 Question 1 (menu)
// if status=2 Question 2 (checkboxes)
// if status=3 Question 3 (buttons)
// if status=4 Question 4 (text field)
// if status=0 <author name>

    String[] messageStrings = {"Message 1", "Message 2", "Message 3"};
    private JComboBox<String> messageList = new JComboBox<String>(messageStrings);
    //private JComboBox messageList = new JComboBox(messageStrings);
    private JLabel lblText = new JLabel("");
    private JLabel title = new JLabel("Courtney Ngai");

    public Assessor() {
        setLayout(new GridLayout(3,1));
        messageList.addActionListener(this);
        add(title);
    }

    public void changeState(int state) {
        status = state;
        switch(status) {
            case 0: //Has the title for my name
                removeAll();
                title.setText("Courtney Ngai");
                add(title);
                revalidate();
                repaint();
                break;
            case 1: //JComboBox Section
                removeAll();
                title.setText("Question 1");
                add(title);
                add(messageList);
                add(lblText);
                revalidate();
                repaint();
                break;
            case 2: //JComboBox Section
                removeAll();
                title.setText("Question 2");
                add(title, BorderLayout.NORTH);
                revalidate();
                repaint();
                break;
            case 3:
                removeAll();
                title.setText("Question 3");
                add(title);
                revalidate();
                repaint();
                break;
            case 4:
                removeAll();
                title.setText("Question 4");
                add(title);
                revalidate();
                repaint();
                break;
            case 5:
                removeAll();
                title.setText("Question 5");
                add(title);
                revalidate();
                repaint();
                break;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == messageList) {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();
            switch(msg) {
                case "Message 1": lblText.setText("You selected Message 1.");
                    break;
                case "Message 2": lblText.setText("You selected Message 2!");
                    break;
                case "Message 3": lblText.setText("You selected Message 3 - awesome!");
                    break;
                default:
                    lblText.setText("No Message selected.");
            }
        }
    }
}