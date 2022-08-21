package controle;

import objetos.*;

public class ControleDados {
    private Dados d = new Dados();

    public ControleDados() {
        
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
    
}
