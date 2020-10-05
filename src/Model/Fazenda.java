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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Fazenda {

   private int codigo;
   private boolean ativo;
   private String nome;
   private String nome_prop;
   private String cfp_prop;
   private String insc_estadual;
   private String telefone;
   private String celular;
   private String email;

    public Fazenda() {
    }

    public Fazenda(int codigo, boolean ativo, String nome, String nome_prop, String cfp_prop, String insc_estadual, String telefone, String celular, String email) {
        this.codigo = codigo;
        this.ativo = ativo;
        this.nome = nome;
        this.nome_prop = nome_prop;
        this.cfp_prop = cfp_prop;
        this.insc_estadual = insc_estadual;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }   
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean getAtivo() {
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

    public String getNome_prop() {
        return nome_prop;
    }

    public void setNome_prop(String nome_prop) {
        this.nome_prop = nome_prop;
    }

    public String getCfp_prop() {
        return cfp_prop;
    }

    public void setCfp_prop(String cfp_prop) {
        this.cfp_prop = cfp_prop;
    }

    public String getInsc_estadual() {
        return insc_estadual;
    }

    public void setInsc_estadual(String insc_estadual) {
        this.insc_estadual = insc_estadual;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrar(){
        Connection con =null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "INSERT INTO tb_fazenda (ativo,nome_fazenda,nome_prop,cfp_prop,insc_estadual,telefone,celular,email)values(?,?,?,?,?,?,?,?);";
        try{
            pst = con.prepareStatement(sql);
            pst.setBoolean(1,this.getAtivo());
            pst.setString(2,this.getNome());
            pst.setString(3,this.getNome_prop());
            pst.setString(4,this.getCfp_prop());
            pst.setString(5,this.getInsc_estadual());
            pst.setString(6,this.getTelefone());
            pst.setString(7,this.getCelular());
            pst.setString(8,this.getEmail());
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Fazenda cadastrada com sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Fazenda não cadastrada");
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
    
    }
    
    public void excluir(){
        Connection con = null;
        PreparedStatement pst = null;
         try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "DELETE FROM tb_fazenda WHERE id_fazenda = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1,this.getCodigo());
            System.out.println(pst);
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Fazenda excluída com sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Fazenda não excluída");
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
  
        String sql = "update tb_fazenda set id_fazenda = ? ,ativo = ?,nome_fazenda = ?,nome_prop = ?,cfp_prop = ?,insc_estadual = ?,telefone = ?,celular = ?,email = ? where id_fazenda = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, this.getCodigo());
            pst.setBoolean(2,this.getAtivo());
            pst.setString(3,this.getNome());
            pst.setString(4,this.getNome_prop());
            pst.setString(5,this.getCfp_prop());
            pst.setString(6,this.getInsc_estadual());
            pst.setString(7,this.getTelefone());
            pst.setString(8,this.getCelular());
            pst.setString(9,this.getEmail());
            pst.setInt(10,this.getCodigo());
            
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Fazenda alterada com sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Fazenda não alterada");
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
  
        String sql = "select id_fazenda,ativo,nome_fazenda,nome_prop,cfp_prop,insc_estadual,telefone,celular,email from tb_fazenda where nome_fazenda like ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,this.getNome());
            rs = pst.executeQuery();
            if(rs.next()){
                this.setCodigo(rs.getInt("id_fazenda"));
                this.setAtivo(rs.getBoolean("ativo"));
                this.setNome(rs.getString("nome_fazenda"));
                this.setNome_prop(rs.getString("nome_prop"));
                this.setCfp_prop(rs.getString("cfp_prop"));
                this.setInsc_estadual(rs.getString("insc_estadual"));
                this.setTelefone(rs.getString("telefone"));
                this.setCelular(rs.getString("celular"));
                this.setEmail(rs.getString("email"));
                JOptionPane.showMessageDialog(null, "Fazenda encontrada");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Fazenda não encontrada"); 
                return false;
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
        return false;
        
    }

}
    
    
