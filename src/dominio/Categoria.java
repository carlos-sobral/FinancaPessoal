package dominio;

import javax.persistence.*;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue 
	private Long id;
	
	@Column(length = 32, unique = true)
	private String descricao;

	public Long getId() {
		return this.id;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
