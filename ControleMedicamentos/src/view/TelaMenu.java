 package view;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import objetos.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton medicamento = new JButton("Medicamentos");
	private static JButton paciente = new JButton("Pacientes");
	public static ControleDados dados = new ControleDados();
	//public static ArrayList <Paciente> pacienteTelaMenu = new ArrayList<Paciente>();
	
	
	
	public TelaMenu() { // layout do menu principal
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(285, 10, 600, 30);
		medicamento.setBounds(355, 70, 140, 100);
		paciente.setBounds(170, 70, 140, 100);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(paciente);
		janela.add(medicamento);
		
		
		janela.setSize(700, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) { // funcao main do sistema
		TelaMenu menu = new TelaMenu();
		
		paciente.addActionListener(menu);
		medicamento.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == paciente){
			janela.dispose();
			new TelaListaPaciente().mostrarDados(dados);
			// chama a tela que lista os pacientes cadastrados
		}

		if(src == medicamento) {
			janela.dispose();
			new TelaEscolhaMedicamento();
			
		}	// chama a tela de escolha do tipo de medicamentos
	}
		
}
