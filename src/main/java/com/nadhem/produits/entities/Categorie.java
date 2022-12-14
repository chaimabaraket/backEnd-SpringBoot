package com.nadhem.produits.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCat;
	
	private String nomCat;
	private String descriptionCat;
	
	
	@OneToMany (mappedBy = "categorie")
	@JsonIgnore
	private List<Produit> produits;


	public Long getIdCat() {
		return idCat;
	}


	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}


	public String getNomCat() {
		return nomCat;
	}


	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}


	public String getDescriptionCat() {
		return descriptionCat;
	}


	public void setDescriptionCat(String descriptionCat) {
		this.descriptionCat = descriptionCat;
	}


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	@Override
	public String toString() {
		return "Categorie [idCat=" + idCat + ", nomCat=" + nomCat + ", descriptionCat=" + descriptionCat + ", produits="
				+ produits + "]";
	}


	public Categorie(Long idCat, String nomCat, String descriptionCat, List<Produit> produits) {
		super();
		this.idCat = idCat;
		this.nomCat = nomCat;
		this.descriptionCat = descriptionCat;
		this.produits = produits;
	}


	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
