package controle;

import objetos.*;

public class ControleDados {
    private Dados d = new Dados(); //objetos.Dados
    
    public ControleDados() {
        d.PreencherDados();
        d.PreencherDadosGerais(); //construtor que começa com os dados ja pré cadastrados;
    }

    public Dados getDados() {
        return d;
    }
    public void setDados(Dados d) {
        this.d = d;
    }

    public Horario[] getHorarios(){
        return d.getHorarios();
    }
    public int getQtdHorarios(){
        return d.getQtdHorarios();
    }

    public Paciente[] getPacientes(){
        return d.getPacientes();
    }
    public int getQtdPacientes(){
        return d.getQtdPacientes();
    }

    public Telefone[] getTelefones(){
        return d.getTelefones();
    }
    public int getQtdTelefones(){
        return d.getQtdTelefones();
    }
    
    public Comprimido[] getComprimidos() {
        return d.getComprimidos();
    }
    public int getQtdComprimidos() {
        return d.getQtdComprimidos();
    }

    public Liquido[] getLiquidos() {
        return d.getLiquidos();
    }
    public int getQtdLiquidos() {
        return d.getQtdLiquidos();
    }



    public boolean inserirEditarComprimido(String[] dadosComprimidos) { 
        Comprimido c = new Comprimido(dadosComprimidos[1], dadosComprimidos[2], dadosComprimidos[3], Integer.parseInt(dadosComprimidos[4]), Integer.parseInt(dadosComprimidos[5]));
        d.inserirEditarComprimido(c, Integer.parseInt(dadosComprimidos[0])); 
        return true;
    }
    
    public boolean deletarComprimido(int i) {
		//int qtdComprimidos = d.getQtdComprimidos();
		String comprimidoRemovido = d.getComprimidos()[i].getNome();
		
		if(i == (d.getQtdComprimidos() - 1)) { 
			d.setQtdComprimidos(d.getQtdComprimidos() - 1);
			d.getComprimidos()[d.getQtdComprimidos()] = null;
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getComprimidos()[posicao].getNome().compareTo(comprimidoRemovido) != 0) {
				posicao++;
			}
			for(int j = posicao; j < d.getQtdComprimidos() - 1; j++) {
				d.getComprimidos()[j] = d.getComprimidos()[j+1];
			}
			d.getComprimidos()[d.getQtdComprimidos()] = null;
			d.setQtdComprimidos(d.getQtdComprimidos() - 1);
			return true;
		}
	}
    
    

    public boolean inserirEditarLiquido(String[] dadosLiquidos) { //inseri ou edita um medicamento liquido gerais
    	Liquido l = new Liquido(dadosLiquidos[1], dadosLiquidos[2], dadosLiquidos[3], Integer.parseInt(dadosLiquidos[4]), Integer.parseInt(dadosLiquidos[5]));
        d.inserirEditarLiquido(l, Integer.parseInt(dadosLiquidos[0])); 
        return true;
    }
    
    public boolean deletarLiquido(int i) {
		//int qtdLiquidos = d.getQtdLiquidos();
		String liquidoRemovido = d.getLiquidos()[i].getNome();
		
		if(i == (d.getQtdLiquidos() - 1)) { // O aluno a ser removido está no final do array
			d.setQtdLiquidos(d.getQtdLiquidos() - 1);
			d.getPacientes()[d.getQtdLiquidos()] = null;
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getPacientes()[posicao].getNome().compareTo(liquidoRemovido) != 0) {
				posicao++;
			}
			
			for(int j = posicao; j < d.getQtdPacientes() - 1; j++) {
				d.getLiquidos()[j] = d.getLiquidos()[j+1];
			}
			d.getPacientes()[d.getQtdPacientes()] = null;
			d.setQtdPacientes(d.getQtdPacientes() - 1);
			return true;
		}
	}
    
  
    public boolean inserirEditarPaciente(String[] dadosPacientes){
    	Liquido l = new Liquido(dadosPacientes[8], dadosPacientes[9], dadosPacientes[10], 
        		Integer.parseInt(dadosPacientes[11]), Integer.parseInt(dadosPacientes[12]),
        		new Horario(Integer.parseInt(dadosPacientes[13]), Integer.parseInt(dadosPacientes[14]), 
        				dadosPacientes[15],dadosPacientes[16]));
    	    
        Paciente p = new Paciente(dadosPacientes[1], dadosPacientes[2], dadosPacientes[3], dadosPacientes[4], 
        		new Telefone(Integer.parseInt(dadosPacientes[5]), dadosPacientes[6]), dadosPacientes[7], l);

        d.inserirEditarLiquidoPaciente(l, getQtdLiquidos());
        d.inserirEditarPaciente(p, Integer.parseInt(dadosPacientes[0]));
        		
        return true;
    }

    public boolean deletarPaciente(int i) {
		//int qtdPacientes = d.getQtdPacientes();
    	String pacienteRemovido = d.getLiquidos()[i].getNome();
    	
		if(i == (d.getQtdPacientes() - 1)) { 
			d.getPacientes()[d.getQtdPacientes()] = null;
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getPacientes()[posicao].getNome().compareTo(pacienteRemovido) != 0) {
				posicao++;
			}
			for(int j = posicao; j < d.getQtdPacientes() - 1; j++) {
				d.getPacientes()[j] = null;
				d.getPacientes()[j] = d.getPacientes()[j+1];
			}
			d.getPacientes()[d.getQtdPacientes()] = null;
			d.setQtdPacientes(d.getQtdPacientes() - 1);
			return true;
		}
	}
}

