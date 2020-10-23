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
public class TelaPesquisaBovinos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroBovino
     */
    

    public TelaPesquisaBovinos() {
        initComponents();
        this.setResizable(false);
    }
    public void IniciaTabela(){
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Bovino bov = new Bovino();
        String sexo;
        if(idsexo==0){
            sexo = "Fêmea";
        }else {
            sexo = "Macho";
        }
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        
        
        String sql = ("select cod, ativo, nome, brinco, data_nasc, sexo, raca, cor, quantCria, observacao, nome_pai, nome_mae from tb_bovino where sexo = ? ");
        DefaultTableModel table = (DefaultTableModel) listaBovinos.getModel();
        try{
            pst = con.prepareStatement(sql);
            System.out.println(sexo);
            pst.setString(1,sexo);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        listaBovinos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaBovinos.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false, false, false, false, false, false, false, false, false
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
            listaBovinos.getColumnModel().getColumn(1).setPreferredWidth(50);
            listaBovinos.getColumnModel().getColumn(2).setPreferredWidth(100);
            listaBovinos.getColumnModel().getColumn(3).setPreferredWidth(30);
            listaBovinos.getColumnModel().getColumn(4).setPreferredWidth(50);
            listaBovinos.getColumnModel().getColumn(5).setResizable(false);
            listaBovinos.getColumnModel().getColumn(5).setPreferredWidth(30);
            listaBovinos.getColumnModel().getColumn(6).setPreferredWidth(30);
            listaBovinos.getColumnModel().getColumn(7).setPreferredWidth(50);
            listaBovinos.getColumnModel().getColumn(8).setPreferredWidth(30);
            listaBovinos.getColumnModel().getColumn(9).setPreferredWidth(100);
            listaBovinos.getColumnModel().getColumn(10).setPreferredWidth(100);
            listaBovinos.getColumnModel().getColumn(11).setPreferredWidth(250);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(valorPesquisaD, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PesquisaB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selecionarB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorPesquisaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisaB))
                .addGap(20, 20, 20)
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
        String sexo;
        if(idsexo==0){
            sexo = "Fêmea";
        }else {
            sexo = "Macho";
        }
        String sql = ("select cod, ativo, nome, brinco, data_nasc, sexo, raca, cor, quantCria, observacao, nome_pai, nome_mae from tb_bovino where nome like ? and sexo = ? ;");
        DefaultTableModel table = (DefaultTableModel) listaBovinos.getModel();
        
        for(int i = table.getRowCount(); i > 0;i--){
            table.removeRow(i-1);
        }
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,valorPesquisaD.getText());
            pst.setString(2,sexo);
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
        
        
        listaBovinos.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,12)); 
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisaBActionPerformed
    private TelaCio TcioAux;
    private int idsexo;
    public void enviavaloresVaca(TelaCio cio1,int idsexoC){
        this.TcioAux = cio1;
        this.idsexo = idsexoC;
    }
    public void enviavaloresTouro(TelaCio cio1,int idsexoC){
        this.TcioAux = cio1; 
        this.idsexo = idsexoC;
    }
   
    private void selecionarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarBActionPerformed
        int linhaSelecionada = listaBovinos.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) listaBovinos.getModel();
        int auxcod;
        auxcod = ((int) table.getValueAt(linhaSelecionada, 0));
        String auxnome;
        auxnome = (String) (table.getValueAt(linhaSelecionada, 2));      
        System.out.println(auxcod);
        System.out.println(auxnome);
        if(idsexo==0){
           TcioAux.retornaValorVaca(auxcod,auxnome);
        }else {
           TcioAux.retornaValorTouro(auxcod,auxnome);
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
            java.util.logging.Logger.getLogger(TelaPesquisaBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaBovinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaBovinos().setVisible(true);
                
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisaB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaBovinos;
    private javax.swing.JButton selecionarB;
    private javax.swing.JTextField valorPesquisaD;
    // End of variables declaration//GEN-END:variables
}
