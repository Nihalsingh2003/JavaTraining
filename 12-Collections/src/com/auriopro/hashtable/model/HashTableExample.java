package com.auriopro.hashtable.model;


import java.util.Hashtable;

public class HashTableExample {
public static void main(String[] args) {
	Hashtable<Integer, String> map=new Hashtable<Integer, String>();

	
	map.put(100, "Gojo");
	map.put(101, "Nihal");
	
	map.putIfAbsent(102, "Nihal");
	System.out.println(map.get(102));
//	map.remove(102);
//	map.remove(100, "Gojo");
	System.out.println(map.containsKey(103));
	System.out.println(map.containsValue("Nihal"));
	System.out.println(map.size());
	System.out.println(map.isEmpty());
//	map.clear();
	map.replace(101, "GOJO");
	map.replace(101, "GOJO", "Nihal");
	System.out.println(map.values());
	System.out.println(map.equals(map));
	System.out.println(map.hashCode());
	
	
	System.out.println(map);
}
}
