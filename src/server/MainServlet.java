package server;

import beans.*;
import tables.*;

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
    @EJB
    ExperienceService es;
    @EJB
    TitleService tis;
    @EJB
    CourseService cos;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        int p2 = servletPath.indexOf(".html");
        if (p2>0) {
            int p1 = servletPath.lastIndexOf("/", p2) + 1;
            String sp = servletPath.substring(p1, p2);
            request.setAttribute("sp", sp);
        }
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
            }
            catch (NumberFormatException ex) {
                response.sendRedirect("teacher.html");
            }

        }

        else if (servletPath.contains("teacher.html")){
            List<Teacher> teachers = ts.findAll();
            request.setAttribute("teachers", teachers);
            request.getRequestDispatcher("/teacher.jsp").forward(request,response);
        }





        else if (servletPath.contains("course.html")){


            String ttid = request.getParameter("ttid");
            try {
                Integer aid = Integer.valueOf(ttid);
                Title title = tis.find(aid);
                request.setAttribute("title", title);
                request.getRequestDispatcher("/course.jsp").forward(request, response);
            }
            catch (NumberFormatException ex) {
                response.sendRedirect("lesson.html");
            }

        }

        else if (servletPath.contains("lesson.html")){
            List<Title> titles = tis.findAll();
            request.setAttribute("titles", titles);
            request.getRequestDispatcher("/title.jsp").forward(request,response);
        }










        else if (servletPath.contains("reviews.html")){
            request.getRequestDispatcher("/reviews.jsp").forward(request,response);
        }
        else if (servletPath.contains("idioms.html")){
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
        else if (servletPath.contains("idiom.html")){
            request.getRequestDispatcher("/idiom.jsp").forward(request,response);
        }
        else if (servletPath.contains("bite-the-bullet.html")){
            request.getRequestDispatcher("/idiom.jsp").forward(request,response);
        } else {
            String requestURI = request.getRequestURI();
            int p = requestURI.lastIndexOf("/");
            String link = requestURI.substring(p+1);
            request.setAttribute("txt",link);
            request.getRequestDispatcher("/none.jsp").forward(request,response);
        }
    }






}