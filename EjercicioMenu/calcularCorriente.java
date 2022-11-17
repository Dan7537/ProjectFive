/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package EjercicioMenu;

/**
 *
 * @author daniel
 */
public class calcularCorriente extends javax.swing.JInternalFrame {

    /**
     * Creates new form calcularCorriente
     */
    public calcularCorriente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textvolta = new javax.swing.JTextField();
        textresi = new javax.swing.JTextField();
        textcorri = new javax.swing.JTextField();
        buttonclcular = new javax.swing.JButton();
        buttonbrra = new javax.swing.JButton();
        buttonslir = new javax.swing.JButton();

        setTitle("Calcular Corriente");

        jLabel1.setText("Voltaje");

        jLabel2.setText("Resistencia");

        jLabel3.setText("Corriente");

        textvolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textvoltaActionPerformed(evt);
            }
        });

        buttonclcular.setText("Calcular");
        buttonclcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonclcularActionPerformed(evt);
            }
        });

        buttonbrra.setText("Borrar");
        buttonbrra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbrraActionPerformed(evt);
            }
        });

        buttonslir.setText("Salir");
        buttonslir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonslirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textvolta, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(textresi)
                    .addComponent(textcorri))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(buttonclcular)
                .addGap(33, 33, 33)
                .addComponent(buttonbrra)
                .addGap(29, 29, 29)
                .addComponent(buttonslir)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textvolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textcorri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonclcular)
                    .addComponent(buttonbrra)
                    .addComponent(buttonslir))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textvoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textvoltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textvoltaActionPerformed

    private void buttonclcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonclcularActionPerformed
        // TODO add your handling code here:
        double corriente,voltaje,resitencia;
        voltaje=Double.parseDouble(textvolta.getText());
        resitencia=Double.parseDouble( textresi.getText());
        corriente=Corriente.calcularCorriente(voltaje,resitencia);
        textcorri.setText(String.valueOf(corriente));
    }//GEN-LAST:event_buttonclcularActionPerformed

    private void buttonbrraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbrraActionPerformed
        // TODO add your handling code here:
        textcorri.setText("");
        textresi.setText("");
        textvolta.setText("");
    }//GEN-LAST:event_buttonbrraActionPerformed

    private void buttonslirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonslirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_buttonslirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonbrra;
    private javax.swing.JButton buttonclcular;
    private javax.swing.JButton buttonslir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textcorri;
    private javax.swing.JTextField textresi;
    private javax.swing.JTextField textvolta;
    // End of variables declaration//GEN-END:variables
}