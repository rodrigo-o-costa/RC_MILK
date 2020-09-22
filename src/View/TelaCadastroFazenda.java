/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Fazenda;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class TelaCadastroFazenda extends javax.swing.JFrame {

    int aux_inclu = 0;
    int aux_altera = 0;
    int aux_excluir = 0;

    public TelaCadastroFazenda() {
        initComponents();
        this.desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterarB = new javax.swing.JButton();
        inclusaoB = new javax.swing.JButton();
        excluirB = new javax.swing.JButton();
        pesquisarB = new javax.swing.JButton();
        listarB = new javax.swing.JButton();
        nomeFazendaD = new javax.swing.JTextField();
        nomeProdD = new javax.swing.JTextField();
        cpfD = new javax.swing.JFormattedTextField();
        nomeFazendaL = new javax.swing.JLabel();
        nomeProdL = new javax.swing.JLabel();
        cpfL = new javax.swing.JLabel();
        ieL = new javax.swing.JLabel();
        ieD = new javax.swing.JTextField();
        emailL = new javax.swing.JLabel();
        telefoneL = new javax.swing.JLabel();
        emailD = new javax.swing.JTextField();
        ativoD = new javax.swing.JCheckBox();
        codD = new javax.swing.JTextField();
        codUsuarioL = new javax.swing.JLabel();
        celularL = new javax.swing.JLabel();
        celularD = new javax.swing.JFormattedTextField();
        telefoneD = new javax.swing.JFormattedTextField();
        cancelarU = new javax.swing.JButton();
        salvarU = new javax.swing.JButton();
        limparU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        alterarB.setText("Alterar");
        alterarB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alterarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBActionPerformed(evt);
            }
        });

        inclusaoB.setText("Incluir");
        inclusaoB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inclusaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inclusaoBActionPerformed(evt);
            }
        });

        excluirB.setText("Excluir");
        excluirB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        excluirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBActionPerformed(evt);
            }
        });

        pesquisarB.setText("Pesquisar");
        pesquisarB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pesquisarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBActionPerformed(evt);
            }
        });

        listarB.setText("Listar");
        listarB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBActionPerformed(evt);
            }
        });

        try {
            cpfD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfDActionPerformed(evt);
            }
        });

        nomeFazendaL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeFazendaL.setText("Nome Fazenda:");

        nomeProdL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeProdL.setText("Nome Prod.:");

        cpfL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cpfL.setText("CPF Prod.:");

        ieL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ieL.setText("Inscrição Estadual:");

        emailL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailL.setText("E-mail:");

        telefoneL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telefoneL.setText("Telefone");

        ativoD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ativoD.setText("Ativo");
        ativoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativoDActionPerformed(evt);
            }
        });

        codD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codDActionPerformed(evt);
            }
        });

        codUsuarioL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        codUsuarioL.setText("Cod.:");

        celularL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        celularL.setText("Celular");

        try {
            celularD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefoneD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cancelarU.setText("Cancelar");
        cancelarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarUActionPerformed(evt);
            }
        });

        salvarU.setText("Salvar");
        salvarU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salvarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarUActionPerformed(evt);
            }
        });

        limparU.setText("Limpar");
        limparU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limparU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ieL)
                                .addComponent(telefoneL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cpfL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(47, 47, 47))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeFazendaL)
                                .addComponent(nomeProdL))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailL)
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ieD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeFazendaD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeProdD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cpfD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codUsuarioL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ativoD))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(telefoneD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(celularL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(celularD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailD, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inclusaoB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alterarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(pesquisarB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(excluirB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(listarB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limparU, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salvarU, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFazendaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFazendaL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProdL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpfD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpfL)
                        .addComponent(codUsuarioL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ativoD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ieL)
                    .addComponent(ieD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneL)
                    .addComponent(celularL)
                    .addComponent(celularD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailL))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(inclusaoB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBActionPerformed
        this.limpaCampos();
        boolean aux;
        do{
            String imput;
            imput=(JOptionPane.showInputDialog(null,"Digite a Fazenda:")); 
            nomeFazendaD.setText(imput);
            if(imput == null){
                System.out.println("Cancel is pressed");
                break;
            }
            Fazenda faz = new Fazenda();
            faz.setNome(nomeFazendaD.getText());
            aux = faz.pesquisar();
            if(aux){
                codD.setText(Integer.toString(faz.getCodigo()));
                ativoD.setSelected(faz.getAtivo());
                nomeFazendaD.setText(faz.getNome());
                nomeProdD.setText(faz.getNome_prop());
                cpfD.setText(faz.getCfp_prop());
                ieD.setText(faz.getInsc_estadual());
                celularD.setText(faz.getCelular());
                telefoneD.setText(faz.getTelefone());
                emailD.setText(faz.getEmail());
                this.habilitaCampos();
                aux_altera = 1; 
            }

        }while(!aux);        // TODO add your handling code here:
    }//GEN-LAST:event_alterarBActionPerformed

    private void ativoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativoDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ativoDActionPerformed

    private void codDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codDActionPerformed

    private void cpfDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfDActionPerformed

    private void pesquisarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBActionPerformed
        this.limpaCampos();
        nomeFazendaD.setText(JOptionPane.showInputDialog("Digite o Nome da Fazenda:"));
        Fazenda faz = new Fazenda();
        faz.setNome(nomeFazendaD.getText());
        faz.pesquisar();
        codD.setText(Integer.toString(faz.getCodigo()));
        ativoD.setSelected(faz.getAtivo());
        nomeFazendaD.setText(faz.getNome());
        nomeProdD.setText(faz.getNome_prop());
        cpfD.setText(faz.getCfp_prop());
        ieD.setText(faz.getInsc_estadual());
        celularD.setText(faz.getCelular());
        telefoneD.setText(faz.getTelefone());
        emailD.setText(faz.getEmail());
    }//GEN-LAST:event_pesquisarBActionPerformed

    private void cancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarUActionPerformed
        this.limpaCampos();
        aux_inclu = 0;
        aux_altera = 0;
        aux_excluir = 0;
        this.desabilitaCampos();
    }//GEN-LAST:event_cancelarUActionPerformed

    private void salvarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarUActionPerformed
        // TODO add your handling code here:
        if(aux_inclu == 1){
           Fazenda faz = new Fazenda();
            faz.setAtivo(ativoD.isSelected());
            faz.setNome(nomeFazendaD.getText());
            faz.setNome_prop(nomeProdD.getText());
            faz.setCfp_prop(cpfD.getText());
            faz.setInsc_estadual(ieD.getText());
            faz.setCelular(celularD.getText());
            faz.setTelefone(telefoneD.getText());
            faz.setEmail(emailD.getText());
            
            if(nomeFazendaD.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Campo Nome Fazenda não pode ser vazio");
            }if(nomeProdD.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Campo Nome Produtor não pode ser vazio");
            }else{
                faz.cadastrar();
                this.desabilitaCampos();
                aux_inclu = 0;
                this.limpaCampos();
            }
           
        }if(aux_altera == 1){
            Fazenda faz = new Fazenda();
            faz.setCodigo(Integer.parseInt(codD.getText()));
            faz.setAtivo(ativoD.isSelected());
            faz.setNome(nomeFazendaD.getText());
            faz.setNome_prop(nomeProdD.getText());
            faz.setCfp_prop(cpfD.getText());
            faz.setInsc_estadual(ieD.getText());
            faz.setCelular(celularD.getText());
            faz.setTelefone(telefoneD.getText());
            faz.setEmail(emailD.getText());
            
            if(nomeFazendaD.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Campo Nome Fazenda não pode ser vazio");
            }if(nomeProdD.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Campo Nome Produtor não pode ser vazio");
            }else{
                faz.alterar();
                this.desabilitaCampos();
                aux_altera = 0;
                this.limpaCampos();
            }
        }if(aux_excluir  == 1){
            Fazenda faz = new Fazenda();
            faz.setCodigo(Integer.parseInt(codD.getText()));
            faz.setAtivo(ativoD.isSelected());
            faz.setNome(nomeFazendaD.getText());
            faz.setNome_prop(nomeProdD.getText());
            faz.setCfp_prop(cpfD.getText());
            faz.setInsc_estadual(ieD.getText());
            faz.setCelular(celularD.getText());
            faz.setTelefone(telefoneD.getText());
            faz.setEmail(emailD.getText());
            if(nomeFazendaD.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Campo Nome Fazenda não pode ser vazio");
            }if(nomeProdD.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Campo Nome Produtor não pode ser vazio");
            }else{
                faz.excluir();
                this.desabilitaCampos();
                aux_excluir = 0;
                this.limpaCampos();
            }
        }
    }//GEN-LAST:event_salvarUActionPerformed

    public void habilitaCampos(){
        ativoD.setEnabled(true);
        celularD.setEnabled(true);
        codD.setEnabled(true);
        cpfD.setEnabled(true);
        emailD.setEnabled(true);
        ieD.setEnabled(true);
        nomeFazendaD.setEnabled(true);
        nomeProdD.setEnabled(true);
        telefoneD.setEnabled(true);
    }
    
    public void desabilitaCampos(){
        ativoD.setEnabled(false);
        celularD.setEnabled(false);
        codD.setEnabled(false);
        cpfD.setEnabled(false);
        emailD.setEnabled(false);
        ieD.setEnabled(false);
        nomeFazendaD.setEnabled(false);
        nomeProdD.setEnabled(false);
        telefoneD.setEnabled(false);
    }
    
    public void limpaCampos(){
        ativoD.setSelected(false);
        celularD.setText("");
        codD.setText("");
        cpfD.setText("");
        emailD.setText("");
        ieD.setText("");
        nomeFazendaD.setText("");
        nomeProdD.setText("");
        telefoneD.setText("");
    }
    private void limparUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparUActionPerformed
        // TODO add your handling code here:
        this.limpaCampos();
    }//GEN-LAST:event_limparUActionPerformed

    private void excluirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBActionPerformed
        this.limpaCampos();
        boolean aux;
        do{
            String imput;
            imput=(JOptionPane.showInputDialog(null,"Digite a Fazenda:")); 
            nomeFazendaD.setText(imput);
            if(imput == null){
                System.out.println("Cancel is pressed");
                break;
            }
            Fazenda faz = new Fazenda();
            faz.setNome(nomeFazendaD.getText());
            aux = faz.pesquisar();
            if(aux){
                codD.setText(Integer.toString(faz.getCodigo()));
                ativoD.setSelected(faz.getAtivo());
                nomeFazendaD.setText(faz.getNome());
                nomeProdD.setText(faz.getNome_prop());
                cpfD.setText(faz.getCfp_prop());
                ieD.setText(faz.getInsc_estadual());
                celularD.setText(faz.getCelular());
                telefoneD.setText(faz.getTelefone());
                emailD.setText(faz.getEmail());
                this.habilitaCampos();
                aux_excluir = 1; 
            }

        }while(!aux); 
    }//GEN-LAST:event_excluirBActionPerformed

    private void inclusaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inclusaoBActionPerformed
        // TODO add your handling code here:
        this.habilitaCampos();
        codD.setEnabled(false);
        aux_inclu = 1;
    }//GEN-LAST:event_inclusaoBActionPerformed

    private void listarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBActionPerformed
        TelaListagemFazendas telaLF = new TelaListagemFazendas ();
        telaLF.setVisible(true);
    }//GEN-LAST:event_listarBActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFazenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaCadastroFazenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarB;
    private javax.swing.JCheckBox ativoD;
    private javax.swing.JButton cancelarU;
    private javax.swing.JFormattedTextField celularD;
    private javax.swing.JLabel celularL;
    private javax.swing.JTextField codD;
    private javax.swing.JLabel codUsuarioL;
    private javax.swing.JFormattedTextField cpfD;
    private javax.swing.JLabel cpfL;
    private javax.swing.JTextField emailD;
    private javax.swing.JLabel emailL;
    private javax.swing.JButton excluirB;
    private javax.swing.JTextField ieD;
    private javax.swing.JLabel ieL;
    private javax.swing.JButton inclusaoB;
    private javax.swing.JButton limparU;
    private javax.swing.JButton listarB;
    private javax.swing.JTextField nomeFazendaD;
    private javax.swing.JLabel nomeFazendaL;
    private javax.swing.JTextField nomeProdD;
    private javax.swing.JLabel nomeProdL;
    private javax.swing.JButton pesquisarB;
    private javax.swing.JButton salvarU;
    private javax.swing.JFormattedTextField telefoneD;
    private javax.swing.JLabel telefoneL;
    // End of variables declaration//GEN-END:variables
}
