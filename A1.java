package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) {
		String fileName = "input.txt";

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				charCount += line.length();
				String[] words = line.split("\\s+");
				wordCount += words.length;
				lineCount++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Character Count: " + charCount);
		System.out.println("Word Count: " + wordCount);
		System.out.println("Line Count: " + lineCount);
	}
}
