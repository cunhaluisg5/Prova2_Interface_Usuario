
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Quarto;

/**
 *
 * @author Luis Gustavo
 */
public class TelaLocacao extends javax.swing.JFrame {

    Cliente cliente;
    DefaultComboBoxModel combo;
    List<Quarto> lista;
    Quarto quarto;
    SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
    
    public TelaLocacao() {
        initComponents();
        lista = TelaPrincipal.dao.listaQuartos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbCPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        lbRenda = new javax.swing.JLabel();
        tfRenda = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbTiposDisponiveis = new javax.swing.JLabel();
        cbTiposDisponiveis = new javax.swing.JComboBox<>();
        lbNumerosDisponiveis = new javax.swing.JLabel();
        cbNumerosDisponiveis = new javax.swing.JComboBox<>();
        lbDataLocacao = new javax.swing.JLabel();
        tfDataLocacao = new javax.swing.JFormattedTextField();
        lbDiasLocados = new javax.swing.JLabel();
        tfDiasLocados = new javax.swing.JTextField();
        lbDataSaida = new javax.swing.JLabel();
        tfDataSaida = new javax.swing.JFormattedTextField();
        btLocar = new javax.swing.JButton();
        lbValorLocacao = new javax.swing.JLabel();
        tfValorLocacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locação");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCPF.setText("CPF:");

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome:");

        lbEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEndereco.setText("Endereço:");

        lbRenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbRenda.setText("Renda:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbRenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRenda)
                    .addComponent(tfRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrar.png"))); // NOI18N
        btCadastrar.setMnemonic('c');
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        btLimpar.setMnemonic('i');
        btLimpar.setText("Limpar");
        btLimpar.setMaximumSize(new java.awt.Dimension(123, 39));
        btLimpar.setPreferredSize(new java.awt.Dimension(123, 39));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btSair.setMnemonic('s');
        btSair.setText("Sair");
        btSair.setMaximumSize(new java.awt.Dimension(123, 39));
        btSair.setPreferredSize(new java.awt.Dimension(123, 39));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTiposDisponiveis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTiposDisponiveis.setText("Tipos Disponíveis");

        cbTiposDisponiveis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fumante", "Não Fumante", "Premium", "Flat" }));
        cbTiposDisponiveis.setEnabled(false);
        cbTiposDisponiveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTiposDisponiveisMouseClicked(evt);
            }
        });

        lbNumerosDisponiveis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNumerosDisponiveis.setText("Números Disponíveis");

        cbNumerosDisponiveis.setEnabled(false);
        cbNumerosDisponiveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbNumerosDisponiveisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTiposDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTiposDisponiveis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNumerosDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNumerosDisponiveis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTiposDisponiveis)
                    .addComponent(lbNumerosDisponiveis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTiposDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNumerosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbDataLocacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataLocacao.setText("Data de Locação");

        try {
            tfDataLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataLocacao.setEnabled(false);
        tfDataLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfDataLocacaoMouseExited(evt);
            }
        });

        lbDiasLocados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDiasLocados.setText("Dias Locados:");

        tfDiasLocados.setEnabled(false);
        tfDiasLocados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfDiasLocadosMouseExited(evt);
            }
        });

        lbDataSaida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataSaida.setText("Data de Saída:");

        try {
            tfDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataSaida.setEnabled(false);

        btLocar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locar.png"))); // NOI18N
        btLocar.setMnemonic('l');
        btLocar.setText("Locar");
        btLocar.setEnabled(false);
        btLocar.setMaximumSize(new java.awt.Dimension(123, 39));
        btLocar.setPreferredSize(new java.awt.Dimension(123, 39));
        btLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocarActionPerformed(evt);
            }
        });

        lbValorLocacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbValorLocacao.setText("Valor da Locação:");

        tfValorLocacao.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfDataLocacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDataLocacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfDiasLocados, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDiasLocados))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDataSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDataSaida)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfValorLocacao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbValorLocacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btLocar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataLocacao)
                    .addComponent(lbDiasLocados)
                    .addComponent(lbDataSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDiasLocados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbValorLocacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLocar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(420, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try{
            String cpf = tfCPF.getText();
            String nome = tfNome.getText();
            String endereco = tfEndereco.getText();
            double renda = Double.parseDouble(tfRenda.getText());
            cliente = new Cliente(cpf, nome, endereco, renda);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Concluído!",
            JOptionPane.INFORMATION_MESSAGE);
            if(lista.size() > 0){
                habilitar();
            }else{
                JOptionPane.showMessageDialog(null, "Para continuar, cadastre pelo menos um quarto "
                + "primeiro!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção!",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cbTiposDisponiveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTiposDisponiveisMouseClicked
        cbNumerosDisponiveis.removeAllItems();
        combo = (DefaultComboBoxModel) cbNumerosDisponiveis.getModel();
        String tipo = cbTiposDisponiveis.getSelectedItem().toString();
        for(Quarto q : lista){
            if(q.getTipo().equals(tipo)){
                combo.addElement(q.getNumero());
            }
        }
        cbNumerosDisponiveis.setModel(combo);
    }//GEN-LAST:event_cbTiposDisponiveisMouseClicked

    private void cbNumerosDisponiveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbNumerosDisponiveisMouseClicked
        tfDataLocacao.setValue("");
        int numero = Integer.parseInt(cbNumerosDisponiveis.getSelectedItem().toString());
        
        for(Quarto q : lista){
            if(q.getNumero() == numero){
                tfDataLocacao.setText(fm.format(q.getDataLocacao().getTime()));
                tfDiasLocados.setText(Integer.toString(q.getDiasLocados()));             
                tfDataSaida.setText(fm.format(retornaData(q.getDataLocacao(), numero).getTime()));
                tfValorLocacao.setText(Double.toString(q.calculaValor()));
                quarto = q;
            }
        }
    }//GEN-LAST:event_cbNumerosDisponiveisMouseClicked

    private void btLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocarActionPerformed
        try{
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja finalizar a locação?", "Atenção!",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            int numero = Integer.parseInt(cbNumerosDisponiveis.getSelectedItem().toString());
            if(opcao == JOptionPane.YES_OPTION){
                preencheQuarto();
                JOptionPane.showMessageDialog(null, "Locação finalizada com sucesso!", "Concluído!",
                JOptionPane.INFORMATION_MESSAGE);
                limpar();
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Selecione um tipo e um número disponível!", "Atenção!",
            JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btLocarActionPerformed

    private void tfDataLocacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDataLocacaoMouseExited
        try{
            preencheSaida();
            preencheQuarto();
            tfValorLocacao.setText(Double.toString(quarto.calculaValor()));
        }catch(NullPointerException e){}
    }//GEN-LAST:event_tfDataLocacaoMouseExited

    private void tfDiasLocadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDiasLocadosMouseExited
        try{
            preencheSaida();
            preencheQuarto();
            tfValorLocacao.setText(Double.toString(quarto.calculaValor()));
        }catch(NullPointerException e){}
    }//GEN-LAST:event_tfDiasLocadosMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpar();
    }//GEN-LAST:event_formWindowOpened
    
    private Calendar retornaData(Calendar data, int dias){
        Calendar saida = Calendar.getInstance();
        saida.setTime(data.getTime());
        saida.add(Calendar.DATE, + dias);
        return saida;
    }
    
    private void preencheSaida(){
        Calendar dataLocacao = Calendar.getInstance();
        int numero = Integer.parseInt(tfDiasLocados.getText());
        try {
            dataLocacao.setTime(fm.parse(tfDataLocacao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfDataSaida.setText(fm.format(retornaData(dataLocacao, numero).getTime()));
    }
    
    private void preencheQuarto(){
        quarto.setCliente(cliente);
        Calendar dataLocacao = Calendar.getInstance();
        try {
            dataLocacao.setTime(fm.parse(tfDataLocacao.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        quarto.setDataLocacao(dataLocacao);
        quarto.setDiasLocados(Integer.parseInt(tfDiasLocados.getText()));
    }
    
    private void habilitar(){
        tfCPF.setEnabled(false);
        tfNome.setEnabled(false);
        tfEndereco.setEnabled(false);
        tfRenda.setEnabled(false);
        btCadastrar.setEnabled(false);
        cbTiposDisponiveis.setEnabled(true);
        cbNumerosDisponiveis.setEnabled(true);
        tfDataLocacao.setEnabled(true);
        tfDiasLocados.setEnabled(true);
        tfDataSaida.setEnabled(true);
        tfValorLocacao.setEnabled(true);
        btLocar.setEnabled(true);
    }
    
    private void limpar(){
        tfCPF.setValue("");
        tfNome.setText("");
        tfEndereco.setText("");
        tfRenda.setText("");
        cbNumerosDisponiveis.removeAllItems();
        tfDiasLocados.setText("0");
        tfDataLocacao.setText(fm.format(new Date()));
        tfDataSaida.setText(fm.format(new Date()));
        tfValorLocacao.setText("0.0");
        tfCPF.requestFocus();
        tfCPF.setEnabled(true);
        tfNome.setEnabled(true);
        tfEndereco.setEnabled(true);
        tfRenda.setEnabled(true);
        btCadastrar.setEnabled(true);
        cbTiposDisponiveis.setEnabled(false);
        cbNumerosDisponiveis.setEnabled(false);
        tfDataLocacao.setEnabled(false);
        tfDiasLocados.setEnabled(false);
        tfDataSaida.setEnabled(false);
        tfValorLocacao.setEnabled(false);
        btLocar.setEnabled(false);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLocar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbNumerosDisponiveis;
    private javax.swing.JComboBox<String> cbTiposDisponiveis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbDataLocacao;
    private javax.swing.JLabel lbDataSaida;
    private javax.swing.JLabel lbDiasLocados;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumerosDisponiveis;
    private javax.swing.JLabel lbRenda;
    private javax.swing.JLabel lbTiposDisponiveis;
    private javax.swing.JLabel lbValorLocacao;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JFormattedTextField tfDataLocacao;
    private javax.swing.JFormattedTextField tfDataSaida;
    private javax.swing.JTextField tfDiasLocados;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRenda;
    private javax.swing.JTextField tfValorLocacao;
    // End of variables declaration//GEN-END:variables
}
