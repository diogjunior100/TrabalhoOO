package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import objetos.*;

public class TelaDetalhePaciente implements ActionListener {
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
    private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

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

            salvarButton.setBounds(100, 180, 115, 30);
            excluirButton.setBounds(225, 180, 115, 30);
        }
        else{
            nomePaciente = new JTextField(200);
            sexoPaciente = new JTextField(200);
            dataPaciente = new JTextField(200);
            emailPaciente = new JTextField(200);
            dddPaciente = new JTextField(4);
            digitosPaciente = new JTextField(200);
            corPaciente = new JTextField(200);
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
        this.janela.add(salvarButton);

        this.janela.setLayout(null);

        this.janela.setSize(600, 500);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButton.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if (src == salvarButton) {
            /*try{
                boolean res;
                if (opcao == 2) {
                    
                }*/
            }
        }


    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Cadastrado");
        janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Excluido");
        janela.dispose();
    }

}
