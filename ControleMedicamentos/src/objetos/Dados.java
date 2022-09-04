package objetos;



public class Dados { // classe que amarzena todos arrays utilizados pelo sistema
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

    public void Preencherdados(){ //funcao para pre cadastrar dados no sistema
        comprimidos[0] = new Comprimido("Concerta", "Pfizer", 10);
        comprimidos[1] = new Comprimido("Predisinolona", "EMS", 5);
        liquidos[0] = new Liquido("Paracetamol", "Paracetamol", 10.0f);
        liquidos[1] = new Liquido("Dipirona", "EMS", 10.0f);
        telefones[0] = new Telefone(86, "999108399");
        telefones[1] = new Telefone(61, "999469112");
        pacientes[0] = new Paciente("03 de Agosto", "Masculino", "Diogenes Junior", "diogjunior10071@gmail.com", telefones[0], comprimidos[0], "Azul");
        pacientes[1] = new Paciente("04 de Outubro", "Masculino", "Henrique Pucci", "henriquepucci@gmail.com", telefones[1], liquidos[1], "Vermelho");
        
        qtdComprimidos = 2;
        qtdLiquidos = 2;
        qtdPacientes = 2;
        qtdTelefones = 2;
    }

    public void inserirEditarComprimido(Comprimido c, int pos){ // funcao de inserir comprimidos cadastrados por ControleDados
        this.comprimidos[pos] = c;
        if(pos == qtdComprimidos)
            qtdComprimidos++;
    }

    public void inserirEditarLiquido(Liquido l, int pos){ // funcao de inserir liquidos cadastrados por ControleDados
        this.liquidos[pos] = l;
        if(pos == qtdLiquidos)
            qtdLiquidos++;
    }

    public void inserirEditarPaciente(Paciente p, int pos){ // funcao de inserir pacientes cadastrados por ControleDados
        this.pacientes[pos] = p;
        if(pos == qtdPacientes){
            qtdPacientes++;
        }
    }

    public void inserirEditarHorario(Horario h, int pos){
        this.horarios[pos] = h;
        if (pos == qtdHorarios) {
            qtdHorarios++;
        }
    }
    
    //getters e setters
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