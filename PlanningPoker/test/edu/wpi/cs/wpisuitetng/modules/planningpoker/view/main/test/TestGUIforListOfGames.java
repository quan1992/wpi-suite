package edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.test;

import java.awt.EventQueue;

import javax.swing.JFrame;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.ListOfGames;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestGUIforListOfGames {

	private JFrame frame;
	private ListOfGames listOfGames;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUIforListOfGames window = new TestGUIforListOfGames();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGUIforListOfGames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 678, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		listOfGames = new ListOfGames();
		frame.getContentPane().add(listOfGames, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnAddDataSet = new JButton("Add Data, Set Stats");
		btnAddDataSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListOfGames log = getListOfGames();
				((DefaultTableModel)(log.getSummaryTableModel())).addRow(new Object[]{"User1", 5});
				((DefaultTableModel)(log.getSummaryTableModel())).addRow(new Object[]{"User2", 10});
				((DefaultTableModel)(log.getSummaryTableModel())).addRow(new Object[]{"User3", 8.1});
				((DefaultTableModel)(log.getSummaryTableModel())).addRow(new Object[]{"User4", 2.5});
				log.calcMean();
				log.calcMedian();
				
			}
		});
		panel.add(btnAddDataSet);
		
		JButton btnSelectRequirement = new JButton("Select Requirement");
		btnSelectRequirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				getListOfGames().flipPanel();
			}
		});
		panel.add(btnSelectRequirement);
	}

	public ListOfGames getListOfGames() {
		return listOfGames;
	}
}
