package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A3 {
	public static void main(String[] args) {
		String inputFile = "input.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)) ) {
			String line;
			String longestWord = "important";

			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+"); 
				for (String word : words) {
					if (word.length() > longestWord.length()) {
						longestWord = word;
					}
				}
			}

			System.out.println("Longest Word: " + longestWord);
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
