/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.ListOfGames;

/**
 * This is the main panel of the planning poker GUI
 * @author llhunker, blammeson, nfbrown
 *
 */
@SuppressWarnings("serial")
public class MainView extends JTabbedPane {
	
	ListOfGames listOfGames = new ListOfGames();
	
	
	public MainView(){
		
		
		addTab("Games", null, listOfGames, null);
		
		
		
		JPanel tab2 = new JPanel();
		addTab("Tab 2", null, tab2, null);
		
		JTextPane txtpnSomeTextNot = new JTextPane();
		txtpnSomeTextNot.setEditable(false);
		txtpnSomeTextNot.setText("Some Text, not editable");
		tab2.add(txtpnSomeTextNot);
		
	}
}
