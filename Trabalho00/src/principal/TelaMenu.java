package principal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Controle de Medicamento");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton medicamento = new JButton("Medicamentos");
	private static JButton paciente = new JButton("Pacientes");
	
	
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(150, 10, 150, 30);
		medicamento.setBounds(220, 70, 140, 100);
		medicamento.setBackground(Color.GREEN);
		paciente.setBounds(20, 70, 140, 100);
		paciente.setBackground(Color.GREEN);
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(paciente);
		janela.add(medicamento);
		
		
		janela.setSize(400, 250);
		janela.getContentPane().setBackground(Color.cyan);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		paciente.addActionListener(menu);
		
		medicamento.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == medicamento)
			new TelaEscolhaMedicamento();
		
		
	}
}