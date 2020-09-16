/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conec;
import View.TelaPrincipal;
import View.Tela_login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Bovino {
    private String nome;
    private int brinco;
    private char sexo;
    private String cor;
    private String clasficacao;
    private String data_nasc;
    private String raca;
    private String observacao;
    private String nome_pai;
    private String nome_mae;

    public Bovino() {
    }
    
    public Bovino(String nome, int brinco, char sexo, String cor, String clasficacao, String data_nasc, String raca, String observacao, String nome_pai, String nome_mae) {
        this.nome = nome;
        this.brinco = brinco;
        this.sexo = sexo;
        this.cor = cor;
        this.clasficacao = clasficacao;
        this.data_nasc = data_nasc;
        this.raca = raca;
        this.observacao = observacao;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBrinco() {
        return brinco;
    }

    public void setBrinco(int brinco) {
        this.brinco = brinco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getClasficacao() {
        return clasficacao;
    }

    public void setClasficacao(String clasficacao) {
        this.clasficacao = clasficacao;
    }
 /*   public void cadastroBovino(String nome, int brinco, char sexo, String cor, String clasficacao, String data_nasc, String raca, String observacao, String nome_pai, String nome_mae){
    
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
         try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "INSERT INTO tb_usuario (ativo,nome_usuario,usuario,senha,telefone,email)VALUES('?','?','?','?','?');";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,usuarioD.getText());
            pst.setString(2,senhaD.getText());
            rs = pst.executeQuery();
             if(rs.next()){
                 JOptionPane.showMessageDialog(null, "Bovino cadastrado com sucesso");
             }else{
                 JOptionPane.showMessageDialog(null, "Bovino Não Cadastrado");
             }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
    }  */
}  

    

