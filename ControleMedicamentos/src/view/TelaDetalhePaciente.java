package view;


import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Classe referente a crição da tela de detalhes do paciente
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public class TelaDetalhePaciente implements ActionListener {
    private JFrame janela = new JFrame("Cadastro Paciente");
    private JLabel nomeJLabel = new JLabel("Nome: ");
    private JTextField nomePaciente;
    private JLabel sexoJLabel = new JLabel("Sexo: ");
    private JTextField sexoPaciente;
    private JLabel datadeNascimento = new JLabel("Nascimento: ");
    private JTextField dataPaciente;
    private JLabel emailJLabel = new JLabel("Email: ");
    private JTextField emailPaciente;
    private JLabel telefoneJLabel = new JLabel("Telefone: ");
    private JTextField dddPaciente;
    private JTextField digitosPaciente;
    private JLabel corJLabel = new JLabel("Cor: ");
    private JTextField corPaciente;
    private JLabel nomeMedicamentoJLabel = new JLabel("Nome Medicamento: ");
    private JTextField nomeMedicamento;
    private JLabel marcaJLabel = new JLabel("Marca: ");
    private JTextField marcaMedicamento;
    private JLabel frequenciaJLabel = new JLabel("Frequência: ");
    private JTextField frequenciaMedicamento;
    private JLabel pordiaJLabel = new JLabel("Por dia: ");
    private JTextField pordiaMedicamento;
    private JLabel totalJLabel = new JLabel("Total: ");
    private JTextField totalMedicamento;
    private JLabel horaJLabel = new JLabel("Horario: ");
    private JTextField hora;
    private JTextField minuto;
    private JLabel diaJLabel = new JLabel("Dia: ");
    private JTextField dia;
    private JLabel detalheJLabel = new JLabel("Detalhe: ");
    private JTextField detalhe;
    private JButton selecionarMedicamentoButton = new JButton("Escolher");
    private JButton excluirButton = new JButton("Excluir");
    private JButton salvarButton = new JButton("Salvar");
    private static ControleDados dados;
    public String nomeLiquido;
    private  String[] dadosPaciente = new String[50];
    private int posicao;
    private int opcao;
    
    /**
     * Método que adiciona todos elementos visuais referentes a TelaDetalhePaciente
     * @param d dados referentes a ControleDados
     * @param op opção de escolha entre cadastro ou edição de um paciente
     * @param posicao posição referente a qual paciente será aberto
     */
    public void inserirEditar(int op, ControleDados d, TelaListaPaciente p, int pos){
        opcao = op;
        posicao = pos;
        dados = d;
        
     
        if (op == 1) { //se for edicao, preenche os campos com os dados do paciente
        	//dados Paciente
        	nomePaciente = new JTextField(dados.getPacientes()[pos].getNome(), 200);
            sexoPaciente = new JTextField(dados.getPacientes()[pos].getSexo(), 200);
            dataPaciente = new JTextField(dados.getPacientes()[pos].getDatadeNascimento(), 200);
            emailPaciente = new JTextField(dados.getPacientes()[pos].getEmail(), 200);
            dddPaciente = new JTextField(String.valueOf(dados.getPacientes()[pos].getTelefone().getDdd()), 4);
            digitosPaciente = new JTextField(dados.getPacientes()[pos].getTelefone().getDigitos(), 200);
            corPaciente = new JTextField(dados.getPacientes()[pos].getCor(), 200);
            
            //medicamento
            nomeMedicamento = new JTextField(dados.getPacientes()[pos].getLiquidos().getNome(), 200);
            marcaMedicamento = new JTextField(dados.getPacientes()[pos].getLiquidos().getMarca(), 200);
            frequenciaMedicamento = new JTextField(dados.getPacientes()[pos].getLiquidos().getFrequencia(), 200);
            pordiaMedicamento = new JTextField(String.valueOf(dados.getPacientes()[pos].getLiquidos().getGotasporDia()), 200);
            totalMedicamento = new JTextField(String.valueOf(dados.getPacientes()[pos].getLiquidos().getMlsTotal()), 200);
            
            //horario
            hora = new JTextField(String.valueOf(dados.getPacientes()[pos].getLiquidos().getHorario().getHora()), 200);
            minuto = new JTextField(String.valueOf(dados.getPacientes()[pos].getLiquidos().getHorario().getMinuto()), 200);
            dia = new JTextField(dados.getPacientes()[pos].getLiquidos().getHorario().getDiadaSemana(), 200);
            detalhe = new JTextField(dados.getPacientes()[pos].getLiquidos().getHorario().getDetalhedoHorario(), 200);
            
        }
        else{ //se for cadastro, cria campos vazios
            nomePaciente = new JTextField(200);
            sexoPaciente = new JTextField(200);
            dataPaciente = new JTextField(200);
            emailPaciente = new JTextField(200);
            dddPaciente = new JTextField(4);
            digitosPaciente = new JTextField(200);
            corPaciente = new JTextField(200);
            
            nomeMedicamento = new JTextField(200);
            marcaMedicamento = new JTextField(200);
            frequenciaMedicamento = new JTextField(200);
            pordiaMedicamento = new JTextField(200);
            totalMedicamento = new JTextField(200);
            
            hora = new JTextField(200);
            minuto = new JTextField(200);
            dia = new JTextField(200);
            detalhe = new JTextField(200);
        }

        nomeJLabel.setBounds(30, 20, 150, 25);
		nomePaciente.setBounds(180, 20, 180, 25);

		sexoJLabel.setBounds(30, 50, 150, 25);
		sexoPaciente.setBounds(180, 50, 180, 25);

		datadeNascimento.setBounds(30, 80, 150, 25);
		dataPaciente.setBounds(180, 80, 180, 25);

		emailJLabel.setBounds(30, 110, 150, 25);
		emailPaciente.setBounds(180, 110, 180, 25);

		corJLabel.setBounds(30, 140, 150, 25);
		corPaciente.setBounds(180, 140, 180, 25);

		telefoneJLabel.setBounds(30, 170, 150, 25);
		dddPaciente.setBounds(180, 170, 28, 25);
		digitosPaciente.setBounds(215, 170, 146, 25);
		
		nomeMedicamentoJLabel.setBounds(30, 200, 150, 25);
		nomeMedicamento.setBounds(180, 200, 180, 25);

		marcaJLabel.setBounds(30, 230, 150, 25);
		marcaMedicamento.setBounds(180, 230, 180, 25);

		frequenciaJLabel.setBounds(30, 260, 150, 25);
		frequenciaMedicamento.setBounds(180, 260, 180, 25);

		pordiaJLabel.setBounds(30, 290, 150, 25);
		pordiaMedicamento.setBounds(180, 290, 180, 25);

		totalJLabel.setBounds(30, 320, 150, 25);
		totalMedicamento.setBounds(180, 320, 180, 25);
	    
		//horario
		horaJLabel.setBounds(30, 350, 150, 25);
		hora.setBounds(180, 350, 28, 25);
		minuto.setBounds(215, 350, 28, 25);

		diaJLabel.setBounds(30, 380, 150, 25);
		dia.setBounds(180, 380, 180, 25);

		detalheJLabel.setBounds(30, 410, 150, 25);
		detalhe.setBounds(180, 410, 180, 25);
		
	
		salvarButton.setBounds(180, 500, 120, 30);
		excluirButton.setBounds(310, 500, 120, 30);
		
		//pacientes
        this.janela.add(nomeJLabel);
        this.janela.add(nomePaciente);
        this.janela.add(sexoJLabel);
        this.janela.add(sexoPaciente);
        this.janela.add(datadeNascimento);
        this.janela.add(dataPaciente);
        this.janela.add(emailJLabel);
        this.janela.add(emailPaciente);
        this.janela.add(corJLabel);
        this.janela.add(corPaciente);
        this.janela.add(telefoneJLabel);
        this.janela.add(dddPaciente);
        this.janela.add(digitosPaciente);
        
        //medicamento
        this.janela.add(nomeMedicamentoJLabel);
        this.janela.add(nomeMedicamento);
        this.janela.add(marcaJLabel);
        this.janela.add(marcaMedicamento);
        this.janela.add(frequenciaJLabel);
        this.janela.add(frequenciaMedicamento);
        this.janela.add(pordiaJLabel);
        this.janela.add(pordiaMedicamento);
        this.janela.add(totalJLabel);
        this.janela.add(totalMedicamento);
        
        //horario
        this.janela.add(horaJLabel);
        this.janela.add(hora);
        this.janela.add(minuto);
        this.janela.add(diaJLabel);
        this.janela.add(dia);
        this.janela.add(detalheJLabel);
        this.janela.add(detalhe);
        
  
        this.janela.add(salvarButton);
        this.janela.add(excluirButton);
        this.janela.add(selecionarMedicamentoButton);

        this.janela.setLayout(null);

        this.janela.setSize(1000, 700);
		this.janela.setVisible(true);

		salvarButton.addActionListener(this);
		excluirButton.addActionListener(this);

    }
    
    /**
     * Método que trata os eventos dos botões
     * @param e eventos relacionados aos botões
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     *
     */
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();
        

        if (src == salvarButton) { //se for salvar, salva os dados no comprimido
        	boolean resposta;
            if (opcao == 2) { // se for cadastro, cria um novo comprimido
                dadosPaciente[0] = Integer.toString(dados.getQtdPacientes());
            }
            else { // se for alteração, pega a posicao do comprimido
                dadosPaciente[0] = Integer.toString(posicao);
            }
                
                dadosPaciente[1] = nomePaciente.getText();
                dadosPaciente[2] = sexoPaciente.getText();
                dadosPaciente[3] = datadeNascimento.getText();
                dadosPaciente[4] = emailPaciente.getText();
                dadosPaciente[5] = dddPaciente.getText();
                dadosPaciente[6] = digitosPaciente.getText();
                dadosPaciente[7] = corPaciente.getText();
                dadosPaciente[8] = nomeMedicamento.getText();
                dadosPaciente[9] = marcaMedicamento.getText();
                dadosPaciente[10] = frequenciaMedicamento.getText();
                dadosPaciente[11] = pordiaMedicamento.getText();
                dadosPaciente[12] = totalMedicamento.getText();
                dadosPaciente[13] = hora.getText();
                dadosPaciente[14] = minuto.getText();
                dadosPaciente[15] = dia.getText();
                dadosPaciente[16] = detalhe.getText();
                
                resposta = dados.inserirEditarPaciente(dadosPaciente);
                
                if(resposta == true) {
                	mensagemCadastroConcluido();
                }
                else {
                	mensagemCadastroErro();
                }
        }
           
        if(src == excluirButton) {
        	boolean resposta = false;
        	
        	resposta = dados.deletarPaciente(posicao);
        	if(resposta == true) {
        		mensagemDeletarConcluido();
        	}
        }
        janela.dispose();
    }
    
    
    public void mensagemCadastroConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Cadastrado");
        //janela.dispose();
    }
    public void mensagemCadastroErro() {
    	JOptionPane.showMessageDialog(null, "Erro no Cadastro");
    	//janela.dispose();
    }
    public void mensagemDeletarConcluido(){
        JOptionPane.showMessageDialog(null, "Paciente Excluido");
        //janela.dispose();
    }

}
