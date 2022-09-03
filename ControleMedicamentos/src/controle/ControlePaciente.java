package controle;

import objetos.*;
import view.*;
import controle.*;

public class ControlePaciente {
	private Paciente[] p;
	private int qtdPacientes;

	public ControlePaciente(ControleDados d){
		p = d.getPacientes();
		qtdPacientes = d.getQtdPacientes();
	}

	public String[] getNomePacinete() { //funcao que lista o nome dos pacientes
		String[] nomePacientes = new String[qtdPacientes];
		for(int i = 0; i < qtdPacientes; i++) {
			nomePacientes[i] = p[i].getNome();
		}
		return nomePacientes;
		
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

	public Telefone getTelefone(int i){
		return p[i].getTelefone();
	}

	public String getCor(int i){
		return p[i].getCor();
	}

}