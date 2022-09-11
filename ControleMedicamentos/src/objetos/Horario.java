package objetos;

/**
 * Classe responsável pelo objeto Horário
 * @author Diógenes Júnior
 * @since 2022
 */
public class Horario {
	private int hora;
	private int minuto;
	private String diadaSemana;
	private String detalhedoHorario;
	
	/**
	 * Construtor da classe Horario
	 * @param hora
	 * @param minuto
	 * @param diadaSemana
	 * @param detalhedoHorario
	 */
	public Horario(int hora, int minuto, String diadaSemana, String detalhedoHorario) {
		this.hora = hora;
		this.minuto = minuto;
		this.diadaSemana = diadaSemana;
		this.detalhedoHorario = detalhedoHorario;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public String getDiadaSemana() {
		return diadaSemana;
	}
	public void setDiadaSemana(String diadaSemana) {
		this.diadaSemana = diadaSemana;
	}
	public String getDetalhedoHorario() {
		return detalhedoHorario;
	}
	public void setDetalhedoHorario(String detalhedoHorario) {
		this.detalhedoHorario = detalhedoHorario;
	}
	

	@Override
	public String toString() {
		return "\n" + "Horario"+ "\n" + 
				"Hora: " + this.hora + "\n" + 
				"Minuto: " + this.minuto + "\n" +
				"Dia da Semana: " + this.diadaSemana + "\n" + 
				"Detalhe do Horario: " + this.detalhedoHorario + "\n";
	}
	
	
	
}