package programaredes;

import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class interfaz extends javax.swing.JFrame {

    List<String> redes;
    List<String> ips;
    List<String> mask;
    DefaultListModel listaRedes;

    String red = "";
    String aux_1[] = {};
    String aux[] = {};
    int aux_2[] = new int[4];
    validar v = new validar();

    public interfaz() {
        initComponents();
        //centrar ventana
        setLocationRelativeTo(null);

        redes = new ArrayList<String>();
        ips = new ArrayList<String>();
        mask = new ArrayList<String>();

        listaRedes = new DefaultListModel();
        listRedes.setModel(listaRedes);
        v.validarNum(txtIp);
        v.validarNum(txtMascara);
        v.limitarCaracteres(txtIp,15);
        v.limitarCaracteres(txtMascara,15);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        txtMascara = new javax.swing.JTextField();
        bntAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listRedes = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("ip:");

        jLabel4.setText("Mascara:");

        bntAgregar.setText("Agregar");
        bntAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(bntAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntAgregar))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(listRedes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarActionPerformed

        if (txtIp.getText().isEmpty() || txtIp.getText().length()<11 || txtMascara.getText().isEmpty() || txtMascara.getText().length()<13 ) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            int respuesta = 0;
            respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
            if (respuesta == 0) {
                agregarIps(txtIp.getText(), txtMascara.getText());
            }
        }


    }//GEN-LAST:event_bntAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);

            }
        });
    }

    private void agregarIps(String ip, String mascara) {
        aux = ip.split("\\.");
        aux_1 = mascara.split("\\.");
        if (aux.length == 4 && aux_1.length == 4) {
            obtenerRed(aux, aux_1);
            JOptionPane.showMessageDialog(null, "Operacion realizada correctamente!");
            //listaRedes.removeAllElements();
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar ip o mascara de red");
            txtIp.setText("");
            txtMascara.setText("");
        }

    }

    private void obtenerRed(String[] _ips, String[] mascara) {

        for (int i = 0; i < 4; i++) {
            aux_2[i] = Integer.parseInt(_ips[i]) & Integer.parseInt(mascara[i]);
            if (i != 3) {
                red += aux_2[i] + ".";
            } else {
                red += aux_2[i];
            }
        }
        System.out.println("Red -> " + red);

        if (!redes.contains(red)) {
            redes.add(red);
            listaRedes.addElement("Red " + red);
            listaRedes.addElement("Ip " + txtIp.getText() + " Mascara: " + txtMascara.getText());

            System.out.println("Tam: " + redes.size());
            red = "";
        } else {

            System.out.println("Ya esta dentro");
            red = "";
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgregar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listRedes;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtMascara;
    // End of variables declaration//GEN-END:variables

    private validar validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
