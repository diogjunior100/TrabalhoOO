package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;
import objetos.*;
import java.util.*;

/**
 * Classe referente a criação da tela de listagem de pacientes
 * @author Diógenes Júnior	
 * @since 2022
 *
 */
public class TelaListaPaciente implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroPaciente;
    private JButton refreshPaciente;
    private JButton medicamentosGerais;
    private static ControleDados dados;
    private JList<String> listaPacientesCadastrados;
    private String[] listaPacientes = new String[50];
	
    /**
     * Método que adiciona todos elementos visuais referentes a TelaListaPaciente
     * @param d dados referentes a ControleDados
     * 
     */
	public void mostrarDados(ControleDados d){
        dados = d;
      
        listaPacientes = new ControlePaciente(dados).getNomePaciente(); // pega os nomes dos pacientes cadastrados
        listaPacientesCadastrados = new JList<String>(listaPacientes); // adiciona os nomes dos pacientes cadastrados na lista
        janela = new JFrame("Controle de Pacientes");
        titulo = new JLabel("Lista de Pacientes");
       
        //buttons da tela
        cadastroPaciente = new JButton("Cadastrar");
        refreshPaciente = new JButton("Atualizar");
        medicamentosGerais = new JButton("Medicamentos");

        //layout da tela da lista dos pacientes
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(230, 10, 600, 30);
        
        listaPacientesCadastrados.setBounds(150, 100, 350, 120);
        listaPacientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaPacientesCadastrados.setVisibleRowCount(10);
        
        medicamentosGerais.setBounds(265, 300, 115, 30);
        cadastroPaciente.setBounds(200, 250, 115, 30);
        refreshPaciente.setBounds(340, 250, 115, 30);
        
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
	
    /**
     * Método que adiciona ações aos botões da tela
     * @param e evento referente ao botão
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *  
     */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
        
		
        if (src == cadastroPaciente) { // se o botão cadastroPaciente for ativado, chama a tela de cadastra o paciente
            new TelaDetalhePaciente().inserirEditar(2, dados, this, 0);
        }
        
        
        if (src == refreshPaciente) { // se o botão refreshPaciente for ativado, atualiza a lista de pacientes
            listaPacientesCadastrados.setListData(new ControlePaciente(dados).getNomePaciente());			
			listaPacientesCadastrados.updateUI();
        }
        
        
        if(src == medicamentosGerais) { // se o botão medicamentosGerais for ativado, chama a tela de medicamentos gerais
        	new TelaEscolhaMedicamento();
        	janela.dispose();
        }
	
	}

    /**
     * Método que adiciona ações a lista de pacientes
     * @param e evento referente a lista de pacientes
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     *  
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaPacientesCadastrados) { // seleciona um paciente
        	new TelaDetalhePaciente().inserirEditar(1, dados, this, listaPacientesCadastrados.getSelectedIndex());
        }
        
    }

}
