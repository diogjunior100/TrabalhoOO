package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.*;
import objetos.*;

public class TelaDetalhePaciente implements ActionListener{
	public int count = 1;
    private JFrame janela = new JFrame("Cadastro Paciente");
    private JLabel nomeJLabel = new JLabel("Nome: ");
    private JTextField nomePaciente;
    private JLabel sexoJLabel = new JLabel("Sexo: ");
    private JTextField sexoPaciente;
    private JLabel datadeNascimento = new JLabel("Nascimento: ");
    private JTextField dataPaciente;
    private JLabel emailJLabel = new JLabel("Email: ");
    private JTextField emailPaciente;
    private JLabel telefoneJLabel = new JLabel("Telefone: ");
    private JTextField dddPaciente;
    private JTextField digitosPaciente;
    private JLabel corJLabel = new JLabel("Cor: ");
    private JTextField corPaciente;
    private JLabel nomeMedicamentoJLabel = new JLabel("Nome Medicamento: ");
    private JTextField nomeMedicamento;
    private JLabel marcaJLabel = new JLabel("Marca: ");
    private JTextField marcaMedicamento;
    private JLabel frequenciaJLabel = new JLabel("Frequência: ");
    private JTextField frequenciaMedicamento;
    private JLabel pordiaJLabel = new JLabel("Por dia: ");
    private JTextField pordiaMedicamento;
    private JLabel totalJLabel = new JLabel("Total: ");
    private JTextField totalMedicamento;
    private JButton selecionarMedicamentoButton = new JButton("Escolher");
    private JButton comprimidoButton = new JButton("Comprimido");
    private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private static ControleDados dados;
    public String nomeLiquido;
    private  String[] dadosPaciente = new String[50];
    private  String[] dadosLiquido = new String[50];
    private int posicao;
    private int opcao;
    

    public void inserirEditar(int op, ControleDados d, TelaListaPaciente p, int pos){
        opcao = op;
        posicao = pos;
        dados = d;
        
        

        if(op == 1); //vizualizar paciente
        if(op == 2); //cadastrar paciente

        if (op == 1) {
        	
        	
        		nomePaciente = new JTextField(dados.getPacientes()[pos].getNome(), 200);
            	sexoPaciente = new JTextField(dados.getPacientes()[pos].getSexo(), 200);
            	dataPaciente = new JTextField(dados.getPacientes()[pos].getDatadeNascimento(), 200);
            	emailPaciente = new JTextField(dados.getPacientes()[pos].getEmail(), 200);
            	dddPaciente = new JTextField(String.valueOf(dados.getPacientes()[pos].getTelefone().getDdd()), 4);
            	digitosPaciente = new JTextField(dados.getPacientes()[pos].getTelefone().getDigitos(), 200);
            	corPaciente = new JTextField(dados.getPacientes()[pos].getCor(), 200);
            	nomeMedicamento = new JTextField(dados.getPacientes()[pos].getLiquidos().getNome(), 200);
            	marcaMedicamento = new JTextField(dados.getPacientes()[pos].getLiquidos().getMarca(), 200);
            	frequenciaMedicamento = new JTextField(dados.getPacientes()[pos].getLiquidos().getFrequencia(), 200);
            	pordiaMedicamento = new JTextField(String.valueOf(dados.getPacientes()[pos].getLiquidos().getGotasporDia()), 200);
            	totalMedicamento = new JTextField(String.valueOf(dados.getPacientes()[pos].getLiquidos().getMlsTotal()), 200);
            
        }
        else{
            nomePaciente = new JTextField(200);
            sexoPaciente = new JTextField(200);
            dataPaciente = new JTextField(200);
            emailPaciente = new JTextField(200);
            dddPaciente = new JTextField(4);
            digitosPaciente = new JTextField(200);
            corPaciente = new JTextField(200);
            nomeMedicamento = new JTextField(200);
            marcaMedicamento = new JTextField(200);
            frequenciaMedicamento = new JTextField(200);
            pordiaMedicamento = new JTextField(200);
            totalMedicamento = new JTextField(200);
        }

        nomeJLabel.setBounds(30, 20, 150, 25);
		nomePaciente.setBounds(180, 20, 180, 25);

		sexoJLabel.setBounds(30, 50, 150, 25);
		sexoPaciente.setBounds(180, 50, 180, 25);

		datadeNascimento.setBounds(30, 80, 150, 25);
		dataPaciente.setBounds(180, 80, 180, 25);

		emailJLabel.setBounds(30, 110, 150, 25);
		emailPaciente.setBounds(180, 110, 180, 25);

		corJLabel.setBounds(30, 140, 150, 25);
		corPaciente.setBounds(180, 140, 180, 25);

		telefoneJLabel.setBounds(30, 170, 150, 25);
		dddPaciente.setBounds(180, 170, 28, 25);
		digitosPaciente.setBounds(215, 170, 146, 25);
		
		nomeMedicamentoJLabel.setBounds(30, 200, 150, 25);
		nomeMedicamento.setBounds(180, 200, 180, 25);

		marcaJLabel.setBounds(30, 230, 150, 25);
		marcaMedicamento.setBounds(180, 230, 180, 25);

		frequenciaJLabel.setBounds(30, 260, 150, 25);
		frequenciaMedicamento.setBounds(180, 260, 180, 25);

		pordiaJLabel.setBounds(30, 290, 150, 25);
		pordiaMedicamento.setBounds(180, 290, 180, 25);

		totalJLabel.setBounds(30, 320, 150, 25);
		totalMedicamento.setBounds(180, 320, 180, 25);
		
		comprimidoButton.setBounds(50, 350, 120, 30);
		salvarButton.setBounds(180, 350, 120, 30);
		excluirButton.setBounds(310, 350, 120, 30);

        this.janela.add(nomeJLabel);
        this.janela.add(nomePaciente);
        this.janela.add(sexoJLabel);
        this.janela.add(sexoPaciente);
        this.janela.add(datadeNascimento);
        this.janela.add(dataPaciente);
        this.janela.add(emailJLabel);
        this.janela.add(emailPaciente);
        this.janela.add(corJLabel);
        this.janela.add(corPaciente);
        this.janela.add(telefoneJLabel);
        this.janela.add(dddPaciente);
        this.janela.add(digitosPaciente);
        this.janela.add(nomeMedicamentoJLabel);
        this.janela.add(nomeMedicamento);
        this.janela.add(marcaJLabel);
        this.janela.add(marcaMedicamento);
        this.janela.add(frequenciaJLabel);
        this.janela.add(frequenciaMedicamento);
        this.janela.add(pordiaJLabel);
        this.janela.add(pordiaMedicamento);
        this.janela.add(totalJLabel);
        this.janela.add(totalMedicamento);
        this.janela.add(comprimidoButton);
        this.janela.add(salvarButton);
        this.janela.add(excluirButton);
        this.janela.add(selecionarMedicamentoButton);

        this.janela.setLayout(null);

        this.janela.setSize(1000, 800);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButton.addActionListener(this);
		comprimidoButton.addActionListener(this);

    }
    
   
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();
        

        if (src == salvarButton) {
        	boolean resposta;
            if (opcao == 2) {
                dadosPaciente[0] = Integer.toString(dados.getQtdPacientes());
                dadosLiquido[0] = Integer.toString(dados.getQtdLiquidos());
            }
            else {
                dadosPaciente[0] = Integer.toString(posicao);
                dadosLiquido[0] = Integer.toString(posicao);
            }
                
                dadosPaciente[1] = nomePaciente.getText();
                dadosPaciente[2] = sexoPaciente.getText();
                dadosPaciente[3] = datadeNascimento.getText();
                dadosPaciente[4] = emailPaciente.getText();
                dadosPaciente[5] = dddPaciente.getText();
                dadosPaciente[6] = digitosPaciente.getText();
                dadosPaciente[7] = corPaciente.getText();
                
                dadosPaciente[8] = nomeMedicamento.getText();
                
                dadosPaciente[9] = marcaMedicamento.getText();
                dadosLiquido[2] = marcaMedicamento.getText();
                
                dadosPaciente[10] = frequenciaMedicamento.getText();
                dadosLiquido[3] = frequenciaMedicamento.getText();
                
                dadosPaciente[11] = pordiaMedicamento.getText();
                dadosLiquido[4] = pordiaMedicamento.getText();
                
                dadosPaciente[12] = totalMedicamento.getText();
                dadosLiquido[5] = totalMedicamento.getText();
                
                
                resposta = dados.inserirEditarPaciente(dadosPaciente);
                
                
                if(resposta == true) {
                	for(int i = 8; i<13; i++) {
                    	dadosLiquido[count] = dadosPaciente[i];
                    	count++;
                    }
                	dados.inserirEditarLiquido(dadosLiquido);
                	mensagemCadastroConcluido();
                }
                else {
                	mensagemCadastroErro();
                }
        }
           
        if(src == excluirButton) {
        	boolean resposta;
        }
    }
    

    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Cadastrado");
        janela.dispose();
    }
    public void mensagemCadastroErro() {
    	JOptionPane.showMessageDialog(null, "Erro no Cadastro");
    	janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Excluido");
        janela.dispose();
    }

}
