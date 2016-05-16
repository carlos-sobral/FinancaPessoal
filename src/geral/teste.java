package geral;


import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

import DAO.EntradaDAO;
import dominio.Entrada;

public class teste {

  public static void main(String[] args) {
   
/* Bloco para testar a criacao de entrada
    Entrada entrada = new Entrada();
	entrada.setValor(500);
	entrada.setComentario("meu comentario");
	entrada.setFrequente(true);
	Calendar c = Calendar.getInstance();
	entrada.setDataReferencia(c);
	entrada.setDataEfetiva(c);
    
	EntradaDAO entradaDao = new EntradaDAO();
	entradaDao.salvar(entrada);
*/	
	  
	  
/* Bloco para testar o getAll */	  
	
	EntradaDAO entradaDao = new EntradaDAO();
	List<Entrada> lista =  entradaDao.getAll();
		
	for (Entrada e : lista) {
	      System.out.println(e.getValor());
	    }
	  

    
  }
}
