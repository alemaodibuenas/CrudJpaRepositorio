package servico;

import java.util.Date;
import java.util.List;
import dominio.SubCategoria;
import repositorio.SubCategoriaRepositorio;

public class SubCategoriaServico extends BaseServico{
	
	private SubCategoriaRepositorio repo;
	
	public SubCategoriaServico(SubCategoriaRepositorio repo) {
		this.repo = repo;
	}
	
	public void inserir() {
		SubCategoria c = new SubCategoria(null,null, "teste", new Date());
		repo.create(c);		
	}
	
	public void alterar(SubCategoria sub) {
		repo.update(sub);		
	}
	
	public void excluirPorId(int id) {
		repo.delete(id);
	}
	
	public void excluirr(SubCategoria sub) {
		this.excluirPorId(sub.getSubCategoriaID());
	}
	
	public List<SubCategoria> listar() {
		return repo.readAll();		
	}
	
	public SubCategoria obter(int id) {
		return repo.read(id);
	}

}
