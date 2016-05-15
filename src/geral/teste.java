package geral;


import java.util.Calendar;

import javax.persistence.*;

import dominio.Entrada;

public class teste {

  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Entrada");

    Entrada entrada = new Entrada();
	entrada.setValor(500);
	entrada.setComentario("meu comentario");
	entrada.setFrequente(true);
	Calendar c = Calendar.getInstance();
	entrada.setDataReferencia(c);
	entrada.setDataEfetiva(c);
    
	EntityManager manager = factory.createEntityManager();

	manager.getTransaction().begin();    
	manager.persist(entrada);
	manager.getTransaction().commit();  

	manager.close();
	factory.close();
    
  }
}
