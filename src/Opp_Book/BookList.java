
package Opp_Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    private ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    // Phương thức thêm sách mới, nhận loại sách để biết cần nhập thông tin gì
    public void addBook(Book bookType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Base Price: ");
        double basePrice = scanner.nextDouble();
        scanner.nextLine();

        if (bookType instanceof TextBook) {
            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();
            TextBook newTextBook = new TextBook(id, title, basePrice, subject);
            bookList.add(newTextBook);
        } else if (bookType instanceof ReferenceBook) {
            System.out.print("Enter Publisher: ");
            String publisher = scanner.nextLine();
            ReferenceBook newReferenceBook = new ReferenceBook(id, title, basePrice, publisher);
            bookList.add(newReferenceBook);
        }
        System.out.println("Book added successfully!");
    }

    public boolean updateBookById(String id) {
        Scanner scanner = new Scanner(System.in);
        Book bookToUpdate = findBookById(id);
        if (bookToUpdate != null) {
            System.out.println("Book found. Enter new details:");
            System.out.print("Enter new Title: ");
            bookToUpdate.setTitle(scanner.nextLine());
            System.out.print("Enter new Base Price: ");
            bookToUpdate.setBasePrice(scanner.nextDouble());
            scanner.nextLine();
            if (bookToUpdate instanceof TextBook) {
                System.out.print("Enter new Subject: ");
                ((TextBook) bookToUpdate).setSubject(scanner.nextLine());
            } else if (bookToUpdate instanceof ReferenceBook) {
                System.out.print("Enter new Publisher: ");
                ((ReferenceBook) bookToUpdate).setPublisher(scanner.nextLine());
            }
            System.out.println("Book updated successfully!");
            return true;
        }
        System.out.println("Book with ID " + id + " not found.");
        return false;
    }

    public boolean deleteBookById(String id) {
        Book bookToDelete = findBookById(id);
        if (bookToDelete != null) {
            bookList.remove(bookToDelete);
            System.out.println("Book with ID " + id + " deleted successfully!");
            return true;
        }
        System.out.println("Book with ID " + id + " not found.");
        return false;
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty.");
            return;
        }
        System.out.println("--- All Books in the List ---");
        for (Book book : bookList) {
            book.displayDetails();
            System.out.println("----------------------------");
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book mostExpensive = bookList.get(0);
        for (Book book : bookList) {
            if (book.calculatePrice() > mostExpensive.calculatePrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public void countBooks() {
        long textBookCount = bookList.stream().filter(b -> b instanceof TextBook).count();
        long referenceBookCount = bookList.stream().filter(b -> b instanceof ReferenceBook).count();
        System.out.println("Total TextBooks: " + textBookCount);
        System.out.println("Total ReferenceBooks: " + referenceBookCount);
    }
}