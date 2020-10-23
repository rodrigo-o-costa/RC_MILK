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
 * @author RODRIGO_PC
 */
public class Cio {
    private int codCio;
    private Date dataCio;
    private int codVaca;
    private String nomeTouro;
    private int codTouro;
    private String nomeVaca;
    private Boolean confirmado;
    private Date dataConfirmacao;
    private Boolean repetiuCio;
    private String obs;
    
    public Cio() {
        
    }
    
    public Cio(int codCio, Date dataCio, int codVaca, String nomeTouro, int codTouro, String nomeVaca, Boolean confirmado, Date dataConfirmacao, Boolean repetiuCio, String obs) {
        this.codCio = codCio;
        this.dataCio = dataCio;
        this.codVaca = codVaca;
        this.nomeTouro = nomeTouro;
        this.codTouro = codTouro;
        this.nomeVaca = nomeVaca;
        this.confirmado = confirmado;
        this.dataConfirmacao = dataConfirmacao;
        this.repetiuCio = repetiuCio;
        this.obs = obs;
    }

    public int getCodCio() {
        return codCio;
    }

    public void setCodCio(int codCio) {
        this.codCio = codCio;
    }

    public Date getDataCio() {
        return dataCio;
    }

    public void setDataCio(Date dataCio) {
        this.dataCio = dataCio;
    }

    public int getCodVaca() {
        return codVaca;
    }

    public void setCodVaca(int codVaca) {
        this.codVaca = codVaca;
    }

    public String getNomeTouro() {
        return nomeTouro;
    }

    public void setNomeTouro(String nomeTouro) {
        this.nomeTouro = nomeTouro;
    }

    public int getCodTouro() {
        return codTouro;
    }

    public void setCodTouro(int codTouro) {
        this.codTouro = codTouro;
    }

    public String getNomeVaca() {
        return nomeVaca;
    }

    public void setNomeVaca(String nomeVaca) {
        this.nomeVaca = nomeVaca;
    }

    public Boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    public Date getDataConfirmacao() {
        return dataConfirmacao;
    }

    public void setDataConfirmacao(Date dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    public Boolean getRepetiuCio() {
        return repetiuCio;
    }

    public void setRepetiuCio(Boolean repetiuCio) {
        this.repetiuCio = repetiuCio;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public void cadastrar(){
    
    }
    
    public void excluir(){

    }
    
    public void alterar(){

    }
    public boolean pesquisar(){
        return true;
    }

    
}
