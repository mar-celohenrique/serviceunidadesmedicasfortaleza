package com.br.eudecido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.String;
import java.util.List;

import com.br.eudecido.models.Projeto;
import com.br.eudecido.models.Usuario;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{
	
	Projeto findById(Integer id);
	
	List<Projeto> findByNomeContainingIgnoreCase(String nome);
	
	List<Projeto> findByUsuario(Usuario usuario);
}
