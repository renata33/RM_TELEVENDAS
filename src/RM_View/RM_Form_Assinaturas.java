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



public class RM_Form_Assinaturas extends JPanel implements ActionListener{

  private JTextField campo_servico ;
  private JTextField campo_duracao;
  private JTextField campo_Tipo_de_assinatura;
  private JTextField campo_Bonus;
  private JTextField campo_Assistencia;
  private JButton botao_enviar;
  
  public RM_Form_Assinaturas(){
  
    setLayout(new GridLayout(6,1));
    
    JLabel label_servico = new JLabel("Serviço");
    add(label_servico);
    
    campo_servico = new JTextField(20);
    add(campo_servico);
    
    JLabel label_duracao = new JLabel("Duração em dias");
    add(label_duracao);
    
     campo_duracao = new JTextField(20);
    add(campo_duracao);
    
    JLabel label_tipodeassinatura = new JLabel ("Tipo de Assinatura");
    add(label_tipodeassinatura);
    
     campo_Tipo_de_assinatura = new JTextField (20);
    add(campo_Tipo_de_assinatura);
    
    JLabel label_Bonus = new JLabel("Bonus");
    add(label_Bonus);
    
     campo_Bonus = new JTextField(20);
    add(campo_Bonus);
    
    JLabel label_Assitencia = new JLabel("Assistencia");
    add(label_Assitencia);
    
     campo_Assistencia = new JTextField(20);
    add(campo_Assistencia);
    
    
    JButton botao_enviar = new JButton("Salvar Assinatura");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }
    @Override
    public void actionPerformed(ActionEvent al) {
        
        
         String valor_servico = campo_servico.getText();
         int valor_duracao = Integer.parseInt(campo_duracao.getText());
         String valor_tipodeassinatura = campo_Tipo_de_assinatura.getText();
         String valor_bonus = campo_Bonus.getText();
         String valor_assistencia = campo_Assistencia.getText();
         
         
         String armazena = "Serviço: "+valor_servico+"\n"
                 +"Duração : "+valor_duracao+"\n"
                 +"Tipo de Assinatura: "+valor_tipodeassinatura+"\n"
                 +"Bônus :"+valor_bonus+"\n"
                 +"Assistência: "+valor_assistencia+"\n"
                 ;
         
        JOptionPane.showMessageDialog(null, armazena);
    }
}
