
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

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null; 
    }

    public boolean updateBookById(String id) {
        Book bookToUpdate = findBookById(id);
        if (bookToUpdate != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new title: ");
            bookToUpdate.setTitle(scanner.nextLine());
            System.out.print("Enter new base price: ");
            bookToUpdate.setBasePrice(Double.parseDouble(scanner.nextLine()));

            if (bookToUpdate instanceof TextBook) {
                TextBook tb = (TextBook) bookToUpdate;
                System.out.print("Enter new subject: ");
                tb.setSubject(scanner.nextLine());
            } else if (bookToUpdate instanceof ReferenceBook) {
                ReferenceBook rb = (ReferenceBook) bookToUpdate;
                System.out.print("Enter new publisher: ");
                rb.setPublisher(scanner.nextLine());
            }
            return true;
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        Book bookToRemove = findBookById(id);
        if (bookToRemove != null) {
            bookList.remove(bookToRemove);
            return true;
        }
        return false;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("The book list is empty.");
            return;
        }
        for (Book book : bookList) {
            book.displayDetails();
            System.out.println(); 
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
        int textBookCount = 0;
        int refBookCount = 0;
        for (Book book : bookList) {
            if (book instanceof TextBook) {
                textBookCount++;
            } else if (book instanceof ReferenceBook) {
                refBookCount++;
            }
        }
        System.out.println("Total number of TextBooks: " + textBookCount);
        System.out.println("Total number of ReferenceBooks: " + refBookCount);
    }
}