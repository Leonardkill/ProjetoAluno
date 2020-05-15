package br.com.salazar.projAluno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.salazar.projAluno.dtos.AlunoDto;
import br.com.salazar.projAluno.entity.Aluno;
import br.com.salazar.projAluno.repository.AlunoRepository;


@RestController
public class AlunoController {

	private AlunoRepository repository;
	
	@RequestMapping("/listaalunos")
	public List<Aluno> listarCursos(){		
		List<Aluno> alunos = repository.findAll();				
		return alunos;		
	}
	
	@PostMapping
	@RequestMapping("/cadastro")
	public void cadastrarCurso(@RequestBody AlunoDto dto) {	
		Aluno aluno = this.toDtoEntity(dto);		
		repository.save(aluno);
	}
	
	private Aluno toDtoEntity(AlunoDto dto) {
		
		Aluno aluno = new Aluno();
		aluno.setNome(dto.getNome());
		aluno.setCpf(dto.getCpf());
		aluno.setEmail(dto.getEmail());
		aluno.setRg(dto.getRg());
		aluno.setData_nasc(dto.getData_nasc());
		return aluno;
	}
	
}
