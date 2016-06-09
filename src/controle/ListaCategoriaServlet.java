package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CategoriaDAO;
import dominio.Categoria;


@WebServlet("/lista-categoria")
public class ListaCategoriaServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	
		CategoriaDAO categoriaDao = new CategoriaDAO();
		List<Categoria> lista =  categoriaDao.getAll();	
		request.setAttribute("listaCategorias", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("addEntradas.jsp");
		rd.forward(request, response);
		
	}
	
	
}
