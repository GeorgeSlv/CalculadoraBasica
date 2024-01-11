package calculadora;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcBasic
 */
@WebServlet("/CalcBasic")
public class CalcBasic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcBasic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String svalorA = request.getParameter("valorA");
		String svalorB = request.getParameter("valorB");
		String sopcao = request.getParameter("opcao");
		
		double dvalorA = Double.parseDouble(svalorA);
		double dvalorB = Double.parseDouble(svalorB);
		double resultado = 0;
		
		if (sopcao.equals("+")) {
			resultado = dvalorA + dvalorB;
		} else if (sopcao.equals("-")) {
			resultado = dvalorA - dvalorB;
		} else if (sopcao.equals("*")) {
			resultado = dvalorA * dvalorB;
		} else if (sopcao.equals("/")) {
			resultado = dvalorA / dvalorB;
		} 
		
		out.print("Resultado:<br>"+resultado);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
