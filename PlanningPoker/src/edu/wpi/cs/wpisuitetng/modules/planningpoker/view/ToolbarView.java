/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import edu.wpi.cs.wpisuitetng.janeway.gui.container.toolbar.DefaultToolbarView;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.toolbar.TestButtons;

/**
 * This is the main class for the planning poker toolbar
 * @author llhunker, blammeson
 *
 */
@SuppressWarnings("serial")
public class ToolbarView extends DefaultToolbarView {

	private TestButtons testThingy = new TestButtons();
	
	public ToolbarView (){
		this.addGroup(testThingy);
	}
}
