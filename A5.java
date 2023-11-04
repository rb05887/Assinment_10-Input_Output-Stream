package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

class Product {
	int productCode;
	double cost;
	int quantity;

	Product(int productCode, double cost, int quantity) {
		this.productCode = productCode;
		this.cost = cost;
		this.quantity = quantity;
	}

	double getTotalValue() {
		return cost * quantity;
	}
}

public class A5 {
	public static void main(String[] args) {
		Product[] products = new Product[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter details for Product " + (i + 1) + ":");
			System.out.print("Product Code: ");
			int code = scanner.nextInt();
			System.out.print("Cost (in Rs): ");
			double cost = scanner.nextDouble();
			System.out.print("Quantity: ");
			int quantity = scanner.nextInt();

			products[i] = new Product(code, cost, quantity);
		}

		try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src/output.txt")))) {
			double totalValue = 0;

			for (Product product : products) {
				writer.println("Product Code: " + product.productCode);
				writer.println("Cost: Rs " + String.format("%.2f", product.cost));
				writer.println("Quantity: " + product.quantity);
				double productTotalValue = product.getTotalValue();
				totalValue += productTotalValue;
				writer.println("Total Value: Rs " + String.format("%.2f", productTotalValue));
				writer.println();
			}

			writer.println("Total Value of All Products: Rs " + String.format("%.2f", totalValue));

			System.out.println("Data written to output.txt successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}