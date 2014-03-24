/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import javax.swing.JTabbedPane;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.DiscussionPanel;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.DistributedGame;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.ListOfCompleteGames;

/**
 * This is the main panel of the planning poker GUI
 * @author llhunker, blammeson, nfbrown
 *
 */
@SuppressWarnings("serial")
public class MainView extends JTabbedPane {
	
	ListOfCompleteGames listOfCompleteGames = new ListOfCompleteGames();
	DiscussionPanel discussion = new DiscussionPanel();
	DistributedGame dGame1 = new DistributedGame();	//only for testing purposes
	
	
	public MainView(){
		
		
		addTab("Complete", null, listOfCompleteGames, null);
		listOfCompleteGames.flipPanel();	//for demonstration purposes
		addTab("Rquirement x", null, dGame1, null);
		
	
		
	}
}
