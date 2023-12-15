package puntosextra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class Archivos {

    public Archivos() {
    }
    
    
    public static void Guardar(JTree arbol, JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(arbol.getModel());
                JOptionPane.showMessageDialog(null, "Los datos se han guardado exitosamente");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
            }
        }
    }
    
    public static void Cargar(JTree arbol, JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                DefaultTreeModel treeModel = (DefaultTreeModel) ois.readObject();
                arbol.setModel(treeModel);

                JOptionPane.showMessageDialog(frame, "Ya esta cargada los datos");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error al cargar los datos");
            }
        }
    }    
}
