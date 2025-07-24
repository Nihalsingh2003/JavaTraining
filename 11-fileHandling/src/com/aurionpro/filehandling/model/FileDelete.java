package com.aurionpro.filehandling.model;

import java.io.File;

public class FileDelete {
public static void main(String[] args) {
	File file=new File("demo.txt");
	if(file.delete()) {
		System.out.println("file deleted");
	}else {
		System.out.println("no exist");
	}
}
}
