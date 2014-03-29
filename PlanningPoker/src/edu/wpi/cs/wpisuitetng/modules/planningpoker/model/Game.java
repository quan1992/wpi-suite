package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.AbstractListModel;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.controller.SimpleListObserver;
import edu.wpi.cs.wpisuitetng.modules.requirementmanager.models.Requirement;

/**
 * Represents a planning poker game
 * 
 * @author Akshay
 * 
 */
public class Game extends AbstractListModel<Estimate> {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -2777122181981150898L;

	public static enum GameStatus {
		PENDING("Pending"), COMPLETE("Complete");
		
		public String name;
		
		GameStatus(String stat){
			name = stat;
		}		
	};

	
    public static enum GameType {
        LIVE, DISTRIBUTED
    };
    
	private ArrayList<Estimate> estimateList;
    private ArrayList<SimpleListObserver> observers;

    private String name;
    private String description;
    private Requirement[] requirements;
    private Date endDate;
    private GameType type;
    private GameStatus status;
    

    /**
     * Constructor
     * @param requirements
     * @param end
     * @param type
     * @param status
     */
    public Game(String name, String description, Requirement[] requirements, Date end, GameType type, GameStatus status) {
        this.name = name;
        this.description = description;
        this.requirements = requirements;
        this.endDate = end;
        this.type = type;
        this.status = status;
        
        estimateList = new ArrayList<>();
        observers = new ArrayList<SimpleListObserver>();
    }
    
    /**
     * Constructor
     * @param requirements
     * @param end
     * @param type
     * @param status
     * @param estimates
     */
    public Game(String name, String description, Requirement[] requirements, Date end, GameType type, GameStatus status, ArrayList<Estimate> estimates) {
        this.name = name;
        this.description = description;
        this.requirements = requirements;
        this.endDate = end;
        this.type = type;
        this.status = status;
        this.estimateList = estimates;
        
        observers = new ArrayList<SimpleListObserver>();
    }
    
    /**
     * 
     * @return the name of this game
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @return the name of this game
     */
    public String getDescription() {
        return description;
    }
    
    
    
    /**
     * Add a SimpleListObserver that is notified when the list of estimates is
     * changed
     * 
     * @param slo The SimpleListObsrever to add
     */
    public void addListListener(SimpleListObserver slo) {
        if (!observers.contains(slo)) {
            observers.add(slo);
        }
    }
    
    /**
     * Add a user's estimate to the list 
     * @param user
     * @param estoimate
     */
    public void addEstimate(Estimate e) {
        estimateList.add(e);
        updated();
    }
    
   
    /**
     * Removes a user's estimate from the list. Doesn't do anything if
     * the estimate is not in the list
     * 
     * @param user the user to remove
     */
    public void removeEstimate(Estimate e) {
        if (estimateList.contains(e)) {
            estimateList.remove(e);
            updated();
        }
    }

    /**
     * @return an array containing all of the estimates
     */
    public ArrayList<Estimate> getEstimates() {
        return estimateList;
    }
    
    /**
     * 
     * @return The Requirement for this game
     */
    public Requirement[] getRequirements() {
        return requirements;
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
        status = fin?GameStatus.COMPLETE:GameStatus.PENDING;
    }
    
    public boolean isEnded() {
        return (status == GameStatus.COMPLETE)
                || (endDate.before(new Date(System.currentTimeMillis())));
    }
    
    /**
     * Computes the numerical average of all of the estimates
     * 
     * @return the mean (average)
     */
    public float getEstimateMean() {
        float mean = 0;
        for (Estimate e:estimateList) {
            mean += e.getEstimate() / (estimateList.size());
        }
        return mean;
    }
    
    /**
     * Computes the median of all of the estimates
     * 
     * @return the median
     */
    public float getEstimateMedian() {
    	int count = estimateList.size();
        if (estimateList.size() % 2 == 1) {
        	return estimateList.get(count/2).getEstimate();
        } else {
        	return (estimateList.get(count/2).getEstimate() + estimateList.get(count/2 -1).getEstimate())/2;
        }
    }

    /**
     * Notifies all observers when that the list has changed
     */
    private void updated() {
        for (SimpleListObserver observer : observers) {
            observer.listUpdated();
        }
    }
    
	@Override
	public int getSize() {
		return estimateList.size();
	}
	
	@Override
	public Estimate getElementAt(int index) {
		return estimateList.get(index);
	}
    
}
