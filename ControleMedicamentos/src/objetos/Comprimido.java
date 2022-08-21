package objetos;

public class Comprimido extends Medicamento{
	
	private int comprimidosporDia;
	private int comprimidosTotal;
	private Horario horario;
	
	public Comprimido(String nome, String marca, String frequencia, int c, int ct, Horario h) {
		super(nome, marca, frequencia);
		this.comprimidosTotal = ct;
		this.comprimidosporDia = c;
		this.horario = h;
	
	}

	public Comprimido(String nome, String marca, int ct) {
		super(nome, marca);
		this.comprimidosTotal = ct;
	}
	
	public int getComprimidosporDia() {
		return comprimidosporDia;
	}
	public void setComprimidosporDia(int comprimidosporDia) {
		this.comprimidosporDia = comprimidosporDia;
	}
	public int getComprimidosTotal() {
		return comprimidosTotal;
	}
	public void setComprimidosTotal(int comprimidosTotal) {
		this.comprimidosTotal = comprimidosTotal;
	}
	
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "\n" + "Comprimido" + "\n" + 
				"Comprimidos por Dia=" + comprimidosporDia + "\n" +
				"ComprimidosTotal=" + comprimidosTotal + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Marca: " + getMarca() + "\n" +
				"Frequencia: " + getFrequencia() + "\n";
	}
	
	
	
}