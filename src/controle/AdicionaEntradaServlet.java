package controle;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CategoriaDAO;
import DAO.EntradaDAO;
import dominio.Categoria;
import dominio.Entrada;

@WebServlet("/adiciona-entrada")
public class AdicionaEntradaServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Entrada entrada = new Entrada();
		entrada.setValor(Double.parseDouble(request.getParameter("valor")));
		entrada.setComentario(request.getParameter("comentario"));
		entrada.setFrequente(Boolean.parseBoolean(request.getParameter("frequente")));

	
		
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		Categoria cat = (Categoria) categoriaDAO.getById(Integer.parseInt(request.getParameter("categoria")));
		entrada.setCategoria(cat);

		
		Calendar c = Calendar.getInstance();
		entrada.setDataReferencia(c);
		entrada.setDataEfetiva(c);
		
	try {    
			EntradaDAO entradaDao = new EntradaDAO();
			entradaDao.salvar(entrada);
			request.setAttribute("mensagem", "A Entrada foi cadastrada com sucesso");
	
	} catch (Exception e) {
			request.setAttribute("mensagem", "Erro ao cadastrar a entrada:" + e);
		  }

		
		RequestDispatcher rd = request.getRequestDispatcher("addEntradas.jsp");
		rd.forward(request, response);
		
		
	}
	
}
