/*******************************************************************************
 * Copyright (c) 2013 -- WPI Suite
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    TODO: Contributors' names
 ******************************************************************************/

package edu.wpi.cs.wpisuitetng.modules.planningpoker.view.toolbar;

import edu.wpi.cs.wpisuitetng.janeway.gui.container.toolbar.ToolbarGroupView;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.NewGameDialog;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * this is an example of buttons
 * @author llhunker, blammeson, nfbrown
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
		// Adding functionality to new game button, not sure if this is where this should go --nfbrown
		newGameButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NewGameDialog newGameDialog = new NewGameDialog();
				newGameDialog.setVisible(true);
			}
		});
		
		this.newGameButton.setHorizontalAlignment(SwingConstants.CENTER);
		this.resultsButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPanel.add(newGameButton);
		contentPanel.add(resultsButton);
		contentPanel.setOpaque(false);
		
		this.add(contentPanel);
	}

}
