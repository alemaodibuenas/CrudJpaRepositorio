package servico;

import java.util.List;
import dominio.Produto;
import repositorio.ProdutoRepositorio;

public class ProdutoServico extends BaseServico{
	
	private ProdutoRepositorio repo;
	
	public ProdutoServico(ProdutoRepositorio repo) {
		this.repo = repo;
	}
	
	public void inserir() {
		Produto c = new Produto(null,null,null, "teste");
		repo.create(c);		
	}
	
	public void alterar(Produto pro) {
		repo.update(pro);		
	}
	
	public void excluirPorId(int id) {
		repo.delete(id);
	}
	
	public void excluirr(Produto pro) {
		this.excluirPorId(pro.getProdutoID());
	}
	
	public List<Produto> listar() {
		return repo.readAll();		
	}
	
	public Produto obter(int id) {
		return repo.read(id);
	}

}
