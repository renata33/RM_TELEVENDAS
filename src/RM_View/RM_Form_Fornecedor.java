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
public class RM_Form_Fornecedor extends JPanel implements ActionListener{
  private JTextField campo_denominacao ;
  private JTextField campo_CNPJ;
  private JTextField campo_telefone;
  private JTextField campo_email;
  private JTextField campo_cidade;
  private JTextField campo_bairro;
  private JButton botao_enviar;
  
  public RM_Form_Fornecedor(){
  
    setLayout(new GridLayout(7,1));
    
    JLabel label_denominacao = new JLabel("Denominacao");
    add(label_denominacao);
    
    campo_denominacao = new JTextField(20);
    add(campo_denominacao);
    
    JLabel label_CNPJ = new JLabel("CNPJ");
    add(label_CNPJ);
    
     campo_CNPJ = new JTextField(20);
    add(campo_CNPJ);
    
    JLabel label_telefone = new JLabel ("Telefone");
    add(label_telefone);
    
     campo_telefone = new JTextField (20);
    add(campo_telefone);
    
    JLabel label_email = new JLabel("Email");
    add(label_email);
    
     campo_email = new JTextField(20);
    add(campo_email);
    
    JLabel label_cidade = new JLabel("Cidade");
    add(label_cidade);
    
     campo_cidade = new JTextField(20);
    add(campo_cidade);
    
      JLabel label_bairro = new JLabel("Bairro");
    add(label_bairro);
    
     campo_bairro = new JTextField(20);
    add(campo_bairro);
    
    
    JButton botao_enviar = new JButton("Salvar Fornecedor");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }
    @Override
    public void actionPerformed(ActionEvent al) {
        
        
         String valor_denomincao = campo_denominacao.getText();
         String valor_CNPJ = campo_CNPJ.getText();
         int valor_telefone = Integer.parseInt(campo_telefone.getText());
         String valor_email = campo_email.getText();
         String valor_cidade = campo_cidade.getText();
         String valor_bairro = campo_bairro.getText();
         
         
         String armazena = "Denominacao: "+valor_denomincao+"\n"
                 +"CNPJ : "+valor_CNPJ+"\n"
                 +"Telefone: "+valor_telefone+"\n"
                 +"Email :"+valor_email+"\n"
                 +"Cidade: "+valor_cidade+"\n"
                 +"Bairro: "+valor_bairro+"\n" ;
         
        JOptionPane.showMessageDialog(null, armazena);
    
    }

}
