/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conec;
import Model.Bovino;
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
public class TelaListagemBovinos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroBovino
     */
    public TelaListagemBovinos() {
        initComponents();
        this.setTitle("RC MILK - LISTAGEM DE BOVINOS");
        this.setResizable(false);
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Bovino bov = new Bovino();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = ("select cod, ativo, nome, brinco, data_nasc, sexo, raca, cor, quantCria, observacao, nome_pai, nome_mae from tb_bovino;");
        DefaultTableModel table = (DefaultTableModel) listaFazenda.getModel();
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                bov.setCod(rs.getInt("cod"));
                bov.setAtivo(rs.getBoolean("ativo"));
                bov.setNome(rs.getString("nome"));
                bov.setBrinco(rs.getInt("brinco"));
                bov.setData_nasc(rs.getDate("data_nasc"));
                bov.setSexo(rs.getString("sexo"));
                bov.setRaca(rs.getString("raca"));
                bov.setCor(rs.getString("cor"));
                bov.setQuantCria(rs.getInt("quantCria"));
                bov.setObservacao(rs.getString("observacao"));
                bov.setNome_pai(rs.getString("nome_pai"));
                bov.setNome_mae(rs.getString("nome_mae"));
                table.addRow(new Object[]{bov.getCod(),bov.isAtivo(),bov.getNome(),bov.getBrinco(),bov.getData_nasc(),bov.getSexo(),bov.getRaca(),bov.getCor(),bov.getQuantCria(), bov.getNome_pai(),bov.getNome_mae(),bov.getObservacao()});
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
        
        listaFazenda.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,12));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaFazenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaFazenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaFazenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "Ativo", "Nome", "Brinco", "Data Nasc", "Sexo", "Raca", "Cor", "Quant Crias", "Nome Pai", "Nome Mae", "Observacao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaFazenda.setPreferredSize(new java.awt.Dimension(500, 329));
        listaFazenda.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(listaFazenda);
        if (listaFazenda.getColumnModel().getColumnCount() > 0) {
            listaFazenda.getColumnModel().getColumn(0).setPreferredWidth(30);
            listaFazenda.getColumnModel().getColumn(1).setPreferredWidth(50);
            listaFazenda.getColumnModel().getColumn(2).setPreferredWidth(100);
            listaFazenda.getColumnModel().getColumn(3).setPreferredWidth(30);
            listaFazenda.getColumnModel().getColumn(4).setPreferredWidth(50);
            listaFazenda.getColumnModel().getColumn(5).setResizable(false);
            listaFazenda.getColumnModel().getColumn(5).setPreferredWidth(30);
            listaFazenda.getColumnModel().getColumn(6).setPreferredWidth(30);
            listaFazenda.getColumnModel().getColumn(7).setPreferredWidth(50);
            listaFazenda.getColumnModel().getColumn(8).setPreferredWidth(30);
            listaFazenda.getColumnModel().getColumn(9).setPreferredWidth(100);
            listaFazenda.getColumnModel().getColumn(10).setPreferredWidth(100);
            listaFazenda.getColumnModel().getColumn(11).setPreferredWidth(250);
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

        setSize(new java.awt.Dimension(900, 393));
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
            java.util.logging.Logger.getLogger(TelaListagemBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagemBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagemBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagemBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaListagemBovinos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaFazenda;
    // End of variables declaration//GEN-END:variables
}
