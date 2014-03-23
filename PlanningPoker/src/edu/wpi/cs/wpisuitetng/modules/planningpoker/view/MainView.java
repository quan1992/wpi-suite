/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.DiscussionPanel;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.ListOfGames;

/**
 * This is the main panel of the planning poker GUI
 * @author llhunker, blammeson, nfbrown
 *
 */
@SuppressWarnings("serial")
public class MainView extends JTabbedPane {
	
	ListOfGames listOfGames = new ListOfGames();
	DiscussionPanel discussion = new DiscussionPanel();
	
	
	public MainView(){
		
		
		addTab("Games", null, listOfGames, null);
		
		
		
		//JPanel tab2 = new JPanel();
		addTab("Discussion", null, discussion, null);
		
		/*
		JTextPane txtpnSomeTextNot = new JTextPane();
		txtpnSomeTextNot.setEditable(false);
		txtpnSomeTextNot.setText("Some Text, not editable");
		tab2.add(txtpnSomeTextNot);
		*/

		
	}
}
