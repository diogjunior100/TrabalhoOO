package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import objetos.*;

public class TelaPaciente implements ActionListener {
	
	private static JFrame janela = new JFrame("Pacientes");
	private static JLabel titulo = new JLabel("Pacientes");
    private static JButton cadastroButton = new JButton("Cadastrar +");
    private static JButton refreshButton = new JButton("Atualizar Lista");
    private static ControleComprimido dados;
    private JList<String> listaPacientes;
    private String[] listaNomesPacientes = new String[50];
	
	public TelaPaciente() {
        //parte de back

        //parte de front
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(150, 10, 150, 30);
        //cadastroButton.setFont(new Font("Arial", Font.BOLD, 20));
        cadastroButton.setBounds(20, 70, 140, 100);
        //refreshButton.setFont(new Font("Arial", Font.BOLD, 20));
        refreshButton.setBounds(220, 70, 140, 100);

		janela.setLayout(null);
		
		janela.add(titulo);
        janela.add(cadastroButton);
        janela.add(refreshButton);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

    public void mostrarDadosPacientes(ControleDados d, int op){
        listaNomesPacientes = new ControlePaciente(dados).getNomePacinete();
        listaPacientes = new JList<String>(listaNomesPacientes);
        janela = new JFrame();
        titulo = new JLabel();

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(90,10,250,30);
        listaPacientes.
        }


    }
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
	}
}

