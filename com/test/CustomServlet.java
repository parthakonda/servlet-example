import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/annotation")
public class CustomServlet extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("Servlet initiated");
    }

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("From Annotation");
    }

    public void destroy() {
        System.out.println("Servlet destroyed");
    }
}