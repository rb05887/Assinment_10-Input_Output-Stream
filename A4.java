package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A4 {

	public static void main(String[] args) {
		String inputFile = "input.txt";
		String textToAppend = "This text is appended to the existing file.";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile, true))) {
			writer.write(textToAppend);
			writer.newLine(); 
			System.out.println("Text appended to the file successfully!");
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
