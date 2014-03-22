package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class LiveGamePanel extends JPanel {
	private JTextField estimationField;

	/**
	 * Create the panel.
	 */
	public LiveGamePanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{321, 400, 0};
		gridBagLayout.rowHeights = new int[]{244, 102, 83, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JTextArea userTextArea = new JTextArea();
		userTextArea.setText("lorem ipsum");
		userTextArea.setEditable(false);
		GridBagConstraints gbc_userTextArea = new GridBagConstraints();
		gbc_userTextArea.insets = new Insets(0, 0, 5, 5);
		gbc_userTextArea.fill = GridBagConstraints.BOTH;
		gbc_userTextArea.gridx = 0;
		gbc_userTextArea.gridy = 0;
		add(userTextArea, gbc_userTextArea);
		
		JPanel chatPlaceholder = new JPanel();
		GridBagConstraints gbc_chatPlaceholder = new GridBagConstraints();
		gbc_chatPlaceholder.fill = GridBagConstraints.BOTH;
		gbc_chatPlaceholder.insets = new Insets(0, 0, 5, 0);
		gbc_chatPlaceholder.gridx = 1;
		gbc_chatPlaceholder.gridy = 0;
		add(chatPlaceholder, gbc_chatPlaceholder);
		
		JPanel estimationPanel = new JPanel();
		GridBagConstraints gbc_estimationPanel = new GridBagConstraints();
		gbc_estimationPanel.insets = new Insets(0, 0, 5, 5);
		gbc_estimationPanel.gridx = 0;
		gbc_estimationPanel.gridy = 1;
		add(estimationPanel, gbc_estimationPanel);
		estimationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		estimationField = new JTextField();
		estimationPanel.add(estimationField);
		estimationField.setColumns(10);
		
		JButton sendEstButton = new JButton("Vote");
		estimationPanel.add(sendEstButton);
		estimationPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{estimationField, sendEstButton}));
		sendEstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel countdownPanel = new JPanel();
		GridBagConstraints gbc_countdownPanel = new GridBagConstraints();
		gbc_countdownPanel.insets = new Insets(0, 0, 5, 0);
		gbc_countdownPanel.gridx = 1;
		gbc_countdownPanel.gridy = 1;
		add(countdownPanel, gbc_countdownPanel);
		countdownPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea countdownText = new JTextArea();
		countdownPanel.add(countdownText);
		countdownText.setText("3:00");
		countdownText.setEditable(false);
		
		JButton btnNewButton = new JButton("Start Countdown");
		countdownPanel.add(btnNewButton);

	}
}
