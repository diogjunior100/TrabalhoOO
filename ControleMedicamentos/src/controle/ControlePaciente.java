package controle;

import objetos.*;

public class ControlePaciente {
	private Paciente paciente;
	
	public ControlePaciente(Paciente p) {
		paciente = p;
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