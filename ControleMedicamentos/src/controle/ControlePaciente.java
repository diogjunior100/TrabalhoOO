package controle;

import objetos.*;
import view.*;
import controle.*;

/**
 * Classe responsável pelo controle de comprimidos.
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public class ControlePaciente {
	private Paciente[] p;
	private int qtdPacientes;

	public ControlePaciente(ControleDados d){
		p = d.getPacientes();
		qtdPacientes = d.getQtdPacientes();
	}

	/**
	 * Método responsável pelo listamento de pacientes pelos seus nomes
	 * @return String com os nomes dos pacientes
	 * 
	 */
	public String[] getNomePaciente() { //funcao que lista o nome dos pacientes
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
	public Medicamento getMedicamento(int i) {
		return p[i].getMedicamento();
	}
	
	public Liquido getLiquidos(int i){
		return p[i].getLiquidos();
	}
	public Comprimido getComprimidos(int i) {
		return p[i].getComprimidos();
	}

	public String getCor(int i){
		return p[i].getCor();
	}

}