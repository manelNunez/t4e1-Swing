package com.manufe;

import javax.swing.*;

public class view extends JFrame{
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JButton btnEntrar;
    private JPanel pnPrincipal;




    public view(){
        setContentPane(pnPrincipal);
        setTitle("ADT4 - Ejemplo");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        view pantalla = new view();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }

}
