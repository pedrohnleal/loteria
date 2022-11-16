import java.util.Arrays;
import java.util.Random;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLoteria = new javax.swing.ButtonGroup();
        jrbMegaSena = new javax.swing.JRadioButton();
        jrbQuina = new javax.swing.JRadioButton();
        jrbLotofacil = new javax.swing.JRadioButton();
        jbSortear = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jrbLotomania = new javax.swing.JRadioButton();
        jrbDuplaSena = new javax.swing.JRadioButton();
        jrbDiaDeSorte = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlSorteados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loterias");
        setFocusCycleRoot(false);
        setResizable(false);

        bgLoteria.add(jrbMegaSena);
        jrbMegaSena.setText("MEGA-SENA");

        bgLoteria.add(jrbQuina);
        jrbQuina.setText("QUINA");

        bgLoteria.add(jrbLotofacil);
        jrbLotofacil.setText("LOTOFÁCIL");
        jrbLotofacil.setToolTipText("");

        jbSortear.setText("SORTEAR");
        jbSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSortearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NÚMEROS SORTEADOS");

        bgLoteria.add(jrbLotomania);
        jrbLotomania.setText("LOTOMANIA");

        bgLoteria.add(jrbDuplaSena);
        jrbDuplaSena.setText("DUPLA SENA");

        bgLoteria.add(jrbDiaDeSorte);
        jrbDiaDeSorte.setText("DIA DE SORTE");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quina.PNG"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lotofacil.PNG"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mega-sena.PNG"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lotomania.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dupla-sena.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dia-de-sorte.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbDiaDeSorte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbLotomania)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbDuplaSena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbMegaSena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbLotofacil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbQuina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSortear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jlSorteados))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbDiaDeSorte)
                                .addComponent(jLabel13))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbDuplaSena)
                                .addComponent(jLabel12))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbLotofacil)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbMegaSena)
                                .addComponent(jLabel10))
                            .addComponent(jrbQuina)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jrbLotomania)
                                    .addComponent(jLabel11))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSortear)
                        .addGap(46, 46, 46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSorteados)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSortearActionPerformed
        Random gerador = new Random();
        int num, i, j;
        int[] diaDeSorte = new int[7];
        int[] duplaSena = new int[6];
        int[] lotofacil = new int[15];
        int[] lotomania = new int[20];
        int[] mega = new int[6];
        int[] quina = new int[5];   

        if(jrbDiaDeSorte.isSelected()) {
            for(i=0; i<diaDeSorte.length; i++) {
                num = gerador.nextInt(31) + 1;
                for(j=0; j<diaDeSorte.length; j++) {
                    if(num == diaDeSorte[j] && j != i) {
                        num = gerador.nextInt(31) + 1;
                    } else {
                        diaDeSorte[i] = num;
                    }
                }
            }
        
            for(i=0; i<diaDeSorte.length; i++) {
                for(j=i+1; j<diaDeSorte.length; j++) {
                    if(diaDeSorte[i] > diaDeSorte[j]) {
                        num = diaDeSorte[i];
                        diaDeSorte[i] = diaDeSorte[j];
                        diaDeSorte[j] = num;
                    }  
                }
            }
        
            for(i=0; i<diaDeSorte.length; i++) {
                jlSorteados.setText(Arrays.toString(diaDeSorte));
            }
        } else if(jrbDuplaSena.isSelected()) {
            for(i=0; i<duplaSena.length; i++) {
                num = gerador.nextInt(50) + 1;
                for(j=0; j<duplaSena.length; j++) {
                    if(num == duplaSena[j] && j != i) {
                        num = gerador.nextInt(50) + 1;
                    } else {
                        duplaSena[i] = num;
                    }
                }
            }
        
            for(i=0; i<duplaSena.length; i++) {
                for(j=i+1; j<duplaSena.length; j++) {
                    if(duplaSena[i] > duplaSena[j]) {
                        num = duplaSena[i];
                        duplaSena[i] = duplaSena[j];
                        duplaSena[j] = num;
                    }  
                }
            }
        
            for(i=0; i<duplaSena.length; i++) {
                jlSorteados.setText(Arrays.toString(duplaSena));
            }
        } else if (jrbLotofacil.isSelected()) {
            for(i=0; i<lotofacil.length; i++) {
                num = gerador.nextInt(25) + 1;
                for(j=0; j<lotofacil.length; j++) {
                    if(num == lotofacil[j] && j != i) {
                        num = gerador.nextInt(25) + 1;
                    } else {
                        lotofacil[i] = num;
                    }
                }
            }
        
            for(i=0; i<lotofacil.length; i++) {
                for(j=i+1; j<lotofacil.length; j++) {
                    if(lotofacil[i] > lotofacil[j]) {
                        num = lotofacil[i];
                        lotofacil[i] = lotofacil[j];
                        lotofacil[j] = num;
                    }  
                }
            }
        
            for(i=0; i<lotofacil.length; i++) {
                jlSorteados.setText(Arrays.toString(lotofacil));
            }
        } else if (jrbLotomania.isSelected()) {
            for(i=0; i<lotomania.length; i++) {
                num = gerador.nextInt(100) + 1;
                for(j=0; j<lotomania.length; j++) {
                    if(num == lotomania[j] && j != i) {
                        num = gerador.nextInt(100) + 1;
                    } else {
                        lotomania[i] = num;
                    }
                }
            }
        
            for(i=0; i<lotomania.length; i++) {
                for(j=i+1; j<lotomania.length; j++) {
                    if(lotomania[i] > lotomania[j]) {
                        num = lotomania[i];
                        lotomania[i] = lotomania[j];
                        lotomania[j] = num;
                    }  
                }
            }
        
            for(i=0; i<lotomania.length; i++) {
                jlSorteados.setText(Arrays.toString(lotomania));
            }
        } else if(jrbMegaSena.isSelected()) {
            for(i=0; i<mega.length; i++) {
                num = gerador.nextInt(60) + 1;
                for(j=0; j<mega.length; j++) {
                    if(num == mega[j] && j != i) {
                        num = gerador.nextInt(60) + 1;
                    } else {
                        mega[i] = num;
                    }
                }
            }
        
            for(i=0; i<mega.length; i++) {
                for(j=i+1; j<mega.length; j++) {
                    if(mega[i] > mega[j]) {
                        num = mega[i];
                        mega[i] = mega[j];
                        mega[j] = num;
                    }  
                }
            }
        
            for(i=0; i<mega.length; i++) {
                jlSorteados.setText(Arrays.toString(mega));
            }
        } else if(jrbQuina.isSelected()) {
            for(i=0; i<quina.length; i++) {
                num = gerador.nextInt(80) + 1;
                for(j=0; j<quina.length; j++) {
                    if(num == quina[j] && j != i) {
                        num = gerador.nextInt(80) + 1;
                    } else {
                        quina[i] = num;
                    }
                }
            }
        
            for(i=0; i<quina.length; i++) {
                for(j=i+1; j<quina.length; j++) {
                    if(quina[i] > quina[j]) {
                        num = quina[i];
                        quina[i] = quina[j];
                        quina[j] = num;
                    }  
                }
            }
        
            for(i=0; i<quina.length; i++) {
                jlSorteados.setText(Arrays.toString(quina));
            }
        }
    }//GEN-LAST:event_jbSortearActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgLoteria;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jbSortear;
    private javax.swing.JLabel jlSorteados;
    private javax.swing.JRadioButton jrbDiaDeSorte;
    private javax.swing.JRadioButton jrbDuplaSena;
    private javax.swing.JRadioButton jrbLotofacil;
    private javax.swing.JRadioButton jrbLotomania;
    private javax.swing.JRadioButton jrbMegaSena;
    private javax.swing.JRadioButton jrbQuina;
    // End of variables declaration//GEN-END:variables
}
