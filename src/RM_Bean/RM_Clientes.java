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
public class RM_Clientes {
    protected String RM_Nome;
    protected int RM_CPF;
    protected int Rm_Telefone;
    protected String RM_Rua;
    protected String RM_Bairro;
    
    public RM_Clientes(String Nome, int CPF, int Telefone, String Rua, String Bairro){
        this.RM_Nome = Nome;
        this.RM_CPF = CPF;
        this.Rm_Telefone = Telefone;
        this.RM_Rua = Rua;
        this.RM_Bairro = Bairro;
             
    }
    
    public void setRM_Nome(String Nome){
        this.RM_Nome = Nome;
    }
    public String getRM_Nome(){
        return this.RM_Nome;
    }
    
    public void setRM_CPF(int CPF){
        this.RM_CPF = CPF;
    }
    public int getRM_CPF(){
        return this.RM_CPF;
    }
     
    public void setRm_Telefone(int Telefone){
        this.Rm_Telefone = Telefone;
    }
    public int getRm_Telefone(){
        return this.Rm_Telefone;
    }
    
    public void setRM_Rua(String Rua){
        this.RM_Rua = Rua;
    }
    public String getRM_Rua(){
        return this.RM_Rua;
    }
    
    public void setRM_Bairro(String Bairro){
        this.RM_Bairro = Bairro;
    }
    public String getRM_Bairro(){
        return this.RM_Bairro;
}
}