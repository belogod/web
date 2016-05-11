package server;

import beans.*;
import tables.Gallery;
import tables.Training;
import tables.Teacher;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;


@WebServlet(name = "MainServlet", urlPatterns = {"*.html"})
public class MainServlet extends HttpServlet {
    @EJB
    ClientService cs;
    @EJB
    TeacherService ts;
    @EJB
    TrainingService trs;
    @EJB
    PageService ps;
    @EJB
    GalleryService gs;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        if (servletPath.contains("gallery.html")) {
            List<Gallery> galleries = gs.findAll();
            List<String> names = galleries.stream().map(c -> c.getTeacher().getName()).distinct().collect(toList());
            request.setAttribute("galleries", galleries);
            request.setAttribute("names", names);
            request.getRequestDispatcher("/gallery.jsp").forward(request,response);
        } else if (servletPath.contains("index.html")) {
            List<Gallery> galleries = gs.findAll();
            request.setAttribute("galleries", galleries);

            List<Training> trainings = trs.findAll();
            request.setAttribute("trainings", trainings);
            request.getRequestDispatcher("/main.jsp").forward(request,response);
        }
        else if (servletPath.contains("contact.html")){
            request.getRequestDispatcher("/contact.jsp").forward(request,response);
        }
        else if (servletPath.contains("teacher_resume.html")){
            String tid = request.getParameter("tid");
            try {
                Integer aid = Integer.valueOf(tid);
                Teacher teacher = ts.find(aid);
                request.setAttribute("teacher", teacher);
                request.getRequestDispatcher("/teacher_resume.jsp").forward(request, response);
            } catch (NumberFormatException ex) {
                response.sendRedirect("teacher.html");
            }

        }

        else if (servletPath.contains("teacher.html")){
            List<Teacher> teachers = ts.findAll();
            request.setAttribute("teachers", teachers);
            request.getRequestDispatcher("/teacher.jsp").forward(request,response);
        }
        else if (servletPath.contains("study.html")){
            request.getRequestDispatcher("/study.jsp").forward(request,response);
        }
        else if (servletPath.contains("reviews.html")){
            request.getRequestDispatcher("/reviews.jsp").forward(request,response);
        }
        else if (servletPath.contains("interesting.html")){
            request.setAttribute("trainings", trs.findByType(Training.INTERESTING));
            request.getRequestDispatcher("/interesting.jsp").forward(request,response);
        }
        else if (servletPath.contains("slang.html")){
            request.setAttribute("trainings", trs.findByType(Training.SLANG));
            request.getRequestDispatcher("/slang.jsp").forward(request,response);
        }
        else if (servletPath.contains("lazy_person.html")){
            request.setAttribute("trainings", trs.findByType(Training.LAZY));
            request.getRequestDispatcher("/lazy_person.jsp").forward(request,response);
        }
        else if (servletPath.contains("piece-of-cake.html")){
            request.getRequestDispatcher("/piece-of-cake.jsp").forward(request,response);
        }
        else if (servletPath.contains("bite-the-bullet.html")){
            request.getRequestDispatcher("/bite-the-bullet.jsp").forward(request,response);
        } else {
            String requestURI = request.getRequestURI();
            int p = requestURI.lastIndexOf("/");
            String link = requestURI.substring(p+1);
            request.setAttribute("txt",link);
            request.getRequestDispatcher("/none.jsp").forward(request,response);
        }
    }






}