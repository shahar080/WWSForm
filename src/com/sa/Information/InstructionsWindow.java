package com.sa.Information;

import javax.swing.*;

public class InstructionsWindow extends JFrame
{
    private int _sizeOfScreenX = 600;
    private int _sizeOfScreenY = 450;
    JFrame _a = new JFrame();
    /**
     * Constructor
     */
    public InstructionsWindow()
    {
        setTitle("הוראות התוכנה");
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(_sizeOfScreenX,_sizeOfScreenY);
        setLayout(null);
        JLabel background=new JLabel(new ImageIcon("src/com/sa/Images/instructions.png"));//todo instructions page
        background.setSize(_sizeOfScreenX, _sizeOfScreenY);
        add(background);
        setVisible(true);
        setResizable(false);
    }
    void main()
    {
        new AboutWindow();
    }

}

