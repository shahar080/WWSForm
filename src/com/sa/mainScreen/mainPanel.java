package com.sa.mainScreen;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    private JButton _loadNumbersPath;
    //todo add information regarding added numbers
    private JButton _start;
    private Image img;


    /**
     * Constructor
     */
    public mainPanel()
    {
        //This code makes the file browser look like windows file browser
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e){}


        img = Toolkit.getDefaultToolkit().createImage("src/com/sa/Images/background.jpg");

//        JLabel background=new JLabel(new ImageIcon("src/com/sa/Images/background.jpg"));//todo bg
//        add(background);

        Font smallFont = new Font(Font.DIALOG, Font.BOLD, 10);
        Font mediumFont = new Font(Font.DIALOG, Font.BOLD, 15);
        Font bigFont = new Font(Font.DIALOG, Font.BOLD, 20);

        this._sendText = new JLabel("הכנס טקסט כאן");
        this._sendText.setFont(bigFont);
        this._sendText.setForeground(Color.BLACK);
        this._sendText.setBounds(650,80, 300, 35);
        add(_sendText);

        _messageInformation = new JTextArea();
        Color c = new Color(0,0,0,100);
        _messageInformation.setBackground(c);
        _messageInformation.setLineWrap(true);
        _messageInformation.setWrapStyleWord(true);
        _messageInformation.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this._messageInformation.setFont(bigFont);
        this._messageInformation.setForeground(Color.BLACK);
        this._messageInformation.setBounds(570,120, 300, 250);
        add(_messageInformation);

        _loadNumbersPath = new JButton("הוסף קובץ אנשי קשר");
        this._loadNumbersPath.addActionListener(this);
        this._loadNumbersPath.setFont(bigFont);
        this._loadNumbersPath.setForeground(Color.BLACK);
        this._loadNumbersPath.setBounds(570,385, 300, 35);
        add(_loadNumbersPath);


        _start = new JButton("התחל");
        this._start.addActionListener(this);
        this._start.setFont(bigFont);
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


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
        repaint();

    }

    public void actionPerformed(ActionEvent e)
    {
        //if load numbers option chosen
        if (e.getSource().equals(_loadNumbersPath)) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Comma separated values (.csv) ", "csv");
            chooser.setFileFilter(filter);
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("בחירת קובץ אנשי קשר");
            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            chooser.setAcceptAllFileFilterUsed(false);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "בחירת הקובץ בוצעה בהצלחה! \n " +
                                "הקובץ שנבחר - " + chooser.getSelectedFile(),
                        "בוצע בהצלחה", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("#####SelectedFilePath : " + chooser.getSelectedFile());
                //todo send path to selenium
            } else {
                JOptionPane.showMessageDialog(null, "לא בוצעה פעולה",
                        "לא בוצעה פעולה", JOptionPane.INFORMATION_MESSAGE);            }
        }

        if (e.getSource().equals(_start)) {

            JOptionPane.showMessageDialog(null, "_start", "_start", JOptionPane.INFORMATION_MESSAGE);
        }

    }




}