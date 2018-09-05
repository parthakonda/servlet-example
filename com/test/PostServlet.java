import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/post")
public class PostServlet extends HttpServlet {

    public void init() throws ServletException{
        System.out.println("Servlet initiate");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Read the parameters
        Integer value1 = Integer.parseInt(request.getParameter("value1"));
        Integer value2 = Integer.parseInt(request.getParameter("value2"));

        // Do some stuff
        Integer results = value1 + value2;

        // Return response
        PrintWriter out = response.getWriter();
        out.println("Results:" + results);

    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}