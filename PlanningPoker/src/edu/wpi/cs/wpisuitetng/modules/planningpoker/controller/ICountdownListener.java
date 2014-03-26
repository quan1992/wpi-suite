package edu.wpi.cs.wpisuitetng.modules.planningpoker.controller;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.countdown.CountdownTimer;

/**
 * Listens to a {@link CountdownTimer} for changes.
 * @author Sam
 *
 */
public interface ICountdownListener {

	/**
	 * Called when the CountdownTimer this is listening to has a new
	 * value.
	 * @param value the new value of the timer
	 */
	public void valueChanged(int value);
	
}
