package br.com.generico.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.generico.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Id> {

	// 1a. Query - LISTAR TODOS
	@Query("SELECT p FROM Pessoa p")
	List<Pessoa> listarTodas();

	// 2a. Query - BUSCAR POR ID
	Pessoa findById(Integer id);

	// 3a. Query - LISTAR TODOS BAIRROS
	@Query("SELECT p.bairro FROM Pessoa p GROUP BY p.bairro")
	List<Object> listarTodosBairros();

	// 4a. Query - LISTAR TODAS CIDADES
	@Query("SELECT p.cidade FROM Pessoa p GROUP BY p.cidade")
	List<Object> listarTodasCidades();

	// 5a. Query - LISTAR TODOS ESTADOS
	@Query("SELECT p.uf FROM Pessoa p GROUP BY p.uf")
	List<Object> listarTodosEstados();

	// 6a. Query - BUSCAR PESSOA POR PARTE DO NOME
	@Query("SELECT p.id, p.nome FROM Pessoa p WHERE LOWER(p.nome) LIKE %:nome%")
	List<Object> listarPessoaPorNome(@Param("nome") String nome);

	// 7a. Query - LISTAR TODOS CPF
	@Query("SELECT p.cpf, p.nome FROM Pessoa p GROUP BY p.cpf")
	List<Object> listarTodosCpf();

	// 8a. Query - LISTAR TODOS ENDEREÇOS
	@Query("SELECT 	p.logradouro, p. numero, p.bairro, p.cidade, p.uf, p.cpf FROM Pessoa p")
	List<Object> listarTodosEnderecos();

	// 9a. Query - BUSCAR POR RG
	Pessoa findByRg(String rg);

	// 10a. Query - LISTAR CLIENTES E CPF 
	@Query("SELECT p.nome, p.cpf FROM Pessoa p")
	List<Object> listarPessoaCpf();

}
