package br.com.generico.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.generico.model.Pessoa;
import br.com.generico.repository.PessoaRepository;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll() {
		List<Pessoa> list = pessoaRepository.listarTodas();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> buscaPorId(@PathVariable Integer id) {
		Pessoa obj = pessoaRepository.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/bairros")
	public ResponseEntity<List<Object>> findAllBairros() {
		List<Object> list = pessoaRepository.listarTodosBairros();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/cidades")
	public ResponseEntity<List<Object>> findAllCidades() {
		List<Object> list = pessoaRepository.listarTodasCidades();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/uf")
	public ResponseEntity<List<Object>> findAllEstados() {
		List<Object> list = pessoaRepository.listarTodosEstados();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/pessoa")
	public ResponseEntity<List<Object>> buscarPessoaPorNome(@RequestParam(value = "nome") String nome) {
		List<Object> list = pessoaRepository.listarPessoaPorNome(nome.toLowerCase());
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/cpfs")
	public ResponseEntity<List<Object>> findAllCpf() {
		List<Object> list = pessoaRepository.listarTodosCpf();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/enderecos")
	public ResponseEntity<List<Object>> findAllEnderecos() {
		List<Object> list = pessoaRepository.listarTodosEnderecos();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/rg/{id}")
	public ResponseEntity<Pessoa> buscaPorRg(@PathVariable String id) {
		Pessoa obj = pessoaRepository.findByRg(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/pessoaCpf")
	public ResponseEntity<List<Object>> listarPessoasBairro() {
		List<Object> list = pessoaRepository.listarPessoaCpf();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Void> gravar(@RequestBody Pessoa Pessoa) {
		Pessoa PessoaSalvo = pessoaRepository.save(Pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(PessoaSalvo.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

}
