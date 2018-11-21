package com.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.entity.Produit;


public interface ProduitRepository extends MongoRepository<Produit, String> {

//	@Query("select p from Produit p where p.designation like:x")
	
//public Page<Produit>produitParMC(@Param("x")String mc, Pageable p);
	
//public List<Produit>	findByDesignation(String des);

//public Page<Produit> findByDesignation(String des, Pageable p);

//public Page<Produit> produitParMC(String string, PageRequest of);
}
