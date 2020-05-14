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
public abstract class  RM_Funcionarios {
    protected String RM_Nome;
    protected String RM_CPF;
    protected String RM_Experiencia;
    protected double RM_Salario;
    protected String RM_Nivel_de_Acesso;

    public String getRM_Nome() {
        return RM_Nome;
    }

    public void setRM_Nome(String RM_Nome) {
        this.RM_Nome = RM_Nome;
    }

    public String getRM_CPF() {
        return RM_CPF;
    }

    public void setRM_CPF(String RM_CPF) {
        this.RM_CPF = RM_CPF;
    }

    public String getRM_Experiencia() {
        return RM_Experiencia;
    }

    public void setRM_Experiencia(String RM_Experiencia) {
        this.RM_Experiencia = RM_Experiencia;
    }

    public double getRM_Salario() {
        return RM_Salario;
    }

    public void setRM_Salario(double RM_Salario) {
        this.RM_Salario = RM_Salario;
    }

    public String getRM_Nivel_de_Acesso() {
        return RM_Nivel_de_Acesso;
    }

    public void setRM_Nivel_de_Acesso(String RM_Nivel_de_Acesso) {
        this.RM_Nivel_de_Acesso = RM_Nivel_de_Acesso;
    }
    
 
}
