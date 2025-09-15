package Opp_Book;

public class ReferenceBook extends Book {
    private String publisher;

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Reference Book Details ---");
        super.displayDetails();
        System.out.println("Publisher: " + publisher);
        System.out.println("Calculated Price: $" + String.format("%.2f", calculatePrice()));
    }

    @Override
    public double calculatePrice() {

        return getBasePrice() * 1.20;
    }
}