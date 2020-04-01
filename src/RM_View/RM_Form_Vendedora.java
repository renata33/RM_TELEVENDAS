/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RM_View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Form_Vendedora extends JPanel implements ActionListener{
     
   private JTextField campo_nome ;
   private JTextField campo_CPF;
   private JTextField campo_niveldeacesso;
   private JTextField campo_experiencia;
   private JTextField campo_salario;
   private JButton botao_enviar;
  
  public RM_Form_Vendedora(){
  
    setLayout(new GridLayout(6,1));
    
    JLabel label_nome = new JLabel("Nome");
    add(label_nome);
    
    campo_nome = new JTextField(20);
    add(campo_nome);
    
    JLabel label_CPF = new JLabel("CPF");
    add(label_CPF);
    
     campo_CPF = new JTextField(20);
    add(campo_CPF);
    
    JLabel label_niveldeacesso = new JLabel ("Nível de Acesso");
    add(label_niveldeacesso);
    
     campo_niveldeacesso = new JTextField (20);
    add(campo_niveldeacesso);
    
    JLabel label_experiencia = new JLabel("Experiência");
    add(label_experiencia);
    
     campo_experiencia = new JTextField(20);
    add(campo_experiencia);
    
    JLabel label_salario = new JLabel("Salário");
    add(label_salario);
    
     campo_salario = new JTextField(20);
    add(campo_salario);
    
     
    
    
    JButton botao_enviar = new JButton("Salvar Vendedor");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }
    @Override
    public void actionPerformed(ActionEvent al) {
        
        
         String valor_nome = campo_nome.getText();
         String valor_CPF = campo_CPF.getText();
         int valor_niveldeacesso = Integer.parseInt(campo_niveldeacesso.getText());
         String valor_experiencia = campo_experiencia.getText();
         double valor_salario = Double.parseDouble(campo_salario.getText());
         
         
         
         String armazena = "Nome: "+valor_nome+"\n"
                 +"CPF : "+valor_CPF+"\n"
                 +"Nível de Acesso: "+valor_niveldeacesso+"\n"
                 +"Experiência :"+valor_experiencia+"\n"
                 +"Salário: "+valor_salario+"\n";
         
        JOptionPane.showMessageDialog(null, armazena);
    
    }

}
