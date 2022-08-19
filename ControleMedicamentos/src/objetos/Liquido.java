package objetos;

public class Liquido extends Medicamento{
	private double gotasporDia;
	private float mlsTotal;
	private Horario horario;
	
	public Liquido(String nome, String marca, String frequencia, double gd, float mlsT, Horario h) {
		super(nome, marca, frequencia);
		this.gotasporDia = gd;
		this.mlsTotal = mlsT;
		this.horario = h;
	}

	public double getGotasporDia() {
		return gotasporDia;
	}

	public void setGotasporDia(double gotasporDia) {
		this.gotasporDia = gotasporDia;
	}

	public float getMlsTotal() {
		return mlsTotal;
	}

	public void setMlsTotal(float mlsT) {
		this.mlsTotal = mlsT;
	}
	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	
	@Override
	public String toString() {
		return "\n" + "Liquido" + "\n" + 
				"Gotas por Dia: " + gotasporDia + "\n" +
				"Mls por Dia: " + mlsTotal + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Marca: " + getMarca() + "\n" +
				"Frequencia: " + getFrequencia() + "\n";
	}

		
	
}