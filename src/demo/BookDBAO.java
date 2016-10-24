package demo;

import demo.BookDetails;

import java.util.ArrayList;

/**
 * Created by 151577f on 10/24/2016.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
    public ArrayList<BookDetails> getAllBooks(){
        BookDetails bd1 = new BookDetails();
        bd1.setBookId("1123");
        bd1.setDescription("Book1");
        bd1.setFirstName("Java");
        bd1.setSurname("Expert");
        bd1.setInventory(5);
        bd1.setOnSale(false);
        bd1.setPrice(5.9f);
        bd1.setTitle("Web components for developers");
        bd1.setYear(2015);

        BookDetails bd2 = new BookDetails();
        bd2.setBookId("1124");
        bd2.setDescription("Book2");
        bd2.setFirstName("Java");
        bd2.setSurname("Expert");
        bd2.setInventory(5);
        bd2.setOnSale(false);
        bd2.setPrice(5.9f);
        bd2.setTitle("Web components for developers");
        bd2.setYear(2015);

        ArrayList<BookDetails> aList = new ArrayList<BookDetails>();
        aList.add(bd1);
        aList.add(bd2);
       // aList.add(bd2);

        return aList;

    }
}