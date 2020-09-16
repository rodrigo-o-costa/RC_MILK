/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conec;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author rodri
 */
public class Usuario {
    private int codigo;
    private boolean ativo;
    private String nome;
    private String user;
    private String senha;
    private String telefone;
    private String email;

    public Usuario() {
    }

    public Usuario(int codigo, boolean ativo, String nome, String user, String senha, String telefone, String email) {
        this.codigo = codigo;
        this.ativo = ativo;
        this.nome = nome;
        this.user = user;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
  
        String sql = "INSERT INTO tb_usuario (ativo,nome_usuario,usuario,senha,telefone,email)VALUES(?,?,?,?,?,?)";
        try{
            pst = con.prepareStatement(sql);
            pst.setBoolean(1,this.getAtivo());
            pst.setString(2,this.getNome());
            pst.setString(3,this.getUser());
            pst.setString(4,this.getSenha());
            pst.setString(5,this.getTelefone());
            pst.setString(6,this.getEmail());
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Usuario Não Cadastrado");
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
  
        String sql = "UPDATE tb_usuario SET ativo = ?,nome_usuario = ?,usuario = ?, senha = ?,telefone = ?,email = ? WHERE id_usuario = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setBoolean(1,this.getAtivo());
            pst.setString(2,this.getNome());
            pst.setString(3,this.getUser());
            pst.setString(4,this.getSenha());
            pst.setString(5,this.getTelefone());
            pst.setString(6,this.getEmail());
            System.out.println(this.getCodigo());
            pst.setInt(7,this.getCodigo());
            System.out.println(pst);
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Usuario Alterado com Sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Usuario Não Alterado");
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
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
  
        String sql = "DELETE FROM tb_usuario WHERE id_usuario = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1,this.getCodigo());
            System.out.println(pst);
            if(!pst.execute()){
                 JOptionPane.showMessageDialog(null, "Usuario Excluido com Sucesso");
            }else{
                 JOptionPane.showMessageDialog(null, "Usuario Não Excluido");
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
  
        String sql = "select id_usuario,ativo,nome_usuario,usuario,senha,telefone,email from tb_usuario where usuario like ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,this.getUser());
            rs = pst.executeQuery();
            if(rs.next()){
                this.setCodigo(rs.getInt("id_usuario"));
                this.setAtivo(rs.getBoolean("ativo"));
                this.setNome(rs.getString("nome_usuario"));
                this.setUser(rs.getString("usuario"));
                this.setSenha(rs.getString("senha"));
                this.setTelefone(rs.getString("telefone"));
                this.setEmail(rs.getString("email"));
                JOptionPane.showMessageDialog(null, "Usuario Encontrado");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Usuario Não Encontrad"); 
                return false;
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, E);
        }
        return false;
    }
    public void listar(){
    
    }
}

