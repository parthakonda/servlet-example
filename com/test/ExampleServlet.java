import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/sample")
public class ExampleServlet extends HttpServlet {

    // Some data
    private String data = "My Static Data";

    public void init() throws ServletException {
        // Settings message
        System.out.println("in Init");
        data = "Changed message";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("in Get");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>" + data + "</h1");
    }

    public void destroy() {
        System.out.println("I'm destroyed");
    }
}