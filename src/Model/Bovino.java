/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Bovino { 
    
    private int cod;
    private boolean ativo;
    private String nome;
    private int brinco;
    private Date data_nasc;
    private String sexo;
    private String raca;
    private String cor;
    private int quantCria;
    private String observacao;
    private String nome_pai;
    private String nome_mae;

    public Bovino() {
    }

    public Bovino(int cod, boolean ativo, String nome, int brinco, Date data_nasc, int idade, String sexo, String raca, String cor, int quantCria, String observacao, String nome_pai, String nome_mae) {
        this.cod = cod;
        this.ativo = ativo;
        this.nome = nome;
        this.brinco = brinco;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.raca = raca;
        this.cor = cor;
        this.quantCria = quantCria;
        this.observacao = observacao;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantCria() {
        return quantCria;
    }

    public void setQuantCria(int quantCria) {
        this.quantCria = quantCria;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
    
    public void excluir(){
        Connection con = null;
        PreparedStatement pst = null;
         try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "DELETE FROM tb_bovino WHERE cod = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1,this.getCod());
            System.out.println(pst);
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Bovino Excluido com Sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Bovino Não Excluido");
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        } 
    }
    
    public void alterar(){
        Connection con =null;
        PreparedStatement pst = null;
         try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "UPDATE tb_bovino set ativo = ?, nome = ?, brinco = ?, data_nasc = ?, sexo = ?, raca = ?, cor = ?, quantCria = ?, observacao = ?, nome_pai = ?, nome_mae = ? where cod = ? ";
        try{
            pst = con.prepareStatement(sql);
            pst.setBoolean(1,this.isAtivo());
            pst.setString(2,this.getNome());
            pst.setInt(3,this.getBrinco());
            pst.setDate(4,new java.sql.Date(this.getData_nasc().getTime()));
            pst.setString(5,this.getSexo());
            pst.setString(6,this.getRaca());
            pst.setString(7,this.getCor());
            pst.setInt(8,this.getQuantCria());
            pst.setString(9,this.getObservacao());
            pst.setString(10,this.getNome_pai());
            pst.setString(11,this.getNome_mae());
            pst.setInt(12,this.getCod());

            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Bovino Alterado com Sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Bovino Não Alterado");
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
        
        
    }
    public boolean pesquisar(){
        Connection con =null;
        PreparedStatement pst = null;
        ResultSet rs = null;
         try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = ("select cod, ativo, nome, brinco, data_nasc, sexo, raca, cor, quantCria, observacao, nome_pai, nome_mae from tb_bovino where nome = ?;");
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,this.getNome());
            rs = pst.executeQuery();
            if(rs.next()){
                this.setCod(rs.getInt("cod"));
                this.setAtivo(rs.getBoolean("ativo"));
                this.setNome(rs.getString("nome"));
                this.setBrinco(rs.getInt("brinco"));
                this.setData_nasc(rs.getDate("data_nasc"));
                this.setSexo(rs.getString("sexo"));
                this.setRaca(rs.getString("raca"));
                this.setCor(rs.getString("cor"));
                this.setQuantCria(rs.getInt("quantCria"));
                this.setObservacao(rs.getString("observacao"));
                this.setNome_pai(rs.getString("nome_pai"));
                this.setNome_mae(rs.getString("nome_mae"));
                JOptionPane.showMessageDialog(null, "Bovino Encontrada");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Bovino Não Encontrada"); 
                return false;
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
        return false;
        
    }
    public void cadastrar(){
        Connection con =null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "INSERT INTO  tb_bovino (ativo, nome, brinco, data_nasc, sexo, raca,cor, quantCria, observacao, nome_pai, nome_mae)values (?,?,?,?,?,?,?,?,?,?,?);";
        try{
            pst = con.prepareStatement(sql);
            pst.setBoolean(1,this.isAtivo());
            pst.setString(2,this.getNome());
            pst.setInt(3,this.getBrinco());
            pst.setDate(4,new java.sql.Date(this.getData_nasc().getTime()));
            pst.setString(5,this.getSexo());
            pst.setString(6,this.getRaca());
            pst.setString(7,this.getCor());
            pst.setInt(8,this.getQuantCria());
            pst.setString(9,this.getObservacao());
            pst.setString(10,this.getNome_pai());
            pst.setString(11,this.getNome_mae());
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Bovino cadastrado com sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Bovino Não Cadastrado");
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
    }

    public String getNome_pai() {
        return nome_pai;
    }

}

  
