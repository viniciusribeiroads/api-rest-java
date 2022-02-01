package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	//Usando padrao Spring Data gerando a Query automaticamente pelo nome
	List<Topico> findByCursoNome(String nomeCurso); //curso e a entidade de relacionamento e nome e o atributo que quero 
	
	// ou gerando a query manualmente
	//@Query ("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	//List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")String nomeCurso);
}
