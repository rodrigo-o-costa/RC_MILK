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
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class TelaPesquisaCiosPreParto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroBovino
     */
    public TelaPesquisaCiosPreParto() {
        initComponents();
        this.setTitle("RC MILK - PESQUISA DE CIOS");
        this.setResizable(false);

    }

    public void IniciaTabela() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Cio cio = new Cio();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Cio.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = ("select codcio, dataCio, codVaca, nomeVaca, codTouro, nomeTouro , confirmado, dataConfirmacao, repetiuCio, obs from tb_cio where perdeu = false and confirmado = true and parto = false and finalizado = false;");
        DefaultTableModel table = (DefaultTableModel) listaCios.getModel();
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
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
                table.addRow(new Object[]{cio.getCodCio(), cio.getDataCio(), cio.getCodVaca(), cio.getNomeVaca(),
                    cio.getCodTouro(), cio.getNomeTouro(), cio.isConfirmado(), cio.getDataConfirmacao(), cio.getRepetiuCio(), cio.getObs()});
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

        listaCios.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaCios = new javax.swing.JTable();
        PesquisaB = new javax.swing.JButton();
        valorPesquisaD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        selecionarB = new javax.swing.JButton();
        selecionarB1 = new javax.swing.JButton();

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

        PesquisaB.setText("Pesquisa");
        PesquisaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaBActionPerformed(evt);
            }
        });

        valorPesquisaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPesquisaDActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa de Cio por  Nome de Vaca:");

        selecionarB.setText("Selecionar");

        selecionarB1.setText("Selecionar");
        selecionarB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorPesquisaD, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PesquisaB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecionarB1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(selecionarB)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valorPesquisaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisaB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(selecionarB1)
                .addGap(417, 417, 417))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 377, Short.MAX_VALUE)
                    .addComponent(selecionarB)
                    .addGap(0, 377, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(818, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaBActionPerformed
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Cio cio = new Cio();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Cio.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = ("select codcio, dataCio, codVaca, nomeVaca, codTouro, nomeTouro , confirmado, dataConfirmacao, repetiuCio, obs from tb_cio where nomeVaca like ? and perdeu = false and confirmado = true and parto = false and finalizado = false;");
        DefaultTableModel table = (DefaultTableModel) listaCios.getModel();
        for (int i = table.getRowCount(); i > 0; i--) {
            table.removeRow(i - 1);
        }
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, valorPesquisaD.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
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
                table.addRow(new Object[]{cio.getCodCio(), cio.getDataCio(), cio.getCodVaca(), cio.getNomeVaca(),
                    cio.getCodTouro(), cio.getNomeTouro(), cio.isConfirmado(), cio.getDataConfirmacao(), cio.getRepetiuCio(), cio.getObs()});
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

        listaCios.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaBActionPerformed
    private TelaPreParto TcioAux;

    public void enviavaloresCio(TelaPreParto cio1) {
        this.TcioAux = cio1;
    }
    private void valorPesquisaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPesquisaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPesquisaDActionPerformed

    private void selecionarB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarB1ActionPerformed
        int linhaSelecionada = listaCios.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) listaCios.getModel();
        int auxcodc, auxcodv, auxcodt;
        String auxnomev, auxnomet;
        Date dateC = null, confirmaDate = null;
        Boolean confirmaC;

        auxcodc = ((int) table.getValueAt(linhaSelecionada, 0));
        dateC = (Date) (table.getValueAt(linhaSelecionada, 1));
        auxcodv = ((int) table.getValueAt(linhaSelecionada, 2));
        auxnomev = (String) (table.getValueAt(linhaSelecionada, 3));
        auxcodt = ((int) table.getValueAt(linhaSelecionada, 4));
        auxnomet = (String) (table.getValueAt(linhaSelecionada, 5));
        confirmaDate = (Date) (table.getValueAt(linhaSelecionada, 7));
        confirmaC = (Boolean) (table.getValueAt(linhaSelecionada, 6));
        System.out.println(auxcodc);
        System.out.println(auxcodv);
        System.out.println(auxnomev);
        System.out.println(auxcodt);
        System.out.println(auxnomet);
        System.out.println(dateC);
        System.out.println("rw");
        TcioAux.retornaValorCio(auxcodc, dateC, auxcodv, auxnomev, auxcodt, auxnomet, confirmaDate, confirmaC);
        this.dispose();
    }//GEN-LAST:event_selecionarB1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisaCiosPreParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaCiosPreParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaCiosPreParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaCiosPreParto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaCiosPreParto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaCios;
    private javax.swing.JButton selecionarB;
    private javax.swing.JButton selecionarB1;
    private javax.swing.JTextField valorPesquisaD;
    // End of variables declaration//GEN-END:variables
}
