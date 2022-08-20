package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import objetos.*;

public class TelaPaciente implements ActionListener {
	
	private static JFrame janela = new JFrame("Pacientes");
	private static JLabel titulo = new JLabel("Pacientes");
	private static JButton cadastroButton = new JButton("Cadastrar Paciente");
    private static JButton refreshButton = new JButton("Atualizar Lista");
	
	public TelaPaciente() {
        //parte de back



        //parte de front
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(150, 10, 150, 30);
        cadastroButton.setFont(new Font("Arial", Font.BOLD, 20));
        cadastroButton.setBounds(20, 70, 200, 100);
        refreshButton.setFont(new Font("Arial", Font.BOLD, 20));
        refreshButton.setBounds(250, 70, 200, 100);

		janela.setLayout(null);
		
		janela.add(titulo);
        janela.add(cadastroButton);
        janela.add(refreshButton);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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