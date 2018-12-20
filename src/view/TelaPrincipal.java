
package view;

import dao.QuartoDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Gustavo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public static QuartoDao dao;
    
    public TelaPrincipal() {
        initComponents();
        dao = new QuartoDao();
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mOperacoes = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miQuartos = new javax.swing.JMenuItem();
        miLocacoes = new javax.swing.JMenuItem();
        miListagem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSair = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ces.jpg"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        mOperacoes.setMnemonic('o');
        mOperacoes.setText("Operações");
        mOperacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miClientes.setMnemonic('c');
        miClientes.setText("Clientes");
        mOperacoes.add(miClientes);

        miQuartos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miQuartos.setMnemonic('q');
        miQuartos.setText("Quartos");
        miQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miQuartosActionPerformed(evt);
            }
        });
        mOperacoes.add(miQuartos);

        miLocacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miLocacoes.setMnemonic('l');
        miLocacoes.setText("Locações");
        miLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLocacoesActionPerformed(evt);
            }
        });
        mOperacoes.add(miLocacoes);

        miListagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miListagem.setMnemonic('i');
        miListagem.setText("Listagem");
        miListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListagemActionPerformed(evt);
            }
        });
        mOperacoes.add(miListagem);
        mOperacoes.add(jSeparator1);

        miSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSair.setMnemonic('s');
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mOperacoes.add(miSair);

        jMenuBar1.add(mOperacoes);

        mAjuda.setMnemonic('a');
        mAjuda.setText("Ajuda");
        mAjuda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        miSobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miSobre.setMnemonic('s');
        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        mAjuda.add(miSobre);

        jMenuBar1.add(mAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(598, 483));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        String nome = "Luís Gustavo da Cunha Cipriani";
        Date dataAtual = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        JOptionPane.showMessageDialog(null, nome + "\n" + fm.format(dataAtual));
    }//GEN-LAST:event_miSobreActionPerformed

    private void miQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miQuartosActionPerformed
        new TelaQuartos().setVisible(true);
    }//GEN-LAST:event_miQuartosActionPerformed

    private void miLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLocacoesActionPerformed
        new TelaLocacao().setVisible(true);
    }//GEN-LAST:event_miLocacoesActionPerformed

    private void miListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListagemActionPerformed
        new TelaListagem().setVisible(true);
    }//GEN-LAST:event_miListagemActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mOperacoes;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miListagem;
    private javax.swing.JMenuItem miLocacoes;
    private javax.swing.JMenuItem miQuartos;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    // End of variables declaration//GEN-END:variables
}
