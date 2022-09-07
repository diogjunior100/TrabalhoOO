package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import objetos.*;

public class TelaListaPaciente implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroPaciente;
    private JButton refreshPaciente;
    private static ControleDados dados;
    private JList<String> listaPacientesCadastrados;
    private String[] listaPacientes = new String[50];
	
	public void mostrarDados(ControleDados d){
        dados = d;

        //mostrar pacientes cadastrados
        listaPacientes = new ControlePaciente(dados).getNomePacinete();
        listaPacientesCadastrados = new JList<String>(listaPacientes);
        janela = new JFrame("Controle de Pacientes");
        titulo = new JLabel("Lista de Pacientes");
        cadastroPaciente = new JButton("Cadastrar");
        refreshPaciente = new JButton("Atualizar");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(90, 10, 250, 30);
        listaPacientesCadastrados.setBounds(20, 50, 350, 120);
        listaPacientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaPacientesCadastrados.setVisibleRowCount(10);

        cadastroPaciente.setBounds(120, 175, 115, 30);
        refreshPaciente.setBounds(245, 175, 115, 30);
        
        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaPacientesCadastrados);
        janela.add(cadastroPaciente);
        janela.add(refreshPaciente);

        janela.setSize(400, 250);
        janela.setVisible(true);

        cadastroPaciente.addActionListener(this);
        refreshPaciente.addActionListener(this);
        listaPacientesCadastrados.addListSelectionListener(this);

    }
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        
        if (src == cadastroPaciente) {
            new TelaDetalhePaciente().inserirEditar(2, dados, this, 0);
        }

        if (src == refreshPaciente) {
            listaPacientesCadastrados.setListData(new ControlePaciente(dados).getNomePacinete());			
			listaPacientesCadastrados.updateUI();
        }

		
	}

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaPacientesCadastrados) {
            new TelaDetalhePaciente().inserirEditar(1, dados, this, listaPacientesCadastrados.getSelectedIndex());
        }
        
    }

}
