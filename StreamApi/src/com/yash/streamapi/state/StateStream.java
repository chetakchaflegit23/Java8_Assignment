package com.yash.streamapi.state;

public class StateStream {
	private int stated;
	private String statename;
	
	public StateStream(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "StateStream [stated=" + stated + ", statename=" + statename + "]";
	}
	
	
}
