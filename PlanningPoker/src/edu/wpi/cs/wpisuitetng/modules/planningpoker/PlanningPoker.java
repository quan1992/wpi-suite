package edu.wpi.cs.wpisuitetng.modules.planningpoker;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import edu.wpi.cs.wpisuitetng.janeway.modules.IJanewayModule;
import edu.wpi.cs.wpisuitetng.janeway.modules.JanewayTabModel;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.MainView;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.ToolbarView;

public class PlanningPoker implements IJanewayModule {
	
	List<JanewayTabModel> tabs;
	
	public PlanningPoker() {
		tabs = new ArrayList<JanewayTabModel>();
		
	    // setup toolbar
		ToolbarView toolbar = new ToolbarView();
		
	    // setup main panel
		MainView mainPanel = new MainView();

	    // Create a tab model that contains the toolbar panel and the main content panel
	    JanewayTabModel tab1 = new JanewayTabModel(getName(), new ImageIcon(), toolbar, mainPanel);

	    // Add the tab to the list of tabs owned by this module
	    tabs.add(tab1);

	}

	@Override
	public String getName() {
		return "PlanningPoker";
	}

	@Override
	public List<JanewayTabModel> getTabs() {
		return tabs;
	}

}
