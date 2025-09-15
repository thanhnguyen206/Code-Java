package Opp_Book;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("\n--- BOOK MANAGEMENT SYSTEM ---");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count the total number of TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bookList.addBook(new TextBook()); 
                    break;
                case 2:
                    bookList.addBook(new ReferenceBook());
                    break;
                case 3:
                    System.out.print("Enter book ID to update: ");
                    String updateId = scanner.nextLine();
                    bookList.updateBookById(updateId);
                    break;
                case 4:
                    System.out.print("Enter book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter book ID to find: ");
                    String findId = scanner.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) {
                        foundBook.displayDetails();
                    } else {
                        System.out.println("Book with ID " + findId + " not found.");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book mostExpensiveBook = bookList.findMostExpensiveBook();
                    if (mostExpensiveBook != null) {
                        System.out.println("The most expensive book is:");
                        mostExpensiveBook.displayDetails();
                    } else {
                        System.out.println("The book list is empty.");
                    }
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}