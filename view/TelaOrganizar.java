/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import controller.Controller;


/**
 *
 * @author Leonardo Leal
 */
public class TelaOrganizar extends javax.swing.JFrame {

    /**
     * Creates new form TelaOrganizar
     */
    private Controller cont;
    public TelaOrganizar() {
        initComponents();
    }

    public TelaOrganizar(Controller cont2) {
        initComponents();
        cont = cont2;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
 
        jPanel1 = new javax.swing.JPanel();
        btnEstatisticas = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnBiomas = new javax.swing.JPanel();
        jCresc = new javax.swing.JCheckBox();
        jDecre = new javax.swing.JCheckBox();
        lbOrganizar = new javax.swing.JLabel();
        lbMetodo = new javax.swing.JLabel();
        lbOrganizarPor = new javax.swing.JLabel();
        cbSort = new javax.swing.JComboBox<>();
        lbOrdem = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cbBioma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 129, 112));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 20));

        btnEstatisticas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEstatisticas.setForeground(new java.awt.Color(255, 255, 255));
        btnEstatisticas.setText("VISUALIZAR");
        btnEstatisticas.setContentAreaFilled(false);
        btnEstatisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstatisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstatisticasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstatisticasMouseEntered(evt);
            }
        });
        btnEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstatisticasActionPerformed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("INSERIR");
        btnInserir.setContentAreaFilled(false);
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInserirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInserirMouseEntered(evt);
            }
        });
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstatisticas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstatisticas)
                    .addComponent(btnInserir))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(177, 222, 202));

        jCresc.setText("Crescente");
        jCresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrescActionPerformed(evt);
            }
        });

        jDecre.setText("Decrescente");
        jDecre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDecreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBiomasLayout = new javax.swing.GroupLayout(pnBiomas);
        pnBiomas.setLayout(pnBiomasLayout);
        pnBiomasLayout.setHorizontalGroup(
            pnBiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCresc)
                    .addComponent(jDecre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBiomasLayout.setVerticalGroup(
            pnBiomasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBiomasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCresc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDecre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbOrganizar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbOrganizar.setForeground(new java.awt.Color(102, 102, 102));
        lbOrganizar.setText("Organizar");

        lbMetodo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbMetodo.setForeground(new java.awt.Color(102, 102, 102));
        lbMetodo.setText("Método:");

        lbOrganizarPor.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbOrganizarPor.setForeground(new java.awt.Color(102, 102, 102));
        lbOrganizarPor.setText("Organizar por:");

        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Insertion Sort", "Quick Sort" }));
        cbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortActionPerformed(evt);
            }
        });

        lbOrdem.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbOrdem.setForeground(new java.awt.Color(102, 102, 102));
        lbOrdem.setText("Ordem:");

        btnBuscar.setBackground(new java.awt.Color(91, 129, 112));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("ORGANIZAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbBioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data", "Satelite", "Pais", "Estado", "Municipio", "Bioma", "Dias sem chuva", "Precipitação", "Risco de Fogo", "Longitude", "Latitude" }));
        cbBioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBiomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbMetodo)
                                .addGap(266, 266, 266))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbOrganizarPor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cbBioma, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbOrdem)
                            .addComponent(pnBiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbOrganizar)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbOrganizar)
                .addGap(18, 18, 18)
                .addComponent(lbMetodo)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lbOrganizarPor)
                        .addGap(7, 7, 7)
                        .addComponent(cbBioma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbOrdem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnBiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(91, 129, 112));
        /* Quando o mouse estiver em cima troca a cor */
        btnBuscar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(235, 235, 235));
        /* Quando o mouse estiver em cima troca a cor */
        btnBuscar.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        long tempo = 0;
        int ordenacao, ordernarpor, crescoudecresc;
         
        ordenacao =   cbSort.getSelectedIndex();
        ordernarpor = cbBioma.getSelectedIndex()+1;
        crescoudecresc = returnOrdem();
        
//        if (jCresc.isEnabled()) {
//            crescoudecresc = 1;
//        } else {
//            crescoudecresc = 2;
//        }
        System.out.println(ordenacao + "+" + ordernarpor + "+" + crescoudecresc);
        tempo = cont.ordenacao (ordenacao, ordernarpor, crescoudecresc);
        System.out.println("Tempo = " + tempo);
        
        new TelaEstatisticas(cont, tempo, ordenacao).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnBuscarActionPerformed
    public int returnOrdem() {
        if        (jCresc.isSelected() == true) {
            return 1;
        } else if (jDecre.isSelected() == true) {
            return 2;
        }
        return 1;
    }
    public int returnMetodo() {
        if        (cbSort.getSelectedItem() == "Selection Sort") {
            return 1;
        } else if (cbSort.getSelectedItem() == "Insertion Sort") {
            return 2;
        } else if (cbSort.getSelectedItem() == "Quick Sort") {
            return 3;
        }
        return 1;
    }
    
    private void btnEstatisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticasMouseExited
        btnEstatisticas.setBackground(new Color(235, 235, 235));
        /* Quando o mouse estiver em cima troca a cor */
        btnEstatisticas.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEstatisticasMouseExited

    private void btnEstatisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticasMouseEntered
        btnEstatisticas.setBackground(new Color(235, 235, 235));
        /* Quando o mouse estiver em cima troca a cor */
        btnEstatisticas.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnEstatisticasMouseEntered

    private void btnEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatisticasActionPerformed
        new TelaEstatisticas(cont,0, 0).setVisible(true);
        dispose();
        /* Abrir tela de Estatisticas */
    }//GEN-LAST:event_btnEstatisticasActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed

    }//GEN-LAST:event_cbSortActionPerformed

    private void jCrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrescActionPerformed
        jDecre.setSelected(false);
    }//GEN-LAST:event_jCrescActionPerformed

    private void jDecreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDecreActionPerformed
        jCresc.setSelected(false);
    }//GEN-LAST:event_jDecreActionPerformed

    private void cbBiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBiomaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        new TelaDados(cont).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnInserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseEntered
        btnInserir.setBackground(new Color(235, 235, 235));
        /* Quando o mouse estiver em cima troca a cor */
        btnInserir.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnInserirMouseEntered

    private void btnInserirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseExited
        btnInserir.setBackground(new Color(235, 235, 235));
        /* Quando o mouse estiver em cima troca a cor */
        btnInserir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnInserirMouseExited

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
            java.util.logging.Logger.getLogger(TelaOrganizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrganizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrganizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrganizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrganizar().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEstatisticas;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbBioma;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JCheckBox jCresc;
    private javax.swing.JCheckBox jDecre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMetodo;
    private javax.swing.JLabel lbOrdem;
    private javax.swing.JLabel lbOrganizar;
    private javax.swing.JLabel lbOrganizarPor;
    private javax.swing.JPanel pnBiomas;
    // End of variables declaration//GEN-END:variables
}
