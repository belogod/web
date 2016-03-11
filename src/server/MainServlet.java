package server;

import beans.BookService;
import beans.ClientService;
import tables.Book;
import tables.Client;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "MainServlet", urlPatterns = {"/main", "/books"})
public class MainServlet extends HttpServlet {
    @EJB
    ClientService cs;
    @EJB
    BookService bs;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
        booksRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
        booksRequest(request,response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Client> clients = cs.findAll();
        request.setAttribute("clients",clients);
        request.getRequestDispatcher("/show_all_clients.jsp").forward(request,response);


    }

    private void booksRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Book> books = bs.findAll();
        request.setAttribute("books",books);
        request.getRequestDispatcher("/show_books.jsp").forward(request,response);
    }
}
