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

		comprimido.addActionListener(this);
		liquido.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == comprimido) // chama tela lista de comprimidos
			new TelaLista().mostrarDados(dados, 1);
		
		if(src == liquido) // chama tela lista de liquidos
			new TelaLista().mostrarDados(dados, 2);
	}
}