package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

//cadastrar novos medicamentos;
public class TelaDetalheMedicamento  implements ActionListener{
    private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Remedio: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca do Remedio: ");
	private JTextField valorMarca;
	private JLabel labelCT = new JLabel("Comprimidos Totais: ");
	private JTextField valorCT;
    private JLabel labelLQ = new JLabel("Mls totais: ");
    private JTextField valorLQ;
	private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private String[] novoDado = new String[10];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    public void inserirEditar(int op, ControleDados d, TelaListaMedicamentos l , int pos){

        dados = d;
        posicao = pos;
        opcao = op;

        if(op == 1) s = "Cadastro Comprimido";
        if(op == 2) s = "Detalhe Comprimido";
        if(op == 3) s = "Cadastro Liquido";
        if(op == 4) s = "Detalhe Liquido";
            
       
        janela = new JFrame(s);

        if(op == 2){ //se for edicao, preenche os campos com os dados do comprimido
            
            valorNome = new JTextField(dados.getComprimidos()[pos].getNome(), 200);
            valorMarca = new JTextField(dados.getComprimidos()[pos].getMarca(), 200);
            valorCT = new JTextField(String.valueOf(dados.getComprimidos()[pos].getComprimidosTotal()), 200);

            salvarButton.setBounds(100, 180, 115, 30);
            excluirButton.setBounds(225, 180, 115, 30);
        
        } 
        else if(op == 4){

            valorNome = new JTextField(dados.getLiquidos()[pos].getNome(), 200);
            valorMarca = new JTextField(dados.getLiquidos()[pos].getMarca(), 200);
            valorLQ = new JTextField(String.valueOf(dados.getLiquidos()[pos].getMlsTotal()), 200);

            salvarButton.setBounds(100, 180, 115, 30);
            excluirButton.setBounds(225, 180, 115, 30);
        }

        else{
            valorNome = new JTextField(200);
            valorMarca = new JTextField(200);
            valorCT = new JTextField(200);
            valorLQ = new JTextField(200);
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        labelMarca.setBounds(30, 50, 150, 25);
        valorMarca.setBounds(180, 50, 180, 25);
        labelCT.setBounds(30, 50, 180, 25);
        valorCT.setBounds(180, 50, 180, 25);
        labelLQ.setBounds(30, 50, 150, 25);
        valorLQ.setBounds(180, 50, 180, 25);


        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelMarca);
        this.janela.add(valorMarca);
        this.janela.add(labelCT);
        this.janela.add(valorCT);
        this.janela.add(labelCT);
        this.janela.add(valorLQ);
        
        this.janela.add(salvarButton);
        this.janela.add(excluirButton);

        this.janela.setSize(400, 250);
        
        this.janela.setVisible(true);

        salvarButton.addActionListener(this);
        excluirButton.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e) { //metodo que executa a acao do botao 
        Object src = e.getSource();

        /*if(src == botaoSalvar){ //se for salvar, salva os dados no comprimido
            try{
                boolean resultado;
                if(opcao == 1){
                    novoDado[0] = Integer.toString(dados.getQtdComprimidos());
                } else{
                    novoDado[0] = Integer.toString(posicao);

                    novoDado[1] = valorNome.getText();
                    novoDado[2] = valorMarca.getText();
                    novoDado[3] = valorCT.getText();

                    resultado = dados.inserirEditarComprimido(novoDado);
                }
            } catch(NullPointerException exc1){

            }

            
        }*/
        
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o comprimido", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}