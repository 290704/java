package com.celcom.day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
public class ImageCopyExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fr=new FileInputStream("D://priya word.jpg");
		FileOutputStream fw=new FileOutputStream("D://priya word1.jpg");
		int ch=0;
		while((ch=fr.read()) !=-1) {
			fw.write(ch);
			
		}
		fr.close();
		fw.close();
		System.out.println("Image copied..");
		
	}

}
