package com.aurionpro.filehandling.model;

import java.io.File;
import java.io.IOException;

public class FileCreate {
public static void main(String[] args) throws IOException {
	File file=new File("demo.txt");
	if(file.createNewFile()) {
		System.out.println("file create");
	}else {
		System.out.println("file already exist");
	}
}
}
