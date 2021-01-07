/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conec;
import Model.Cio;
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
public class TelaListagemCios extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroBovino
     */
    public TelaListagemCios() {
        initComponents();
        this.setTitle("RC MILK - LISTAGEM DE CIOS");
        this.setResizable(false);
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Cio cio = new Cio();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Cio.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = ("select codcio, dataCio, codVaca, nomeVaca, codTouro, nomeTouro , confirmado, dataConfirmacao, repetiuCio, obs from tb_cio;");
        DefaultTableModel table = (DefaultTableModel) listaCios.getModel();
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                cio.setCodCio(rs.getInt("codcio"));
                cio.setDataCio(rs.getDate("dataCio"));
                cio.setCodVaca(rs.getInt("codVaca"));
                cio.setNomeVaca(rs.getString("nomeVaca"));
                cio.setCodTouro(rs.getInt("codTouro"));
                cio.setNomeTouro(rs.getString("nomeTouro"));
                cio.setConfirmado(rs.getBoolean("confirmado"));
                cio.setDataConfirmacao(rs.getDate("dataConfirmacao"));
                cio.setRepetiuCio(rs.getBoolean("repetiuCio"));
                cio.setObs(rs.getString("obs"));
                String Confirmado = "" ;
                if(cio.isConfirmado() == true){
                    Confirmado = "Sim";
                }else{
                    Confirmado = "Não";
                }
                String RepetiuCio = "" ;
                if(cio.getRepetiuCio() == true){
                    RepetiuCio = "Sim";
                }else{
                    RepetiuCio = "Não";
                }
                table.addRow(new Object[]{cio.getCodCio(),cio.getDataCio(),cio.getCodVaca(),cio.getNomeVaca(),
                                cio.getCodTouro(),cio.getNomeTouro(),Confirmado,cio.getDataConfirmacao(),RepetiuCio,cio.getObs()});
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
        
        listaCios.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,12));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaCios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaCios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Cio", "Data Cio", "Cod Vaca", "Nome Vaca", "Cod Touro", "Nome Touro", "Confirmado", "Data Confirmacao", "Repetiu Cio", "Observacao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaCios.setPreferredSize(new java.awt.Dimension(500, 329));
        listaCios.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(listaCios);
        if (listaCios.getColumnModel().getColumnCount() > 0) {
            listaCios.getColumnModel().getColumn(0).setPreferredWidth(30);
            listaCios.getColumnModel().getColumn(1).setPreferredWidth(30);
            listaCios.getColumnModel().getColumn(2).setPreferredWidth(180);
            listaCios.getColumnModel().getColumn(3).setPreferredWidth(100);
            listaCios.getColumnModel().getColumn(4).setPreferredWidth(100);
            listaCios.getColumnModel().getColumn(5).setPreferredWidth(180);
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
            java.util.logging.Logger.getLogger(TelaListagemCios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagemCios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagemCios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagemCios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemCios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaCios;
    // End of variables declaration//GEN-END:variables
}
