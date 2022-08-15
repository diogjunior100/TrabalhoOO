package objetos;

public class Paciente {
	private String datadeNascimento;
	private String sexo;
	private String nome;
	private String email;
	private Telefone telefone;
	private Medicamento medicamento;
	private String cor;
	
	public Paciente(String datadeNascimento, String sexo, String nome, String email, Telefone telefone, Medicamento medicamento, String cor) {
		this.datadeNascimento = datadeNascimento;
		this.sexo = sexo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.medicamento = medicamento;
		this.cor = cor;
	}

	
	public String getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(String datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}


	@Override
	public String toString() {
		return "Data de Nascimento: " + datadeNascimento + "\n" +
				"Sexo: " + sexo + "\n" + 
				"Nome: " + nome + "\n" + 
				"Email: " + email + "\n" + 
				"Telefone: " + telefone.toString() + "\n" + "\n" +
				"Medicamento " + medicamento.toString() + "\n" + 
				"Cor: " + cor + "\n";
	}
	

}
