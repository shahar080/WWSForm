package com.sa.Information;




import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings({ "serial", "unused" })
/**
 * Class for the instructions of the software
 * @author shahar
 */
public class AboutWindow extends JFrame 
{
	private int _sizeOfScreenX = 600;
	private int _sizeOfScreenY = 450;
	JFrame _a = new JFrame();
	/**
	 * Constructor
	 */
	public AboutWindow()
	{
		setTitle("אודות התוכנה");
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(_sizeOfScreenX,_sizeOfScreenY);
		setLayout(null);
		JLabel background=new JLabel(new ImageIcon("src/com/sa/Images/about.png"));//todo about page
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

