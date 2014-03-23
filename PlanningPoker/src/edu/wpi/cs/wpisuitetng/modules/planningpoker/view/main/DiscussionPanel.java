package edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * This is a JPanel GUI element to hold the discussion panel element
 * @author llhunker, blammeson, dbtrue
 *
 */
public class DiscussionPanel extends JPanel {
	private JTextField txtEnterMessageHere;
	public DiscussionPanel() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{664, 79, 0};
		gridBagLayout.rowHeights = new int[]{262, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JTextArea chatArea = new JTextArea();
		chatArea.setText("  (2014-03-22 17:56:13) Brett Ammeson: This is a sample message\r\n  (2014-03-22 17:56:31) Lukas Hunker: Hello world");
		chatArea.setEditable(false);
		GridBagConstraints gbc_chatArea = new GridBagConstraints();
		gbc_chatArea.insets = new Insets(0, 0, 5, 0);
		gbc_chatArea.gridwidth = 2;
		gbc_chatArea.fill = GridBagConstraints.BOTH;
		gbc_chatArea.gridx = 0;
		gbc_chatArea.gridy = 0;
		add(chatArea, gbc_chatArea);
		
		txtEnterMessageHere = new JTextField();
		txtEnterMessageHere.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterMessageHere.setText("  Enter Message Here");
		GridBagConstraints gbc_txtEnterMessageHere = new GridBagConstraints();
		gbc_txtEnterMessageHere.insets = new Insets(0, 0, 0, 5);
		gbc_txtEnterMessageHere.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterMessageHere.gridx = 0;
		gbc_txtEnterMessageHere.gridy = 1;
		add(txtEnterMessageHere, gbc_txtEnterMessageHere);
		txtEnterMessageHere.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		GridBagConstraints gbc_btnSend = new GridBagConstraints();
		gbc_btnSend.fill = GridBagConstraints.BOTH;
		gbc_btnSend.gridx = 1;
		gbc_btnSend.gridy = 1;
		add(btnSend, gbc_btnSend);
	}

}