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
    private Date dataperda;
    private Boolean perda;
    private Date dataparto;
    private Boolean parto;
    private Boolean finilizado;

    public Cio(int codCio, Date dataCio, int codVaca, String nomeTouro, int codTouro, String nomeVaca, Boolean confirmado, Date dataConfirmacao, Boolean repetiuCio, String obs, Date dataperda, Boolean perda, Date dataparto, Boolean parto, Boolean finilizado) {
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
        this.dataperda = dataperda;
        this.perda = perda;
        this.dataparto = dataparto;
        this.parto = parto;
        this.finilizado = finilizado;
    }

    public Cio() {

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

    public boolean isConfirmado() {
        return confirmado;
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

    public Date getDataperda() {
        return dataperda;
    }

    public void setDataperda(Date dataperda) {
        this.dataperda = dataperda;
    }

    public Boolean getPerda() {
        return perda;
    }

    public void setPerda(Boolean perda) {
        this.perda = perda;
    }
    public Date getDataparto() {
        return dataparto;
    }

    public void setDataparto(Date dataparto) {
        this.dataparto = dataparto;
    }

    public Boolean getParto() {
        return parto;
    }

    public void setParto(Boolean parto) {
        this.parto = parto;
    }

    public Boolean getFinilizado() {
        return finilizado;
    }

    public void setFinilizado(Boolean finilizado) {
        this.finilizado = finilizado;
    }

    public void cadastrar() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println();
        String sql = "INSERT INTO tb_cio ( dataCio, codVaca, nomeVaca, codTouro, nomeTouro, obs,confirmado, repetiuCio,perdeu,parto,finalizado) values (?,?,?,?,?,?,false,false,false,false,false);";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataCio()).getTime()));
            pst.setInt(2, this.getCodVaca());
            pst.setString(3, this.getNomeVaca());
            pst.setInt(4, this.getCodTouro());
            pst.setString(5, this.getNomeTouro());
            pst.setString(6, this.getObs());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Cio cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Cio Não Cadastrado");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

    public void excluir() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Bovino.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "DELETE FROM tb_cio WHERE codCio = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, this.getCodCio());
            System.out.println(pst);
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Registro de Cio Excluido com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Registro de Cio Não Excluido");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

    public void alterar() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "update tb_cio set dataCio = ?, codvaca = ?, nomeVaca = ?, codTouro = ?, nomeTouro = ?,obs = ? where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataCio()).getTime()));
            pst.setInt(2, this.getCodVaca());
            pst.setString(3, this.getNomeVaca());
            pst.setInt(4, this.getCodTouro());
            pst.setString(5, this.getNomeTouro());
            pst.setString(6, this.getObs());
            pst.setInt(7, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Cio Alterado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Cio Não Cadastrado");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

    public boolean pesquisar() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = ("select codcio, dataCio, codVaca, nomeVaca, codTouro, nomeTouro, obs from tb_cio where nomeVaca = ?;");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, this.getNomeVaca());
            System.out.println(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.setCodCio(rs.getInt("codcio"));
                this.setDataCio(rs.getDate("dataCio"));
                this.setCodVaca(rs.getInt("codVaca"));
                this.setNomeVaca(rs.getString("nomeVaca"));
                this.setCodTouro(rs.getInt("codTouro"));
                this.setNomeTouro(rs.getString("nomeTouro"));
                this.setObs(rs.getString("obs"));
                JOptionPane.showMessageDialog(null, "Registro de Cio Encontrado");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Registro de Cio Não Encontrado");
                return false;
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }
        return false;
    }

    public void confirmaCio() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "update tb_cio set  dataConfirmacao = ?, confirmado = ?,obs = ? where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataConfirmacao()).getTime()));
            pst.setBoolean(2, this.isConfirmado());
            pst.setString(3, this.getObs());
            pst.setInt(4, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Cio Confirmado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Cio Confirmado Não Cadastrado");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

    public void repetiu() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "update tb_cio set  repetiuCio = ? , finalizado = true where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setBoolean(1, this.getRepetiuCio());
            pst.setInt(2, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Cio Confirmado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Cio Confirmado Não Cadastrado");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

    public void perdeu() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "update tb_cio set  dataperda = ?, perdeu = ?,obs = ?, finalizado = true where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataperda()).getTime()));
            pst.setBoolean(2, this.getPerda());
            pst.setString(3, this.getObs());
            pst.setInt(4, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Perda de Cria Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "Perda de Cria Registrada");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }
    }

    public void parto() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }

        String sql = "update tb_cio set  dataparto = ?, parto = ?,obs = ?,finalizado = true where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataparto()).getTime()));
            pst.setBoolean(2, this.getParto());
            pst.setString(3, this.getObs());
            pst.setInt(4, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Perda de Cria Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "Perda de Cria Registrada");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }

    }

}
