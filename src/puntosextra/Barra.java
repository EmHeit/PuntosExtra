package puntosextra;

import javax.swing.JButton;
import javax.swing.JProgressBar;

public class Barra extends Thread {

    private JProgressBar barra;
    private JButton boton;

    @Override
    public void run(){
        int cantidadTorneos = 1;

        int progresoPorTorneo = 100 / cantidadTorneos;

        for (int i = 0; i < cantidadTorneos; i++) {

            int progresoActual = (i + 1) * progresoPorTorneo;
            barra.setValue(progresoActual);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        barra.setValue(100);    
    }

}
