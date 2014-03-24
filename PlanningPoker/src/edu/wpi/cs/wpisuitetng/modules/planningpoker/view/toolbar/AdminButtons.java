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

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import edu.wpi.cs.wpisuitetng.janeway.gui.container.toolbar.ToolbarGroupView;

/**
 * Buttons for new game and delete game
 * 
 * @author Dan
 * 
 */
public class AdminButtons extends ToolbarGroupView {
    /**
     * 
     */
    private static final long serialVersionUID = 312905811728893535L;
    private JButton newGameButton = new JButton(
            "<html>End<br/>Estimation</html>");
    private JButton btnDeleteGame = new JButton("<html>Delete<br/>Game</html>");
    
    private final JPanel contentPanel = new JPanel();
    
    public AdminButtons() {
        super("");
        
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
        setPreferredWidth(350);
        
        newGameButton.setHorizontalAlignment(SwingConstants.CENTER);
        btnDeleteGame.setHorizontalAlignment(SwingConstants.CENTER);
        btnDeleteGame.setForeground(Color.RED);
        
        contentPanel.add(newGameButton);
        contentPanel.add(btnDeleteGame);
        contentPanel.setOpaque(false);
        
        this.add(contentPanel);
        
    }
}
