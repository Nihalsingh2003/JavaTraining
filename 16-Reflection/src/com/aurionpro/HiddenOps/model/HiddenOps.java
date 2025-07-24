package com.aurionpro.HiddenOps.model;

public class HiddenOps {
private String secretCode(String input) {
	StringBuilder stringBuilder=new StringBuilder(input);
	return stringBuilder.reverse().toString();
}
}
