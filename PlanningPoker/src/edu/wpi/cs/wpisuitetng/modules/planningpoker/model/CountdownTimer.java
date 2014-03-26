package edu.wpi.cs.wpisuitetng.modules.planningpoker.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import edu.wpi.cs.wpisuitetng.modules.planningpoker.controller.ICountdownListener;

/**
 * A class for a single-use countdown timer in the live game.
 * 
 * @author Quan Peng, Shan Zhou, Sam Carlberg
 * 
 */
public class CountdownTimer {

	// seconds left on the countdown
	private int timeLeft;
	private Timer timer;
	// ms to delay after we're told to start counting
	private int delay = 0;
	// how often to count down in ms
	private int period = 1000;

	// a list of listeners
	private List<ICountdownListener> listeners = new ArrayList<>();

	/**
	 * Creates a new countdown timer to count down for the given amount of
	 * seconds.
	 * 
	 * @param time
	 *            how long to count down for, in seconds
	 */
	public CountdownTimer(int time) {
		timer = new Timer();
		this.timeLeft = time;
	}

	/**
	 * Decrements the time remaining and, if necessary, cancel the timer.
	 * 
	 * @return the new time remaining, in seconds
	 */
	private int countdown() {
		if (this.timeLeft == 1) {
			timer.cancel();
		}
		timeLeft--;
		notifyListeners();
		return timeLeft;
	}

	/**
	 * Starts the countdown.
	 */
	public void start() {
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				countdown();
			}
		}, delay, period);
	}

	/**
	 * Add a listener to this countdown timer.
	 * 
	 * @param listener
	 *            a listener to add
	 */
	public void addListener(ICountdownListener listener) {
		listeners.add(listener);
	}

	/**
	 * Notify all listeners of a new value.
	 */
	private void notifyListeners() {
		for (ICountdownListener l : listeners) {
			l.valueChanged(timeLeft);
		}
	}
}
