/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RM_Layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Renata <rptmpriscila33@gmail.com>
 */
public class RM_Janela extends JFrame {
    public RM_Janela(){
        super("Televendas");
        setLayout(new BorderLayout());
        add(new RM_Esquerda(), BorderLayout.WEST);
        add(new RM_Direita(), BorderLayout.EAST);
        pack();
        show();
    }
}
