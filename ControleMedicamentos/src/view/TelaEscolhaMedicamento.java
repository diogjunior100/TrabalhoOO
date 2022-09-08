package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import objetos.*;

public class TelaEscolhaMedicamento implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton comprimido = new JButton("Comprimido");
	private static JButton liquido = new JButton("Líquido");
	private static JButton comprimidoPaciente = new JButton("Comprimido");
	private static JButton liquidoPaciente = new JButton("Líquido");
	public static ControleDados dados = new ControleDados();
	private int opcao;
	
	
	public TelaEscolhaMedicamento(int op) {
		opcao = op;
		
		switch(op) {
		case 1:
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(170, 10, 150, 30);

			comprimido.setBounds(220, 70, 140, 100);
			liquido.setBounds(20, 70, 140, 100);
		
			janela.setLayout(null);
		
			janela.add(titulo);
			janela.add(comprimido);
			janela.add(liquido);
		
		
			janela.setSize(400, 250);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);

			comprimido.addActionListener(this);
			liquido.addActionListener(this);
		break;
		
		case 2:
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(170, 10, 150, 30);

			comprimidoPaciente.setBounds(220, 70, 140, 100);
			liquidoPaciente.setBounds(20, 70, 140, 100);
		
			janela.setLayout(null);
		
			janela.add(titulo);
			janela.add(comprimidoPaciente);
			janela.add(liquidoPaciente);
		
		
			janela.setSize(400, 250);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);

			comprimidoPaciente.addActionListener(this);
			liquidoPaciente.addActionListener(this);
		break;
		
		default:
			JOptionPane.showMessageDialog(null,"Opcao nao encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == comprimido) { // chama tela lista de comprimidos
			new TelaListaMedicamentos().mostrarDados(dados, 1);
			janela.dispose();
		}
		if(src == liquido) { // chama tela lista de comprimidos
			new TelaListaMedicamentos().mostrarDados(dados, 2);
			janela.dispose();
		}
		
		if(src == comprimidoPaciente) { // chama tela lista de liquidos do Paciente
			new TelaListaMedicamentosPacientes().mostrarDados(dados, 1);
			janela.dispose();
		}
		if(src == liquidoPaciente) { // chama tela lista de comprimidos do Paciente
			new TelaListaMedicamentosPacientes().mostrarDados(dados, 2);
			janela.dispose();
		}
	}
	
		
	
	
}