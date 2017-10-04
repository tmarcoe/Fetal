package com.ftl.events;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ftl.helper.FetalTransaction;


public class Step {
	
	List<StepEventListener> listeners = new ArrayList<StepEventListener>();
	
	
	public synchronized void receiveStep(FetalTransaction trans) {
		_fireStepEvent(trans);
	}
	
	public synchronized void addEventListener(StepEventListener sel) {
		listeners.add(sel);
	}
	public synchronized void removeEventListener(StepEventListener sel) {
		listeners.remove(sel);
	}
	
	private synchronized void _fireStepEvent(FetalTransaction trans) {
		StepEvent stepEvent = new StepEvent(this);
		
		Iterator<StepEventListener> li = listeners.iterator();
		while(li.hasNext()) {
			li.next().StepReceived(stepEvent);
		}
	}

}
