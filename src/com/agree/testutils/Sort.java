package com.agree.testutils;

import java.util.ArrayList;
import java.util.Date;

public class Sort {
	public static ArrayList<Integer> sortxz(ArrayList<Integer> a){
		int len = a.size();
		int count = 0;
		Date str = new Date();
		System.out.println(a.get(0));
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				if (a.get(i) < a.get(j)) {
					int tmp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, tmp);
					count++;
					System.out.println(count+":"+a);
				}
			}
		}
		Date end = new Date();
		System.out.println(count);
		return a;
	}
	public static ArrayList<Integer> sortmp(ArrayList<Integer> a){
		int len = a.size();
		int count = 0;
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if (a.get(j) < a.get(j+1)) {
					int tmp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, tmp);
					count++;
					System.out.println(count+":"+a);
				}
			}
		}
		System.out.println(count);
		return a;
	}
}
