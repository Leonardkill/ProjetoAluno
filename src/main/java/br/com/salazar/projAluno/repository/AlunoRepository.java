package br.com.salazar.projAluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.salazar.projAluno.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
