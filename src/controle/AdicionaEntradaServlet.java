package controle;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EntradaDAO;
import dominio.Categoria;
import dominio.Entrada;

@WebServlet("/adiciona-entrada")
public class AdicionaEntradaServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
	
		Entrada entrada = new Entrada();
		entrada.setValor(Double.parseDouble(request.getParameter("valor")));
		entrada.setComentario(request.getParameter("comentario"));
		entrada.setFrequente(Boolean.parseBoolean(request.getParameter("frequente")));
		System.out.println(entrada.getValor());
		System.out.println(entrada.getComentario());
		System.out.println(entrada.isFrequente());
		
		Categoria cat = new Categoria();
		cat.setDescricao(request.getParameter("categoria"));
		entrada.setCategoria(cat);
		Calendar c = Calendar.getInstance();
		entrada.setDataReferencia(c);
		entrada.setDataEfetiva(c);
		    
		EntradaDAO entradaDao = new EntradaDAO();
		entradaDao.salvar(entrada);
		
		RequestDispatcher rd = request.getRequestDispatcher("tables2.html");
		rd.forward(request, response);
		
		
	}
	
}
