package com.collections1;

import java.util.Comparator;

public class PassengerDetail implements Comparable {
	int passId;
	String passeName;
	String destinationFrom;
	String destinationTo;
	public PassengerDetail(int passId, String passeName, String destinationFrom, String destinationTo) {
		super();
		this.passId = passId;
		this.passeName = passeName;
		this.destinationFrom = destinationFrom;
		this.destinationTo = destinationTo;
	}
	public int getpassId() {
		return passId;
	}
	public String getpasseName() {
		return passeName;
	}
	public String getdestinationFrom() {
		return destinationFrom;
	}
	public String getdestinationTo() {
		return destinationTo;
	}
	
	public String toString() {
		return passId+" "+passeName+" "+destinationFrom+" "+destinationTo;
	}
	@Override
	public int compareTo(Object o) {
		if(this.passId>((PassengerDetail)(o)).passId){
			return 1;
		}
		return -1;
	}
	
}

class SortingByComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int res=(((PassengerDetail)(o1)).passeName).compareTo((((PassengerDetail)(o2)).passeName));
		if(res>0) {
			return 1;
		}
		return -1;
	}
	
}
