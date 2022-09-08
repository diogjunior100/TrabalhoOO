package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.*;

//cadastrar novos medicamentos;
public class TelaDetalheMedicamento  implements ActionListener{
    private JFrame janela = new JFrame("Cadastro Medicamento");
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelCT = new JLabel("Comprimidos Totais: ");
	//private JTextField valorCT;
	private JLabel labelLQ = new JLabel("Mls Totais: ");
	private JTextField valorTotal;
	private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private String[] dadosComprimido = new String[10];
    private String[] dadosLiquido = new String[10];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    public void inserirEditar(int op, ControleDados d, TelaListaMedicamentos l , int pos){

        dados = d;
        posicao = pos;
        opcao = op;


        if(op == 2){ //se for edicao, preenche os campos com os dados do comprimido
            
            valorNome = new JTextField(dados.getComprimidos()[pos].getNome(), 200);
            valorMarca = new JTextField(dados.getComprimidos()[pos].getMarca(), 200);
            valorTotal = new JTextField(String.valueOf(dados.getComprimidos()[pos].getComprimidosTotal()), 200);
            
            labelCT.setBounds(30, 80, 150, 25);
            
        } 
        else if(op == 4){ //se for edicao, preenche os campos com os dados do liquido

            valorNome = new JTextField(dados.getLiquidos()[pos].getNome(), 200);
            valorMarca = new JTextField(dados.getLiquidos()[pos].getMarca(), 200);
            valorTotal = new JTextField(String.valueOf(dados.getLiquidos()[pos].getMlsTotal()), 200);
            
            labelLQ.setBounds(30, 80, 150, 25);
        }

        else{
            valorNome = new JTextField(200);
            valorMarca = new JTextField(200);
            valorTotal = new JTextField(200);
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        
        labelMarca.setBounds(30, 50, 150, 25);
        valorMarca.setBounds(180, 50, 180, 25);
        
        //labelCT.setBounds(30, 80, 150, 25);
        valorTotal.setBounds(180, 80, 180, 25);
        
        salvarButton.setBounds(100, 200, 120, 30);
		excluirButton.setBounds(230, 200, 120, 30);

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelMarca);
        this.janela.add(valorMarca);
        this.janela.add(labelCT);
        this.janela.add(labelLQ);
        this.janela.add(valorTotal);
        this.janela.add(salvarButton);
        this.janela.add(excluirButton);

        this.janela.setLayout(null);

        this.janela.setSize(600, 500);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButton.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e) { //metodo que executa a acao do botao 
        Object src = e.getSource();

        if(src == salvarButton){ //se for salvar, salva os dados no comprimido
                boolean resultado;
                if(opcao == 1){
                    dadosComprimido[0] = Integer.toString(dados.getQtdComprimidos());
                } 
                else{
                    dadosComprimido[0] = Integer.toString(posicao);
                }
                
                if(opcao == 3){
                    dadosLiquido[0] = Integer.toString(dados.getQtdLiquidos());
                } 
                else{
                    dadosLiquido[0] = Integer.toString(posicao);
                }
                
                if(opcao == 1) {
                    dadosComprimido[1] = valorNome.getText();
                    dadosComprimido[2] = valorMarca.getText();
                    dadosComprimido[3] = valorTotal.getText();
                    
                    resultado = dados.inserirEditarComprimido(dadosComprimido);
                    mensagemCadastroConcluido();
                }
                else {
                	dadosLiquido[1] = valorNome.getText();
                    dadosLiquido[2] = valorMarca.getText();
                    dadosLiquido[3] = valorTotal.getText();
                    
                    resultado = dados.inserirEditarLiquido(dadosLiquido);
                    mensagemCadastroConcluido();
                }
                
                }
      
    		}

    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Medicamento Cadastrado");
        janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Medicamento Excluido");
        janela.dispose();
    }
}