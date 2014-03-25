package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.ArrayList;
import java.util.HashMap;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.controller.SimpleListObserver;

/**
 * Stores a list of games and their statuses
 * @author Akshay
 *
 */
public class GameListModel {

	private HashMap<String, String> games;
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
	public void addGame(String req, String status){
		games.put(req, status);	
		updated();
	}

	/**
	 * Update a game's status. Doesn't do anything if the game is not in the list
	 * @param req The game to update
	 * @param status The game's new status
	 */
	public void updateGame(String req, String status){
		if(games.containsKey(req)){
			games.put(req, status);
			updated();	
		}
	}

	/**
	 * Removes a game from the list. Doesn't do anything if the game is not in the list
	 * @param req The game to remove
	 */
	public void removeGame(String req){
		if(games.containsKey(req)){
			games.remove(req);
			updated();
		}
	}

	/**
	 * @return an array containing the game in the list
	 */
	public String[] getGames(){
		return games.keySet().toArray(new String[]{});
	}

	/**
	 * @return an array containing the statuses of the games
	 */
	public String[] getStatuses(){
		return games.values().toArray(new String[]{});
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