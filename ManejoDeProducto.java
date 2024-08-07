package com.mycompany.manejodeproducto;

/**
 *
 * @author Don Alejo
 */
public class ManejoDeProducto {

    public static void main(String[] args) {
        // Iniciar el formulario ManejoProductos
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManejoProductos().setVisible(true);
            }
        });
    }
}
