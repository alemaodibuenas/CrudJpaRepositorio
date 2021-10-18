package repositorio;

import java.util.List;

import javax.persistence.Query;

import dominio.Categoria;
import dominio.SubCategoria;

public class SubCategoriaRepositorio extends BaseRepositorio {
	
	public SubCategoriaRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		this.em = this.emf.createEntityManager();
	}
	
	public void create(SubCategoria subCategoria) {
		this.em.getTransaction().begin();
		this.em.persist(subCategoria);
		this.em.getTransaction().commit();			
	}
	
	public List<SubCategoria> readAll() {
		Query qry = this.em.createQuery("from SubCategoria");
		@SuppressWarnings("unchecked")
		List<SubCategoria> lista = qry.getResultList();
		return lista;		
	}
	
	
	public SubCategoria read(int id) {		
		SubCategoria sub = this.em.find(SubCategoria.class, id);
		return sub;		
	}
	
	public SubCategoria update(SubCategoria subCategoria) {
		SubCategoria sub = this.em.find(SubCategoria.class, subCategoria.getSubCategoriaID());
		this.em.detach(sub);		
		this.em.getTransaction().begin();
		SubCategoria mergesubCategoria = (SubCategoria)this.em.merge(subCategoria);
		this.em.getTransaction().commit();	
		return mergesubCategoria;
	}
	
	public void delete(int id) {
		SubCategoria sub = this.em.find(SubCategoria.class, id);
		this.em.getTransaction().begin();
		this.em.remove(sub);
		this.em.getTransaction().commit();	
	}	
	
	public void dispose() {
		this.em.close();
		this.emf.close();		
	}

}
