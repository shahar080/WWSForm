package com.sa.mainScreen;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import com.sa.Information.AboutWindow;
import com.sa.Information.InstructionsWindow;


/**
 * Class for the frame of the game
 * @author Shahar_Azar
 */
public class mainFrame extends JFrame implements ActionListener
{
	public static int _sizeOfScreenX = 900;
	public static int _sizeOfScreenY = 750;
	public mainPanel _myPanel;
    private JMenuBar _mainMenu;
    private JMenu _file;
    private JMenu _options;
    private JMenuItem _op1;
    private JMenuItem _about;
    private JMenuItem _exit;
    private JMenuItem _instructions;

	/**
	 * Constructor
	 */
	public mainFrame()
	{
		setTitle("Whatsapp Message Sender Utility");//Game title
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(_sizeOfScreenX, _sizeOfScreenY);
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        _mainMenu = new JMenuBar();
        _mainMenu.add(Box.createHorizontalGlue());
        _file = new JMenu("קובץ");
        _options = new JMenu("אפשרויות");
        /////

        _about = new JMenuItem("אודות");//about option
        _file.add(_about);
        _about.addActionListener(this);

        _exit = new JMenuItem("יציאה");//exit option
        _file.add(_exit);
        _exit.addActionListener(this);


        _instructions = new JMenuItem("הוראות");//instructions
        _options.add(_instructions);
        _instructions.addActionListener(this);
        //////
        _mainMenu.add(_options);
        _mainMenu.add(_file);

        setJMenuBar(_mainMenu);
        setLayout(new BorderLayout());

        _myPanel = new mainPanel();
        _myPanel.getPreferredSize();
        this.add(_myPanel, BorderLayout.NORTH);



        setVisible(true);
		setResizable(false);

	}


	/**
	 * Function to check what the user chose from the menu
	 */
	public void actionPerformed(ActionEvent e) //check what the player chose
	{
        if (e.getSource() instanceof JMenuItem) {

            if (e.getActionCommand().equalsIgnoreCase("אודות")) {
                AboutWindow aw = new AboutWindow();
            }

            if (e.getActionCommand().equalsIgnoreCase("יציאה")) {
                String[] options = new String[] {"ביטול", "כן"};
                int dialogResult = JOptionPane.showOptionDialog(null,
                        "האם אתה בטוח שברצונך לצאת?", "אזהרה",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[0]);

                if(dialogResult == 1) {
                    System.exit(0);
                }
                else
                    System.out.println("####Exit program canceled");
            }

            if (e.getActionCommand().equalsIgnoreCase("הוראות"))
            {
                InstructionsWindow iw = new InstructionsWindow();
            }

        }
	}
	/**
	 * Function to repaint the screen
	 * @author Shahar_Azar
	 */
	public class gameTimerEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			repaint();
		}
	}
	public static void main(String[] args) 
	{ 
		new mainFrame();
	}

}

