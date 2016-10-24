package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by 151577f on 10/24/2016.
 */
@WebServlet(name = "BookCatalogServlet" , urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>" + "<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");


        BookDBAO db = new BookDBAO();
        ArrayList<BookDetails> bdList = db.getAllBooks();

        for(int i =0 ; i<bdList.size();i++){
            System.out.println("List size = : " +bdList.size());
            out.println("<h2>" + bdList.get(i).getTitle() + "</h2>" + "&nbsp;" +
                    " by<em>" + bdList.get(i).getFirstName() +
                    " " + bdList.get(i).getSurname() + "</em> &nbsp; &nbsp; " + "(" +
                    bdList.get(i).getYear() + ")<br> &nbsp; <br>" + "<h4>" +
                    "Here's what the critcs say: </h4><blockquote>" +
                    bdList.get(i).getDescription() + "</blockquote>" + "<h4>" +
                    "Our Price: " + bdList.get(i).getPrice() + "</h4>" +
                    "<p><strong>" +
                    response.encodeURL(request.getContextPath()
                        /*    "/bookcatalog?bookId=" + bookId) + "\">" +*/
                 //   "Add to Cart</a>&nbsp;&nbsp;&nbsp;"
                    /*"<a href=\"" +
                    response.encodeURL(request.getContextPath() +
                            "/bookcatalog") + "\">" +
                    "Continue Shopping</a></p></strong>")*/));
    }
}}
