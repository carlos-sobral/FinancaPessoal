package dominio;
import java.util.Calendar;
import javax.persistence.*;

@Entity
public class Entrada {

	@Id
	@GeneratedValue 
	private Long id;
	
	@ManyToOne 
	@JoinColumn
	private Categoria categoria;
	private boolean frequente;
	private double valor;
	private String comentario;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataReferencia;

	@Temporal(TemporalType.DATE)
	private Calendar dataEfetiva;
	
	public boolean isFrequente() {
		return frequente;
	}

	public void setFrequente(boolean frequente) {
		this.frequente = frequente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Calendar getDataReferencia() {
		return dataReferencia;
	}
	
	public void setDataReferencia(Calendar dataReferencia) {
		this.dataReferencia = dataReferencia;
	}
	
	public Calendar getDataEfetiva() {
		return dataEfetiva;
	}
	
	public void setDataEfetiva(Calendar dataEfetiva) {
		this.dataEfetiva = dataEfetiva;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
