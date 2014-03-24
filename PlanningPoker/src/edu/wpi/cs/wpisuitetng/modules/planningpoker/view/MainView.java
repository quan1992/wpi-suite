/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import javax.swing.JTabbedPane;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.DiscussionPanel;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.DistributedGame;
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
	DistributedGame dGame1 = new DistributedGame();	//only for testing purposes
	
	
	public MainView(){
		
		
		addTab("Games", null, listOfGames, null);
		
		addTab("Discussion", null, discussion, null);
		addTab("Rquirement x", null, dGame1, null);
		
	
		
	}
}
