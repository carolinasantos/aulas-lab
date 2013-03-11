package br.com.senacrs.alp.aulas;

import java.util.Date;

public interface Funcionario extends Pessoa {
	Date getDataAdmissao();
	String getMatriculaFuncionario();
	String getFuncao();

}
