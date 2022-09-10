package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaListaPaciente implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroPaciente;
    private JButton refreshPaciente;
    private JButton medicamentosGerais;
    private static ControleDados dados;
    private JList<String> listaPacientesCadastrados;
    private String[] listaPacientes = new String[50];
	
	public void mostrarDados(ControleDados d){
        dados = d;

        //mostrar pacientes cadastrados
        listaPacientes = new ControlePaciente(dados).getNomePaciente(); //lista o nome dos pacientes cadastrados
        listaPacientesCadastrados = new JList<String>(listaPacientes);
        janela = new JFrame("Controle de Pacientes");
        titulo = new JLabel("Lista de Pacientes");
        
        //buttons da tela
        cadastroPaciente = new JButton("Cadastrar");
        refreshPaciente = new JButton("Atualizar");
        medicamentosGerais = new JButton("Medicamentos");

        //layout da tela da lista dos pacientes
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(230, 10, 600, 30);
        listaPacientesCadastrados.setBounds(150, 50, 350, 120);
        listaPacientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaPacientesCadastrados.setVisibleRowCount(10);
        
        medicamentosGerais.setBounds(265, 225, 115, 30);
        cadastroPaciente.setBounds(200, 175, 115, 30);
        refreshPaciente.setBounds(340, 175, 115, 30);
        
        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaPacientesCadastrados);
        janela.add(cadastroPaciente);
        janela.add(refreshPaciente);
        janela.add(medicamentosGerais);

        janela.setSize(700, 500);
        janela.setVisible(true);

        cadastroPaciente.addActionListener(this);
        refreshPaciente.addActionListener(this);
        medicamentosGerais.addActionListener(this);
        listaPacientesCadastrados.addListSelectionListener(this);

    }
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        
		//se o button cadastroPaciente for ativado, chama a tela de cadastra o paciente
        if (src == cadastroPaciente) {
            new TelaDetalhePaciente().inserirEditar(2, dados, this, 0);
        }
        
        //atualiza a lista dos Pacientes cadastrados
        if (src == refreshPaciente) {
            listaPacientesCadastrados.setListData(new ControlePaciente(dados).getNomePaciente());			
			listaPacientesCadastrados.updateUI();
        }
        
        //vai para telaEscolhaMedicamento para mostrar os medicamentos gerais
        if(src == medicamentosGerais) {
        	new TelaEscolhaMedicamento();
        	janela.dispose();
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
