package com.sistema.model.bean;
// Generated 21/11/2017 11:03:53 by Hibernate Tools 4.3.1



/**
 * Paciente generated by hbm2java
 */
public class Paciente  implements java.io.Serializable {


     private Integer codigo;
     private String nome;
     private String rg;
     private String cpf;

    public Paciente() {
    }

    public Paciente(String nome, String rg, String cpf) {
       this.nome = nome;
       this.rg = rg;
       this.cpf = cpf;
    }
   
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




}


