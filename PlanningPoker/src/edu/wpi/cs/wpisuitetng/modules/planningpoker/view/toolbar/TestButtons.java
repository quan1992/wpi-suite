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
public class TestButtons extends ToolbarGroupView {
	private JButton button1 = new JButton("<html>Test<br />Button 1</html>");
	
	private JButton button2 = new JButton("<html>Test<br />Button 2</html>");
	private final JPanel contentPanel = new JPanel();
	
	public TestButtons() {
		super("");	//not sure if this is needed
		
		this.contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
		this.setPreferredWidth(350);
		
		this.button1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		contentPanel.add(button1);
		contentPanel.add(button2);
		contentPanel.setOpaque(false);
		
		this.add(contentPanel);
	}

}
