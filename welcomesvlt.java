import javax.*;
import java.io.*;
import util.*;

public class welcomesvlt extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponce res)throws IOException,ServletException
	{
		res.getContent("text/html");
		PrintWriter pw=res.getWriter();
		String u=req.getParameter(uname);
		pw.println("Welcome +u");
	}
	
}