package controle;
import objetos.*;

public class ControleLiquido {
    private Liquido[] l;
    private int qtdLiquidos;
    
    public ControleLiquido(ControleDados d) {
        l = d.getLiquidos();
        qtdLiquidos = d.getQtdLiquidos();
    }
    
    public String[] getNomeLiquido() {
        
        String[] s = new String[qtdLiquidos];
        for(int i = 0; i < qtdLiquidos; i++) {
            s[i] = l[i].getNome();
        }
        
        return s;
        
    }
    
    public int getQtd(){
        return qtdLiquidos;
    }
    
    public void setQtd(int qtd){
        this.qtdLiquidos = qtd;
    }
    
}