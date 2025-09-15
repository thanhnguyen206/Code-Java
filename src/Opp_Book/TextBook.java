package Opp_Book;

public class TextBook extends Book {
    private String subject;

    public TextBook(java.lang.String id, java.lang.String title, java.lang.Double basePrice, java.lang.String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + this.subject);
        System.out.println("Final Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.10;
    }
}