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
	
	
	
	public TelaEscolhaMedicamento() {
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
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		/*if(src == medicamento)
			new TelaPessoa().mostrarDados(dados, 1);
		
		if(src == prof)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == curso)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matr�cula", null, 
					JOptionPane.INFORMATION_MESSAGE);*/
	}
}