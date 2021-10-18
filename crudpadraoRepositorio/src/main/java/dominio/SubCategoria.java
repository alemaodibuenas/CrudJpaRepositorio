package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubCategoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SubCategoriaID")	
	private Integer subCategoriaID;

	@Column(name = "CategoriaID")
	private Integer categoriaID;

	@Column(name = "Descricao")
	private String descricao;

	@Column(name = "DataInsert")
	private Date dataInsert;

	public Integer getSubCategoriaID() {
		return subCategoriaID;
	}

	public void setSubCategoriaID(Integer subCategoriaID) {
		this.subCategoriaID = subCategoriaID;
	}

	public Integer getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInsert() {
		return dataInsert;
	}

	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}

	public SubCategoria(Integer subCategoriaID, Integer categoriaID, String descricao, Date dataInsert) {
		super();
		this.subCategoriaID = subCategoriaID;
		this.categoriaID = categoriaID;
		this.descricao = descricao;
		this.dataInsert = dataInsert;
	}

	@Override
	public String toString() {
		return "SubCategoria [subCategoriaID=" + subCategoriaID + ", categoriaID=" + categoriaID + ", descricao="
				+ descricao + ", dataInsert=" + dataInsert + "]";
	}	
	
	public SubCategoria() {}

}
