package Practice1;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("War and peas");
        Book book2 = new Book("Rad and black");
        Magazine magazine1 = new Magazine("Java rush");
        Magazine magazine2 = new Magazine("Forbes");

        Printable[] printables = {book1,book2,magazine1,magazine2};
        for(Printable printable:printables){
            printable.print();
        }
    }
}
