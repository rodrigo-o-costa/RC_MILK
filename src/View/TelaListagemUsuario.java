/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conec;
import Model.Usuario;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class TelaListagemUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroBovino
     */
    public TelaListagemUsuario() {
        initComponents();
        this.setTitle("RC MILK - LISTAGEM DE USUARIO");
        this.setResizable(false);
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Usuario user = new Usuario();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "select id_usuario,ativo,nome_usuario,usuario,senha,telefone,email from tb_usuario";
        DefaultTableModel table = (DefaultTableModel) listaUsuarios.getModel();
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                user.setCodigo(rs.getInt("id_usuario"));
                user.setAtivo(rs.getBoolean("ativo"));
                user.setNome(rs.getString("nome_usuario"));
                user.setUser(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                user.setTelefone(rs.getString("telefone"));
                user.setEmail(rs.getString("email"));
                String ativo = "";
                if (user.getAtivo() == true) {
                    ativo = "Sim";
                } else {
                    ativo = "Não";
                }
                table.addRow(new Object[]{user.getCodigo(), ativo, user.getNome(), user.getUser(), user.getTelefone(), user.getEmail()});
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

        listaUsuarios.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ativo", "Nome", "User", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaUsuarios.setPreferredSize(new java.awt.Dimension(500, 329));
        listaUsuarios.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(listaUsuarios);
        if (listaUsuarios.getColumnModel().getColumnCount() > 0) {
            listaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            listaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(30);
            listaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            listaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(30);
            listaUsuarios.getColumnModel().getColumn(2).setResizable(false);
            listaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(180);
            listaUsuarios.getColumnModel().getColumn(3).setResizable(false);
            listaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(100);
            listaUsuarios.getColumnModel().getColumn(4).setResizable(false);
            listaUsuarios.getColumnModel().getColumn(4).setPreferredWidth(100);
            listaUsuarios.getColumnModel().getColumn(5).setResizable(false);
            listaUsuarios.getColumnModel().getColumn(5).setPreferredWidth(180);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(720, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaListagemUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagemUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagemUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagemUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
