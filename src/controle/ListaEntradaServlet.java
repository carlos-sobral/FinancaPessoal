package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EntradaDAO;
import dominio.Categoria;
import dominio.Entrada;

@WebServlet("/lista-entrada")
public class ListaEntradaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	
		EntradaDAO entradaDao = new EntradaDAO();
		List<Entrada> lista =  entradaDao.getAll();	
		request.setAttribute("listaEntradas", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("tables2.jsp");
		rd.forward(request, response);
		
	}
	
}
