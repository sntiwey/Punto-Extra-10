package org.example.Controlador;

import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

public class ContorladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ContorladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() ==view.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icono = new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(view,"Hola desde el ejmplo", "Perosnalizado", JOptionPane.WARNING_MESSAGE, icono);
        }
        if (e.getSource() ==view.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(view, "Ejmplo de entrada", "Titulo personalizado", JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }
        if (e.getSource() ==view.getBtnOpcion()){
            //System.out.println("Opcion");
            int respuesta = JOptionPane.showConfirmDialog(view, "Estas seguro de que quieres borrar el registro?", "Confirmacion", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_NO_OPTION){
            view.getLblResultado().setText("Elejiste SI");
        }else {
            view.getLblResultado().setText("Elejiste NO");

        }
        }
    }
}
