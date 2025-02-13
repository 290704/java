package com.celcom.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D://UserInputEx.txt");
		int ch=0;
		while((ch=fr.read()) !=-1) {
			System.out.print((char)ch);
			
		}
		fr.close();
		
	}

}
