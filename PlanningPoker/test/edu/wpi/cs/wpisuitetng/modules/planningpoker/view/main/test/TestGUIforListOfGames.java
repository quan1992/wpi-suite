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
				log.addUserAndEstimate("User1", 5);
				log.addUserAndEstimate("User2", 10);
				log.addUserAndEstimate("User3", 8.1f);
				log.addUserAndEstimate("User4", 2.5f);
			}
		});
		panel.add(btnAddDataSet);
		
		JButton btnSelectRequirement = new JButton("Select Requirement");
		btnSelectRequirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getListOfGames().flipPanel();
			}
		});
		
		JButton btnClearTable = new JButton("Clear Table");
		btnClearTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getListOfGames().clearSummaryTable();
			}
		});
		panel.add(btnClearTable);
		panel.add(btnSelectRequirement);
		
		JButton btnAddGame = new JButton("Add Game");
		btnAddGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getListOfGames().addGame("important requirement", "In progress");
			}
		});
		panel.add(btnAddGame);
		
		JButton btnUpdateGame = new JButton("Update Game");
		btnUpdateGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getListOfGames().updateGame("important requirement", "Finished");
			}
		});
		panel.add(btnUpdateGame);
		
		JButton btnRemoveGame = new JButton("Remove Game");
		btnRemoveGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getListOfGames().removeGame("important requirement");
			}
		});
		panel.add(btnRemoveGame);
	}

	public ListOfGames getListOfGames() {
		return listOfGames;
	}
}
