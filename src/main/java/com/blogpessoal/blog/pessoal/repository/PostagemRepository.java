package com.blogpessoal.blog.pessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.blogpessoal.blog.pessoal.model.Postagem;


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long > {
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}


