package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Categoria;

public class CategoriaDAO implements IDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Categoria");
	EntityManager manager = factory.createEntityManager();

	@Override
	public void salvar(Object bean) {
		// TODO Auto-generated method stub
				
		manager.getTransaction().begin();    
		manager.persist(bean);
		manager.getTransaction().commit();  

		manager.close();
		factory.close();	
	}

	@Override
	public void atualizar(Object bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getById(long id) {
		Query query = manager.createQuery("select e from Categoria as e where e.id = :param");
		query.setParameter("param", id);
		Categoria cat = (Categoria) query.getSingleResult();	
		
		manager.close();
		factory.close();
		return cat;
	}
	
	public List<Categoria> getAll() {
		 
		Query query = manager.createQuery("SELECT e FROM Categoria e");
		List<Categoria> lista = query.getResultList();	
		
		manager.close();
		factory.close();
		
		return lista;
	}

}
