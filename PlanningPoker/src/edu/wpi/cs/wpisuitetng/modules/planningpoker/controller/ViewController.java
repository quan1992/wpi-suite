package edu.wpi.cs.wpisuitetng.modules.planningpoker.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.model.GameModel;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.model.GameModel.GameStatus;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.MainView;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.ToolbarView;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.EditGamePanel;
import edu.wpi.cs.wpisuitetng.modules.requirementmanager.models.Requirement;

public class ViewController {

	private MainView mainView;
	private ToolbarView toolbar;

	public ViewController(MainView mainView, ToolbarView toolbar) {
		this.mainView = mainView;
		this.toolbar = toolbar;
	}

	public void addNewGameTab() {
		EditGamePanel editGame = new EditGamePanel();
		mainView.addTab("New Game", editGame);
		mainView.setSelectedComponent(editGame);
	}

	public void saveNewGame(EditGamePanel e) {
		GameModel newGame = new GameModel(e.getName(),
				e.getDescription(),
				e.getRequirements(),
				e.getEndDate(),
				e.getGameType(), 
				GameStatus.PENDING);
		
		AddGameController adder = new AddGameController();
		adder.addGame(newGame);		
	}
	
	public void cancelNewGame(EditGamePanel e){
		int result = JOptionPane.showConfirmDialog(e, "Are you sure you want to cancel this game?");
		if(result == JOptionPane.OK_OPTION) {
			mainView.removeTabAt(mainView.indexOfComponent(e));	
		}
	}

}