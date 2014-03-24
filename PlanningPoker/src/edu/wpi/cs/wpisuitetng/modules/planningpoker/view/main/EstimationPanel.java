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

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * This is the panel where the user inputs their estimate for a requirement
 * 
 * @author TODO: authors' names
 * 
 */
public class EstimationPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 710681835939619974L;
    private JTextField estimateField;
    
    /**
     * Create the panel.
     */
    public EstimationPanel() {
        setPreferredSize(new Dimension(200, 110));
        setMinimumSize(new Dimension(200, 110));
        
        JPanel panel = new JPanel();
        
        JPanel panel_1 = new JPanel();
        
        JPanel panel_2 = new JPanel();
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout
                .setHorizontalGroup(groupLayout
                        .createParallelGroup(Alignment.TRAILING)
                        .addGroup(
                                groupLayout
                                        .createSequentialGroup()
                                        .addGroup(
                                                groupLayout
                                                        .createParallelGroup(
                                                                Alignment.LEADING)
                                                        .addGroup(
                                                                groupLayout
                                                                        .createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(
                                                                                panel,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                groupLayout
                                                                        .createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(
                                                                                panel_1,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                groupLayout
                                                                        .createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(
                                                                                panel_2,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(294, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
                Alignment.LEADING).addGroup(
                groupLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(panel_1, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(panel_2, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(199, Short.MAX_VALUE)));
        
        JLabel lblNewLabel_2 = new JLabel("Ends at:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        panel_2.add(lblNewLabel_2);
        
        JLabel timeLabel = new JLabel("3/23 6:00 PM");
        panel_2.add(timeLabel);
        
        JLabel lblNewLabel = new JLabel("Votes:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        panel_1.add(lblNewLabel);
        
        JLabel votesLabel = new JLabel("0/15");
        panel_1.add(votesLabel);
        
        JLabel lblEstimate = new JLabel("Estimate:");
        panel.add(lblEstimate);
        
        estimateField = new JTextField();
        panel.add(estimateField);
        estimateField.setColumns(10);
        setLayout(groupLayout);
        
    }
}
