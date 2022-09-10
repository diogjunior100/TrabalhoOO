package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaEscolhaMedicamento implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton comprimido = new JButton("Comprimido");
	private static JButton liquido = new JButton("Líquido");
	public static ControleDados dados = new ControleDados();
	private int opcao;
	
	
	public TelaEscolhaMedicamento() {
		 
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(285, 10, 600, 30);

		comprimido.setBounds(355, 70, 140, 100);
		liquido.setBounds(170, 70, 140, 100);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(comprimido);
		janela.add(liquido);
		
		
		janela.setSize(700, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		comprimido.addActionListener(this);
		liquido.addActionListener(this);
		 
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == comprimido) { // chama tela lista de comprimidos
			new TelaListaMedicamentos().mostrarDados(dados, 1);
			
		}
		if(src == liquido) { // chama tela lista de comprimidos
			new TelaListaMedicamentos().mostrarDados(dados, 2);
			
		}
		
	}
		
	
}