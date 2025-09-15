package Opp_Book;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        BookList myBookList = new BookList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BOOK MANAGEMENT MENU ---");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Please choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: 
                    System.out.print("Enter ID: ");
                    String tbId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String tbTitle = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double tbPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Subject: ");
                    String tbSubject = scanner.nextLine();
                    myBookList.addBook(new TextBook(tbId, tbTitle, tbPrice, tbSubject));
                    System.out.println("Textbook added successfully!");
                    break;
                case 2: 
                    System.out.print("Enter ID: ");
                    String rbId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String rbTitle = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double rbPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Publisher: ");
                    String rbPublisher = scanner.nextLine();
                    myBookList.addBook(new ReferenceBook(rbId, rbTitle, rbPrice, rbPublisher));
                    System.out.println("Reference book added successfully!");
                    break;
                case 3: 
                    System.out.print("Enter ID of the book to update: ");
                    String updateId = scanner.nextLine();
                    if (myBookList.updateBookById(updateId)) {
                        System.out.println("Book updated successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4: 
                    System.out.print("Enter ID of the book to delete: ");
                    String deleteId = scanner.nextLine();
                    if (myBookList.deleteBookById(deleteId)) {
                        System.out.println("Book deleted successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5: 
                    System.out.print("Enter ID of the book to find: ");
                    String findId = scanner.nextLine();
                    Book foundBook = myBookList.findBookById(findId);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6: 
                    myBookList.displayAllBooks();
                    break;
                case 7: 
                    Book expensiveBook = myBookList.findMostExpensiveBook();
                    if (expensiveBook != null) {
                        System.out.println("The most expensive book is:");
                        expensiveBook.displayDetails();
                    } else {
                        System.out.println("The book list is empty.");
                    }
                    break;
                case 8: 
                    myBookList.countBooks();
                    break;
                case 0: 
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}