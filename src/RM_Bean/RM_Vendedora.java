/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RM_Bean;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Vendedora {
    private String RM_nome;
    private String RM_CPF ;
    private int RM_nivel_de_acesso;
    private String RM_experiencia;
    private double RM_salario;
    
    
    public RM_Vendedora(String nome, String cpf, int nivel_de_acesso, String experiencia, double salario) {
        this.RM_nome =  nome;
        this.RM_CPF =  cpf;
        this.RM_nivel_de_acesso = nivel_de_acesso;
        this.RM_experiencia = experiencia;
        this.RM_salario = salario;
   
    }
        
 public void setRM_nome(String nome){
     this.RM_nome = nome;
 }
 public String getRM_nome(){
     return this.RM_nome;
 }
    
public void setRM_CPF(String cpf){
    this.RM_CPF =  cpf;
}
public String getRM_CPF(){
    return this.RM_CPF;
}

public void setRM_nivel_de_acesso(int nivel_de_acesso){
    this.RM_nivel_de_acesso = nivel_de_acesso;
}
public int getRM_nivel_de_acesso(){
    return this.RM_nivel_de_acesso;
}

public void setRM_experiencia(String experiencia){
    this.RM_experiencia = experiencia;
}
public String getRM_experiencia(){
    return this.RM_experiencia;
}

public void setRM_salario(double salario){
    this.RM_salario = salario;
}
public double getRM_salario(){
    return this.RM_salario;
}



}


