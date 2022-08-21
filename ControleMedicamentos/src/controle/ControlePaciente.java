package controle;

import objetos.*;
import view.*;
import controle.*;

public class ControlePaciente {
	private Paciente[] paciente;
	private int qtdPacientes;

	public String[] getNomePacinete() {
		
		String[] s = new String[qtdPacientes];
		for(int i = 0; i < qtdPacientes; i++) {
			s[i] = paciente[i].getNome();
		}

		return s;
		
	}
	
	public ControlePaciente(Paciente paciente) {
		paciente = paciente;
	}
	
	public boolean cadastrar() {
		Paciente p = this.getPaciente();
		return true;
	}
	
	public boolean deletar() {
		Paciente p = null;
		return false;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Paciente:" + paciente + "\n";
	}	
	
}