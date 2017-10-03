package net.brianjlee.servletjsp2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "userServlet", urlPatterns = { "users" }, loadOnStartup = 1)
public class UserServlet extends HttpServlet {
    private DataAccessObject data = new DataAccessObject();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        User[] users = data.getUsers();
        for (User user: users) {
            int id = user.getId();
            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String phone = user.getFormattedPhoneNumber();
            writer.printf("%d: %s %s – %s%n", id, firstName, lastName, phone);
        }
        writer.println();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
