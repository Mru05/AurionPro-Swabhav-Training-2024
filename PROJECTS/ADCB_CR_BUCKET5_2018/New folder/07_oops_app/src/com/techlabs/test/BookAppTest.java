package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BookApp;

public class BookAppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
       

        BookApp[] books = new BookApp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            books[i] = new BookApp(bookId, name, author, price);
        }

        //  bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books[j].getPrice() < books[j + 1].getPrice()) {
                    BookApp temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

        
        System.out.println("\nBooks in descending order of price:");
        for (BookApp book : books) {
        	System.out.println("");
            System.out.println("Book ID: " + book.getBookId() + ", \nName: " + book.getName() + ", \nAuthor: " + book.getAuthor() + ", \nPrice: " + book.getPrice());
        }

        scanner.close();
    }
}
