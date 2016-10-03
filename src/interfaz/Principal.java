/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier Tareas
 */
public class Principal extends javax.swing.JFrame {

    double n;
    int sw;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdOperacion, cmdLlenadoManual, cmdLlenadoAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumerodeFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumerodeColumnas = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Operaciones Matrices");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("No. de Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel2.add(txtNumerodeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel3.setText("No. de Columnas: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel2.add(txtNumerodeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 350, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 480, 60));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 360, 210));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Letra Ve", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 160, -1));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaInicial.setEnabled(false);
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 360, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        sw = 1;

        DefaultTableModel tm, tm2;

        if (txtNumerodeFilas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el numero de filas", "Error", 2);
            txtNumerodeFilas.requestFocusInWindow();
            sw = 0;
        } else if (txtNumerodeColumnas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el numero de columnas", "Error", 2);
            txtNumerodeColumnas.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                nf = Integer.parseInt(txtNumerodeFilas.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el numero de filas correctamente", "Error", 2);
                txtNumerodeFilas.requestFocusInWindow();
                txtNumerodeFilas.selectAll();
                sw = 0;
            }
            try {
                nc = Integer.parseInt(txtNumerodeColumnas.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese el numero de columnas correctamente", "Error", 2);
                txtNumerodeColumnas.requestFocusInWindow();
                txtNumerodeColumnas.selectAll();
                sw = 0;
            }
        }
        if (sw == 1) {

            nf = Integer.parseInt(txtNumerodeFilas.getText());
            nc = Integer.parseInt(txtNumerodeColumnas.getText());

            if (nf < 15 && nc < 15) {
                if (nc > 0 && nf > 0) {

                    tm = (DefaultTableModel) tblTablaInicial.getModel();
                    tm2 = (DefaultTableModel) tblTablaResultado.getModel();

                    tm.setRowCount(nf);
                    tm.setColumnCount(nc);

                    tm2.setRowCount(nf);
                    tm2.setColumnCount(nc);
                    JButton botonesH[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdLimpiar};
                    JButton botonesD[] = {cmdCrear, cmdOperacion};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                } else {
                    JOptionPane.showMessageDialog(this, "No se permiten valores negativos", "Error", 2);
                    txtNumerodeColumnas.setText("");
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdLimpiar, cmdOperacion};
                    Helper.deshabilitarBotones(botonesD);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ha excedido el limite de filas y columnas disponibles", "Error", 2);
                txtNumerodeColumnas.setText("");
                txtNumerodeFilas.requestFocusInWindow();
                txtNumerodeFilas.selectAll();
                JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdLimpiar, cmdOperacion};
                Helper.deshabilitarBotones(botonesD);
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc;
        double aux, res;

        boolean sw = true;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.recibirDatos(this, "Digite el elemento en la posición: [" + i + "][" + j + "]"));

                        tblTablaInicial.setValueAt((int) n, i, j);
                        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
                        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
                        Helper.habilitarBotones(botonesH);
                        Helper.deshabilitarBotones(botonesD);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        System.out.println(res);
                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            Helper.tablaPorDefecto(tblTablaInicial);
                            Helper.tablaPorDefecto(tblTablaResultado);
                            txtNumerodeFilas.setText("");
                            txtNumerodeColumnas.setText("");
                            JButton botonesH[] = {cmdCrear, cmdLimpiar};
                            JButton botonesD[] = {cmdOperacion, cmdLlenadoManual, cmdLlenadoAutomatico};
                            Helper.habilitarBotones(botonesH);
                            Helper.deshabilitarBotones(botonesD);
                        } else {
                            aux = 0;

                        }

                    }

                } while (aux == 0);

            }

        }
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, m;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                m = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(m, i, j);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op, nf, nc;
        sw = 1;

        op = cmbOperaciones.getSelectedIndex();
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();

        Helper.limpiarTabla(tblTablaResultado);

        switch (op) {
            case 0:
                if (nf%2 != 0 && nf > 4 && nc > 2) {

                    Helper.LetraB(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra B" + "\n" + "Asegurese de ingresar valores impares en el numero de filas", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }
                break;
            case 1:
                if (nf % 2 != 0 && nc == nf - (nf / 2) + 1 && nf > 4) {
                    Helper.LetraK(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Filas: Asegurese de ingresar valores impares mayores que 5"
                            + "\n" + "Columnas: A partir de 5 filas y 4 columnas, por cada numero impar que usted suba en filas, debe sumarle 1 al numero de columnas", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }
                break;
            case 2:
                if (nc%2 !=0 && nf >= nc && nf > 4 && nc > 4) {
                    Helper.LetraM(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra M" + "\n" 
                            + "Asegurese de ingresar valores impares en columnas menores o iguales que el numero de filas", "Error", 2);
                    txtNumerodeColumnas.requestFocusInWindow();
                    txtNumerodeColumnas.selectAll();
                    sw = 0;
                }

                break;
            case 3:
                if (nc%2 !=0 && nc > 4 || nf > 4) {
                    Helper.LetraW(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra W"+ "\n" 
                            + "Asegurese de ingresar valores impares en columnas", "Error", 2);
                    txtNumerodeColumnas.requestFocusInWindow();
                    txtNumerodeColumnas.selectAll();
                    sw = 0;
                }

                break;

            case 4:

                if (nf > 4 && nc > 3) {
                    Helper.letraQ(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Insuficientes filas y columnas para formar la letra Q", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
            case 5:
                if (nc == nf && nc > 2 && nf > 3) {
                    Helper.letraZ(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Insuficientes filas y columnas para formar la letra Z", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
            case 6:
                if (nc % 2 != 0 && nc > 2 && nf > 1) {
                    Helper.letraT(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra T"
                            + "\n" + "Asegurese de ingresar valores impares", "Error", 2);
                    txtNumerodeColumnas.requestFocusInWindow();
                    txtNumerodeColumnas.selectAll();
                    sw = 0;
                }

                break;

            case 7:

                if (nc == nf && nc % 2 != 0 && nf % 2 != 0 && nc > 2 && nf > 2) {
                    Helper.letraV(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra V"
                            + "\n" + "Asegurese de ingresar valores impares", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
            case 8:
                if (nf > 4 && nc > 1) {
                    Helper.letraE(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Insuficientes filas y columnas para formar la letra E", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
            case 9:

                if (nf > 4 && nc > 1) {
                    Helper.letraF(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Insuficientes filas y columnas para formar la letra F", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
            case 10:

                if (nc == nf && nf > 4 && nc > 4) {
                    Helper.letraP(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra P", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }
                break;
            case 11:

                if (nf > 1 && nc > 2) {
                    Helper.letraI(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Insuficientes filas y columnas para formar la letra I", "Error", 2);
                    txtNumerodeColumnas.requestFocusInWindow();
                    txtNumerodeColumnas.selectAll();
                    sw = 0;
                }

                break;
            case 12:

                if (nf == nc && nf > 2 && nc > 2) {
                    Helper.letraN(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra N", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
            case 13:
                //Corregir

                if (nf == nc && nf > 2 && nc > 2) {
                    Helper.letraY(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra Y", "Error", 2);
                    txtNumerodeColumnas.requestFocusInWindow();
                    txtNumerodeColumnas.selectAll();
                    sw = 0;
                }

                break;
            case 14:

                if (nf >= nc && nf > 2 && nc > 2) {
                    Helper.letraX(tblTablaInicial, tblTablaResultado);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrectas filas y columnas para formar la letra X"
                            + "\n" + "Asegurese de que el No. de filas sea mayor o igual al No. de columnas", "Error", 2);
                    txtNumerodeFilas.requestFocusInWindow();
                    txtNumerodeFilas.selectAll();
                    sw = 0;
                }

                break;
        }
        if (sw == 0) {
            JButton botonesH[] = {cmdCrear, cmdLimpiar};
            JButton botonesD[] = {cmdOperacion, cmdLlenadoAutomatico, cmdLlenadoManual};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        Helper.tablaPorDefecto(tblTablaInicial);
        Helper.tablaPorDefecto(tblTablaResultado);

        txtNumerodeFilas.setText("");
        txtNumerodeColumnas.setText("");
        txtNumerodeFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumerodeColumnas;
    private javax.swing.JTextField txtNumerodeFilas;
    // End of variables declaration//GEN-END:variables
}
