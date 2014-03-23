/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.planningpoker.view.toolbar;

import edu.wpi.cs.wpisuitetng.janeway.gui.container.toolbar.ToolbarGroupView;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * this is an example of buttons
 * @author llhunker, blammeson
 *
 */
@SuppressWarnings("serial")
public class CommonButtons extends ToolbarGroupView {
	private JButton newGameButton = new JButton("<html>Create<br/>Game</html>");
	
	private JButton resultsButton = new JButton("<html>View<br/>Results</html>");
	private final JPanel contentPanel = new JPanel();
	
	public CommonButtons() {
		super("");	//not sure if this is needed
		
		this.contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
		this.setPreferredWidth(350);
		
		this.newGameButton.setHorizontalAlignment(SwingConstants.CENTER);
		this.resultsButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPanel.add(newGameButton);
		contentPanel.add(resultsButton);
		contentPanel.setOpaque(false);
		
		this.add(contentPanel);
	}

}
