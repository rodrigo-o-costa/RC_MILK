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
    private boolean ativo;
    private String nome;
    private String user;
    private String senha;
    private String telefone;
    private String email;

    public Usuario() {
    }

    public Usuario(boolean ativo, String nome, String user, String senha, String telefone, String email) {
        this.ativo = ativo;
        this.nome = nome;
        this.user = user;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
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
    
    }
    public void excluir(){
    
    }
    public void pesquisar(){
    
    }
    public void listar(){
    
    }
}

