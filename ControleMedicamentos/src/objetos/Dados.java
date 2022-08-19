package objetos;

import java.util.*;

public class Dados {
    private Paciente[] pacientes = new Paciente[50];
	private int qtdPacientes = 0;
    private Telefone[] telefones = new Telefone[50];
    private int qtdTelefones = 0;
    private Comprimido[] comprimidos = new Comprimido[50];
    private int qtdComprimidos = 0;
    private Liquido[] liquidos = new Liquido[50];
    private int qtdLiquidos = 0;
    private Horario[] horarios = new Horario[50];
    private int qtdHorarios = 0;
    
    
    public void qtdPacientes(Paciente p, int pos) {
    	this.pacientes[pos] = p;
    	if(pos == qtdPacientes) {
    		qtdPacientes++;
    	}
    }
    
    public void qtdComprimidos(Comprimido c, int pos) {
    	this.comprimidos[pos] = c;
    	if(pos == qtdComprimidos) {
    		qtdComprimidos++;
    	}
    }
    
    public void qtdLiquidos(Liquido l, int pos) {
    	this.liquidos[pos] = p;
    	if(pos == qtdLiquidos) {
    		qtdLiquidos++;
    	}
    }
    
    public Paciente[] getPacientes() {
        return pacientes;
    }
    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
    public int getQtdPacientes() {
        return qtdPacientes;
    }
    public void setQtdPacientes(int qtdPacientes) {
        this.qtdPacientes = qtdPacientes;
    }
    public Telefone[] getTelefones() {
        return telefones;
    }
    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    public int getQtdTelefones() {
        return qtdTelefones;
    }
    public void setQtdTelefones(int qtdTelefones) {
        this.qtdTelefones = qtdTelefones;
    }
    public Comprimido[] getComprimidos() {
        return comprimidos;
    }
    public void setComprimidos(Comprimido[] comprimidos) {
        this.comprimidos = comprimidos;
    }
    public int getQtdComprimidos() {
        return qtdComprimidos;
    }
    public void setQtdComprimidos(int qtdComprimidos) {
        this.qtdComprimidos = qtdComprimidos;
    }
    public Liquido[] getLiquidos() {
        return liquidos;
    }
    public void setLiquidos(Liquido[] liquidos) {
        this.liquidos = liquidos;
    }
    public int getQtdLiquidos() {
        return qtdLiquidos;
    }
    public void setQtdLiquidos(int qtdLiquidos) {
        this.qtdLiquidos = qtdLiquidos;
    }
    public Horario[] getHorarios() {
        return horarios;
    }
    public void setHorarios(Horario[] horarios) {
        this.horarios = horarios;
    }
    public int getQtdHorarios() {
        return qtdHorarios;
    }
    public void setQtdHorarios(int qtdHorarios) {
        this.qtdHorarios = qtdHorarios;
    }
    
}