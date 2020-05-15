package br.com.salazar.projAluno.dtos;

import java.io.Serializable;
import java.sql.Date;

public class AlunoDto implements Serializable {

	private static final long serialVersionUID = 2504064788106763424L;
	private String nome;
	private int rg;
	private int cpf;
	private String email;
	private Date data_nasc;
	
	public AlunoDto() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Aluno dto [nome=" + nome + ", descricao=" + cpf + "]";
	}

}
