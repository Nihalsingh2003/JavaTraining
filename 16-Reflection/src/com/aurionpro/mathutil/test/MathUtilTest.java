package com.aurionpro.mathutil.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.aurionpro.mathutil.model.MathUtil;

public class MathUtilTest {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	MathUtil mathUtil=new MathUtil();
	Class c=MathUtil.class;
	Method method=c.getDeclaredMethod("square", int.class);
	System.out.println(method.invoke(mathUtil, 4));
}
}
