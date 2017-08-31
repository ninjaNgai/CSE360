/**
 * Created by CTN on 8/29/17.
 */
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class TestApp extends JFrame {

    public TestApp() {
        setTitle("MyFrame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Assessor assessorPanel = new Assessor();
        //pack();  // this tells the layout managers to do their thing
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        TestApp frame = new TestApp();

        //Add components
        Assessor assessorPanel = new Assessor();
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 0);

        //slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = slider.getValue();
               switch(value) {
                   case 0:
                       System.out.println("0");
                       assessorPanel.changeState(value);
                       break;
                   case 1:
                       System.out.println("1");
                       assessorPanel.changeState(value);
                       break;
                   case 2:
                       System.out.println("2");
                       assessorPanel.changeState(value);
                       break;
                   case 3:
                       System.out.println("3");
                       assessorPanel.changeState(value);
                       break;
                   case 4:
                       System.out.println("4");
                       assessorPanel.changeState(value);
                       break;
                   case 5:
                       System.out.println("5");
                       assessorPanel.changeState(value);
                       break;
                }
            }
        });

        frame.setLayout(new GridLayout(2,1));
        frame.add(assessorPanel);  // Add Assessor Panel
        frame.add(slider);

        frame.setVisible(true);
    }
}
