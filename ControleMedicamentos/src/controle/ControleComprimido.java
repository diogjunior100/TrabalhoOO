package controle;
import objetos.*;

public class ControleComprimido {
    private Comprimido[] c;
    private int qtdComprimidos;

    public ControleComprimido(ControleDados d){
        c = d.getComprimidos();
        qtdComprimidos = d.getQtdComprimidos();
    }

    public String[] getNomeComprimido() { //funcao que listara o nome de comprimidos cadastrados 
        String[] comprimidos = new String[qtdComprimidos];
        for(int i = 0; i < qtdComprimidos; i++) {
            comprimidos[i] = c[i].getNome();
        }
        return comprimidos;  
    }

    public int getQtd(){
        return qtdComprimidos;
    }

    public void setQtd(int qtd){
        this.qtdComprimidos = qtd;
    }
    
    public String getNome(int i){
        return c[i].getNome();
    }

    public String getMarca(int i){
        return c[i].getMarca();
    }
    
    public String getFrequencia(int i) {
    	return c[i].getFrequencia();
    }
    
    public String getComprimidosPorDia(int i) {
    	return Integer.toString(c[i].getComprimidosporDia());
    }

    public String getComprimidosTotal(int i){
        return Integer.toString(c[i].getComprimidosTotal());
    }
    public Horario getHorario(int i) {
    	return c[i].getHorario();
    }
}

