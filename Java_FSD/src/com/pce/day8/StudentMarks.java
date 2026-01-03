package com.pce.day8;

import java.util.Arrays;
import java.util.List;

public class StudentMarks {

	public static void main(String[] args) {

		List<Integer> marks=Arrays.asList(30,45,60,35,80);
		int sum=marks.stream()
				     .filter(m-> m>=40)
				     .map(m->m+5)
				     .reduce(0, Integer::sum);
		System.out.println("Total Marks Of Passed Student : "+sum);

	}

}