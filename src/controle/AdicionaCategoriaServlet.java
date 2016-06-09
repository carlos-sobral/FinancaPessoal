package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CategoriaDAO;
import dominio.Categoria;

@WebServlet("/adiciona-categoria")
public class AdicionaCategoriaServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try { 		
		Categoria cat = new Categoria();
		cat.setDescricao(request.getParameter("categoria"));
		
		
		   
			CategoriaDAO categoriaDao = new CategoriaDAO();
			categoriaDao.salvar(cat);
			request.setAttribute("mensagem", "A categoria foi cadastrada com sucesso");
		} catch (Exception e) {
			request.setAttribute("mensagem", "Erro ao cadastrar a categoria:" + e);
		  }

		
		RequestDispatcher rd = request.getRequestDispatcher("addCategorias.jsp");
		rd.forward(request, response);
		
		
	}
	
	
}
