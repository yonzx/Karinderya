package servlet;

import dao.UserDAO;
import model.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User u = new UserDAO().login(username, password);
        if (u != null) {
            req.getSession().setAttribute("user", u);
            resp.sendRedirect("dashboard.jsp");
        } else {
            req.setAttribute("error", "Wrong username or password.");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}