package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.Date;

/**
 * Represents a planning poker game
 * @author Akshay
 *
 */
public class GameModel {
	
	public static final int TYPE_LIVE = 0;
	public static final int TYPE_DISTRIBUTED = 1;
	
	private String requirement;
	private Date endDate;
	private int type;
	private boolean isEnded;
	
	/**
	 * Constructor
	 * @param req The requirement for this game
	 * @param end End time for this game
	 * @param type What type of game this is
	 * @param finished whether or not the game has been manually ended
	 */
	public GameModel(String req, Date end, int type, boolean finished){
		this.requirement = req;
		this.endDate = end;
		this.type = type;
		isEnded = finished;
	}
	
	/**
	 * 
	 * @return The Requirement for this game
	 */
	public String getRequirement(){
		return requirement;
	}
	
	/**
	 * 
	 * @return The end time for this game
	 */
	public Date getEndTime(){
		return endDate;
	}
	
	/**
	 * Returns which type of game this is
	 * @return Either TYPE_LIVE or TYPE_DISTRIBUTED
	 */
	public int getType(){
		return type;
	}
	
	/**
	 * Manually set the game to ended
	 * @param fin
	 */
	public void setEnded(boolean fin){
		isEnded = fin;
	}
	
	public boolean isEnded(){
		return isEnded || (endDate.before(new Date(System.currentTimeMillis())));
	}

}
