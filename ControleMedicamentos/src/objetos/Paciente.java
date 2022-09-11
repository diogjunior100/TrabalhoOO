package objetos;

/**
 * Classe responsável pelo objeto paciente
 * @author Henrique Pucci
 * @since 2022
 * 
 */
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
	
	/**
	 * Construtor da classe Paciente
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param datadeNascimento
	 * @param sexo
	 * @param medicamento
	 * @param liquido
	 * @param comprimido
	 * @param cor
	 * 
	 */
	public Paciente(String nome, String sexo, String datadeNascimento, String email, Telefone telefone, String cor, Liquido liquido) {
		this.nome = nome;
		this.sexo = sexo;
		this.datadeNascimento = datadeNascimento;
		this.email = email;
		this.telefone = telefone;
		this.cor = cor;
		this.liquido = liquido;
	}
	
	public Paciente(String nome, String sexo, String datadeNascimento, String email, Telefone telefone, String cor, Comprimido comprimido) {
		this.nome = nome;
		this.sexo = sexo;
		this.datadeNascimento = datadeNascimento;
		this.email = email;
		this.telefone = telefone;
		this.cor = cor;
		this.comprimido = comprimido;
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
	public Liquido getLiquidos() {
		return liquido;
	}
	public void setLiquidos(Liquido liquido) {
		this.liquido = liquido;
	}
	public Comprimido getComprimidos() {
		return comprimido;
	}
	public void setComprimidos(Comprimido comprimido) {
		this.comprimido = comprimido;
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