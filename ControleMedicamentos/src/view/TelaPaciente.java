package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

import controle.*;
import objetos.*;

public class TelaPaciente implements ActionListener {
	
	/*private static JFrame janela = new JFrame("Pacientes");
	private static JLabel titulo = new JLabel("Pacientes");
	private static JButton cadastroButton = new JButton("Cadastrar Paciente");
    private static JButton refreshButton = new JButton("Atualizar Lista");*/

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroPaciente;
    private JButton refreshPaciente;
    private static ControleDados dados;
    private JList<String> listaPacientesCadastrados;
    private String[] listaPacientes = new String[50];
	
	public void mostrarDados(ControleDados d, int op){
        dados = d;

        //mostrar pacientes cadastrados
        listaPacientes = new ControlePaciente(dados).getNomePacinete();
        listaPacientesCadastrados = new JList<String>(listaPacientes);
        janela = new JFrame("Contro de Pacientes");
        cadastroPaciente = new JButton("Cadastrar");
        refreshPaciente = new JButton("Atualizar");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(90, 10, 250, 30);
        listaPacientesCadastrados.setBounds(20, 50, 350, 120);
        listaPacientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaPacientesCadastrados.setVisibleRowCount(10);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaPacientesCadastrados);

        janela.setSize(400, 250);
        janela.setVisible(true);


    }
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        

		
	}
}

/*public void mostrarPacientes(ControleDados d){
        dados = d;

        janela = new JFrame("Paciente");
        titulo = new JLabel("Pacientes Cadastrados");
        cadastroPaciente = new JButton("Cadastro Paciente");
        refreshPaciente = new JButton("Atualizar lista de Pacientes");

    }*/