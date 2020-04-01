/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RM_Classes;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Assinaturas {
    
    protected String RM_Servico;
    protected int RM_Duracao;
    protected String RM_Tipo_de_Assinatura;
    protected String RM_Bonus;
    protected String RM_Assistencia;
   
    
    public RM_Assinaturas(String Servico, int Duracao, String Tipo_de_Assinatura, String Bonus, String Assistencia){
        this.RM_Servico = Servico;
        this.RM_Duracao = Duracao;
        this.RM_Tipo_de_Assinatura = Tipo_de_Assinatura;
        this.RM_Bonus = Bonus;
        this.RM_Assistencia = Assistencia;
        
    }
    
    public void setRM_Servico(String Servico){
    this.RM_Servico = Servico;
}
    public String getRM_Servico(){
    return this.RM_Servico;
}
    public void setRM_Duracao(int Duracao){
    this.RM_Duracao = Duracao;
}
    public int getRM_Duracao(){
    return this.RM_Duracao;
}
    
    public void setRM_Tipo_de_Assinatura(String Tipo_de_Assinatura){
    this.RM_Tipo_de_Assinatura = Tipo_de_Assinatura;
}
    public String getRM_Tipo_de_Assinatura(){
    return this.RM_Tipo_de_Assinatura;
}
    
    public void setRM_Bonus(String Bonus){
    this.RM_Bonus = Bonus;
}
    public String getRM_Bonus(){
    return this.RM_Bonus;
}
    public void setRM_Assistencia(String Assistencia){
    this.RM_Assistencia = Assistencia;
}
    public String getRM_Assistencia(){
    return this.RM_Assistencia;
}
    
    
}
