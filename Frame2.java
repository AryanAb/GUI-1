import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame2 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public Frame2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Frame2 swingControlDemo = new Frame2();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 3));
        mainFrame.setResizable(false);

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        //controlPanel.setLayout(new FlowLayout());
        controlPanel.setLayout(null);

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        headerLabel.setText("How do you make effective passwords?");

        String b1String = "Have at least 12 characters";
        String b2String = "Rely on obvious substitution (e.g. p@ssw0rd)";
        String b3String = "Include numbers, symbols, capital letters, and lower case letters";
        String b4String = "Use obvious words (e.g. password)";

        JRadioButton b1 = new JRadioButton(b1String);
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand(b1String);
        b1.setSelected(true);

        JRadioButton b2 = new JRadioButton(b2String);
        b2.setMnemonic(KeyEvent.VK_C);
        b2.setActionCommand(b2String);

        JRadioButton b3 = new JRadioButton(b3String);
        b3.setMnemonic(KeyEvent.VK_D);
        b3.setActionCommand(b3String);

        JRadioButton b4 = new JRadioButton(b4String);
        b4.setMnemonic(KeyEvent.VK_R);
        b4.setActionCommand(b4String);

        JButton submit = new JButton("Submit");

        controlPanel.add(b1);
        controlPanel.add(b2);
        controlPanel.add(b3);
        controlPanel.add(b4);

        controlPanel.add(submit);

        submit.setBounds(200, 200, 50, 100);

        mainFrame.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);
        group.add(b4);


        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());


    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("A")) {
                statusLabel.setText("A Button clicked.");
            } else if (command.equals("B")) {
                statusLabel.setText("B Button clicked.");
            } else if (command.equals("C")) {
                statusLabel.setText("C Button clicked.");
            } else{
                statusLabel.setText("D Button clicked.");
            }
        }
    }
}