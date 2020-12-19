package com.programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FIleInputOutput {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Dell\\eclipse-workspace\\Programs\\src\\com\\programs\\input.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		String[] array = line.split(",");

		String output="";
		FileWriter fw = new FileWriter("C:\\Users\\Dell\\eclipse-workspace\\Programs\\src\\com\\programs\\output.txt", true);
		PrintWriter out = new PrintWriter(fw);
		for (int i = 0; i < array.length; i++) {
			int value= Integer.parseInt(array[i]);
			if(value%2 != 0) {
				output = value+"";
				out.write(value+",");
			}

		}
		out.flush();
		out.close();

	}

}
