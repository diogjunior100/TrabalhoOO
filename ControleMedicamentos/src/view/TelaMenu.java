 package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import objetos.Dados;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton medicamento = new JButton("Medicamentos");
	private static JButton paciente = new JButton("Pacientes");
	public static ControleDados dados = new ControleDados();
	
	
	
	public TelaMenu() { // menu principal
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(150, 10, 150, 30);
		medicamento.setBounds(220, 70, 140, 100);
		paciente.setBounds(20, 70, 140, 100);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(paciente);
		janela.add(medicamento);
		
		
		janela.setSize(400, 250);
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
		

		if(src == medicamento) // chama a tela de escolha do tipo de medicamentos

			new TelaEscolhaMedicamento();
		}
		
	}
}