package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import objetos.*;

public class TelaPaciente implements ActionListener {
	
	private static JFrame janelaPaciente = new JFrame("Pacientes");
	private static JLabel titulo = new JLabel("Pacientes");
    private static JButton cadastroButton = new JButton("Cadastrar +");
    private static JButton refreshButton = new JButton("Atualizar Lista");
    private static ControlePaciente dados;
    private JList<String> listaPacientes;
    private String[] listaNomesPacientes = new String[50];
	
	public TelaPaciente() {

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(150, 10, 150, 30);
        //cadastroButton.setFont(new Font("Arial", Font.BOLD, 20));
        cadastroButton.setBounds(20, 70, 140, 100);
        //refreshButton.setFont(new Font("Arial", Font.BOLD, 20));
        refreshButton.setBounds(220, 70, 140, 100);

		janelaPaciente.setLayout(null);
		
		janelaPaciente.add(titulo);
        janelaPaciente.add(cadastroButton);
        janelaPaciente.add(refreshButton);
		
		janelaPaciente.setSize(400, 250);
		janelaPaciente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaPaciente.setVisible(true);
	}

    public void mostrarDadosPacientes(ControleDados d, int op){
        listaNomesPacientes = new ControlePaciente(dados).getNomePacinete();
        listaPacientes = new JList<String>(listaNomesPacientes);
        janelaPaciente = new JFrame();
        titulo = new JLabel();

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(90,10,250,30);
        listaPacientes.setBounds(20,50,350,120);
        listaPacientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaPacientes.setVisibleRowCount(10);

        janelaPaciente.setLayout(null);

        janelaPaciente.add(titulo);
        janelaPaciente.setVisible(true);
        }


    }
	
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
	}
}

