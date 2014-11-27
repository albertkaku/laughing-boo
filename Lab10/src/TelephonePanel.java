//************************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;
import javax.swing.*;
public class TelephonePanel extends JPanel
{
	public TelephonePanel()
	{	
		//set BorderLayout for this panel
		this.setLayout(new BorderLayout());
		//create a JLabel with "Your Telephone" title
		JLabel labelTitle = new JLabel("Your Telephone");
		JPanel newJPanel = new JPanel();
		newJPanel.add(labelTitle);
		//add title label to north of this panel
		this.add(newJPanel, BorderLayout.PAGE_START);
		//create panel to hold keypad and give it a 4x3 GridLayout
		JPanel keypad = new JPanel();
		keypad.setLayout(new GridLayout(4,3));
		//add buttons representing keys to key panel
		keypad.add(new Button("1"));
		keypad.add(new Button("2"));
		keypad.add(new Button("3"));
		keypad.add(new Button("4"));
		keypad.add(new Button("5"));
		keypad.add(new Button("6"));
		keypad.add(new Button("7"));
		keypad.add(new Button("8"));
		keypad.add(new Button("9"));
		keypad.add(new Button("*"));
		keypad.add(new Button("0"));
		keypad.add(new Button("#"));
		//add key panel to center of this panel
		this.add(keypad,BorderLayout.CENTER);
	}
}