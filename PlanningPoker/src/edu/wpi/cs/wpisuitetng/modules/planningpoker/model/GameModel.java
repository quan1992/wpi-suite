package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.controller.SimpleListObserver;

/**
 * Stores a list of games and their statuses
 * @author Akshay
 *
 */
public class GameModel extends AbstractListModel<Game> {
	
	private static GameModel instance;
	
	public static GameModel getInstance(){
		if(instance == null){
			instance = new GameModel();
		}
		return instance;
	}
	
	private static final long serialVersionUID = -4216338772150454616L;

	
	private ArrayList<Game> games;
	private ArrayList<SimpleListObserver> observers;

	public GameModel(){
		games = new ArrayList<>();
		observers = new ArrayList<SimpleListObserver>();
	}

	/**
	 * Add a SimpleListObserver that is notified when the list of games is changed
	 * @param slo The SimpleListObsrever to add
	 */
	public void addListListener(SimpleListObserver slo){
		if(!observers.contains(slo)) {
			observers.add(slo);	
		}
	}
	
	/**
	 * Add a game to the list
	 * @param req The game to add
	 * @param status The game's status
	 */
	public void addGame(Game g){
		games.add(g);	
		updated();
	}

	/**
	 * Removes a game from the list. Doesn't do anything if the game is not in the list
	 * @param req The game to remove
	 */
	public void removeGame(Game g){
		if(games.contains(g)){
			games.remove(g);
			updated();
		}
	}
	
	public void emptyModel(){
		games.clear();
	}

	/**
	 * @return the list of games
	 */
	public ArrayList<Game> getGames(){
		return games;
	}
	
	/**
	 * Notifies all observers when that the list has changed
	 */
	private void updated() {
		for(SimpleListObserver observer:observers){
			observer.listUpdated();
		}		
	}


	@Override
	public int getSize() {
		return games.size();
	}

	@Override
	public Game getElementAt(int index) {
		return games.get(index);
	}
}