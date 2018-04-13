package com.sa.mainScreen;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Class for the game panel
 * @author Shahar_Azar
 */
public class mainPanel extends JPanel implements ActionListener, Runnable{

    //graphics
    private Image _addedImage;//Image the user added
    //todo example message screen
    private JLabel _sendText;
    private JTextArea _messageInformation;
    private JButton _loadNumbers;
    //todo add information regarding added numbers
    private JButton _start;


    /**
     * Constructor
     */
    public mainPanel()
    {


//        JLabel background=new JLabel(new ImageIcon("src/com/sa/Images/background.jpg"));//todo bg
//        add(background);

        Font f = new Font(Font.DIALOG, Font.BOLD, 20);
        Font myF = new Font(Font.DIALOG, Font.BOLD, 15);

        this._sendText = new JLabel("הכנס טקסט כאן");
        this._sendText.setFont(f);
        this._sendText.setForeground(Color.BLACK);
        this._sendText.setBounds(650,80, 300, 35);
        add(_sendText);

        _messageInformation = new JTextArea();
        _messageInformation.setLineWrap(true);
        _messageInformation.setWrapStyleWord(true);
        _messageInformation.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this._messageInformation.setFont(f);
        this._messageInformation.setForeground(Color.BLACK);
        this._messageInformation.setBounds(570,120, 300, 250);
        add(_messageInformation);

        _loadNumbers = new JButton("הוסף קובץ אנשי קשר");
        this._loadNumbers.addActionListener(this);
        this._loadNumbers.setFont(f);
        this._loadNumbers.setForeground(Color.BLACK);
        this._loadNumbers.setBounds(570,385, 300, 35);
        add(_loadNumbers);

        _start = new JButton("התחל");
        this._start.addActionListener(this);
        this._start.setFont(f);
        this._start.setForeground(Color.BLACK);
        this._start.setBounds(670,430, 100, 35);
        add(_start);


        //Finishing creation
        setPreferredSize(new Dimension(mainFrame._sizeOfScreenX,mainFrame._sizeOfScreenY));
        this.setLayout(null);
        this.setFocusable(true);   // Allow this panel to get focus.


    }



    public void run(){

    }

    public void startSoftware(){
        (new Thread(this)).start();
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource().equals(_loadNumbers))
            JOptionPane.showMessageDialog(null, "_loadNumbers", "_loadNumbers", JOptionPane.INFORMATION_MESSAGE);

        if (e.getSource().equals(_start))
            JOptionPane.showMessageDialog(null, "_start", "_start", JOptionPane.INFORMATION_MESSAGE);

    }




}