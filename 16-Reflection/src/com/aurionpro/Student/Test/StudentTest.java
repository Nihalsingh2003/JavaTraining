package com.aurionpro.Student.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.Student.model.Student;

public class StudentTest {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Student student =new Student();
	Class c=Student.class;
	System.out.println(c.getName());
	
	Field[] field=c.getDeclaredFields();
//	for(Field result:field) {
//		System.out.println(result.getName());
//	}
//	Constructor[] constructor=c.getDeclaredConstructors();
//	for(Constructor result:constructor) {
//		System.out.println(result.getName());
//	}
//	
//	Method[] method=c.getDeclaredMethods();
//	for(Method result:method) {
//		System.out.println(result.getName());
//	}
	
	Method m=c.getDeclaredMethod("result",double.class);
	m.setAccessible(true);
	System.out.println(m.invoke(student, 6.8));
	
	
}
}
