package repositorio;

import java.util.List;

import javax.persistence.Query;

import dominio.Produto;

public class ProdutoRepositorio extends BaseRepositorio {
	
	public ProdutoRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		this.em = this.emf.createEntityManager();
	}
	
	public void create(Produto produto) {
		this.em.getTransaction().begin();
		this.em.persist(produto);
		this.em.getTransaction().commit();			
	}
	
	public List<Produto> readAll() {
		Query qry = this.em.createQuery("from Produto");
		@SuppressWarnings("unchecked")
		List<Produto> lista = qry.getResultList();
		return lista;		
	}
	
	
	public Produto read(int id) {		
		Produto pro = this.em.find(Produto.class, id);
		return pro;		
	}
	
	public Produto update(Produto produto) {
		Produto pro = this.em.find(Produto.class, produto.getProdutoID());
		this.em.detach(pro);		
		this.em.getTransaction().begin();
		Produto mergeproduto = (Produto)this.em.merge(produto);
		this.em.getTransaction().commit();	
		return mergeproduto;
	}
	
	public void delete(int id) {
		Produto pro = this.em.find(Produto.class, id);
		this.em.getTransaction().begin();
		this.em.remove(pro);
		this.em.getTransaction().commit();	
	}	
	
	public void dispose() {
		this.em.close();
		this.emf.close();		
	}

}
