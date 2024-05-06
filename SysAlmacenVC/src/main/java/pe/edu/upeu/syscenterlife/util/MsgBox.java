package pe.edu.upeu.syscenterlife.util;

import javax.swing.*;

/**
 * Clase Principal para manejo de alertas
 *
 * @see <br>
 * El constructor resive 3 parametros(mensaje, tipo_de_alerta,
 * icono_personalizado)
 * <h1>El parámetro tipoDialog tiene las siguientes opciones: JOptionPane</h1>
 *
 * <ol><li>WARNING_MESSAGE</li><li>ERROR_MESSAGE</li><li>PLAIN_MESSAGE</li><li>IN
 * FORMATION_MESSAGE</li>
 * <li>QUESTION_MESSAGE</li></ol>
 */
public class MsgBox {

    UtilsX obj = new UtilsX();
    JPanel p;
    ImageIcon icon = null;

    public MsgBox() {
    }

    public MsgBox(String msg, int tipoDialog, String iconPropio) {
        if (!iconPropio.trim().equals("")) {
            icon = new ImageIcon(obj.getFile(iconPropio));
            JOptionPane.showMessageDialog(p, msg, "JAAA", tipoDialog, icon);
        } else {
            JOptionPane.showMessageDialog(p, msg, "JAAA", tipoDialog);
        }
    }

    public static void main(String[] args) {
        MsgBox msgBox = new MsgBox("Mensaje", JOptionPane.ERROR_MESSAGE, "img/secrecy-icon.png");
        //Oe, suerte p. Ya fuera de bromas, mis mejores deseos y vibras a la distancia de 5 minutos, delumbra a todos con tu voz HONEY,
        //Sabes q tqm. ATTE. Tu mejor fan (En mi percepcíón de la realidad bien alterada eres la mejor cantante}
}
}