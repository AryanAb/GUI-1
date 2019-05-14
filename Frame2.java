import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame2 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel controlPanel2;
    private JPanel controlPanel3;
    private JPanel controlPanel4;
    private JPanel controlPanel5;
    private JPanel controlPanel6;
    private JPanel controlPanel7;
    private JPanel controlPanel8;
    private JPanel controlPanel9;
    private JPanel controlPanel10;

    private boolean isCorrect = false;

    private JPanel[] panels = {controlPanel, controlPanel2, controlPanel3, controlPanel4, controlPanel5, controlPanel6, controlPanel7,
    controlPanel8, controlPanel9, controlPanel10};

    JButton _continue = new JButton("Continue");
    JButton _continue2 = new JButton("Continue");


    public Frame2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Frame2 swingControlDemo = new Frame2();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Quiz");
        mainFrame.setSize(400, 650);
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

        // Question 1
        controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.PAGE_AXIS));
        controlPanel.setVisible(true);

        // Question 2
        controlPanel2 = new JPanel();
        controlPanel2.setLayout(new BoxLayout(controlPanel2, BoxLayout.PAGE_AXIS));
        controlPanel2.setVisible(false);

        // Question 3
        controlPanel3 = new JPanel();
        controlPanel3.setLayout(new BoxLayout(controlPanel3, BoxLayout.PAGE_AXIS));
        controlPanel3.setVisible(false);

        // Question 4
        controlPanel4 = new JPanel();
        controlPanel4.setLayout(new BoxLayout(controlPanel4, BoxLayout.PAGE_AXIS));
        controlPanel4.setVisible(false);

        // Question 5
        controlPanel5 = new JPanel();
        controlPanel5.setLayout(new BoxLayout(controlPanel5, BoxLayout.PAGE_AXIS));
        controlPanel5.setVisible(false);

        // Question 6
        controlPanel6 = new JPanel();
        controlPanel6.setLayout(new BoxLayout(controlPanel6, BoxLayout.PAGE_AXIS));
        controlPanel6.setVisible(false);

        // Question 7
        controlPanel7 = new JPanel();
        controlPanel7.setLayout(new BoxLayout(controlPanel7, BoxLayout.PAGE_AXIS));
        controlPanel7.setVisible(false);

        // Question 8
        controlPanel8 = new JPanel();
        controlPanel8.setLayout(new BoxLayout(controlPanel8, BoxLayout.PAGE_AXIS));
        controlPanel8.setVisible(false);

        //Question 9
        controlPanel9 = new JPanel();
        controlPanel9.setLayout(new BoxLayout(controlPanel9, BoxLayout.PAGE_AXIS));
        controlPanel9.setVisible(false);

        // Question 10
        controlPanel10 = new JPanel();
        controlPanel10.setLayout(new BoxLayout(controlPanel10, BoxLayout.PAGE_AXIS));
        controlPanel10.setVisible(false);

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        // ===============================Question 1=================================================
        headerLabel.setText("How do you make effective passwords?");

        String b1String = "Have at least 12 characters";
        String b2String = "Do not rely on obvious substitution (e.g. p@ssw0rd)";
        String b3String = "Include numbers, symbols, capital letters, and lower case letters";
        String b4String = "Do not use obvious words (e.g. password)";
        String b5String = "All of the above";

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

        JRadioButton b5 = new JRadioButton(b5String);
        b5.setMnemonic(KeyEvent.VK_E);
        b5.setActionCommand(b5String);


        JButton submit = new JButton("Submit");

        controlPanel.add(b1);
        controlPanel.add(b2);
        controlPanel.add(b3);
        controlPanel.add(b4);
        controlPanel.add(b5);

        controlPanel.add(submit);

        _continue.setEnabled(false);
        controlPanel.add(_continue);

        mainFrame.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);
        group.add(b4);
        group.add(b5);


        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());
        b5.addActionListener(new ButtonClickListener());
        submit.addActionListener(new ButtonClickListener());
        _continue.addActionListener(new ButtonClickListener());

        //===================================================================================================================

        //===========================================Question 2=========================================

        String b6String = "Accepting a prompt or pop-up without reading it first";
        String b7String = "Downloading software from an unreliable source";
        String b8String = "Opening email attachments from unknown senders";
        String b9String = "Pirating media such as movies, music, or games";
        String b10String = "All of the above";

        JRadioButton b6 = new JRadioButton(b6String);
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand(b1String);
        b1.setSelected(true);

        JRadioButton b7 = new JRadioButton(b7String);
        b2.setMnemonic(KeyEvent.VK_C);
        b2.setActionCommand(b2String);

        JRadioButton b8 = new JRadioButton(b8String);
        b3.setMnemonic(KeyEvent.VK_D);
        b3.setActionCommand(b3String);

        JRadioButton b9 = new JRadioButton(b9String);
        b4.setMnemonic(KeyEvent.VK_R);
        b4.setActionCommand(b4String);

        JRadioButton b10 = new JRadioButton(b10String);
        b5.setMnemonic(KeyEvent.VK_E);
        b5.setActionCommand(b5String);


        JButton submit2 = new JButton("Submit");


        controlPanel2.add(b6);
        controlPanel2.add(b7);
        controlPanel2.add(b8);
        controlPanel2.add(b9);
        controlPanel2.add(b10);

        controlPanel2.add(submit2);

        _continue2.setEnabled(false);
        controlPanel2.add(_continue2);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(b6);
        group2.add(b7);
        group2.add(b8);
        group2.add(b9);
        group2.add(b10);


        b6.addActionListener(new ButtonClickListener());
        b7.addActionListener(new ButtonClickListener());
        b8.addActionListener(new ButtonClickListener());
        b9.addActionListener(new ButtonClickListener());
        b10.addActionListener(new ButtonClickListener());
        submit2.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //==================================Question 3===================================================



        //===============================================================================================
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            if (command.equals("All of the above")) {
                isCorrect = true;
            }
            if (command.equals("Submit") && isCorrect) {
                statusLabel.setText("Correct!");
                _continue.setEnabled(true);

            }else if (command.equals("Submit") && !isCorrect) {
                statusLabel.setText("Wrong!");
            }
            if (command.equals("Continue")){
                mainFrame.remove(statusLabel);
                headerLabel.setText("How can you get spyware?");
                mainFrame.remove(controlPanel);
                mainFrame.add(controlPanel2);
                controlPanel2.setVisible(true);
            }
        }
    }
}