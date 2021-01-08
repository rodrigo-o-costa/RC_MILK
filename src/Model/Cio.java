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
import java.util.Calendar;
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
    private Date dataPerda;
    private Boolean perda;
    private Date dataParto;
    private Boolean parto;
    private Boolean finilizado;
    private Date dataPreParto;
    private Boolean preParto;
    private Date previsaoParto;

    public Cio(int codCio, Date dataCio, int codVaca, String nomeTouro, int codTouro, String nomeVaca, Boolean confirmado, Date dataConfirmacao, Boolean repetiuCio, String obs, Date dataPerda, Boolean perda, Date dataParto, Boolean parto, Boolean finilizado, Date dataPreParto, Boolean preParto, Date previsaoParto) {
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
        this.dataPerda = dataPerda;
        this.perda = perda;
        this.dataParto = dataParto;
        this.parto = parto;
        this.finilizado = finilizado;
        this.dataPreParto = dataPreParto;
        this.preParto = preParto;
        this.previsaoParto = previsaoParto;
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

    public Date getDataPerda() {
        return dataPerda;
    }

    public void setDataPerda(Date dataPerda) {
        this.dataPerda = dataPerda;
    }

    public Boolean getPerda() {
        return perda;
    }

    public void setPerda(Boolean perda) {
        this.perda = perda;
    }

    public Date getDataParto() {
        return dataParto;
    }

    public void setDataParto(Date dataParto) {
        this.dataParto = dataParto;
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

    public Date getDataPreParto() {
        return dataPreParto;
    }

    public void setDataPreParto(Date dataPreParto) {
        this.dataPreParto = dataPreParto;
    }

    public Boolean getPreParto() {
        return preParto;
    }

    public void setPreParto(Boolean preParto) {
        this.preParto = preParto;
    }

    public Date getPrevisaoParto() {
        return previsaoParto;
    }

    public void setPrevisaoParto(Date previsaoParto) {
        this.previsaoParto = previsaoParto;
    }

    public void cadastrar() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.getDataCio());
        System.out.println(cal.getTime());
        cal.add(Calendar.MONTH, 9);
        this.setPrevisaoParto(cal.getTime());
        String sql = "INSERT INTO tb_cio ( dataCio, codVaca, nomeVaca, codTouro, nomeTouro, obs,confirmado, repetiuCio,perdeu,parto,finalizado,previsao_parto) values (?,?,?,?,?,?,false,false,false,false,false,?);";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataCio()).getTime()));
            pst.setInt(2, this.getCodVaca());
            pst.setString(3, this.getNomeVaca());
            pst.setInt(4, this.getCodTouro());
            pst.setString(5, this.getNomeTouro());
            pst.setString(6, this.getObs());
            pst.setDate(7, new java.sql.Date((this.getPrevisaoParto()).getTime()));
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

        String sql = "update tb_cio set  dataperda = ?, perdeu = ?,obs = ? where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataPerda()).getTime()));
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

    public void pre_parto() {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = Conec.Conectar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "update tb_cio set  data_preparto = ?, pre_parto = ?,obs = ?,finalizado = true where codCio = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date((this.getDataPreParto()).getTime()));
            pst.setBoolean(2, this.getPreParto());
            pst.setString(3, this.getObs());
            pst.setInt(4, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Pré-parto registrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Pré-parto não registrado.");
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
            pst.setDate(1, new java.sql.Date((this.getDataParto()).getTime()));
            pst.setBoolean(2, this.getParto());
            pst.setString(3, this.getObs());
            pst.setInt(4, this.getCodCio());
            if (!pst.execute()) {
                JOptionPane.showMessageDialog(null, "Parto de Cria Registrada");
            } else {
                JOptionPane.showMessageDialog(null, "Perda de Cria Registrada");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, E);
        }
    }

}
