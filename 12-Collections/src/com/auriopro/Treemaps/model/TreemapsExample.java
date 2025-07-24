package com.auriopro.Treemaps.model;

import java.util.TreeMap;

public class TreemapsExample {
public static void main(String[] args) {
	TreeMap<Integer, String> map=new TreeMap<Integer, String>();
	map.put(100, "Gojo");
	map.put(120, "Nihal");
	map.put(103, "Nihal");
	map.put(104, "Nihal");
	map.put(106, "Nihal");
	System.out.println(map.containsKey(103));
	System.out.println(map.containsValue("Nihal"));
	System.out.println(map.size());
	System.out.println(map.isEmpty());
//map.clear();
	map.replace(101, "GOJO");
	map.replace(101, "GOJO", "Nihal");
	System.out.println(map.values());
	System.out.println(map.firstEntry());
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	System.out.println(map.higherKey(100));
	System.out.println(map.ceilingKey(101));
	System.out.println(map.floorKey(101));
	System.out.println(map.descendingMap());
	System.out.println(map.subMap(103, 106));
	System.out.println(map);
}
}
