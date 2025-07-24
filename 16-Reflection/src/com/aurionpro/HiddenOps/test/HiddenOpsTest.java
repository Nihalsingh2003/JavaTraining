package com.aurionpro.HiddenOps.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.HiddenOps.model.HiddenOps;

public class HiddenOpsTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		HiddenOps hiddenOps = new HiddenOps();
		Class c = HiddenOps.class;
		Method method = c.getDeclaredMethod("secretCode", String.class);
		method.setAccessible(true);
		System.out.println(method.invoke(hiddenOps, "Hello"));

	}
}
