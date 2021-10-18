package principal;

import dominio.Produto;
import repositorio.ProdutoRepositorio;
import servico.ProdutoServico;

public class Programa {

	public static void main(String[] args) {

//		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
//		CategoriaServico servico = new CategoriaServico(repo);
//		for (Categoria item : servico.listar()) {
//			System.out.println(item);			
//		}
		
//		SubCategoriaRepositorio repo = new SubCategoriaRepositorio("exemplo-jpa");
//		SubCategoriaServico servico = new SubCategoriaServico(repo);
//		for (SubCategoria item : servico.listar()) {
//			System.out.println(item);			
//		}
		
		ProdutoRepositorio repo = new ProdutoRepositorio("exemplo-jpa");
		ProdutoServico servico = new ProdutoServico(repo);
		for (Produto item : servico.listar()) {
			System.out.println(item);			
		}
		

		repo.dispose();

	}

}
