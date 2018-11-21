package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProduitRepository;
import com.entity.Produit;

@RestController
public class ServiceProduit {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping("/save")
	public Produit saveProduit(Produit p) {	
		produitRepository.save(p);
		return p ;
	}
		
	@RequestMapping("/all")
	  public List <Produit> getProduits(){			
		return produitRepository.findAll();
		
	}


	@RequestMapping("/produits")
	public Page <Produit> getProduits(int page){		
	return produitRepository.findAll( PageRequest.of(0, 3));	
	}
	
	
    /* @RequestMapping("/produitsParMC")
      public Page<Produit> getProduits(String mc,int page){
     return produitRepository.produitParMC("%"+mc+"%",PageRequest.of(0, 3));
	}*/
	
	@RequestMapping("/get")
	public Optional<Produit> getProduit(String ref) {
		return produitRepository.findById(ref);	
	}
	
	@RequestMapping("/update")
	public Produit update (Produit p){
produitRepository.save(p);
return p;
}
	
	@RequestMapping("/delete")
public boolean delete(String ref) {
		produitRepository.deleteById(ref);
		return true;	
	}
	
}

