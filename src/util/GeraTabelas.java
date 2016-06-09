package util;

import javax.persistence.*;

public class GeraTabelas {
	
  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("Entrada");
    factory = Persistence.createEntityManagerFactory("Categoria");
    factory.close();
    
    
  }
		
}
