package com.celcom.day8;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D://UserInputEx.txt");
		FileWriter fw=new FileWriter("D://UserInputEx1.txt");
		int ch=0;
		while((ch=fr.read()) !=-1) {
			fw.write(ch);
			
		}
		fr.close();
		fw.close();
		System.out.println("File copied..");
		
	}

}
