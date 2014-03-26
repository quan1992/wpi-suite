package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.AbstractListModel;

import com.google.gson.Gson;

import edu.wpi.cs.wpisuitetng.modules.core.models.User;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.controller.SimpleListObserver;

/**
 * Stores a list of users and their estimates
 * 
 * @author Akshay
 * 
 */
public class EstimateListModel extends AbstractListModel {
    
    private HashMap<User, Float> estimateList;
    private ArrayList<SimpleListObserver> observers;
    
    public EstimateListModel() {
        estimateList = new HashMap<>();
        observers = new ArrayList<SimpleListObserver>();
    }
    
    /**
     * Add a SimpleListObserver that is notified when the list of estimates is
     * changed
     * 
     * @param slo
     *            The SimpleListObsrever to add
     */
    public void addListListener(SimpleListObserver slo) {
        if (!observers.contains(slo)) {
            observers.add(slo);
        }
    }
    
    /**
     * Add a user's estimate to the list
     * 
     * @param user
     * @param estoimate
     */
    public void addEstimate(User user, Float estimate) {
        estimateList.put(user, estimate);
        updated();
    }
    
    /**
     * Update a user's estimate. Doesn't do anything if the user is not in the
     * list.
     * 
     * @param user
     *            The user to update
     * @param estimate
     *            The user's new estimate
     */
    public void updateEstimate(User user, Float estimate) {
        if (estimateList.containsKey(user)) {
            estimateList.put(user, estimate);
            updated();
        }
    }
    
    /**
     * Removes a user and their estimate from the list. Doesn't do anything if
     * the user is not in the list
     * 
     * @param user
     *            the user to remove
     */
    public void removeEstimate(User user) {
        if (estimateList.containsKey(user)) {
            estimateList.remove(user);
            updated();
        }
    }
    
    /**
     * @return an array containing the users in the list
     */
    public User[] getUsers() {
        return estimateList.keySet().toArray(new User[] {});
        
    }
    
    /**
     * @return an array containing all of the estimates
     */
    public Float[] getEstimates() {
        return estimateList.values().toArray(new Float[] {});
    }
    
    /**
     * Computes the numerical average of all of the estimates
     * 
     * @return the mean (average)
     */
    public float getMean() {
        float mean = 0;
        for (Float f : estimateList.values()) {
            mean += f / (estimateList.values().size());
        }
        return mean;
    }
    
    /**
     * Computes the median of all of the estimates
     * 
     * @return the median
     */
    public float getMedian() {
        Float[] nums = estimateList.values().toArray(new Float[] {});
        if (estimateList.values().size() % 2 == 1) {
            return nums[estimateList.values().size() / 2];
        } else {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
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
	public Object getElementAt(int index) {
		return null;
	}
    
}