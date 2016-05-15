package geral;


import java.util.Calendar;

import javax.persistence.*;

import DAO.EntradaDAO;
import dominio.Entrada;

public class teste {

  public static void main(String[] args) {
   

    Entrada entrada = new Entrada();
	entrada.setValor(500);
	entrada.setComentario("meu comentario");
	entrada.setFrequente(true);
	Calendar c = Calendar.getInstance();
	entrada.setDataReferencia(c);
	entrada.setDataEfetiva(c);
    
	EntradaDAO entradaDao = new EntradaDAO();
	entradaDao.salvar(entrada);
    
  }
}
