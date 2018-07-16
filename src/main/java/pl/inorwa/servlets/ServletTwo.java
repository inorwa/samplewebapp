package pl.inorwa.servlets;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Two")
public class ServletTwo extends HttpServlet {
	private Log log = LogFactory.getLog(ServletTwo.class);



	public ServletTwo() {
		log.info("====== HttpServlet constructor =======");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		log.info("====== HttpServlet.service =======");
		super.service(req, res);
	}

	@Override
	public void init() throws ServletException {
		log.info("====== HttpServlet.init =======");
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("HELLO Servlet 3.0");
		log.info("====== HttpServlet.doGet =======");

	}

	@Override
	public void destroy() {
		log.info("====== HttpServlet.destroy =======");
		super.destroy();
	}
}
