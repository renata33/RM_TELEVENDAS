/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RM_Layout;
import RM_View.RM_Form_Clientes;
import RM_View.RM_Form_Assinaturas;
import RM_View.RM_Form_Fornecedor;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Esquerda extends JPanel {
    public RM_Esquerda(){
        
        setLayout(new GridLayout(3,1));
        add(new RM_Form_Clientes());
        add(new RM_Form_Assinaturas());
        add(new RM_Form_Fornecedor());
        
    }
}
