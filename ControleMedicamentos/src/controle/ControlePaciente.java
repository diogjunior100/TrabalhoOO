package controle;

import objetos.*;
import view.*;
import controle.*;

public class ControlePaciente {
	private Paciente[] p;
	private Telefone[] t;
	private int qtdPacientes;

	public ControlePaciente(ControleDados d){
		p = d.getPacientes();
		qtdPacientes = d.getQtdPacientes();
	}

	public String[] getNomePacinete() { //funcao que lista o nome dos pacientes
		String[] s = new String[qtdPacientes];
		for(int i = 0; i < qtdPacientes; i++) {
			s[i] = p[i].getNome();
		}
		return s;
		
	}
	
	public int getQtd(){
		return qtdPacientes;
	}

	public void setQtd(int qtd){
		this.qtdPacientes = qtd;
	}

	public String getDatadeNascimento(int i){
		return p[i].getDatadeNascimento();
	}

	public String getSexo(int i){
		return p[i].getSexo();
	}

	public String getNome(int i){
		return p[i].getNome();
	}

	public String getEmail(int i){
		return p[i].getEmail();
	}

	public int getDdd(int i){
		return t[i].getDdd();
	}

	public String getDigitos(int i){
		return t[i].getDigitos();
	}

	public String getCor(int i){
		return p[i].getCor();
	}

}