/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Mixto;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielDeJesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Mixto m3;
    public Principal() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdConvertirFraccionario.setEnabled(false);
        cmdBorrar.setEnabled(true);
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
        txtNumerador = new javax.swing.JTextField();
        txtDenominador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumeroEntero = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<String>();
        txtNumeroEntero1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNumerador1 = new javax.swing.JTextField();
        txtDenominador1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroEntero2 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        txtDenominador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNumerador3 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdConvertirFraccionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setText("Taller Objetos 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txtNumerador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 60, -1));

        txtDenominador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 10));

        txtNumeroEntero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroEnteroKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        txtNumeroEntero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEntero1ActionPerformed(evt);
            }
        });
        txtNumeroEntero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroEntero1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 60, 10));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 60, -1));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 60, -1));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        txtNumeroEntero2.setEditable(false);
        jPanel1.add(txtNumeroEntero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 60, -1));

        txtNumerador2.setEditable(false);
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 60, -1));

        txtDenominador2.setEditable(false);
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 60, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 60, 10));

        jLabel3.setText("Conversión a fraccionario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        txtNumerador3.setEditable(false);
        txtNumerador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 60, -1));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 60, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 60, 10));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        cmdConvertirFraccionario.setText("Convertir a Fraccionario");
        cmdConvertirFraccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirFraccionarioActionPerformed(evt);
            }
        });
        jPanel1.add(cmdConvertirFraccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(602, 315));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroEntero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEntero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroEntero1ActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, op1, n_Entero, n_Entero1, n_Entero2, n, n1, n2, d, d1, d2;
        Mixto m1, m2;
         
        if(txtNumeroEntero.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero entero del primer mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroEntero.requestFocusInWindow();
        }
        else if(txtNumeroEntero1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numero entero del segundo mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroEntero1.requestFocusInWindow();
        }
        else if(txtNumerador.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numerador del primer mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador.requestFocusInWindow();
        }
        else if(txtNumeroEntero1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el numerador del segundo mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroEntero1.requestFocusInWindow();
        }
        else if(txtDenominador.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el denominador del primer mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador.requestFocusInWindow();
        }
        else if(txtDenominador1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite el denominador del segundo mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
        }
        else if(Integer.parseInt(txtDenominador.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "No puede ser cero el denominador del primer mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador.requestFocusInWindow();
            txtDenominador.selectAll();
        }
        else if(Integer.parseInt(txtDenominador1.getText().trim())==0){
            JOptionPane.showMessageDialog(this, "No puede ser cero el denominador del segundo mixto", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            txtDenominador1.selectAll();
        }
        else{
            try{
            op = cmbOperacion.getSelectedIndex();
            n_Entero = Integer.parseInt(txtNumeroEntero.getText());
            n_Entero1 = Integer.parseInt(txtNumeroEntero1.getText());
            n = Integer.parseInt(txtNumerador.getText());
            n1 = Integer.parseInt(txtNumerador1.getText());
            d = Integer.parseInt(txtDenominador.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            
            m1 = new Mixto(n_Entero, n, d);
            m2 = new Mixto(n_Entero1, n1, d1);
            
            m3 = m1.operacion(m2, op);
            
            txtNumeroEntero2.setText(""+m3.getNumero_Entero());
            txtNumerador2.setText(""+m3.getNumerador());
            txtDenominador2.setText(""+m3.getDenominador());
            cmdCalcular.setEnabled(true);
            cmdConvertirFraccionario.setEnabled(true);
            cmdBorrar.setEnabled(true);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valo no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtDenominador.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtNumerador.setText("");
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtNumeroEntero.setText("");
        txtNumeroEntero1.setText("");
        txtNumeroEntero2.setText("");
        cmbOperacion.setSelectedIndex(0);
        txtNumeroEntero.requestFocusInWindow();
        cmdCalcular.setEnabled(true);
        cmdConvertirFraccionario.setEnabled(false);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumerador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador3ActionPerformed

    private void cmdConvertirFraccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirFraccionarioActionPerformed
        int num,den;
        Mixto m4=m3, m5=null;
        m5=m3.convertirFraccionario(m4);
        num = m5.getNumerador();
        den = m5.getDenominador();
        txtNumerador3.setText(""+num);
        txtDenominador3.setText(""+den);
        cmdCalcular.setEnabled(true);
        cmdConvertirFraccionario.setEnabled(true);
        cmdBorrar.setEnabled(true);
    }//GEN-LAST:event_cmdConvertirFraccionarioActionPerformed

    private void txtNumeroEnteroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroEnteroKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroEnteroKeyTyped

    private void txtNumeradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeradorKeyTyped

    private void txtDenominadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominadorKeyTyped

    private void txtNumeroEntero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroEntero1KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroEntero1KeyTyped

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador1KeyTyped

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
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdConvertirFraccionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominador;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtNumerador;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumeroEntero;
    private javax.swing.JTextField txtNumeroEntero1;
    private javax.swing.JTextField txtNumeroEntero2;
    // End of variables declaration//GEN-END:variables
}