package view;

import controller.Controller;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Informacoes;
import view.TelaOrganizar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.FlowLayout;


public class TelaEstatisticas extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstatistica
     */
    private Controller cont;
    private long tempo;

    public TelaEstatisticas() {
        initComponents();
    }

    public TelaEstatisticas(Controller cont2, long t, int metodo) {
        initComponents();
        cont = cont2;
        tempo = t;

        lbTempo.setText(tempo + "ms");

        ArrayList< Informacoes> lista = null;
        	switch (metodo) {
			case 0:
				lista = cont.getListaSelection();
				break;
			case 1:
				lista = cont.getListaInsertion();
				break;
			case 2:
				lista = cont.getListaQuick();
				break;
			}
            DefaultTableModel model = (DefaultTableModel) jPlanilha.getModel();
            model.setNumRows(0);

            for (int i = 0; i < lista.size(); i++) {

                Informacoes info = lista.get(i);
                model.addRow(new Object[]{
                    info.getData(),
                    info.getSatelite(),
                    info.getPais(),
                    info.getEstado(),
                    info.getMunicipio(),
                    info.getBioma(),
                    info.getDiasSemChuva(),
                    info.getPrecipitacao(),
                    info.getRiscoFogo(),
                    info.getLatitude(),
                    info.getLongitude()});

            }

     

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbEstatisticas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPlanilha = new javax.swing.JTable();
        lbTempoGasto = new javax.swing.JLabel();
        lbTempo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrganizar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(177, 222, 202));

        lbEstatisticas.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbEstatisticas.setForeground(new java.awt.Color(102, 102, 102));
        lbEstatisticas.setText("Estatisticas");

        jPlanilha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Satelite", "País", "Estado", "Munícipio", "Bioma", "Dias sem chuva", "Precipitação", "Risco de fogo", "Latitude", "Longitude"
            }
        ));
        jScrollPane1.setViewportView(jPlanilha);

        lbTempoGasto.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbTempoGasto.setForeground(new java.awt.Color(102, 102, 102));
        lbTempoGasto.setText("Tempo gasto:");

        lbTempo.setText("0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(530, Short.MAX_VALUE)
                .addComponent(lbEstatisticas)
                .addGap(505, 505, 505))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(544, 544, 544)
                        .addComponent(lbTempoGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTempo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbEstatisticas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTempoGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTempo))
                .addGap(76, 76, 76))
        );

        jPanel3.setBackground(new java.awt.Color(91, 129, 112));
        jPanel3.setPreferredSize(new java.awt.Dimension(410, 20));

        btnOrganizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnOrganizar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrganizar.setText("ORGANIZAR");
        btnOrganizar.setContentAreaFilled(false);
        btnOrganizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrganizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrganizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrganizarMouseEntered(evt);
            }
        });
        btnOrganizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(17)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 655, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 0));
        jPanel3.add(btnInserir);
        jPanel3.add(btnOrganizar);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrganizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrganizarMouseExited
        btnOrganizar.setBackground(new Color(235, 235, 235));
        btnOrganizar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnOrganizarMouseExited

    private void btnOrganizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrganizarMouseEntered
        btnOrganizar.setBackground(new Color(235, 235, 235));
        btnOrganizar.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnOrganizarMouseEntered

    private void btnInserirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseExited
        btnInserir.setBackground(new Color(235, 235, 235));
        btnInserir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnInserirMouseExited

    private void btnInserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseEntered
        btnInserir.setBackground(new Color(235, 235, 235));
        btnInserir.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnInserirMouseEntered

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        new TelaDados(cont).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnOrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizarActionPerformed
        new TelaOrganizar(cont).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOrganizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstatisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstatisticas().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnOrganizar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jPlanilha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEstatisticas;
    private javax.swing.JLabel lbTempo;
    private javax.swing.JLabel lbTempoGasto;
    // End of variables declaration                   
}
