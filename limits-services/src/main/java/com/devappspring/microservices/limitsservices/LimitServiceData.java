package com.devappspring.microservices.limitsservices;

public class LimitServiceData {

	int maxLimit;
	int minLimit;
	int Avg;
	LimitServiceData(int maxLimit,int minLimit){
		this.maxLimit=maxLimit;
		this.minLimit=minLimit;
	}
	public int getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
	
	public int getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	
}
