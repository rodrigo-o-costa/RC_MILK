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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author rodri
 */
public class TelaRelatorioDeCioPorVacas extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroBovino
     */
    

    public TelaRelatorioDeCioPorVacas() {
        initComponents();
        this.setResizable(false);
    }
    public void IniciaTabela(){
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Bovino bov = new Bovino();
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
        String sql = ("SELECT cod, nome FROM tb_bovino where sexo = 'Fêmea'");
        DefaultTableModel table = (DefaultTableModel) listaBovinos.getModel();
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                bov.setCod(rs.getInt("cod"));
                bov.setNome(rs.getString("nome"));
                table.addRow(new Object[]{bov.getCod(),bov.getNome()});
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
        
        listaBovinos.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,12));  
           }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaBovinos = new javax.swing.JTable();
        valorPesquisaD = new javax.swing.JTextField();
        PesquisaB = new javax.swing.JButton();
        selecionarB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        listaBovinos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaBovinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaBovinos.setPreferredSize(new java.awt.Dimension(500, 329));
        listaBovinos.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(listaBovinos);
        if (listaBovinos.getColumnModel().getColumnCount() > 0) {
            listaBovinos.getColumnModel().getColumn(0).setPreferredWidth(30);
            listaBovinos.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        valorPesquisaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPesquisaDActionPerformed(evt);
            }
        });

        PesquisaB.setText("Pesquisa");
        PesquisaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaBActionPerformed(evt);
            }
        });

        selecionarB.setText("Selecionar");
        selecionarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarBActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa de Bovino por Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selecionarB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorPesquisaD, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PesquisaB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorPesquisaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisaB)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionarB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(900, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valorPesquisaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPesquisaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPesquisaDActionPerformed

    private void PesquisaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaBActionPerformed
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Bovino bov = new Bovino();

        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
        
        String sql = ("SELECT cod, nome FROM tb_bovino where nome like ? and sexo = 'Fêmea'");
        DefaultTableModel table = (DefaultTableModel) listaBovinos.getModel();
        
        for(int i = table.getRowCount(); i > 0;i--){
            table.removeRow(i-1);
        }
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,valorPesquisaD.getText());
            rs = pst.executeQuery();
            while(rs.next()){
                bov.setCod(rs.getInt("cod"));
                bov.setNome(rs.getString("nome"));
                table.addRow(new Object[]{bov.getCod(),bov.getNome()});
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
        
        listaBovinos.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,12)); 
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaBActionPerformed

    private void selecionarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBActionPerformed
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int linhaSelecionada = listaBovinos.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) listaBovinos.getModel();
        String auxnome;
        auxnome = (String) (table.getValueAt(linhaSelecionada, 1));   
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = ("SELECT codcio, datacio, codvaca, nomevaca, codtouro, nometouro, confirmado, dataconfirmacao, repetiucio, obs, perdeu, dataparto, parto, dataperda, finalizado, pre_parto, data_preparto, previsao_parto FROM tb_cio WHERE tb_cio.nomevaca = ?;");
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,auxnome);
            rs = pst.executeQuery();
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
        try {
            JRResultSetDataSource resultset = new JRResultSetDataSource(rs);
            Map map = null;
            String url = "src\\Relatorios\\rel_reproducao_cio_porvaca.jasper";
            System.out.println(url);
            JasperPrint jasperPrint  = JasperFillManager.fillReport(url,map, resultset);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint,false );	  
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
     
    }//GEN-LAST:event_selecionarBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioDeCioPorVacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioDeCioPorVacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioDeCioPorVacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioDeCioPorVacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioDeCioPorVacas().setVisible(true);
                
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaBovinos;
    private javax.swing.JButton selecionarB;
    private javax.swing.JTextField valorPesquisaD;
    // End of variables declaration//GEN-END:variables
}
