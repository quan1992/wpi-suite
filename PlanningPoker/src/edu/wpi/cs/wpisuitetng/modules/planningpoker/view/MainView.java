/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;

/**
 * This is the main panel of the planning poker GUI
 * @author llhunker, blammeson
 *
 */
@SuppressWarnings("serial")
public class MainView extends JTabbedPane {
	
	
	
	public MainView(){
		
		//this is a placeholder to show functionality
		//should be replaced with custom panels
		JPanel tab1 = new JPanel();
		addTab("Tab 1", null, tab1, null);
		
		JLabel lblSomeLabel = new JLabel("Some Label");
		tab1.add(lblSomeLabel);
		
		JPanel tab2 = new JPanel();
		addTab("Tab 2", null, tab2, null);
		
		JTextPane txtpnSomeTextNot = new JTextPane();
		txtpnSomeTextNot.setEditable(false);
		txtpnSomeTextNot.setText("Some Text, not editable");
		tab2.add(txtpnSomeTextNot);
		
	}
}
