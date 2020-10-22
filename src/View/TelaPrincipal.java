/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conec;
import Controller.PostgresBackup;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    Connection con =null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaPrincipal() {
        initComponents();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
        this.setIcon();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoTelaPrincipal = new javax.swing.JLabel();
        painelAT = new javax.swing.JPanel();
        AT_Bovino = new javax.swing.JButton();
        AT_USUARIO1 = new javax.swing.JButton();
        AT_fazenda = new javax.swing.JButton();
        AT_sair = new javax.swing.JButton();
        AT_backup = new javax.swing.JButton();
        AT_Cio = new javax.swing.JButton();
        painelInfo = new javax.swing.JPanel();
        usuarioLogadoInfo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        cadastroM = new javax.swing.JMenu();
        bovinoM = new javax.swing.JMenuItem();
        fazendaM = new javax.swing.JMenuItem();
        usuarioM = new javax.swing.JMenuItem();
        eventosM = new javax.swing.JMenu();
        cioM = new javax.swing.JMenuItem();
        relatorioM = new javax.swing.JMenu();
        utilitariosM = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        trocarUsuarioM = new javax.swing.JMenuItem();
        BackupM = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_TelaPrincipal.png"))); // NOI18N

        painelAT.setBackground(new java.awt.Color(255, 255, 255));

        AT_Bovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/at_bovino.png"))); // NOI18N
        AT_Bovino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AT_BovinoActionPerformed(evt);
            }
        });

        AT_USUARIO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/at_usuario.png"))); // NOI18N
        AT_USUARIO1.setBorder(null);
        AT_USUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AT_USUARIO1ActionPerformed(evt);
            }
        });

        AT_fazenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/at_fazenda.png"))); // NOI18N
        AT_fazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AT_fazendaActionPerformed(evt);
            }
        });

        AT_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/at_sair.png"))); // NOI18N
        AT_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AT_sairActionPerformed(evt);
            }
        });

        AT_backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/at_backup.png"))); // NOI18N
        AT_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AT_backupActionPerformed(evt);
            }
        });

        AT_Cio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones/at_bovino.png"))); // NOI18N
        AT_Cio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AT_CioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelATLayout = new javax.swing.GroupLayout(painelAT);
        painelAT.setLayout(painelATLayout);
        painelATLayout.setHorizontalGroup(
            painelATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelATLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AT_USUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AT_fazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AT_Bovino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AT_Cio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AT_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AT_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelATLayout.setVerticalGroup(
            painelATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelATLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AT_Cio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AT_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AT_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AT_Bovino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AT_fazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AT_USUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelInfo.setBackground(new java.awt.Color(255, 255, 255));

        usuarioLogadoInfo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usuarioLogadoInfo.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        javax.swing.GroupLayout painelInfoLayout = new javax.swing.GroupLayout(painelInfo);
        painelInfo.setLayout(painelInfoLayout);
        painelInfoLayout.setHorizontalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuarioLogadoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        painelInfoLayout.setVerticalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(usuarioLogadoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBarra.setBackground(new java.awt.Color(102, 102, 102));

        cadastroM.setText("Cadastro");
        cadastroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroMActionPerformed(evt);
            }
        });

        bovinoM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        bovinoM.setText("Bovino");
        bovinoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bovinoMActionPerformed(evt);
            }
        });
        cadastroM.add(bovinoM);

        fazendaM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        fazendaM.setText("Fazenda");
        fazendaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazendaMActionPerformed(evt);
            }
        });
        cadastroM.add(fazendaM);

        usuarioM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        usuarioM.setText("Usuário");
        usuarioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioMActionPerformed(evt);
            }
        });
        cadastroM.add(usuarioM);

        menuBarra.add(cadastroM);

        eventosM.setText("Eventos");

        cioM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        cioM.setText("Cio");
        cioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cioMActionPerformed(evt);
            }
        });
        eventosM.add(cioM);

        menuBarra.add(eventosM);

        relatorioM.setText("Relatorios");
        menuBarra.add(relatorioM);

        utilitariosM.setText("Utilitário");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        utilitariosM.add(jMenuItem2);

        trocarUsuarioM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        trocarUsuarioM.setText("Trocar Usuário");
        trocarUsuarioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioMActionPerformed(evt);
            }
        });
        utilitariosM.add(trocarUsuarioM);

        BackupM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        BackupM.setText("Backup");
        BackupM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupMActionPerformed(evt);
            }
        });
        utilitariosM.add(BackupM);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem1.setText("Suporte");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        utilitariosM.add(jMenuItem1);

        menuBarra.add(utilitariosM);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(painelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(logoTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(799, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/LogoRCIcon.png")));  
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void usuarioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioMActionPerformed
        // TODO add your handling code here:
         TelaCadastroUsuario telaU = new TelaCadastroUsuario();
         telaU.setVisible(true);
         telaU.setTitle("RC MILK - CADASTRO USUARIOS");
    }//GEN-LAST:event_usuarioMActionPerformed

    private void trocarUsuarioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuarioMActionPerformed
         Tela_login telaL = new Tela_login();
         this.dispose();
         telaL.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_trocarUsuarioMActionPerformed

    private void bovinoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bovinoMActionPerformed
        TelaCadastroBovino telaB = new TelaCadastroBovino();
        telaB.setTitle("RC MILK - CADASTRAR BOVINOS");
        telaB.setVisible(true);    
        // TODO add your handling code here:
    }//GEN-LAST:event_bovinoMActionPerformed

    private void cadastroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroMActionPerformed

    private void fazendaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazendaMActionPerformed
        TelaCadastroFazenda telaF = new TelaCadastroFazenda();
        telaF.setTitle("RC MILK - CADASTRAR FAZENDA");
        telaF.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_fazendaMActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String sql = "select nome_usuario,telefone,email from tb_usuario where id_usuario = 1";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/Imagens/suporte.png"))); 
            JOptionPane.showMessageDialog(null, "Entre em contato com:\nSuporte: "+rs.getString("nome_usuario")+
                                          "\nTelefone: "+rs.getString("telefone")+"\nE-mail: "
                                          +rs.getString("email"), "RC MILK - SUPORTE", JOptionPane.PLAIN_MESSAGE, figura); 
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BackupMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupMActionPerformed

            try {
            PostgresBackup.realizaBackup();
            } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
      
    }//GEN-LAST:event_BackupMActionPerformed

    private void AT_BovinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AT_BovinoActionPerformed
        TelaCadastroBovino telaB = new TelaCadastroBovino();
        telaB.setTitle("RC MILK - CADASTRAR BOVINOS");
        telaB.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_AT_BovinoActionPerformed

    private void AT_fazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AT_fazendaActionPerformed
        TelaCadastroFazenda telaF = new TelaCadastroFazenda();
        telaF.setTitle("RC MILK - CADASTRAR FAZENDA");
        telaF.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_AT_fazendaActionPerformed

    private void AT_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AT_sairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_AT_sairActionPerformed

    private void AT_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AT_backupActionPerformed
        try {
            PostgresBackup.realizaBackup();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_AT_backupActionPerformed

    private void AT_USUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AT_USUARIO1ActionPerformed
        TelaCadastroUsuario telaU = new TelaCadastroUsuario();
        telaU.setVisible(true);
        telaU.setTitle("RC MILK - CADASTRO USUARIOS");        // TODO add your handling code here:
    }//GEN-LAST:event_AT_USUARIO1ActionPerformed

    private void AT_CioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AT_CioActionPerformed
        TelaCio telaC = new  TelaCio();
        telaC.setVisible(true);
        telaC.setTitle("RC MILK - CIOS");        // TODO add your handling code here:
    }//GEN-LAST:event_AT_CioActionPerformed

    private void cioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cioMActionPerformed
        TelaCio telaC = new  TelaCio();
        telaC.setVisible(true);
        telaC.setTitle("RC MILK - CIOS"); 
    }//GEN-LAST:event_cioMActionPerformed

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
    private javax.swing.JButton AT_Bovino;
    private javax.swing.JButton AT_Cio;
    private javax.swing.JButton AT_USUARIO1;
    private javax.swing.JButton AT_backup;
    private javax.swing.JButton AT_fazenda;
    private javax.swing.JButton AT_sair;
    private javax.swing.JMenuItem BackupM;
    private javax.swing.JMenuItem bovinoM;
    private javax.swing.JMenu cadastroM;
    private javax.swing.JMenuItem cioM;
    private javax.swing.JMenu eventosM;
    private javax.swing.JMenuItem fazendaM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel logoTelaPrincipal;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JPanel painelAT;
    private javax.swing.JPanel painelInfo;
    private javax.swing.JMenu relatorioM;
    private javax.swing.JMenuItem trocarUsuarioM;
    public javax.swing.JLabel usuarioLogadoInfo;
    private javax.swing.JMenuItem usuarioM;
    private javax.swing.JMenu utilitariosM;
    // End of variables declaration//GEN-END:variables
}
