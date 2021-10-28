package it.unical.ProvaIngSw;

import java.util.List;

public class MyListUtil {

	public MyListUtil() {}
	
	public static void sort(List<Integer> list, int order) {
		if(list.size() < 1 || list == null)
			throw new IllegalArgumentException("The list is empty or null");
		boolean notOrdered = true;
		int it = 1;
		if(order == 0) {
			while(notOrdered) {
				for(int i = 0; i < list.size() - it; ++i) {
					if(list.get(i) > list.get(i + 1)) {
						int temp = list.get(i);
						list.set(i, list.get(i+1));
						list.set(i+1, temp);
					}
				}
				++it;
			}
		}
		else if(order == 1) {
			while(notOrdered) {
				for(int i = 0; i < list.size() - it; ++i) {
					if(list.get(i) < list.get(i + 1)) {
						int temp = list.get(i);
						list.set(i, list.get(i+1));
						list.set(i+1, temp);
					}
				}
				++it;
			}
		}
		else
			throw new IllegalArgumentException("Invalid order");
	}
}
