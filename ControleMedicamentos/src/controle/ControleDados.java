package controle;

import objetos.*;

public class ControleDados {
    private Dados d = new Dados();

    public ControleDados() {

        d.PreencherComprimidos(); //construtor que começa com os dados ja pré cadastrados

    }

    public Dados getDados() {
        return d;
    }

    public void setDados(Dados d) {
        this.d = d;
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


   /*  public boolean inserirEditarComprimido(String[] dados) { // Cadastro e edicao de comprimdos IMCOMPLETO
        
        Comprimido c = new Comprimido(dados[1], dados[2], Integer.parseInt(dados[3]));
        d.inserirEditarComprimido(c, Integer.parseInt(dados[0]));

        return true;
        
    } */
    
}

