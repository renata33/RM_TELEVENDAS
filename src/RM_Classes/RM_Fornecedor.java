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
public class RM_Fornecedor {
        
    protected String RM_Denominacao;
    protected String RM_CNPJ;
    protected int RM_telefone;
    protected String RM_email;
    protected String RM_Cidade;
    protected String RM_Bairro;
    
    public RM_Fornecedor(String Denominacao, String CNPJ, int telefone, String email, String cidade, String Bairro){
        this.RM_Denominacao = Denominacao;
        this.RM_CNPJ = CNPJ;
        this.RM_telefone = telefone;
        this.RM_email = email;
        this.RM_Cidade = cidade;
        this.RM_Bairro = Bairro;
    }
    
public void setDenominacao(String Denominacao){
    this.RM_Denominacao = Denominacao;
}
public String getDenominacao(){
    return this.RM_Denominacao;
}

public void setRM_CNPJ(String CNPJ){
    this.RM_CNPJ = CNPJ;
}
public String getRM_CNPJ(){
    return this.RM_CNPJ;
}

public void setRM_telefone(int telefone){
    this.RM_telefone = telefone;
}
public int getRM_telefone(){
    return this.RM_telefone;
}

public void setRM_email(String email){
    this.RM_email = email;
}
public String getRM_email(){
    return this.RM_email;
}

public void setRM_Cidade(String cidade){
    this.RM_Cidade = cidade;
}
public String getRM_Cidade(){
    return this.RM_Cidade;
}

public void setRM_Bairro(String Bairro){
    this.RM_Bairro = Bairro;
}
public String getRM_Bairro(){
    return this.RM_Bairro;
}



}
