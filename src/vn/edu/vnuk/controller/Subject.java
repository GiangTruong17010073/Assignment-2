package vn.edu.vnuk.controller;

import java.util.List;
import java.util.ArrayList;

public class Subject {
	  private List<Observer> observers = new ArrayList<Observer>();
	  public void attach(Observer observer) {
	      observers.add(observer);
	  }
	  public void detach(Observer observer) {
	      observers.remove(observer);
	  }
	  public void notifyChange(float minimumWage) {
	      for(Observer observer : observers) {
	          observer.update(minimumWage);
	      }
	  }
	}