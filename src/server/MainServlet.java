package server;

import beans.BookService;
import beans.ClientService;
import beans.TeacherService;
import tables.Book;
import tables.Client;
import tables.Teacher;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "MainServlet", urlPatterns = {"*.html"})
public class MainServlet extends HttpServlet {
    @EJB
    ClientService cs;
    @EJB
    BookService bs;
    @EJB
    TeacherService ts;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        if (servletPath.contains("clients_main.html")) {
            clientsRequest(request, response);
        } else if (servletPath.contains("books_show.html")) {
            booksRequest(request, response);
        } else if (servletPath.contains("/teachers/")) {
            teachersRequest(request,response);
        } else if (servletPath.contains("command.html")) {
             request.getRequestDispatcher("/command.jsp").forward(request,response);
        } else if (servletPath.contains("index.html")) {
            request.getRequestDispatcher("/main.jsp").forward(request,response);
        }
        else if (servletPath.contains("contact.html")){
            request.getRequestDispatcher("/contact.jsp").forward(request,response);
        }
        else if (servletPath.contains("teacher.html")){
            List<Teacher> teachers = ts.findAll();
            request.setAttribute("teachers", teachers);
            request.getRequestDispatcher("/teacher.jsp").forward(request,response);
        }

    }

    private void teachersRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();

    }

    private void clientsRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Client> clients = cs.findAll();
        request.setAttribute("clients", clients);
        request.getRequestDispatcher("/show_all_clients.jsp").forward(request, response);
    }

    private void booksRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        if (servletPath.contains("show.html")) {
            showBooks(request, response);
        } else if (servletPath.contains("delete.html")) {
            deleteBook(request, response);
        } else {
            showBooks(request, response);
        }

    }

    private void showBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = bs.findAll();
        request.setAttribute("books", books);
        request.getRequestDispatcher("/show_books.jsp").forward(request, response);

    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer book_id = Integer.valueOf(request.getParameter("book_id"));
        bs.remove(book_id);
        response.sendRedirect("show.html");
    }


}
