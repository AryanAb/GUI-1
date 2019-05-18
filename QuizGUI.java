/*
 * QuizGUI.java
 * Aryan Abed, Joon Kim, and Ivan Lee
 * May 17th 2019
 * To inform and quiz ethics in computer use
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuizGUI {
    // create the frame, header and footer
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;

    // create the panels
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
    private JPanel controlPanel12;
    private JPanel controlPanel13;
    private JPanel controlPanel14;
    private JPanel controlPanel15;
    private JPanel controlPanel16;

    // create text boxes
    private JTextField t1 = new JTextField("Type your answer here");
    private JTextField t2 = new JTextField("Type your answer here");
    private JTextField t3 = new JTextField("Type your answer here");
    private JTextField t4 = new JTextField("Type your answer here");
    private JTextField t5 = new JTextField("Type your answer here");

    // checks if user answered correctly
    private boolean isCorrect = false;

    // an array of type JPanel which contains all the panels with the questions in them
    private JPanel[] panels = new JPanel[16];

    // an array of type String which has all the questions
    private String[] questions = {
            //Question 1, Thinking, Joon's Question (http://www2.connectseward.org/shs/students/students17/evanNottingham/passwordSecurity/create.html)
            "<html>The Traditional Password Advice" + "<br> <br>Has 12 Characters, Minimum: You need to choose a password that’s long enough. You should generally go for passwords that are a minimum of 12 to 14 characters in length. A longer password would be even better. "+
                    "<br><br> Includes Numbers, Symbols, Capital Letters, and Lower-Case Letters: Use a mix of different types of characters to make the password harder to crack. " +
                    "<br><br> Isn’t a Dictionary Word or Combination of Dictionary Words: Stay away from obvious dictionary words and combinations of dictionary words. Any word on its own is bad. Any combination of a few words, especially if they're obvious, is also bad. " +
                    "<br><br>Doesn’t Rely on Obvious Substitutions: Don’t use common substitutions, either ? for example, “H0use” isn’t strong just because you’ve replaced an o with a 0." +

                    "<br> <br>1. How do you make effective passwords? </html>",

            //Question 2, Knowledge Aryan's Question (https://us.norton.com/internetsecurity-how-to-catch-spyware-before-it-snags-you.html )
            "<html><br>Spyware can affect PCs, Macs, and iOS or Android devices. Although Windows operating systems may be more susceptible to attacks, attackers are becoming better at infiltrating Apple’s operating systems as well."+
                    "<br><br>Some of the most common ways your computer can become infected with spyware include these:"+
                    "<br><br>Accepting a prompt or pop-up without reading it first"+
                    "<br><br>Downloading software from an unreliable source"+
                    "<br><br>Opening email attachments from unknown senders"+
                    "<br><br>Pirating media such as movies, music, or games"+

                    "<br><br>2. How can you get spyware?</html>",

            //Question 3, Knowledge, Joon's question (https://us.norton.com/internetsecurity-how-to-catch-spyware-before-it-snags-you.html)
            "<html><br>Spyware can affect PCs, Macs, and iOS or Android devices. Although Windows operating systems may be more susceptible to attacks, attackers are becoming better at infiltrating Apple’s operating systems as well."+

                    "<br><br>3. Spyware is an unwanted software that infiltrates your computing device, stearing your internet usage data and sensitive information</html>",

            //Question 4, Knowledge Aryan's question (https://searchsecurity.techtarget.com/definition/keylogger)
            "<html><br>A keylogger, sometimes called a keystroke logger or system monitor, is a type of surveillance technology used to monitor and record each keystroke typed on a specific computer's keyboard."+
                    "<br><br>Keylogger software is also available for use on smartphones, such as Apple's iPhone and Android devices."+
                    "<br><br>A hardware-based keylogger is a small device that serves as a connector between the computer keyboard and the computer."+
                    "<br><br>The device is designed to resemble an ordinary keyboard PS/2 connector,making it relatively easy for someone who wants to monitor a user's behavior to hide such a device."+

                    "<br><br>4. A ________ is a type of surveillance technology used to monitor and record each keystroke typed on a specific computer's keyboard.</html>",

            //Question 5, Thinking, Aryan's Question (https://channels.theinnovationenterprise.com/articles/the-importance-of-reading-terms-and-conditions)
            "<html><br>When you fail to read the terms and conditions, or what we might call the 'fine print' in any contract, you are setting yourself up for a fall."+
                    "<br><br>5. There is no need to read the term and condition.</html>",

            //Question 6, Application, Joon's question (https://us.norton.com/internetsecurity-how-to-catch-spyware-before-it-snags-you.html)
            "<html><br>Spyware can affect PCs, Macs, and iOS or Android devices. Although Windows operating systems may be more susceptible to attacks, attackers are becoming better at infiltrating Apple’s operating systems as well."+
                    "<br><br>Some of the most common ways your computer can become infected with spyware include these:"+
                    "<br><br>Accepting a prompt or pop-up without reading it first"+
                    "<br><br>Downloading software from an unreliable source"+
                    "<br><br>Opening email attachments from unknown senders"+
                    "<br><br>Pirating media such as movies, music, or games"+

                    "<br><br>6. How can you prevent spyware?</html>",

            //Question 7, Thinking, Ivan's Question
            "<html><br>Commandment 6: Refrain from copying software or buying pirated copies. Pay for software unless it is free" +
                    "<br><br>Explanation: Like any other artistic or literary work, software is copyrighted. A piece of code is the original work of the individual who created it. It is copyrighted in his/her name. "+
                    "<br><br>In case of a developer writing software for the organization she works for, the organization holds the copyright for it. Copyright holds true unless its creators announce it is not. "+
                    "<br><br>Obtaining illegal copies of copyrighted software is unethical and also encourages others to make copies illegally."+

                    "<br><br>7. Piracy is unethical</html>",

            // Question 8, Knowledge, Joon's question (https://www.ontario.ca/page/how-avoid-or-recover-identity-theft)
            "<html><br>Your personal information can be stolen without your knowledge. " +
                    "<br>Many people find out they’ve been the victim of identity theft when they’re denied a loan, job or rent unexpectedly because of a credit check. "+
                    "<br>This is why it’s very important to check your credit report once a year for errors or strange activities. "+
                    "<br>Others signs of identity theft include:"+
                    "<br>bills and statements don't arrive when they are supposed to ? they may have been stolen from your mailbox or someone may have changed the mailing address for your accounts"+
                    "<br>you receive calls from collection agencies or creditors for an account you don't have"+
                    "<br>you receive notification from your bank, credit card or online business about a new account in your name, or added charges"+
                    "<br>financial account statements show withdrawals or transfers you didn't make"+
                    "<br>a creditor calls to say you've been approved or denied credit that you haven't applied for"+

                    "<br><br>8. If you receive calls from collection agencies or creditors for an account you don't have, you might be a victim of ___________.</html>",

            // Question 9, Application, Aryan's question (https://www.computerhope.com/jargon/p/phishing.htm)
            "<html><br>phishing is a term used to describe a malicious individual or group of individuals who scam users. " +
                    "<br>They do so by sending e-mails or creating web pages that are designed to collect an individual's online bank, credit card, or other login information. " +
                    "<br>Because these e-mails and web pages look like legitimate companies users trust them and enter their personal information " +

                    "<br><br>9. How can you identify if the email you received is a phishing email? </html>",

            //Question 10, Application, Joon's question (https://www.howtogeek.com/195430/how-to-create-a-strong-password-and-remember-it/)
            "<html>The Traditional Password Advice" + "<br> <br>Has 12 Characters, Minimum: You need to choose a password that’s long enough. You should generally go for passwords that are a minimum of 12 to 14 characters in length. A longer password would be even better. "+
                    "<br><br>Includes Numbers, Symbols, Capital Letters, and Lower-Case Letters: Use a mix of different types of characters to make the password harder to crack. " +
                    "<br><br> Isn’t a Dictionary Word or Combination of Dictionary Words: Stay away from obvious dictionary words and combinations of dictionary words. Any word on its own is bad. Any combination of a few words, especially if they're obvious, is also bad. " +
                    "<br><br>Doesn’t Rely on Obvious Substitutions: Don’t use common substitutions, either ? for example, “H0use” isn’t strong just because you’ve replaced an o with a 0." +

                    "<br><br>10. Which of the following is a good password? </html>",


            //Question 11, Application, Aryan's question (https://www.computerhope.com/jargon/p/phishing.htm)
            "<html><i>11. Your Account is Suspended. We will ask for your password only once. Ignoring this message can cause eBay TKO delete your account forever.</i> What kind of unethical computer use is this?</html>",

            //Question 12, Knowledge, Ivan's question (www.mpsaz.org/eva/staff/ksrandle/class1/files/1-importance_of_computer_ethics.ppsx)
            "<html><br>What is computer ethics? Ethics is a set of moral principles that govern the behaviour of a group or individual. Therefore, computer ethics is set of moral principles that regulate the use of computers."+
                    "<br>Some common issues of computer ethics include intellectual property rights( such as copyrighted electronic content), privacy concerns, and how computers affect society. "+
                    "<br>Ethical actions are things that don’t cause harm to you or other people. "+

                    "<br><br>12. computer ethics is set of moral principles that ___________ the use of computers. </html>" ,

            //Question 13, Thinking, Ivan's question (www.mpsaz.org/eva/staff/ksrandle/class1/files/1-importance_of_computer_ethics.ppsx)
            "<html>It is unethical to use a computer to cause damage to your own digital property or someone else’s"+
                    "<br>it is wrong to use a computer to steal someone's personal information. Manipulating or destroying files of other users is ethically wrong."+

                    "<br> <br>13. Hacking is ethical.</html>",

            //Question 14, Knowledge, Ivan's question (www.mpsaz.org/eva/staff/ksrandle/class1/files/1-importance_of_computer_ethics.ppsx)
            "<html><br>Rules of tech ethics: " +
                    "<br>Privacy - I will protect my privacy and other people's privacy " +
                    "<br>Property - I will protect my property and other people's property " +
                    "<br>Appropriate Use - I will use technology in constructive ways and in ways that do not break rules set by government" +
                    "<br><br>14. State the 3 rules of tech ethics.",

            //Question 15, Thinking, Ivan's question (www.mpsaz.org/eva/staff/ksrandle/class1/files/1-importance_of_computer_ethics.ppsx)
            "<html>It is unethical to write programs, which on execution lead to stealing, copying or gaining unauthorized access to other users' data."+
                    "<br>Being involved in practices like hacking, spamming, phishing or cyber bullying does not conform to computer ethics."+
                    "<br>15. How can someone access someone else's property?</html>",
            "N/A"
    };

    // index of the current panel
    private int panelIndex = 0;

    // create continue buttons for each panel
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
    private JButton _continue12 = new JButton("Continue");
    private JButton _continue13 = new JButton("Continue");
    private JButton _continue14 = new JButton("Continue");
    private JButton _continue15 = new JButton("Continue");

    // an array of type JButton which contains all the continue buttons
    private JButton[] continueButtons = {_continue, _continue2, _continue3, _continue4, _continue5, _continue6, _continue7, _continue8,
            _continue9, _continue10, _continue11, _continue12, _continue13, _continue14, _continue15};

    // create submit buttons
    private JButton submit = new JButton("Submit");
    private JButton submit2 = new JButton("Submit");
    private JButton submit3 = new JButton("Submit");
    private JButton submit4 = new JButton("Submit");
    private JButton submit5 = new JButton("Submit");
    private JButton submit6 = new JButton("Submit");
    private JButton submit7 = new JButton("Submit");
    private JButton submit8 = new JButton("Submit");
    private JButton submit9 = new JButton("Submit");
    private JButton submit10 = new JButton("Submit");
    private JButton submit11 = new JButton("Submit");
    private JButton submit12 = new JButton("Submit");
    private JButton submit13 = new JButton("Submit");
    private JButton submit14 = new JButton("Submit");
    private JButton submit15 = new JButton("Submit");

    // an array of type JButton which contains all the submit buttons
    private JButton[] submitButtons = {submit, submit2, submit3, submit4, submit5, submit6, submit7, submit8, submit9, submit10, submit11, submit12, submit13, submit14, submit15};

    // score of the user
    int score = 0;

    private QuizGUI() {
        prepareGUI();
    }

    public static void main(String[] args) {
        QuizGUI swingControlDemo = new QuizGUI();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        // initialize the window
        mainFrame = new JFrame("Java Quiz");
        mainFrame.setSize(800, 1000);
        mainFrame.setLayout(new GridLayout(3, 3));
        mainFrame.setResizable(true);

        // initialize the header and the footer
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

        //Question 11
        controlPanel11 = new JPanel();
        controlPanel11.setLayout(new BoxLayout(controlPanel11, BoxLayout.PAGE_AXIS));
        controlPanel11.setVisible(false);
        panels[10] = controlPanel11;


        //Question 12
        controlPanel12 = new JPanel();
        controlPanel12.setLayout(new BoxLayout(controlPanel12, BoxLayout.PAGE_AXIS));
        controlPanel12.setVisible(false);
        panels[11] = controlPanel12;

        //Question13
        controlPanel13 = new JPanel();
        controlPanel13.setLayout(new BoxLayout(controlPanel13, BoxLayout.PAGE_AXIS));
        controlPanel13.setVisible(false);
        panels[12] = controlPanel13;

        //Question 14
        controlPanel14 = new JPanel();
        controlPanel14.setLayout(new BoxLayout(controlPanel14, BoxLayout.PAGE_AXIS));
        controlPanel14.setVisible(false);
        panels[13] = controlPanel14;

        //Question15
        controlPanel15 = new JPanel();
        controlPanel15.setLayout(new BoxLayout(controlPanel15, BoxLayout.PAGE_AXIS));
        controlPanel15.setVisible(false);
        panels[14] = controlPanel15;

        controlPanel16 = new JPanel();
        controlPanel16.setLayout(new BoxLayout(controlPanel16, BoxLayout.PAGE_AXIS));
        controlPanel16.setVisible(false);
        panels[15] = controlPanel16;

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        // ===============================Question 1=================================================
        headerLabel.setText(questions[panelIndex]);

        // multiple choices
        String b1String = "Have at least 12 characters";
        String b2String = "Do not rely on obvious substitution (e.g. p@ssw0rd)";
        String b3String = "Include numbers, symbols, capital letters, and lower case letters";
        String b4String = "Do not use obvious words (e.g. password)";
        String b5String = "All of the above";

        // create radio buttons
        JRadioButton b1 = new JRadioButton(b1String);
        b1.setMnemonic(KeyEvent.VK_A); // set A as an alt key (press Alt-A to see the effect)
        b1.setActionCommand(b1String);

        JRadioButton b2 = new JRadioButton(b2String);
        b2.setMnemonic(KeyEvent.VK_B);
        b2.setActionCommand(b2String);

        JRadioButton b3 = new JRadioButton(b3String);
        b3.setMnemonic(KeyEvent.VK_C);
        b3.setActionCommand(b3String);

        JRadioButton b4 = new JRadioButton(b4String);
        b4.setMnemonic(KeyEvent.VK_D);
        b4.setActionCommand(b4String);

        JRadioButton b5 = new JRadioButton(b5String);
        b5.setMnemonic(KeyEvent.VK_E);
        b5.setActionCommand(b5String);

        // add the buttons to the panel
        controlPanel.add(b1);
        controlPanel.add(b2);
        controlPanel.add(b3);
        controlPanel.add(b4);
        controlPanel.add(b5);

        controlPanel.add(submitButtons[0]);

        _continue.setEnabled(false);
        controlPanel.add(_continue);

        mainFrame.setVisible(true);

        // group the buttons so no more than 1 button could be selected at one time
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);
        group.add(b4);
        group.add(b5);

        // add event listeners
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
        b3.addActionListener(new ButtonClickListener());
        b4.addActionListener(new ButtonClickListener());
        b5.addActionListener(new ButtonClickListener());
        submitButtons[0].addActionListener(new ButtonClickListener());
        _continue.addActionListener(new ButtonClickListener());

        //===================================================================================================================

        //===========================================Question 2=========================================

        // multiple choices
        String b6String = "Accepting a prompt or pop-up without reading it first";
        String b7String = "Downloading software from an unreliable source";
        String b8String = "Opening email attachments from unknown senders";
        String b9String = "Pirating media such as movies, music, or games";
        String b10String = "All of the above";

        // create radio buttons
        JRadioButton b6 = new JRadioButton(b6String);
        b6.setMnemonic(KeyEvent.VK_A);
        b6.setActionCommand(b1String);
        //b6.setSelected(true);

        JRadioButton b7 = new JRadioButton(b7String);
        b7.setMnemonic(KeyEvent.VK_B);
        b7.setActionCommand(b2String);

        JRadioButton b8 = new JRadioButton(b8String);
        b8.setMnemonic(KeyEvent.VK_C);
        b8.setActionCommand(b3String);

        JRadioButton b9 = new JRadioButton(b9String);
        b9.setMnemonic(KeyEvent.VK_D);
        b9.setActionCommand(b4String);

        JRadioButton b10 = new JRadioButton(b10String);
        b10.setMnemonic(KeyEvent.VK_E);
        b10.setActionCommand(b5String);

        // add the buttons to the panel
        controlPanel2.add(b6);
        controlPanel2.add(b7);
        controlPanel2.add(b8);
        controlPanel2.add(b9);
        controlPanel2.add(b10);

        controlPanel2.add(submitButtons[1]);

        _continue2.setEnabled(false);
        controlPanel2.add(_continue2);

        // group the buttons so no more than 1 button could be selected at one
        ButtonGroup group2 = new ButtonGroup();
        group2.add(b6);
        group2.add(b7);
        group2.add(b8);
        group2.add(b9);
        group2.add(b10);

        // add event listeners
        b6.addActionListener(new ButtonClickListener());
        b7.addActionListener(new ButtonClickListener());
        b8.addActionListener(new ButtonClickListener());
        b9.addActionListener(new ButtonClickListener());
        b10.addActionListener(new ButtonClickListener());
        submitButtons[1].addActionListener(new ButtonClickListener());
        _continue2.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //==================================Question 3===================================================

        // True and False string
        String _trueString = "True";
        String _falseString = "False";

        // create radio buttons
        JRadioButton _true = new JRadioButton(_trueString);
        _true.setMnemonic(KeyEvent.VK_A); // press Alt-A to see the effect
        _true.setActionCommand(_trueString);

        JRadioButton _false = new JRadioButton(_falseString);
        _false.setMnemonic(KeyEvent.VK_B);
        _false.setActionCommand(_falseString);

        // add buttons to the panel
        controlPanel3.add(_true);
        controlPanel3.add(_false);

        controlPanel3.add(submitButtons[2]);

        _continue3.setEnabled(false);
        controlPanel3.add(_continue3);

        // group the buttons so no more than one button could be selected at a time
        ButtonGroup group3 = new ButtonGroup();
        group3.add(_true);
        group3.add(_false);

        // add event listeners
        _true.addActionListener(new ButtonClickListener());
        _false.addActionListener(new ButtonClickListener());
        submitButtons[2].addActionListener(new ButtonClickListener());
        _continue3.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //======================================Question 4===============================================

        // create the text box
        t1.setMaximumSize(new Dimension(500, 45));

        // add the text box to the panel
        controlPanel4.add(t1);

        // add buttons to the panel
        controlPanel4.add(submitButtons[3]);

        _continue4.setEnabled(false);
        controlPanel4.add(_continue4);

        // add event listener
        submitButtons[3].addActionListener(new ButtonClickListener());
        _continue4.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //======================================Question 5===============================================

        // True and False string
        String _trueString1 = "True ";
        String _falseString1 = "False ";

        // create radio buttons
        JRadioButton _true2 = new JRadioButton(_trueString1);
        _true2.setMnemonic(KeyEvent.VK_A); // press Alt-A to see the effect
        _true2.setActionCommand(_trueString1);

        JRadioButton _false2 = new JRadioButton(_falseString1);
        _false2.setMnemonic(KeyEvent.VK_B);
        _false2.setActionCommand(_falseString1);

        // add buttons to the panel
        controlPanel5.add(_true2);
        controlPanel5.add(_false2);

        controlPanel5.add(submitButtons[4]);

        _continue5.setEnabled(false);
        controlPanel5.add(_continue5);

        // group the buttons so no more than one button could be selected at a time
        ButtonGroup group5 = new ButtonGroup();
        group5.add(_true2);
        group5.add(_false2);

        // add event listeners
        _true2.addActionListener(new ButtonClickListener());
        _false2.addActionListener(new ButtonClickListener());
        submitButtons[4].addActionListener(new ButtonClickListener());
        _continue5.addActionListener(new ButtonClickListener());


        //===============================================================================================

        //============================================Question 6=========================================

        // multiple choices
        String b11String = "Don't open emails from unknown senders";
        String b12String = "Don't download files from untrustworthy sources";
        String b13String = "Don't click pop-op advertisements";
        String b14String = "Use reputable antivirus software";
        String b15String = "All of the above";

        // create radio buttons
        JRadioButton b11 = new JRadioButton(b11String);
        b11.setMnemonic(KeyEvent.VK_A);
        b11.setActionCommand(b11String);
        //b11.setSelected(true);

        JRadioButton b12 = new JRadioButton(b12String);
        b12.setMnemonic(KeyEvent.VK_B);
        b12.setActionCommand(b12String);

        JRadioButton b13 = new JRadioButton(b13String);
        b13.setMnemonic(KeyEvent.VK_C);
        b13.setActionCommand(b13String);

        JRadioButton b14 = new JRadioButton(b14String);
        b14.setMnemonic(KeyEvent.VK_D);
        b14.setActionCommand(b14String);

        JRadioButton b15 = new JRadioButton(b15String);
        b15.setMnemonic(KeyEvent.VK_E);
        b15.setActionCommand(b15String);

        // add the buttons to the panel
        controlPanel6.add(b11);
        controlPanel6.add(b12);
        controlPanel6.add(b13);
        controlPanel6.add(b14);
        controlPanel6.add(b15);

        controlPanel6.add(submitButtons[5]);

        _continue6.setEnabled(false);
        controlPanel6.add(_continue6);

        // group the buttons so no more than 1 button could be selected at one
        ButtonGroup group6 = new ButtonGroup();
        group6.add(b11);
        group6.add(b12);
        group6.add(b13);
        group6.add(b14);
        group6.add(b15);

        // add event listeners
        b11.addActionListener(new ButtonClickListener());
        b12.addActionListener(new ButtonClickListener());
        b13.addActionListener(new ButtonClickListener());
        b14.addActionListener(new ButtonClickListener());
        b15.addActionListener(new ButtonClickListener());
        submitButtons[5].addActionListener(new ButtonClickListener());
        _continue6.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //=============================================Question 7========================================

        // create radio buttons
        JRadioButton _true3 = new JRadioButton(_trueString1);
        _true3.setMnemonic(KeyEvent.VK_A); // press Alt-A to see the effect
        _true3.setActionCommand(_trueString);

        JRadioButton _false3 = new JRadioButton(_falseString1);
        _false3.setMnemonic(KeyEvent.VK_B);
        _false3.setActionCommand(_falseString);

        // add buttons to the panel
        controlPanel7.add(_true3);
        controlPanel7.add(_false3);

        controlPanel7.add(submitButtons[6]);

        _continue7.setEnabled(false);
        controlPanel7.add(_continue7);

        // group the buttons so no more than one button could be selected at a time
        ButtonGroup group7 = new ButtonGroup();
        group7.add(_true3);
        group7.add(_false3);

        // add event listeners
        _true3.addActionListener(new ButtonClickListener());
        _false3.addActionListener(new ButtonClickListener());
        submitButtons[6].addActionListener(new ButtonClickListener());
        _continue7.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //============================================Question 8=========================================

        // create the text box
        t2.setMaximumSize(new Dimension(500, 45));

        // add the text box to the panel
        controlPanel8.add(t2);

        // add buttons to the panel
        controlPanel8.add(submitButtons[7]);

        _continue8.setEnabled(false);
        controlPanel8.add(_continue8);

        // add event listener
        submitButtons[7].addActionListener(new ButtonClickListener());
        _continue8.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //============================================Question 9=========================================

        // multiple choices
        String b16String = "Wrong company name";
        String b17String = "Spelling or grammar mistakes";
        String b18String = "Questionable deadlines";
        String b19String = "Suspicious links";
        String b20String = "All of the above";

        // create radio buttons
        JRadioButton b16 = new JRadioButton(b16String);
        b16.setMnemonic(KeyEvent.VK_A);
        b16.setActionCommand(b16String);
        //b16.setSelected(true);

        JRadioButton b17 = new JRadioButton(b17String);
        b17.setMnemonic(KeyEvent.VK_B);
        b17.setActionCommand(b17String);

        JRadioButton b18 = new JRadioButton(b18String);
        b18.setMnemonic(KeyEvent.VK_C);
        b18.setActionCommand(b18String);

        JRadioButton b19 = new JRadioButton(b19String);
        b19.setMnemonic(KeyEvent.VK_D);
        b19.setActionCommand(b19String);

        JRadioButton b20 = new JRadioButton(b20String);
        b20.setMnemonic(KeyEvent.VK_E);
        b20.setActionCommand(b20String);

        // add the buttons to the panel
        controlPanel9.add(b16);
        controlPanel9.add(b17);
        controlPanel9.add(b18);
        controlPanel9.add(b19);
        controlPanel9.add(b20);

        controlPanel9.add(submitButtons[8]);

        _continue9.setEnabled(false);
        controlPanel9.add(_continue9);

        // group the buttons so no more than 1 button could be selected at one
        ButtonGroup group9 = new ButtonGroup();
        group9.add(b16);
        group9.add(b17);
        group9.add(b18);
        group9.add(b19);
        group9.add(b20);

        // add event listeners
        b16.addActionListener(new ButtonClickListener());
        b17.addActionListener(new ButtonClickListener());
        b18.addActionListener(new ButtonClickListener());
        b19.addActionListener(new ButtonClickListener());
        b20.addActionListener(new ButtonClickListener());
        submitButtons[8].addActionListener(new ButtonClickListener());
        _continue9.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //===========================================Question 10=========================================

        // multiple choices
        String b21String = "ilovecompsci";
        String b22String = "gh1ghiph!@iAhg2!";
        String b23String = "qwerty";
        String b24String = "c0mpsc!";
        String b25String = "p@55word";

        // create radio buttons
        JRadioButton b21 = new JRadioButton(b21String);
        b21.setMnemonic(KeyEvent.VK_A);
        b21.setActionCommand(b21String);
        //b21.setSelected(true);

        JRadioButton b22 = new JRadioButton(b22String);
        b22.setMnemonic(KeyEvent.VK_B);
        b22.setActionCommand(b22String);

        JRadioButton b23 = new JRadioButton(b23String);
        b23.setMnemonic(KeyEvent.VK_C);
        b23.setActionCommand(b23String);

        JRadioButton b24 = new JRadioButton(b24String);
        b24.setMnemonic(KeyEvent.VK_D);
        b24.setActionCommand(b24String);

        JRadioButton b25 = new JRadioButton(b25String);
        b25.setMnemonic(KeyEvent.VK_E);
        b25.setActionCommand(b25String);

        // add the buttons to the panel
        controlPanel10.add(b21);
        controlPanel10.add(b22);
        controlPanel10.add(b23);
        controlPanel10.add(b24);
        controlPanel10.add(b25);

        controlPanel10.add(submitButtons[9]);

        _continue10.setEnabled(false);
        controlPanel10.add(_continue10);

        // group the buttons so no more than 1 button could be selected at one
        ButtonGroup group10 = new ButtonGroup();
        group10.add(b21);
        group10.add(b22);
        group10.add(b23);
        group10.add(b24);
        group10.add(b25);

        // add event listeners
        b21.addActionListener(new ButtonClickListener());
        b22.addActionListener(new ButtonClickListener());
        b23.addActionListener(new ButtonClickListener());
        b24.addActionListener(new ButtonClickListener());
        b25.addActionListener(new ButtonClickListener());
        submitButtons[9].addActionListener(new ButtonClickListener());
        _continue10.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //========================================Question 11============================================

        // multiple choices
        String b26String = "Phishing";
        String b27String = "Keystorke logging";
        String b28String = "Cyberbullying";
        String b29String = "None of the above";
        String b30String = "All of the above ";

        // create radio buttons
        JRadioButton b26 = new JRadioButton(b26String);
        b26.setMnemonic(KeyEvent.VK_A);
        b26.setActionCommand(b26String);
        //b26.setSelected(true);

        JRadioButton b27 = new JRadioButton(b27String);
        b27.setMnemonic(KeyEvent.VK_B);
        b27.setActionCommand(b27String);

        JRadioButton b28 = new JRadioButton(b28String);
        b28.setMnemonic(KeyEvent.VK_C);
        b28.setActionCommand(b28String);

        JRadioButton b29 = new JRadioButton(b29String);
        b29.setMnemonic(KeyEvent.VK_D);
        b29.setActionCommand(b29String);

        JRadioButton b30 = new JRadioButton(b30String);
        b30.setMnemonic(KeyEvent.VK_E);
        b30.setActionCommand(b30String);

        // add the buttons to the panel
        controlPanel11.add(b26);
        controlPanel11.add(b27);
        controlPanel11.add(b28);
        controlPanel11.add(b29);
        controlPanel11.add(b30);

        controlPanel11.add(submitButtons[10]);

        _continue11.setEnabled(false);
        controlPanel11.add(_continue11);

        // group the buttons so no more than 1 button could be selected at one
        ButtonGroup group11 = new ButtonGroup();
        group11.add(b26);
        group11.add(b27);
        group11.add(b28);
        group11.add(b29);
        group11.add(b30);

        // add event listeners
        b26.addActionListener(new ButtonClickListener());
        b27.addActionListener(new ButtonClickListener());
        b28.addActionListener(new ButtonClickListener());
        b29.addActionListener(new ButtonClickListener());
        b30.addActionListener(new ButtonClickListener());
        submitButtons[10].addActionListener(new ButtonClickListener());
        _continue11.addActionListener(new ButtonClickListener());

        //===============================================================================================

        //=============================================Question 12=======================================

        // create the text box
        t3.setMaximumSize(new Dimension(500, 45));

        // add the text box to the panel
        controlPanel12.add(t3);

        // add buttons to the panel
        controlPanel12.add(submitButtons[11]);

        _continue12.setEnabled(false);
        controlPanel12.add(_continue12);

        // add event listener
        submitButtons[11].addActionListener(new ButtonClickListener());
        _continue12.addActionListener(new ButtonClickListener());

        //=================================================================================================

        //=========================================Question 13=============================================

        // create radio buttons
        JRadioButton _true4 = new JRadioButton(_trueString1);
        _true2.setMnemonic(KeyEvent.VK_A);// press Alt-A to see the effect
        _true2.setActionCommand(_trueString1);

        JRadioButton _false4 = new JRadioButton(_falseString1);
        _false2.setMnemonic(KeyEvent.VK_B);
        _false2.setActionCommand(_falseString1);

        // add buttons to the panel
        controlPanel13.add(_true4);
        controlPanel13.add(_false4);

        controlPanel13.add(submitButtons[12]);

        _continue13.setEnabled(false);
        controlPanel13.add(_continue13);

        // group the buttons so no more than one button could be selected at a time
        ButtonGroup group13 = new ButtonGroup();
        group13.add(_true4);
        group13.add(_false4);

        // add event listeners
        _true4.addActionListener(new ButtonClickListener());
        _false4.addActionListener(new ButtonClickListener());
        submitButtons[12].addActionListener(new ButtonClickListener());
        _continue13.addActionListener(new ButtonClickListener());

        //==================================================================================================

        //=============================================Question 14==========================================

        // create the text box
        t4.setMaximumSize(new Dimension(500, 45));

        // add the text box to the panel
        controlPanel14.add(t4);

        // add buttons to the panel
        controlPanel14.add(submitButtons[13]);

        _continue14.setEnabled(false);
        controlPanel14.add(_continue14);

        // add event listener
        submitButtons[13].addActionListener(new ButtonClickListener());
        _continue14.addActionListener(new ButtonClickListener());

        //==================================================================================================

        //===============================================Question 15========================================

        // create the text box
        t5.setMaximumSize(new Dimension(500, 45));

        // add the text box to the panel
        controlPanel15.add(t5);

        // add buttons to the panel
        controlPanel15.add(submitButtons[14]);

        _continue15.setEnabled(false);
        controlPanel15.add(_continue15);

        // add event listener
        submitButtons[14].addActionListener(new ButtonClickListener());
        _continue15.addActionListener(new ButtonClickListener());

        //==================================================================================================

    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();

            if(command.equals("Submit")){ // when submit is clicked, get the string in the text box
                if(t1.getText().toLowerCase().equals("keylogger")){
                    isCorrect = true;
                } else if(t2.getText().toLowerCase().equals("identity theft")){
                    isCorrect = true;
                } else if(t3.getText().toLowerCase().equals("regulates")){
                    isCorrect = true;
                } else if(t4.getText().toLowerCase().indexOf("privacy") != -1 && t4.getText().toLowerCase().indexOf("property") != -1 && t4.getText().toLowerCase().indexOf("appropriate") != -1){
                    isCorrect = true;
                } else if(t5.getText().toLowerCase().indexOf("program") != -1 && t5.getText().toLowerCase().indexOf("unauthorized") != -1){
                    isCorrect = true;
                }
            }
            if (command.equals("All of the above")) {
                isCorrect = true;
            } else if(command.equals("True")) {
                isCorrect = true;
            }else if(command.equals("False ")){
                isCorrect = true;
            } else if(command.equals("gh1ghiph!@iAhg2!")){
                isCorrect = true;
            } else if(command.equals("Phishing")){
                isCorrect = true;
            }
            // if any other choice is selected, set isCorrect to false
            if(!command.equals("All of the above") && !command.equals("Submit") && !command.equals("True") && !command.equals("False ") && !command.equals("gh1ghiph!@iAhg2!") && !command.equals("Phishing")){
                isCorrect = false;
            }
            if (command.equals("Submit") && isCorrect) { // if submit is pressed and the user was right
                mainFrame.add(statusLabel);
                statusLabel.setText("Correct!"); // display correct
                mainFrame.repaint();
                continueButtons[panelIndex].setEnabled(true); // enable continue button
                submitButtons[panelIndex].setEnabled(false); // disable submit button
                score++;
            } else if (command.equals("Submit") && !isCorrect) { // if submit is pressed and the user was wrong
                mainFrame.add(statusLabel);
                statusLabel.setText("Wrong!"); // display wrong
                mainFrame.repaint();
                continueButtons[panelIndex].setEnabled(true); // enable continue button
                submitButtons[panelIndex].setEnabled(false); // disable submit button
            }
            if (command.equals("Continue")) {
                // reset the text in the text box so it won't affect the answers
                t1.setText("Enter your answer here");
                t2.setText("Enter your answer here");
                t3.setText("Enter your answer here");
                t4.setText("Enter your answer here");
                mainFrame.remove(statusLabel); // remove wrong or correct answer
                mainFrame.repaint();
                headerLabel.setText(questions[panelIndex + 1]); // display the next question
                mainFrame.remove(panels[panelIndex]); // remove panel
                mainFrame.add(panels[panelIndex + 1]);
                panels[panelIndex + 1].setVisible(true);
                panelIndex++;
                isCorrect = false;
                if(panelIndex == 15){ // if the user reaches the final panel
                    headerLabel.setText("your score is: " + score + "/15"); // display user's score
                }
            }
        }
    }
}