package com.info.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import com.info.bean.Employee;
import com.info.bean.My1;
import com.info.bean.My2;

public class MainClass {

	public static void main(String[] args) {
/*		HashMap<String, String> hmap=new HashMap<>();
		hmap.put("1","abc");
		hmap.put("2","aba");
		hmap.put("3","abe");
		hmap.put("4","abf");
		LinkedList<Entry<String, String>> mapLL=new LinkedList<>(hmap.entrySet());
		System.out.println(mapLL);
		Collections.sort(mapLL,new Sorted());
		System.out.println(mapLL);
		LinkedHashMap<String, String> lHMap=mapLL.stream().collect(Collectors.toma);
		float f=(float)(5>>1);
		System.out.println(f);*/
		
		ConcurrentHashMap<Integer, String> hmap=new ConcurrentHashMap();
		hmap.put(1, "a");
		hmap.put(2, "b");
		hmap.put(3, "c");
		hmap.put(4, "d");
		
		Set<Integer> abc=hmap.keySet();
		System.out.println(abc);
		Iterator<Integer> keys=abc.iterator();
		
		while(keys.hasNext())
		{
			Integer key=keys.next();
			hmap.put(5, "e");
			System.out.println("Key : "+key+"value : "+hmap.get(key));
			System.out.println(hmap);
			//System.out.println(hmap.get(keys.next()));
			
		}
		System.out.println(hmap);
	}
		
}
