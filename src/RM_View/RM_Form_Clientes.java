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
public class RM_Form_Clientes extends JPanel implements ActionListener {
  private JTextField campo_nome ;
  private JTextField campo_CPF;
  private JTextField campo_Telefone;
  private JTextField campo_Rua;
  private JTextField campo_Bairro;
  private JButton botao_enviar;
  
  public RM_Form_Clientes(){
  
    setLayout(new GridLayout(6,1));
    
    JLabel label_nome = new JLabel("Nome");
    add(label_nome);
    
    campo_nome = new JTextField(20);
    add(campo_nome);
    
    JLabel label_CPF = new JLabel("CPF");
    add(label_CPF);
    
     campo_CPF = new JTextField(20);
    add(campo_CPF);
    
    JLabel label_telefone = new JLabel ("Telefone");
    add(label_telefone);
    
     campo_Telefone = new JTextField (20);
    add(campo_Telefone);
    
    JLabel label_rua = new JLabel("Rua");
    add(label_rua);
    
     campo_Rua = new JTextField(20);
    add(campo_Rua);
    
    JLabel label_Bairro = new JLabel("Bairro");
    add(label_Bairro);
    
     campo_Bairro = new JTextField(20);
    add(campo_Bairro);
    
    
    JButton botao_enviar = new JButton("Salvar Cliente");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }
    @Override
    public void actionPerformed(ActionEvent al) {
        
        
         String valor_nome = campo_nome.getText();
         int valor_CPF = Integer.parseInt(campo_CPF.getText());
         int valor_telefone = Integer.parseInt(campo_Telefone.getText());
         String valor_rua = campo_Rua.getText();
         String valor_bairro = campo_Bairro.getText();
         
         
         String armazena = "Nome: "+valor_nome+"\n"
                 +"CPF : "+valor_CPF+"\n"
                 +"Telefone: "+valor_telefone+"\n"
                 +"Rua :"+valor_rua+"\n"
                 +"Bairro: "+valor_bairro+"\n"
                 ;
         
        JOptionPane.showMessageDialog(null, armazena);
    
    }

}
