package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.Date;

import edu.wpi.cs.wpisuitetng.modules.requirementmanager.models.Requirement;

/**
 * Represents a planning poker game
 * 
 * @author Akshay
 * 
 */
public class GameModel {
    
    public static enum GameType {
        LIVE, DISTRIBUTED
    };
    
    private Requirement requirement;
    private Date endDate;
    private GameType type;
    private boolean isEnded;
    
    /**
     * Constructor
     * 
     * @param req
     *            The requirement for this game
     * @param end
     *            End time for this game
     * @param type
     *            What type of game this is
     * @param finished
     *            whether or not the game has been manually ended
     */
    public GameModel(Requirement req, Date end, GameType type, boolean finished) {
        requirement = req;
        endDate = end;
        this.type = type;
        isEnded = finished;
    }
    
    /**
     * 
     * @return The Requirement for this game
     */
    public Requirement getRequirement() {
        return requirement;
    }
    
    /**
     * 
     * @return The end time for this game
     */
    public Date getEndTime() {
        return endDate;
    }
    
    /**
     * Returns which type of game this is
     * 
     * @return Either TYPE_LIVE or TYPE_DISTRIBUTED
     */
    public GameType getType() {
        return type;
    }
    
    /**
     * Manually set the game to ended
     * 
     * @param fin
     */
    public void setEnded(boolean fin) {
        isEnded = fin;
    }
    
    public boolean isEnded() {
        return isEnded
                || (endDate.before(new Date(System.currentTimeMillis())));
    }
    
}
