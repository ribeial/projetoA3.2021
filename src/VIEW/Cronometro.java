package VIEW;

import static java.lang.Thread.sleep;

/**
 *
 * @author victo
 */
public class Cronometro extends javax.swing.JFrame {

    int miliseg = 0;
    int seg = 0;
    int min = 0;
    int hor = 0;
    boolean estado = true;
    String cpf;

    /**
     * Creates new form Cronometro
     */
    public Cronometro() {
        initComponents();
    }

    public Cronometro(String cpf) {
        initComponents();
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        jSeparator1 = new javax.swing.JSeparator();
        jButtonVoltar = new javax.swing.JButton();
        jLabelSaudeBem = new javax.swing.JLabel();
        jLabelHorMinSeg = new javax.swing.JLabel();
        jLabelMilesi = new javax.swing.JLabel();
        jToggleButtonParar = new javax.swing.JToggleButton();
        jToggleButtonZerar = new javax.swing.JToggleButton();
        jToggleButtonIniciar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronômetro ");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFocusable(false);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 620, 10);

        jButtonVoltar.setText("↩");
        jButtonVoltar.setBorderPainted(false);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVoltar);
        jButtonVoltar.setBounds(0, 0, 60, 40);

        jLabelSaudeBem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bem(redim).png"))); // NOI18N
        jPanel1.add(jLabelSaudeBem);
        jLabelSaudeBem.setBounds(350, 0, 250, 40);

        jLabelHorMinSeg.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelHorMinSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHorMinSeg.setText("00:00:00");
        jLabelHorMinSeg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelHorMinSeg);
        jLabelHorMinSeg.setBounds(100, 90, 290, 90);

        jLabelMilesi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMilesi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMilesi.setText("0000");
        jPanel1.add(jLabelMilesi);
        jLabelMilesi.setBounds(350, 120, 80, 40);

        jToggleButtonParar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButtonParar.setForeground(new java.awt.Color(255, 51, 51));
        jToggleButtonParar.setText("Parar");
        jToggleButtonParar.setFocusable(false);
        jToggleButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPararActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButtonParar);
        jToggleButtonParar.setBounds(230, 220, 110, 30);

        jToggleButtonZerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButtonZerar.setText("Zerar");
        jToggleButtonZerar.setFocusable(false);
        jToggleButtonZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonZerarActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButtonZerar);
        jToggleButtonZerar.setBounds(360, 220, 110, 30);

        jToggleButtonIniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButtonIniciar.setText("Iniciar");
        jToggleButtonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButtonIniciar.setFocusPainted(false);
        jToggleButtonIniciar.setFocusable(false);
        jToggleButtonIniciar.setOpaque(true);
        jToggleButtonIniciar.setVerifyInputWhenFocusTarget(false);
        jToggleButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButtonIniciar);
        jToggleButtonIniciar.setBounds(100, 220, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 320);

        setSize(new java.awt.Dimension(614, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Exercicios janelaExercicios = new Exercicios(this.cpf);
        janelaExercicios.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jToggleButtonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPararActionPerformed
        parar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPararActionPerformed

    private void jToggleButtonZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonZerarActionPerformed
        zerar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonZerarActionPerformed

    private void jToggleButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonIniciarActionPerformed
        iniciar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelHorMinSeg;
    private javax.swing.JLabel jLabelMilesi;
    private javax.swing.JLabel jLabelSaudeBem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButtonIniciar;
    private javax.swing.JToggleButton jToggleButtonParar;
    private javax.swing.JToggleButton jToggleButtonZerar;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        estado = true;
        Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (estado == true) {
                        try {
                            sleep(1, 1);
                            if (miliseg >= 1000) {
                                miliseg = 0;
                                seg++;
                            }
                            if (seg >= 60) {
                                miliseg = 00;
                                seg = 0;
                                min++;
                            }
                            if (min >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min = 0;
                                hor++;
                            }
                            jLabelHorMinSeg.setText(hor + " : " + min + " : " + seg + " : ");
                            jLabelMilesi.setText("" + miliseg);
                            miliseg++;
                        }
                        catch (InterruptedException e) {
                        }
                    }
                    else {
                        break;
                    }
                }
            }
        };
        hilo.start();
    }

    private void parar() {
        estado = false;
    }

    private void zerar() {
        estado = true;
        miliseg = 0;
        seg = 0;
        min = 0;
        hor = 0;
        jLabelHorMinSeg.setText("00" + ":" + "00" + ":" + "00");
        jLabelMilesi.setText("0000");
    }
}
