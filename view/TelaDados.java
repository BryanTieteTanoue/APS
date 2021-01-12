/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Informacoes;
import controller.Controller;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;

public class TelaDados extends javax.swing.JFrame {

    /**
     * Creates new form TelaDados
     */
    private SimpleDateFormat sdf;
    private Controller cont;
    
    public TelaDados() {
        this(new Controller());
    }
    
    public TelaDados(Controller cont2) {
        initComponents();
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        cont = cont2;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbInsiraDados = new javax.swing.JLabel();
        lbBioma = new javax.swing.JLabel();
        lbSatelite = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        ftfData = new javax.swing.JFormattedTextField();
        gravaInfo = new javax.swing.JButton();
        lbPais = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        cbBioma = new javax.swing.JComboBox<>();
        tfPrecipitacao = new javax.swing.JTextField();
        tfMunicipio = new javax.swing.JTextField();
        tfLatitude = new javax.swing.JTextField();
        tfRiscoFogo = new javax.swing.JTextField();
        tfdiasSemChuva = new javax.swing.JTextField();
        tfLongitude = new javax.swing.JTextField();
        lbBioma3 = new javax.swing.JLabel();
        lbBioma1 = new javax.swing.JLabel();
        lbBioma2 = new javax.swing.JLabel();
        lbBioma4 = new javax.swing.JLabel();
        lbBioma5 = new javax.swing.JLabel();
        lbBioma6 = new javax.swing.JLabel();
        lbData1 = new javax.swing.JLabel();
        ftfHora = new javax.swing.JFormattedTextField();
        btnAdicionar1 = new javax.swing.JButton();
        cbSatelite = new javax.swing.JComboBox<>();
        lbEstado = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 129, 112));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 20));

        jPanel2.setBackground(new java.awt.Color(177, 222, 202));

        lbInsiraDados.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbInsiraDados.setForeground(new java.awt.Color(102, 102, 102));
        lbInsiraDados.setText("Insira os Dados");

        lbBioma.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma.setText("Bioma:");

        lbSatelite.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbSatelite.setForeground(new java.awt.Color(102, 102, 102));
        lbSatelite.setText("Satélite:");

        lbData.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbData.setForeground(new java.awt.Color(102, 102, 102));
        lbData.setText("Data:");

        ftfData.setForeground(new java.awt.Color(91, 129, 112));
        try {
            ftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gravaInfo.setBackground(new java.awt.Color(91, 129, 112));
        gravaInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gravaInfo.setForeground(new java.awt.Color(255, 255, 255));
        gravaInfo.setText("ADICIONAR");
        gravaInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gravaInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gravaInfoMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gravaInfoMouseEntered(evt);
            }
        });
        gravaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravaInfoActionPerformed(evt);
            }
        });

        lbPais.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbPais.setForeground(new java.awt.Color(102, 102, 102));
        lbPais.setText("País:");

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Bolívia", "Brasil", "Chile", "Colômbia", "Equador", "Guiana", "Paraguai", "Peru", "Suriname", "Uruguai", "Venezuela" }));

        cbBioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazônia", "Cerrado", "Caatinga", "Mata Atlântica", "Pantanal", "Pampa" }));
        cbBioma.setName(""); // NOI18N

        lbBioma3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma3.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma3.setText("Risco de Fogo:");

        lbBioma1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma1.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma1.setText("Dias sem chuva:");

        lbBioma2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma2.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma2.setText("Longitude:");

        lbBioma4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma4.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma4.setText("Latitude:");

        lbBioma5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma5.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma5.setText("Munícipio:");

        lbBioma6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbBioma6.setForeground(new java.awt.Color(102, 102, 102));
        lbBioma6.setText("Precipitação");

        lbData1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbData1.setForeground(new java.awt.Color(102, 102, 102));
        lbData1.setText("Hora:");

        ftfHora.setForeground(new java.awt.Color(91, 129, 112));
        try {
            ftfHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAdicionar1.setBackground(new java.awt.Color(91, 129, 112));
        btnAdicionar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdicionar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar1.setText("UPLOAD  .CSV");
        btnAdicionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionar1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionar1MouseEntered(evt);
            }
        });
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        cbSatelite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOES-16", "METOP-P" }));

        lbEstado.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(102, 102, 102));
        lbEstado.setText("Estado:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(25)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(cbSatelite, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbSatelite))
        					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(lbBioma5)
        									.addGap(48))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(tfMunicipio, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        									.addGap(33)))
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lbEstado)))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lbBioma4)
        								.addComponent(tfLatitude, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        							.addGap(33)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lbBioma2)
        								.addComponent(tfLongitude, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))))
        					.addGap(55))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbPais)
        						.addComponent(cbPais, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbBioma)
        						.addComponent(cbBioma, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
        					.addGap(51)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(tfPrecipitacao, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lbBioma6))
        					.addGap(33)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbBioma3)
        						.addComponent(tfRiscoFogo, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        					.addContainerGap(37, Short.MAX_VALUE))))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(128, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbInsiraDados)
        					.addGap(132))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(btnAdicionar1)
        							.addGap(71)
        							.addComponent(gravaInfo, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(ftfData, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(lbData)
        									.addGap(82)))
        							.addGap(72)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(ftfHora, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        									.addGroup(jPanel2Layout.createSequentialGroup()
        										.addComponent(lbData1)
        										.addGap(82)))
        								.addComponent(lbBioma1))))
        					.addGap(98))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(tfdiasSemChuva, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        					.addGap(116))))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lbInsiraDados)
        			.addGap(10)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbBioma)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbBioma, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(lbBioma3)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tfRiscoFogo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel2Layout.createSequentialGroup()
        						.addComponent(lbBioma6)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(tfPrecipitacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbBioma5)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(tfMunicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbPais)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbPais, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbEstado)
        					.addGap(6)
        					.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(23)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lbBioma2)
        						.addComponent(lbBioma4))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tfLongitude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(tfLatitude, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbSatelite)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(cbSatelite, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
        			.addGap(34)
        			.addComponent(lbBioma1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tfdiasSemChuva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbData)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(ftfData, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(lbData1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(ftfHora, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
        			.addGap(59)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(gravaInfo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnAdicionar1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addGap(26))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(22))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(22, Short.MAX_VALUE))
        );
        btnEstatisticas = new javax.swing.JButton();
        
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
                btnOrganizar = new javax.swing.JButton();
                
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
                        FlowLayout fl_jPanel1 = new FlowLayout(FlowLayout.CENTER, 50, 0);
                        jPanel1.setLayout(fl_jPanel1);
                        jPanel1.add(btnOrganizar);
                jPanel1.add(btnEstatisticas);
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrganizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrganizarMouseExited
        btnOrganizar.setBackground(new Color(235, 235, 235));
        btnOrganizar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnOrganizarMouseExited

    private void btnOrganizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrganizarMouseEntered
        btnOrganizar.setBackground(new Color(235, 235, 235));
        btnOrganizar.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnOrganizarMouseEntered

    private void btnEstatisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticasMouseExited
        btnEstatisticas.setBackground(new Color(235, 235, 235));
        btnEstatisticas.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEstatisticasMouseExited

    private void btnEstatisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticasMouseEntered
        btnEstatisticas.setBackground(new Color(235, 235, 235));
        btnEstatisticas.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_btnEstatisticasMouseEntered

    private void btnEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatisticasActionPerformed
    	new TelaEstatisticas(cont,0, 0).setVisible(true);
    	dispose();
    }//GEN-LAST:event_btnEstatisticasActionPerformed

    
    
    
    private void gravaInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gravaInfoMouseExited
        gravaInfo.setBackground(new Color(91, 129, 112));
        gravaInfo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_gravaInfoMouseExited

    private void gravaInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gravaInfoMouseEntered
        gravaInfo.setBackground(new Color(235, 235, 235));
        gravaInfo.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_gravaInfoMouseEntered

    private void gravaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravaInfoActionPerformed
        try {
            gravaInfo();
            cont = new Controller();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio, preencha todos.");
    }//GEN-LAST:event_gravaInfoActionPerformed
    }
    private void btnOrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizarActionPerformed
        new TelaOrganizar(cont).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOrganizarActionPerformed

    private void btnAdicionar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionar1MouseExited

    private void btnAdicionar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionar1MouseEntered

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
    	new TelaDados(new Controller(true)).setVisible(true);
    	JOptionPane.showMessageDialog(null, "Importado com sucesso!");
    	dispose();
    	// TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnEstatisticas;
    private javax.swing.JButton btnOrganizar;
    private javax.swing.JComboBox<String> cbBioma;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JComboBox<String> cbSatelite;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JFormattedTextField ftfHora;
    private javax.swing.JButton gravaInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBioma;
    private javax.swing.JLabel lbBioma1;
    private javax.swing.JLabel lbBioma2;
    private javax.swing.JLabel lbBioma3;
    private javax.swing.JLabel lbBioma4;
    private javax.swing.JLabel lbBioma5;
    private javax.swing.JLabel lbBioma6;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbData1;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbInsiraDados;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbSatelite;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfLatitude;
    private javax.swing.JTextField tfLongitude;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfPrecipitacao;
    private javax.swing.JTextField tfRiscoFogo;
    private javax.swing.JTextField tfdiasSemChuva;
    // End of variables declaration//GEN-END:variables

    private void gravaInfo() {
        String hora = ftfHora.getText();
        String data = ftfData.getText();
        data = data + " " + hora;
        Date datahora = null;
        
        try {
            datahora = sdf.parse(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data e hora incorreta.");
        }
        String satelite = cbSatelite.getSelectedItem().toString();
        String pais = cbPais.getSelectedItem().toString();
        String estado = tfEstado.getText();
        String municipio = tfMunicipio.getText();
        String bioma = cbBioma.getSelectedItem().toString();
        int diasSemChuva = Integer.valueOf(tfdiasSemChuva.getText());
        double precipitacao = Double.valueOf(tfPrecipitacao.getText());
        double riscoFogo = Double.valueOf(tfRiscoFogo.getText());
        double latitude = Double.valueOf(tfLatitude.getText());
        double longitude = Double.valueOf(tfLongitude.getText());
        
        Informacoes info = new Informacoes(datahora, satelite, pais, estado, 
                municipio, bioma, diasSemChuva, precipitacao, 
                riscoFogo, latitude, longitude);
        JOptionPane.showMessageDialog(null,"Informações adicionadas." + info);
        cont.inserirInformacao(info);
        
    }
}
