package controle;

import objetos.*;

public class ControleDados {
    private Dados d = new Dados();

    public ControleDados() {
        d.Preencherdados(); //construtor que começa com os dados ja pré cadastrados

    }

    public Dados getDados() {
        return d;
    }

    public void setDados(Dados d) {
        this.d = d;
    }

    public Paciente[] getPacientes(){
        return d.getPacientes();
    }
    public int getQtdPacientes(){
        return d.getQtdPacientes();
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


    
    public boolean inserirEditarComprimido(String[] dados) { // Cadastro e edicao de comprimdos IMCOMPLETO 
        Comprimido c = new Comprimido(dados[1], dados[2], Integer.parseInt(dados[3]));
        d.inserirEditarComprimido(c, Integer.parseInt(dados[0]));
        return true;
    }

    public boolean inserirEditarLiquido(String[] dados) { // Cadastro e edicao de liquidos IMCOMPLETO
        Liquido l = new Liquido(dados[1], dados[2], Float.parseFloat(dados[3]));
        d.inserirEditarLiquido(l, Integer.parseInt(dados[0]));
        return true;
        
    }
    
}

