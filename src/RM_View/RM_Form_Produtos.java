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
public class RM_Form_Produtos extends JPanel implements ActionListener{
private JTextField campo_descricao ;
  private JTextField campo_valor;
  private JTextField campo_quantidade;
  private JTextField campo_ID;
  private JTextField campo_Lote;
  private JButton botao_enviar;
  
  public RM_Form_Produtos(){
  
    setLayout(new GridLayout(6,1));
    
    JLabel label_descricao = new JLabel("Descrição");
    add(label_descricao);
    
    campo_descricao = new JTextField(20);
    add(campo_descricao);
    
    JLabel label_Valor = new JLabel("Valor");
    add(label_Valor);
    
     campo_valor = new JTextField(20);
    add(campo_valor);
    
    JLabel label_quantidade = new JLabel ("Quantidade");
    add(label_quantidade);
    
     campo_quantidade = new JTextField (20);
    add(campo_quantidade);
    
    JLabel label_ID = new JLabel("ID");
    add(label_ID);
    
     campo_ID = new JTextField(20);
    add(campo_ID);
    
    JLabel label_lote = new JLabel("Lote");
    add(label_lote);
    
     campo_Lote = new JTextField(20);
    add(campo_Lote);
    
     
    
    
    JButton botao_enviar = new JButton("Salvar Produtos");
     botao_enviar.addActionListener(this);
    add(botao_enviar);
    }
    @Override
    public void actionPerformed(ActionEvent al) {
        
        
         String valor_descricao = campo_descricao.getText();
         double valor_valor = Double.parseDouble(campo_valor.getText());
         int valor_quantidade = Integer.parseInt(campo_quantidade.getText());
         int valor_ID = Integer.parseInt(campo_ID.getText());
         String valor_String = campo_Lote.getText();
         
         
         
         String armazena = "Denominacao: "+valor_descricao+"\n"
                 +"CNPJ : "+valor_valor+"\n"
                 +"Telefone: "+valor_quantidade+"\n"
                 +"Email :"+valor_ID+"\n"
                 +"Cidade: "+valor_String+"\n";
         
        JOptionPane.showMessageDialog(null, armazena);
    
    }
}
