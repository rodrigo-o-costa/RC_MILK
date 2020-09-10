/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rodri
 */
public class Fazenda {
   private String nome;
   private String nome_prop;
   private String cfp_prop;
   private String insc_estadual;

    public Fazenda() {
    }

    public Fazenda(String nome, String nome_prop, String cfp_prop, String insc_estadual) {
        this.nome = nome;
        this.nome_prop = nome_prop;
        this.cfp_prop = cfp_prop;
        this.insc_estadual = insc_estadual;
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
    
}
