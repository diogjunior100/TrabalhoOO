package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalhe  implements ActionListener{
    private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Remedio: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca do Remedio: ");
	private JTextField valorMarca;
	private JLabel labelCT = new JLabel("Comprimidos Totais: ");
	private JTextField valorCT;
	private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[10];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    public void inserirEditar(int op, ControleDados d, TelaLista l , int pos){

        dados = d;
        posicao = pos;
        opcao = op;
       
        if (op == 1) s ="Cadastro de Comprimido";
        if (op == 2) s ="Detalhe de Comprimido";
        if (op == 3) s ="Cadastro de Liquido";
        if (op == 4) s ="Detalhe de Liquido";
        if (op == 5) s ="Cadastro de Paciente";
        if (op == 6) s ="Detalhe de Paciente";
        
        janela = new JFrame(s);

        if(op == 2){
            
            valorNome = new JTextField(dados.getComprimidos()[pos].getNome(), 200);
            valorMarca = new JTextField(dados.getComprimidos()[pos].getMarca(), 200);
            valorCT = new JTextField(String.valueOf(dados.getComprimidos()[pos].getComprimidosTotal()), 200);
        
        } else{
                
            valorNome = new JTextField(200);
            valorMarca = new JTextField(200);
            valorCT = new JTextField(200);

            botaoSalvar.setBounds(245, 175, 115, 30);
            
        }

        labelNome.setBounds(30, 20, 150, 25);
        valorNome.setBounds(180, 20, 180, 25);
        labelMarca.setBounds(30, 50, 150, 25);
        valorMarca.setBounds(180, 50, 180, 25);
        labelCT.setBounds(30, 50, 180, 25);
        valorCT.setBounds(180, 50, 180, 25);

        if(op == 2){
            botaoSalvar.setBounds(120, 175, 115, 30);
            botaoExcluir.setBounds(245, 175, 115, 30);
        }

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelMarca);
        this.janela.add(valorMarca);
        this.janela.add(labelCT);
        this.janela.add(valorCT);
        
        this.janela.add(botaoSalvar);
        this.janela.add(botaoExcluir);

        this.janela.setSize(400, 250);
        this.janela.setLayout(null);
        this.janela.setVisible(true);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == botaoSalvar){
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

            
        }
        
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o comprimido", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}