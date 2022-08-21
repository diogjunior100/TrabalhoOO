package controle;
import objetos.*;

public class ControleComprimido {
    private Comprimido[] c;
    private int qtdComprimidos;

    public ControleComprimido(ControleDados d){
        c = d.getComprimidos();
        qtdComprimidos = d.getQtdComprimidos();
    }

    public String[] getNomeComprimido() {
        
        String[] s = new String[qtdComprimidos];
        for(int i = 0; i < qtdComprimidos; i++) {
            s[i] = c[i].getNome();
        }

        return s;
        
    }

    public int getQtd(){
        return qtdComprimidos;
    }

    public void setQtd(int qtd){
        this.qtdComprimidos = qtd;
    }
}
