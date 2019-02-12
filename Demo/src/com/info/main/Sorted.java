package com.info.main;

import java.util.Comparator;
import java.util.Map.Entry;

public class Sorted implements Comparator<Entry<String, String>>{

	@Override
	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}

}
