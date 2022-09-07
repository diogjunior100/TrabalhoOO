package controle;

import objetos.*;

public class ControleDados {
    private Dados d = new Dados(); //objetos.Dados

    public ControleDados() {
        d.Preencherdados(); //construtor que começa com os dados ja pré cadastrados;
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
        Comprimido c = new Comprimido(dadosComprimidos[1], dadosComprimidos[2], Integer.parseInt(dadosComprimidos[3]));
        d.inserirEditarComprimido(c, Integer.parseInt(dadosComprimidos[0])); //passa o objeto e a posicao dele no vetor
        return true;
    }

    /*public boolean deletarComprimido(int i){

    }*/

    public boolean inserirEditarLiquido(String[] dadosLiquidos) { 
        Liquido l = new Liquido(dadosLiquidos[1], dadosLiquidos[2], Float.parseFloat(dadosLiquidos[3]));
        d.inserirEditarLiquido(l, Integer.parseInt(dadosLiquidos[0])); //passa o objeto e a posicao dele no vetor
        return true;
        
    }
    /*public boolean deletarLiquido(int i){

    }*/

    public boolean inserirEditarPaciente(String[] dadosPacientes){
        //Paciente p = new Paciente(dadosPacientes[1], dadosPacientes[2], dadosPacientes[3], dadosPacientes[4], new Telefone(Integer.parseInt(dadosPacientes[5]), dadosPacientes[6]), 
        //new Liquido(dadosPacientes[7],dadosPacientes[8], Float.parseFloat(dadosPacientes[9])), dadosPacientes[10]);
        Paciente p = new Paciente(dadosPacientes[1], dadosPacientes[2], dadosPacientes[3], dadosPacientes[4], new Telefone(Integer.parseInt(dadosPacientes[5]), dadosPacientes[6]), dadosPacientes[7]);
        d.inserirEditarPaciente(p, Integer.parseInt(dadosPacientes[0]));
        return true;
    }

    /*public boolean deletarPaciente(){

    }*/
    
}

