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
    private JPanel controlPanel11;

    private JTextField t1 = new JTextField("Type your answer here");
    private JTextField t2 = new JTextField("Type your answer here");

    private boolean isCorrect = false;

    private JPanel[] panels = new JPanel[11];

    private String[] questions = {"1. How do you make effective passwords?",
            "2. How can you get spyware?",
            "<html>3. Spyware is an unwanted software that infiltrates your computing device, stearing your internet usage data and sensitive information</html>",
    "<html>4. A ________ is a type of surveillance technology used to monitor and record each keystroke typed on a specific computer's keyboard.</html>",
            "5. There is no need to read the term and condition.",
    "6. How can you prevent spyware?",
    "7. Piracy is unethical",
    "<html>8. If you receive calls from collection agencies or creditors for an account you don't have, you might be a victim of ___________.</html>",
    "9. How can you identify if the email you received is a phishing email?",
    "10. Which of the following is a good password?",
    "<html><i>11. Your Account is Suspended. We will ask for your password only once. Ignoring this message can cause eBay TKO delete your account forever.</i> What kind of unethical computer use is this?</html>"
    };

    private int panelIndex = 0;

    //String textValue= "";

    private JButton _continue = new JButton("Continue");
    private JButton _continue2 = new JButton("Continue");
    private JButton _continue3 = new JButton("Continue");
    private JButton _continue4 = new JButton("Continue");
    private JButton _continue5 = new JButton("Continue");
    private JButton _continue6 = new JButton("Continue");
    private JButton _continue7 = new JButton("Continue");
    private JButton _continue8 = new JButton("Continue");
    private JButton _continue9 = new JButton("Continue");
    private JButton _continue10 = new JButton("Continue");
    private JButton _continue11 = new JButton("Continue");

    private JButton[] continueButtons = {_continue, _continue2, _continue3, _continue4, _continue5, _continue6, _continue7, _continue8,
            _continue9, _continue10, _continue11};


    private Frame2() {
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
        //mainFrame.setLayout(null);
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
        panels[0] = controlPanel;

        // Question 2
        controlPanel2 = new JPanel();
        controlPanel2.setLayout(new BoxLayout(controlPanel2, BoxLayout.PAGE_AXIS));
        controlPanel2.setVisible(false);
        panels[1] = controlPanel2;

        // Question 3
        controlPanel3 = new JPanel();
        controlPanel3.setLayout(new BoxLayout(controlPanel3, BoxLayout.PAGE_AXIS));
        controlPanel3.setVisible(false);
        panels[2] = controlPanel3;

        // Question 4
        controlPanel4 = new JPanel();
        controlPanel4.setLayout(new BoxLayout(controlPanel4, BoxLayout.PAGE_AXIS));
        controlPanel4.setVisible(false);
        panels[3] = controlPanel4;

        // Question 5
        controlPanel5 = new JPanel();
        controlPanel5.setLayout(new BoxLayout(controlPanel5, BoxLayout.PAGE_AXIS));
        controlPanel5.setVisible(false);
        panels[4] = controlPanel5;

        // Question 6
        controlPanel6 = new JPanel();
        controlPanel6.setLayout(new BoxLayout(controlPanel6, BoxLayout.PAGE_AXIS));
        controlPanel6.setVisible(false);
        panels[5] = controlPanel6;

        // Question 7
        controlPanel7 = new JPanel();
        controlPanel7.setLayout(new BoxLayout(controlPanel7, BoxLayout.PAGE_AXIS));
        controlPanel7.setVisible(false);
        panels[6] = controlPanel7;

        // Question 8
        controlPanel8 = new JPanel();
        controlPanel8.setLayout(new BoxLayout(controlPanel8, BoxLayout.PAGE_AXIS));
        controlPanel8.setVisible(false);
        panels[7] = controlPanel8;

        //Question 9
        controlPanel9 = new JPanel();
        controlPanel9.setLayout(new BoxLayout(controlPanel9, BoxLayout.PAGE_AXIS));
        controlPanel9.setVisible(false);
        panels[8] = controlPanel9;

        // Question 10
        controlPanel10 = new JPanel();
        controlPanel10.setLayout(new BoxLayout(controlPanel10, BoxLayout.PAGE_AXIS));
        controlPanel10.setVisible(false);
        panels[9] = controlPanel10;

        controlPanel11 = new JPanel();
        controlPanel11.setLayout(new BoxLayout(controlPanel11, BoxLayout.PAGE_AXIS));
        controlPanel11.setVisible(false);
        panels[10] = controlPanel11;

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        // ===============================Question 1=================================================
        headerLabel.setText(questions[panelIndex]);

        String b1String = "Have at least 12 characters";
        String b2String = "Do not rely on obvious substitution (e.g. p@ssw0rd)";
        String b3String = "Include numbers, symbols, capital letters, and lower case letters";
        String b4String = "Do not use obvious words (e.g. password)";
        String b5String = "All of the above";

        JRadioButton b1 = new JRadioButton(b1String);
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand(b1String);
        //b1.setSelected(true);

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
        b6.setMnemonic(KeyEvent.VK_B);
        b6.setActionCommand(b1String);
        //b6.setSelected(true);

        JRadioButton b7 = new JRadioButton(b7String);
        b7.setMnemonic(KeyEvent.VK_C);
        b7.setActionCommand(b2String);

        JRadioButton b8 = new JRadioButton(b8String);
        b8.setMnemonic(KeyEvent.VK_D);
        b8.setActionCommand(b3String);

        JRadioButton b9 = new JRadioButton(b9String);
        b9.setMnemonic(KeyEvent.VK_R);
        b9.setActionCommand(b4String);

        JRadioButton b10 = new JRadioButton(b10String);
        b10.setMnemonic(KeyEvent.VK_E);
        b10.setActionCommand(b5String);


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
        _continue2.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //==================================Question 3===================================================

        String _trueString = "True";
        String _falseString = "False";

        JRadioButton _true = new JRadioButton(_trueString);
        _true.setMnemonic(KeyEvent.VK_E);
        _true.setActionCommand(_trueString);

        JRadioButton _false = new JRadioButton(_falseString);
        _false.setMnemonic(KeyEvent.VK_C);
        _false.setActionCommand(_falseString);

        JButton submit3 = new JButton("Submit");

        controlPanel3.add(_true);
        controlPanel3.add(_false);

        controlPanel3.add(submit3);

        _continue3.setEnabled(false);
        controlPanel3.add(_continue3);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(_true);
        group3.add(_false);

        _true.addActionListener(new ButtonClickListener());
        _false.addActionListener(new ButtonClickListener());
        submit3.addActionListener(new ButtonClickListener());
        _continue3.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //======================================Question 4===============================================

        t1.setMaximumSize(new Dimension(500, 45));

        JButton submit4 = new JButton("Submit");

        controlPanel4.add(t1);

        controlPanel4.add(submit4);

        _continue4.setEnabled(false);
        controlPanel4.add(_continue4);

        submit4.addActionListener(new ButtonClickListener());
        _continue4.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //======================================Question 5===============================================

        String _trueString1 = "True ";
        String _falseString1 = "False ";

        JRadioButton _true2 = new JRadioButton(_trueString1);
        _true2.setMnemonic(KeyEvent.VK_B);
        _true2.setActionCommand(_trueString1);

        JRadioButton _false2 = new JRadioButton(_falseString1);
        _false2.setMnemonic(KeyEvent.VK_D);
        _false2.setActionCommand(_falseString1);

        JButton submit5 = new JButton("Submit");

        controlPanel5.add(_true2);
        controlPanel5.add(_false2);

        controlPanel5.add(submit5);

        _continue5.setEnabled(false);
        controlPanel5.add(_continue5);

        ButtonGroup group5 = new ButtonGroup();
        group5.add(_true2);
        group5.add(_false2);

        _true2.addActionListener(new ButtonClickListener());
        _false2.addActionListener(new ButtonClickListener());
        submit5.addActionListener(new ButtonClickListener());
        _continue5.addActionListener(new ButtonClickListener());


        //===============================================================================================

        //============================================Question 6=========================================

        String b11String = "Don't open emails from unknown senders";
        String b12String = "Don't download files from untrustworthy sources";
        String b13String = "Don't click pop-op advertisements";
        String b14String = "Use reputable antivirus software";
        String b15String = "All of the above";

        JRadioButton b11 = new JRadioButton(b11String);
        b11.setMnemonic(KeyEvent.VK_B);
        b11.setActionCommand(b11String);
        //b11.setSelected(true);

        JRadioButton b12 = new JRadioButton(b12String);
        b12.setMnemonic(KeyEvent.VK_C);
        b12.setActionCommand(b12String);

        JRadioButton b13 = new JRadioButton(b13String);
        b13.setMnemonic(KeyEvent.VK_D);
        b13.setActionCommand(b13String);

        JRadioButton b14 = new JRadioButton(b14String);
        b14.setMnemonic(KeyEvent.VK_R);
        b14.setActionCommand(b14String);

        JRadioButton b15 = new JRadioButton(b15String);
        b15.setMnemonic(KeyEvent.VK_E);
        b15.setActionCommand(b15String);


        JButton submit6 = new JButton("Submit");


        controlPanel6.add(b11);
        controlPanel6.add(b12);
        controlPanel6.add(b13);
        controlPanel6.add(b14);
        controlPanel6.add(b15);

        controlPanel6.add(submit6);

        _continue6.setEnabled(false);
        controlPanel6.add(_continue6);

        ButtonGroup group6 = new ButtonGroup();
        group6.add(b11);
        group6.add(b12);
        group6.add(b13);
        group6.add(b14);
        group6.add(b15);


        b11.addActionListener(new ButtonClickListener());
        b12.addActionListener(new ButtonClickListener());
        b13.addActionListener(new ButtonClickListener());
        b14.addActionListener(new ButtonClickListener());
        b15.addActionListener(new ButtonClickListener());
        submit6.addActionListener(new ButtonClickListener());
        _continue6.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //=============================================Question 7========================================

        JRadioButton _true3 = new JRadioButton(_trueString1);
        _true3.setMnemonic(KeyEvent.VK_B);
        _true3.setActionCommand(_trueString);

        JRadioButton _false3 = new JRadioButton(_falseString1);
        _false3.setMnemonic(KeyEvent.VK_D);
        _false3.setActionCommand(_falseString);

        JButton submit7 = new JButton("Submit");

        controlPanel7.add(_true3);
        controlPanel7.add(_false3);

        controlPanel7.add(submit7);

        _continue7.setEnabled(false);
        controlPanel7.add(_continue7);

        ButtonGroup group7 = new ButtonGroup();
        group7.add(_true3);
        group7.add(_false3);

        _true3.addActionListener(new ButtonClickListener());
        _false3.addActionListener(new ButtonClickListener());
        submit7.addActionListener(new ButtonClickListener());
        _continue7.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //============================================Question 8=========================================

        t2.setMaximumSize(new Dimension(500, 45));

        JButton submit8 = new JButton("Submit");

        controlPanel8.add(t2);

        controlPanel8.add(submit8);

        _continue8.setEnabled(false);
        controlPanel8.add(_continue8);

        submit8.addActionListener(new ButtonClickListener());
        _continue8.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //============================================Question 9=========================================

        String b16String = "Wrong company name";
        String b17String = "Spelling or grammar mistakes";
        String b18String = "Questionable deadlines";
        String b19String = "Suspicious links";
        String b20String = "All of the above";

        JRadioButton b16 = new JRadioButton(b16String);
        b16.setMnemonic(KeyEvent.VK_B);
        b16.setActionCommand(b16String);
        //b16.setSelected(true);

        JRadioButton b17 = new JRadioButton(b17String);
        b17.setMnemonic(KeyEvent.VK_C);
        b17.setActionCommand(b17String);

        JRadioButton b18 = new JRadioButton(b18String);
        b18.setMnemonic(KeyEvent.VK_D);
        b18.setActionCommand(b18String);

        JRadioButton b19 = new JRadioButton(b19String);
        b19.setMnemonic(KeyEvent.VK_R);
        b19.setActionCommand(b19String);

        JRadioButton b20 = new JRadioButton(b20String);
        b20.setMnemonic(KeyEvent.VK_E);
        b20.setActionCommand(b20String);


        JButton submit9 = new JButton("Submit");


        controlPanel9.add(b16);
        controlPanel9.add(b17);
        controlPanel9.add(b18);
        controlPanel9.add(b19);
        controlPanel9.add(b20);

        controlPanel9.add(submit9);

        _continue9.setEnabled(false);
        controlPanel9.add(_continue9);

        ButtonGroup group9 = new ButtonGroup();
        group9.add(b16);
        group9.add(b17);
        group9.add(b18);
        group9.add(b19);
        group9.add(b20);


        b16.addActionListener(new ButtonClickListener());
        b17.addActionListener(new ButtonClickListener());
        b18.addActionListener(new ButtonClickListener());
        b19.addActionListener(new ButtonClickListener());
        b20.addActionListener(new ButtonClickListener());
        submit9.addActionListener(new ButtonClickListener());
        _continue9.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //===========================================Question 10=========================================

        String b21String = "ilovecompsci";
        String b22String = "gh1ghiph!@iAhg2!";
        String b23String = "qwerty";
        String b24String = "c0mpsc!";
        String b25String = "p@55word";

        JRadioButton b21 = new JRadioButton(b21String);
        b21.setMnemonic(KeyEvent.VK_B);
        b21.setActionCommand(b21String);
        //b21.setSelected(true);

        JRadioButton b22 = new JRadioButton(b22String);
        b22.setMnemonic(KeyEvent.VK_C);
        b22.setActionCommand(b22String);

        JRadioButton b23 = new JRadioButton(b23String);
        b23.setMnemonic(KeyEvent.VK_D);
        b23.setActionCommand(b23String);

        JRadioButton b24 = new JRadioButton(b24String);
        b24.setMnemonic(KeyEvent.VK_R);
        b24.setActionCommand(b24String);

        JRadioButton b25 = new JRadioButton(b25String);
        b25.setMnemonic(KeyEvent.VK_E);
        b25.setActionCommand(b25String);


        JButton submit10 = new JButton("Submit");


        controlPanel10.add(b21);
        controlPanel10.add(b22);
        controlPanel10.add(b23);
        controlPanel10.add(b24);
        controlPanel10.add(b25);

        controlPanel10.add(submit10);

        _continue10.setEnabled(false);
        controlPanel10.add(_continue10);

        ButtonGroup group10 = new ButtonGroup();
        group10.add(b21);
        group10.add(b22);
        group10.add(b23);
        group10.add(b24);
        group10.add(b25);


        b21.addActionListener(new ButtonClickListener());
        b22.addActionListener(new ButtonClickListener());
        b23.addActionListener(new ButtonClickListener());
        b24.addActionListener(new ButtonClickListener());
        b25.addActionListener(new ButtonClickListener());
        submit10.addActionListener(new ButtonClickListener());
        _continue10.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //========================================Question 11============================================

        String b26String = "Phishing";
        String b27String = "Keystorke logging";
        String b28String = "Cyberbullying";
        String b29String = "None of the above";
        String b30String = "All of the above ";

        JRadioButton b26 = new JRadioButton(b26String);
        b26.setMnemonic(KeyEvent.VK_B);
        b26.setActionCommand(b26String);
        //b26.setSelected(true);

        JRadioButton b27 = new JRadioButton(b27String);
        b27.setMnemonic(KeyEvent.VK_C);
        b27.setActionCommand(b27String);

        JRadioButton b28 = new JRadioButton(b28String);
        b28.setMnemonic(KeyEvent.VK_D);
        b28.setActionCommand(b28String);

        JRadioButton b29 = new JRadioButton(b29String);
        b29.setMnemonic(KeyEvent.VK_R);
        b29.setActionCommand(b29String);

        JRadioButton b30 = new JRadioButton(b30String);
        b30.setMnemonic(KeyEvent.VK_E);
        b30.setActionCommand(b30String);


        JButton submit11 = new JButton("Submit");


        controlPanel11.add(b26);
        controlPanel11.add(b27);
        controlPanel11.add(b28);
        controlPanel11.add(b29);
        controlPanel11.add(b30);

        controlPanel11.add(submit11);

        _continue11.setEnabled(false);
       // controlPanel11.add(_continue11);

        ButtonGroup group11 = new ButtonGroup();
        group11.add(b26);
        group11.add(b27);
        group11.add(b28);
        group11.add(b29);
        group11.add(b30);


        b26.addActionListener(new ButtonClickListener());
        b27.addActionListener(new ButtonClickListener());
        b28.addActionListener(new ButtonClickListener());
        b29.addActionListener(new ButtonClickListener());
        b30.addActionListener(new ButtonClickListener());
        submit11.addActionListener(new ButtonClickListener());
        _continue11.addActionListener(new ButtonClickListener());

        //===============================================================================================

    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            if(command.equals("Submit")){
                if(t1.getText().toLowerCase().equals("keylogger")){
                    isCorrect = true;
                } else if(t2.getText().toLowerCase().equals("identity theft")){
                    isCorrect = true;
                }
            }
            if (command.equals("All of the above")) {
                isCorrect = true;
                //System.out.println("Correct Radio Button Selected");
            } else if(command.equals("True")){
                //System.out.println("Correct Answer Selected");
                isCorrect = true;
            }
            if(command.equals("False ")){
                isCorrect = true;
            }else if(command.equals("True ")) {
                isCorrect = false;
            }
            if(command.equals("gh1ghiph!@iAhg2!")){
                isCorrect = true;
                System.out.println("Correct answer selected");
            }
            if(command.equals("Phishing")){
                isCorrect = true;
            }
            // +++++++++++++++++++++++++++++++++++++++++++fix this++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            if(!command.equals("All of the above") && !command.equals("Submit") && !command.equals("True") && !command.equals("False ") && !command.equals("gh1ghiph!@iAhg2!") && !command.equals("Phishing")){
              isCorrect = false;
                //System.out.println("Wrong Answer Selected");
            }
            if (command.equals("Submit") && isCorrect) {
                mainFrame.add(statusLabel);
                statusLabel.setText("Correct!");
                mainFrame.repaint();
                continueButtons[panelIndex].setEnabled(true);
                //System.out.println("Correct!");
            } else if (command.equals("Submit") && !isCorrect) {
                mainFrame.add(statusLabel);
                statusLabel.setText("Wrong!");
                mainFrame.repaint();
            }
            if (command.equals("Continue")) {
                t1.setText("Enter your answer here");
                t2.setText("Enter your answer here");
                mainFrame.remove(statusLabel);
                mainFrame.repaint();
                headerLabel.setText(questions[panelIndex + 1]);
                mainFrame.remove(panels[panelIndex]);
                mainFrame.add(panels[panelIndex + 1]);
                panels[panelIndex + 1].setVisible(true);
                panelIndex++;
                isCorrect = false;
            }
        }
    }
}