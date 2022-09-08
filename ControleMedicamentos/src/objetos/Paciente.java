package objetos;

public class Paciente {
	private String datadeNascimento;
	private String sexo;
	private String nome;
	private String email;
	private Telefone telefone;
	private Medicamento medicamento;
	private Liquido liquido;
	private Comprimido comprimido;
	private String cor;
	
	public Paciente(String nome, String sexo, String datadeNascimento, String email, Telefone telefone, String cor, Medicamento medicamento) {
		this.nome = nome;
		this.sexo = sexo;
		this.datadeNascimento = datadeNascimento;
		this.email = email;
		this.telefone = telefone;
		this.cor = cor;
		this.medicamento = medicamento;
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
		return "Nome: " + nome + "\n" +
				"Sexo: " + sexo + "\n" + 
				"Data de Nascimento: " + datadeNascimento + "\n" + 
				"Email: " + email + "\n" + 
				"Telefone: " + telefone.toString() + "\n" + "\n" +
				"Medicamento " + medicamento.toString() + "\n" + 
				"Cor: " + cor + "\n";
	}
	

}