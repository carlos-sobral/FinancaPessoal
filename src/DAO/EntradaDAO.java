package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Entrada;

public class EntradaDAO implements IDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Entrada");
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
	public Object getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Entrada> getAll() {
		 
		Query query = manager.createQuery("SELECT e FROM Entrada e");
		List<Entrada> lista = query.getResultList();	
		
		manager.close();
		factory.close();
		
		return lista;
	}

}
