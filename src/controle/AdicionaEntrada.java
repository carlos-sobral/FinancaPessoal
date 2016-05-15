package controle;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Categoria;
import dominio.Entrada;

public class AdicionaEntrada implements Logica {


	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Entrada");

		Entrada entrada = new Entrada();
		entrada.setValor(Double.parseDouble(req.getParameter("valor")));
		entrada.setComentario(req.getParameter("comentario"));
		entrada.setFrequente(Boolean.parseBoolean(req.getParameter("frequente")));
		Categoria cat = new Categoria();
		cat.setDescricao(req.getParameter("categoria"));
		entrada.setCategoria(cat);
		Calendar c = Calendar.getInstance();
		entrada.setDataReferencia(c);
		entrada.setDataEfetiva(c);
		    
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();    
		manager.persist(entrada);
		manager.getTransaction().commit();  

		manager.close();
		factory.close();

	    return "lista-contatos.jsp";
	}


}





