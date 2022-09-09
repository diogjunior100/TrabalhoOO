package objetos;

public class Liquido extends Medicamento{
	private int gotasporDia;
	private int mlsTotal;
	//private Horario horario;
	
	public Liquido(String nome, String marca, String frequencia, int gd, int mlsT) { // construtor para cadastrar liquido em um paciente
		super(nome, marca, frequencia);
		this.gotasporDia = gd;
		this.mlsTotal = mlsT;
		//this.horario = h;
	}
	
	public Liquido(String nome, String marca, int mlsTotal) { // construtor para cadastrar comprimido em um paciente
		super(nome, marca);
		this.mlsTotal = mlsTotal;
		//this.horario = h;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public int getGotasporDia() {
		return gotasporDia;
	}

	public void setGotasporDia(int gotasporDia) {
		this.gotasporDia = gotasporDia;
	}

	public int getMlsTotal() {
		return mlsTotal;
	}

	public void setMlsTotal(int mlsT) {
		this.mlsTotal = mlsT;
	}
	/*public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}*/
	
	
	@Override
	public String toString() {
		return "\n" + "Liquido" + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Marca: " + getMarca() + "\n" +
				"Frequencia: " + getFrequencia() + "\n" + 
		        "Gotas por Dia: " + gotasporDia + "\n" +
		        "Mls por Dia: " + mlsTotal + "\n";
	}

	

		
	
}