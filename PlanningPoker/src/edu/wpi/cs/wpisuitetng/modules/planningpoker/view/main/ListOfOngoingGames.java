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

import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.table.TableModel;

/**
 * GUI element that shows the ongoing games and the deadline for the requirement
 * @author TODO: authors' names
 *
 */
@SuppressWarnings("serial")
public class ListOfOngoingGames extends JPanel {
	
	// TODO: show game data in summary panel when it is selected
	
	private JTable table;
	private JTable table_1;
	private JPanel OptionalPanel;

	/**
	 * Create the panel.
	 */
	public ListOfOngoingGames() {
		setLayout(new MigLayout("", "[][450px][grow][grow]", "[300px,grow]"));
		
		JPanel ListPanel = new JPanel();
		add(ListPanel, "cell 1 0,grow");
		ListPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		ListPanel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Requirement", "Deadline"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("No Requirements");
		ListPanel.add(lblNewLabel, BorderLayout.SOUTH);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		OptionalPanel = new JPanel();
		add(OptionalPanel, "cell 2 0,grow");
		OptionalPanel.setLayout(new CardLayout(0, 0));
		
		JPanel Blank = new JPanel();
		OptionalPanel.add(Blank, "name_292516405624772");
		Blank.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNoRequirementSelected = new JLabel("No Requirement Selected");
		lblNoRequirementSelected.setHorizontalAlignment(SwingConstants.CENTER);
		Blank.add(lblNoRequirementSelected);
		
		JPanel SummaryPanel = new JPanel();
		OptionalPanel.add(SummaryPanel, "name_292469201088950");
		SummaryPanel.setLayout(new MigLayout("", "[grow][]", "[][grow][grow][grow]"));
		
		JLabel lblSummary = new JLabel("Summary:");
		SummaryPanel.add(lblSummary, "cell 0 0");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		SummaryPanel.add(scrollPane_1, "cell 0 1,grow");
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"User", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		getSummaryTableModel().addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				
			}
		});

	}

	protected JPanel getOptionalPanel() {
		return OptionalPanel;
	}
	
	/**
	 * Switches the right summary panel between a blank panel for when no game is selected to a
	 * summary panel showing stats about the selected game
	 * @author tcarmstrong
	 */
	public void flipPanel(){
		JPanel OptionalPanel = getOptionalPanel();
		CardLayout cl = (CardLayout) OptionalPanel.getLayout();
		cl.next(OptionalPanel);
		return;
	}
	
	
	public TableModel getSummaryTableModel() {
		return table_1.getModel();
	}
	protected void setSummaryTableModel(TableModel model) {
		table_1.setModel(model);
	}
	
	public void addGame(String requirement, String status) {
		DefaultTableModel tm = ((DefaultTableModel)(getEstimateTableModel()));
		for (int i = 0; i < tm.getRowCount(); i++) {
			if (tm.getValueAt(i, 0).equals(requirement)) return;
		}
		tm.addRow(new Object[] { requirement, status });
	}
	
	public void updateGame(String requirement, String status) {
		DefaultTableModel tm = ((DefaultTableModel)(getEstimateTableModel()));
		for (int i = 0; i < tm.getRowCount(); i++) {
			if (tm.getValueAt(i, 0).equals(requirement)) {
				tm.setValueAt(status, i, 1);
			}
		}
	}
	
	public void removeGame(String requirement) {
		DefaultTableModel tm = ((DefaultTableModel)(getEstimateTableModel()));
		for (int i = 0; i < tm.getRowCount(); i++) {
			if (tm.getValueAt(i, 0).equals(requirement)) {
				tm.removeRow(i);
				return;
			}
		}
	}
	
	public void addUserAndEstimate(String username, float estimate) {
		((DefaultTableModel)(getSummaryTableModel())).addRow(new Object[]{username, estimate});
	}
	
	public void clearSummaryTable() {
		DefaultTableModel tm = ((DefaultTableModel)(getSummaryTableModel()));
		int num_rows = tm.getRowCount();
		for (int i = num_rows - 1; i >= 0; i--) {
			tm.removeRow(i);
		}
	}
	public TableModel getEstimateTableModel() {
		return table.getModel();
	}
	public void setEstimateTableModel(TableModel model_1) {
		table.setModel(model_1);
	}
}
