/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_login;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout.Constraints;
import javax.swing.SwingConstants;

/**
 *
 * @author Usuario
 */
public class Gui_Login extends JFrame {

    public Gui_Login(String title) throws HeadlessException {
        super(title);
        //this.setBounds(400, 200, 400, 300);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //----------------------------Componetes----
        JLabel      jL_usuario        = new JLabel("Usuario: ");
        jL_usuario.setPreferredSize(new Dimension(100, 25));
        jL_usuario.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JTextField  jT_usuario        = new JTextField();
        jT_usuario.setPreferredSize(new Dimension(175, 25));
        jT_usuario.setHorizontalAlignment(SwingConstants.LEFT);
        //jT_usuario.setHorizontalAlignment());
       // jT_usuario.setHorizontalAlignement(SwingConstants.RIGHT); 
        JLabel      jL_contrasena     = new JLabel("Contraseña: ");
        jL_contrasena.setPreferredSize(new Dimension(100, 25));
        jL_contrasena.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JPasswordField  jT_contrasena = new JPasswordField();
        jT_contrasena.setPreferredSize(new Dimension(175, 25));
        jT_contrasena.setHorizontalAlignment(SwingConstants.LEFT);
         
        JButton     jB_aceptar         = new JButton("Aceptar");
        
        // Con FLOW....................
        this.setLayout(new FlowLayout());
        // Con GRID....................
        //this.setLayout(new GridLayout(0, 2, 15, 20));
        this.getContentPane().add(jL_usuario);
        this.getContentPane().add(jT_usuario);
        
        this.getContentPane().add(jL_contrasena);
        this.getContentPane().add(jT_contrasena);
        
        this.getContentPane().add(jB_aceptar);
       
        this.setVisible(true);
        this.pack();
        this.setBounds(400, 200, 325, 150);
        //this.setResizable(false);
    }
    

    public static void main(String[] args) {
        JFrame ventana= new Gui_Login("Login...");
       
    }
    
}
