package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.ArrayList;
import java.util.HashMap;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.controller.SimpleListObserver;
import edu.wpi.cs.wpisuitetng.modules.requirementmanager.models.Requirement;

/**
 * Stores a list of games and their statuses
 * @author Akshay
 *
 */
public class GameListModel {
	
	public static enum GameStatus {PENDING, COMPLETE};

	private HashMap<Requirement, GameStatus> games;
	private ArrayList<SimpleListObserver> observers;

	public GameListModel(){
		games = new HashMap<>();
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
	 * Add a game and its status to the list
	 * @param req The game to add
	 * @param status The game's status
	 */
	public void addGame(Requirement req, GameStatus status){
		games.put(req, status);	
		updated();
	}

	/**
	 * Update a game's status. Doesn't do anything if the game is not in the list.
	 * @param req The game to update
	 * @param status The game's new status
	 */
	public void updateGame(Requirement req, GameStatus status){
		if(games.containsKey(req)){
			games.put(req, status);
			updated();	
		}
	}

	/**
	 * Removes a game from the list. Doesn't do anything if the game is not in the list
	 * @param req The game to remove
	 */
	public void removeGame(Requirement req){
		if(games.containsKey(req)){
			games.remove(req);
			updated();
		}
	}

	/**
	 * @return an array containing the game in the list
	 */
	public Requirement[] getGames(){
		return games.keySet().toArray(new Requirement[]{});
	}

	/**
	 * @return an array containing the statuses of the games
	 */
	public GameStatus[] getStatuses(){
		return games.values().toArray(new GameStatus[]{});
	}
	
	/**
	 * @return the number of games in this model
	 */
	public int getNumGames() {
	    return games.size();
	}
	
	/**
	 * Notifies all observers when that the list has changed
	 */
	private void updated() {
		for(SimpleListObserver observer:observers){
			observer.listUpdated();
		}		
	}
}