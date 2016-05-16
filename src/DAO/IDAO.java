package DAO;

import java.util.List;

public interface IDAO {
	public void salvar(Object bean);
	public void atualizar(Object bean);
	public void deletar(int id);
	public Object getById(int id);
}
