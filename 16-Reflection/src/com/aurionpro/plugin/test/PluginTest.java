package com.aurionpro.plugin.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.plugin.model.Plugin;

public class PluginTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
		Class c = Plugin.class;
		Constructor constructor = c.getDeclaredConstructor();
		constructor.setAccessible(true);
		System.out.println(constructor.getName());
		Plugin plugin = (Plugin) constructor.newInstance();
		Field field = c.getDeclaredField("version");
		field.setAccessible(true);
		field.set(plugin, 3.1);
		System.out.println(field.get(plugin));
		
		Method method=c.getDeclaredMethod("execute");
		method.invoke(plugin);
		

	}
}