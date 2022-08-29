package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.*;

public class TelaLista implements ActionListener, ListSelectionListener {
    private JFrame janela;
	private JLabel titulo;
    private JButton cadastroComprimido;
    private JButton refreshComprimido;
    private JButton cadastraLiquido;
    private JButton refreshLiquido;
	private static ControleDados dados;
	private JList<String> listaComprimidosCadastrados;
	private JList<String> listaLiquidosCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1: //mostrar lista de comprimidos cadastrados
            listaNomes = new ControleComprimido(dados).getNomeComprimido(); // chamando nomes de comprimidos cadastrados da controle
            listaComprimidosCadastrados = new JList<String>(listaNomes);// criando a lista de nomes de comprimidos cadastrados
            janela = new JFrame("Controle de Medicamento");
            titulo = new JLabel("Comprimidos Cadastrados");
            cadastroComprimido = new JButton("Cadastrar");
            refreshComprimido = new JButton("Atualizar");
            
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(90, 10, 250, 30);
            listaComprimidosCadastrados.setBounds(20, 50, 350, 120);
            listaComprimidosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaComprimidosCadastrados.setVisibleRowCount(10);
            
            cadastroComprimido.setBounds(70, 177, 100, 30);
            refreshComprimido.setBounds(200, 177, 100, 30);
            
            janela.setLayout(null);


            janela.add(titulo);
            janela.add(listaComprimidosCadastrados);
            janela.add(cadastroComprimido);
            janela.add(refreshComprimido);

            janela.setSize(400, 250);
            janela.setVisible(true);

        break;

		case 2://mostrar lista de liquidos cadastrados
            listaNomes = new ControleLiquido(dados).getNomeLiquido(); // chamando nomes de liquidos cadastrados da controle
            listaLiquidosCadastrados = new JList<String>(listaNomes); // criando a lista de nomes de liquidos cadastrados
            janela = new JFrame("Controle de Medicamento");
            titulo = new JLabel("Liquidos Cadastrados");
            
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(90, 10, 250, 30);
            listaLiquidosCadastrados.setBounds(20, 50, 350, 120);
            listaLiquidosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaLiquidosCadastrados.setVisibleRowCount(10);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaLiquidosCadastrados);

            janela.setSize(400, 250);
            janela.setVisible(true);
			
		break;
        case 3://mostrar lista de pacientes cadastrados

            break;

		default:
			JOptionPane.showMessageDialog(null,"Op��o n�o encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

    
	}

   
    public void valueChanged(ListSelectionEvent e) {
        Object obj = e.getSource();
        
        if(e.getValueIsAdjusting() && src == listaComprimidosCadastrados){
            new TelaDetalhe().inserirEditar(2, dados, this, listaComprimidosCadastrados.getSelectedIndex());
        }
        
    }

    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

   

}



	



