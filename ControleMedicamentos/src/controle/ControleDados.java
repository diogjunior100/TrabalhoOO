package controle;

import objetos.*;
import testeJUnit.*;

/**
 * Classe responsável pelo controle de adicionar e excluir os dados do sistema.
 * @author Diógenes Júnior
 * @since 2022
 *
 */
public class ControleDados {
    private Dados d = new Dados();
     /**
	  * Construtor da classe ControleDados que começa com os dados pré cadastrados do sistema
	  */
    public ControleDados() {
        d.PreencherDados();
        d.PreencherDadosGerais(); //construtor que começa com os dados ja pré cadastrados
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


	/**
	 * Método responsável por adicionar novos dados de comprimidos.
	 * @param dadosComprimidos dados de cada atributo de um comprimido
	 * @return true se o comprimido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarComprimido(String[] dadosComprimidos) { 
        Comprimido c = new Comprimido(dadosComprimidos[1], dadosComprimidos[2], dadosComprimidos[3], Integer.parseInt(dadosComprimidos[4]), Integer.parseInt(dadosComprimidos[5]));
        d.inserirEditarComprimido(c, Integer.parseInt(dadosComprimidos[0])); //Criando novo objeto comprimido
        return true;
    }
    
    public static boolean testeComprimido(String[] dadosComprimidos) { 
    	Comprimido c = new Comprimido(dadosComprimidos[1], dadosComprimidos[2], dadosComprimidos[3], Integer.parseInt(dadosComprimidos[4]), Integer.parseInt(dadosComprimidos[5]));
        return true;
    }
    
	/**
	 * Método responsável por excluir algum objeto comprimido escolhido
	 * @param i posição do comprimido no vetor
	 * @return true se o comprimido foi excluído com sucesso, false caso contrário
	 */
    public boolean deletarComprimido(int i) {
		int qtdComprimidos = d.getQtdComprimidos();
		String comprimidoRemovido = d.getComprimidos()[i].getNome();
		
		if(i == (d.getQtdComprimidos() - 1)) { //se o comprimido a ser removido for o ultimo do vetor
			d.setQtdComprimidos(d.getQtdComprimidos() - 1); // decrementa a quantidade de comprimidos
			d.getComprimidos()[d.getQtdComprimidos()] = null; //seta o ultimo comprimido como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getComprimidos()[posicao].getNome().compareTo(comprimidoRemovido) != 0) { // se o comprimido a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdComprimidos() - 1; j++) { //percorre o vetor de comprimidos a partir da posição do comprimido a ser removido
				d.getComprimidos()[j] = d.getComprimidos()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getComprimidos()[d.getQtdComprimidos()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdComprimidos(d.getQtdComprimidos() - 1); //decrementa a quantidade de comprimidos
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de líquidos.
	 * @param dadosLiquidos dados de cada atributo de um líquido
	 * @return true se o líquido foi adicionado com sucesso, false caso contrário
	 * 
	 */
    public boolean inserirEditarLiquido(String[] dadosLiquidos) { 
    	Liquido l = new Liquido(dadosLiquidos[1], dadosLiquidos[2], dadosLiquidos[3], Integer.parseInt(dadosLiquidos[4]), Integer.parseInt(dadosLiquidos[5]));
        d.inserirEditarLiquido(l, Integer.parseInt(dadosLiquidos[0])); // Criando novo objeto liquido
        return true;
    }
    
    public static boolean testeLiquido(String[] dadosLiquidos) { 
    	Liquido l = new Liquido(dadosLiquidos[1], dadosLiquidos[2], dadosLiquidos[3], Integer.parseInt(dadosLiquidos[4]), Integer.parseInt(dadosLiquidos[5]));
        return true;
    }
     /**
	  * Método responsável por excluir algum objeto líquido escolhido	
	  * @param i posição do líquido no vetor
	  * @return true se o liquido foi excluído com sucesso, false caso contrário

	  */
    public boolean deletarLiquido(int i) {
		int qtdLiquidos = d.getQtdLiquidos();
		String liquidoRemovido = d.getLiquidos()[i].getNome();
		
		if(i == (d.getQtdLiquidos() - 1)) { //se o liquido a ser removido for o ultimo do vetor
			d.setQtdLiquidos(d.getQtdLiquidos() - 1); // decrementa a quantidade de liquidos
			d.getLiquidos()[d.getQtdLiquidos()] = null; //seta o ultimo liquido como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getLiquidos()[posicao].getNome().compareTo(liquidoRemovido) != 0) { // se o liquido a ser removido não for o ultimo do vetor
				posicao++;
			}
			
			for(int j = posicao; j < d.getQtdPacientes() - 1; j++) { //percorre o vetor de liquidos a partir da posição do liquido a ser removido
				d.getLiquidos()[j] = d.getLiquidos()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getLiquidos()[d.getQtdLiquidos()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdLiquidos(d.getQtdLiquidos() - 1); //decrementa a quantidade de liquidos
			return true;
		}
	}
    
    
	/**
	 * Método responsável por adicionar novos dados de pacientes.
	 * @param dadosPacientes dados de cada atributo de um paciente
	 * @return true se o paciente foi adicionado com sucesso, false caso contrário
	 * 
	 */
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
    

	/**
	 * Método responsável por excluir algum objeto paciente escolhido
	 * @param i posição do paciente no vetor
	 * @return true se o paciente foi excluído com sucesso, false caso contrário
	 * 
	 */
    public boolean deletarPaciente(int i) {
		int qtdPacientes = d.getQtdPacientes();
    	String pacienteRemovido = d.getPacientes()[i].getNome();
    	
		if(i == (d.getQtdPacientes() - 1)) {  //se o paciente a ser removido for o ultimo do vetor
			d.setQtdPacientes(d.getQtdPacientes() - 1); // decrementa a quantidade de pacientes
			d.getPacientes()[d.getQtdPacientes()] = null; //seta o ultimo paciente como null
			return true;
			
		} 
		else { 
			int posicao = 0;
			while(d.getPacientes()[posicao].getNome().compareTo(pacienteRemovido) != 0) { // se o paciente a ser removido não for o ultimo do vetor
				posicao++;
			}
			for(int j = posicao; j < d.getQtdPacientes() - 1; j++) { //percorre o vetor de pacientes a partir da posição do paciente a ser removido
				d.getPacientes()[j] = null; // seta posição do vetor como null
				d.getPacientes()[j] = d.getPacientes()[j+1]; //cada posição do vetor recebe o valor da posição seguinte
			}
			d.getPacientes()[d.getQtdPacientes()] = null; //seta o ultimo elemento do vetor como null
			d.setQtdPacientes(d.getQtdPacientes() - 1); //decrementa a quantidade de pacientes
			return true;
		}
	}
}

