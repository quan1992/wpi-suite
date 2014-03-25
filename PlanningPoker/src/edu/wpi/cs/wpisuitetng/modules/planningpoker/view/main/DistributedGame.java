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

package edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * A tab for entering an estimate on a distributed game
 * 
 * @author llhunker, blammeson, dbtrue
 * 
 */
public class DistributedGame extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = -6088834261822142945L;
    
    public DistributedGame() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 79, 145, 228, 0 };
        gridBagLayout.rowHeights = new int[] { 282, 0, 0, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        setLayout(gridBagLayout);
        
        RequirementsPanel requirementPanel_1 = new RequirementsPanel();
        GridBagConstraints gbc_requirementPanel_1 = new GridBagConstraints();
        gbc_requirementPanel_1.gridwidth = 2;
        gbc_requirementPanel_1.insets = new Insets(0, 0, 5, 5);
        gbc_requirementPanel_1.fill = GridBagConstraints.BOTH;
        gbc_requirementPanel_1.gridx = 0;
        gbc_requirementPanel_1.gridy = 0;
        add(requirementPanel_1, gbc_requirementPanel_1);
        
        EstimationPanel estimationPanel = new EstimationPanel();
        GridBagConstraints gbc_estimationPanel = new GridBagConstraints();
        gbc_estimationPanel.insets = new Insets(0, 0, 5, 0);
        gbc_estimationPanel.fill = GridBagConstraints.BOTH;
        gbc_estimationPanel.gridx = 2;
        gbc_estimationPanel.gridy = 0;
        add(estimationPanel, gbc_estimationPanel);
        
        DiscussionPanel discussionPanel = new DiscussionPanel();
        GridBagConstraints gbc_discussionPanel = new GridBagConstraints();
        gbc_discussionPanel.insets = new Insets(0, 0, 5, 0);
        gbc_discussionPanel.gridwidth = 3;
        gbc_discussionPanel.fill = GridBagConstraints.BOTH;
        gbc_discussionPanel.gridx = 0;
        gbc_discussionPanel.gridy = 1;
        add(discussionPanel, gbc_discussionPanel);
        
        JButton btnSave = new JButton("Save");
        GridBagConstraints gbc_btnSave = new GridBagConstraints();
        gbc_btnSave.anchor = GridBagConstraints.WEST;
        gbc_btnSave.insets = new Insets(0, 0, 0, 5);
        gbc_btnSave.gridx = 0;
        gbc_btnSave.gridy = 2;
        add(btnSave, gbc_btnSave);
        
        JButton btnClose = new JButton("Cancel");
        GridBagConstraints gbc_btnClose = new GridBagConstraints();
        gbc_btnClose.anchor = GridBagConstraints.WEST;
        gbc_btnClose.insets = new Insets(0, 0, 0, 5);
        gbc_btnClose.gridx = 1;
        gbc_btnClose.gridy = 2;
        add(btnClose, gbc_btnClose);
    }
    
}
