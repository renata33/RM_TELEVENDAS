/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RM_Layout;

import RM_View.RM_Form_Produtos;
import RM_View.RM_Form_Vendedora;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Direita extends JPanel {
 
    public RM_Direita(){
        
        setLayout(new GridLayout(2,1));
        add(new RM_Form_Produtos());
        add(new RM_Form_Vendedora());
        
        
    }
}
