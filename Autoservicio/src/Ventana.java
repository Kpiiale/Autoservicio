import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTabbedPane tabbedPane1;
    private JPanel PanelPrincipal;
    private JSpinner spinner1;
    private JTextArea textArea1;
    private JButton realizarUnNuevoPedidoButton;
    private JTextArea Actualizarestado;
    private JButton actualizar;
    private JButton finalizarPedidoButton;

    ColaAutoservicio uwu=new ColaAutoservicio();
    public Ventana() {
        realizarUnNuevoPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer codigo=Integer.parseInt(spinner1.getValue().toString());
                String descrpcion=textArea1.getText();
             uwu.encolar(new Serivio(codigo,descrpcion));
             JOptionPane.showMessageDialog(null,"Auto añadido a la cola");
             Actualizarestado.setText(uwu.listafila());
             spinner1.setValue(0);
             textArea1.setText("");

            }
        });
        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    uwu.actualizar();
                    Actualizarestado.setText(uwu.listafila());
                }catch (Exception ec){
                    JOptionPane.showMessageDialog(null,ec.getMessage());
                }

            }
        });
        finalizarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    uwu.atender();
                    Actualizarestado.setText(uwu.listafila());
                }catch (Exception a){
                    JOptionPane.showMessageDialog(null,a.getMessage());
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
