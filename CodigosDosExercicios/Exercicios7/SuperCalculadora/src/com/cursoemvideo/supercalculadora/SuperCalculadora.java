/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cursoemvideo.supercalculadora;

/**
 *
 * @author Felipe Dantas
 */
public class SuperCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form SuperCalculadora
     */
    public SuperCalculadora() {
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

        lblTextoInforme = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtNumero = new javax.swing.JSpinner();
        lblTextoCubo = new javax.swing.JLabel();
        lblTextoRaizQuadrada = new javax.swing.JLabel();
        lblTextoRaizCubica = new javax.swing.JLabel();
        lblTextoValorAbsoluto = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaizQuadrada = new javax.swing.JLabel();
        lblRaizCubica = new javax.swing.JLabel();
        lblValorAbsoluto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTextoResto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTextoInforme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoInforme.setText("Informe um valor: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Super Calculadora");

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/operadores-aritmeticos50x50.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumero.setModel(new javax.swing.SpinnerNumberModel());

        lblTextoCubo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoCubo.setText("Elevado ao Cubo");

        lblTextoRaizQuadrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoRaizQuadrada.setText("Raiz Quadrada");

        lblTextoRaizCubica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoRaizCubica.setText("Raiz Cúbica");

        lblTextoValorAbsoluto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoValorAbsoluto.setText("Valor Absoluto");

        lblResto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResto.setForeground(new java.awt.Color(0, 0, 255));
        lblResto.setText("0");

        lblCubo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCubo.setForeground(new java.awt.Color(0, 0, 255));
        lblCubo.setText("0");

        lblRaizQuadrada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRaizQuadrada.setForeground(new java.awt.Color(0, 0, 255));
        lblRaizQuadrada.setText("0");

        lblRaizCubica.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRaizCubica.setForeground(new java.awt.Color(0, 0, 255));
        lblRaizCubica.setText("0");

        lblValorAbsoluto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValorAbsoluto.setForeground(new java.awt.Color(0, 0, 255));
        lblValorAbsoluto.setText("0");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora-pexels-karolina-grabowska-5412200-320x316.jpg"))); // NOI18N

        lblTextoResto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTextoResto.setText("Resto da divisão por 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTextoInforme)
                        .addGap(70, 70, 70)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTextoRaizQuadrada)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTextoRaizCubica)
                                                    .addComponent(lblTextoValorAbsoluto))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblValorAbsoluto, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblRaizCubica, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTextoCubo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblRaizQuadrada)
                                            .addComponent(lblCubo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblResto)))
                                .addGap(103, 103, 103))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTextoResto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(lblTextoInforme)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(lblTextoResto)
                        .addGap(17, 17, 17)
                        .addComponent(lblResto)
                        .addGap(1, 1, 1)
                        .addComponent(lblTextoCubo)
                        .addGap(12, 12, 12)
                        .addComponent(lblCubo)
                        .addGap(7, 7, 7)
                        .addComponent(lblTextoRaizQuadrada)
                        .addGap(10, 10, 10)
                        .addComponent(lblRaizQuadrada)
                        .addGap(4, 4, 4)
                        .addComponent(lblTextoRaizCubica)
                        .addGap(8, 8, 8)
                        .addComponent(lblRaizCubica)
                        .addGap(7, 7, 7)
                        .addComponent(lblTextoValorAbsoluto)
                        .addGap(7, 7, 7)
                        .addComponent(lblValorAbsoluto)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
    
        // pegar o valor do spinner
        int numero = Integer.parseInt(txtNumero.getValue().toString());
        
        // realizar os calculos
        // resto
        int resto = numero % 2;
        
        //cubo do valor
        double cubo = Math.pow(numero, 3);
        
        //raiz quadrada
        double raizq = Math.sqrt(numero);
        
        //raiz cúbica
        double raizc = Math.cbrt(numero);
        
        //valor absoluto
        int valorAbsoluto = Math.abs(numero);
        
        //mostrar valores
        lblTextoResto.setVisible(true);
        lblResto.setVisible(true);
        lblResto.setText(Integer.toString(resto));
        
        lblTextoCubo.setVisible(true);
        lblCubo.setVisible(true);
        lblCubo.setText(Double.toString(cubo));
        
        lblTextoRaizQuadrada.setVisible(true);
        lblRaizQuadrada.setVisible(true);
        lblRaizQuadrada.setText(Double.toString(raizq));
        
        lblTextoRaizCubica.setVisible(true);
        lblRaizCubica.setVisible(true);
        lblRaizCubica.setText(Double.toString(raizc));
        
        lblTextoValorAbsoluto.setVisible(true);
        lblValorAbsoluto.setVisible(true);
        lblValorAbsoluto.setText(Integer.toString(valorAbsoluto));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Escondendo os labels
        /*
        lblResto.setVisible(false);
        lblTextoResto.setVisible(false);
        
        lblCubo.setVisible(false);
        lblTextoCubo.setVisible(false);
        
        lblRaizQuadrada.setVisible(false);
        lblTextoRaizQuadrada.setVisible(false);
        
        lblRaizCubica.setVisible(false);
        lblTextoRaizCubica.setVisible(false);
        
        lblValorAbsoluto.setVisible(false);
        lblTextoValorAbsoluto.setVisible(false);
        */
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Escondendo os labels
        lblResto.setVisible(false);
        lblTextoResto.setVisible(false);
        
        lblCubo.setVisible(false);
        lblTextoCubo.setVisible(false);
        
        lblRaizQuadrada.setVisible(false);
        lblTextoRaizQuadrada.setVisible(false);
        
        lblRaizCubica.setVisible(false);
        lblTextoRaizCubica.setVisible(false);
        
        lblValorAbsoluto.setVisible(false);
        lblTextoValorAbsoluto.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblRaizCubica;
    private javax.swing.JLabel lblRaizQuadrada;
    private javax.swing.JLabel lblResto;
    private javax.swing.JLabel lblTextoCubo;
    private javax.swing.JLabel lblTextoInforme;
    private javax.swing.JLabel lblTextoRaizCubica;
    private javax.swing.JLabel lblTextoRaizQuadrada;
    private javax.swing.JLabel lblTextoResto;
    private javax.swing.JLabel lblTextoValorAbsoluto;
    private javax.swing.JLabel lblValorAbsoluto;
    private javax.swing.JSpinner txtNumero;
    // End of variables declaration//GEN-END:variables
}
