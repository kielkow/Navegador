/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegador;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Tela extends javax.swing.JFrame{

    
    /**
     * Creates new form Tela
     */
    Pilha p = new Pilha(100);
    int i = -1;
    
    public Tela() {
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

        btnAvancar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        tfTexto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tfTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTextoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvancar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAvancar)
                .addComponent(btnVoltar)
                .addComponent(tfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        btnVoltar.setEnabled(true);
        
        
        
        if(tfTexto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um site");
        }
       

            if(p.sites[i+1] != null){
                i++;
                tfTexto.setText(p.sites[i]);
            }
            else{
                p.push(tfTexto.getText());
                i++;
            }


            System.out.println(i);
        
        
        
        
        
        /*
        if(p.sites[i+1] != null){
            i++;
            tfTexto.setText(p.sites[i+1]);
        }
        else{
            p.push(tfTexto.getText());
            i++;
            tfTexto.setText("");
        } 
        */
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        btnAvancar.setEnabled(true);
        
        
        if(i == 1){
            btnVoltar.setEnabled(false);
        }
        i--;
        tfTexto.setText(p.sites[i]);
        System.out.println(i);
        
        
        
        /*
          tfTexto.setText(p.sites[i]); 
          i--;
        */
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tfTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTextoActionPerformed

    }//GEN-LAST:event_tfTextoActionPerformed
    

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
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField tfTexto;
    // End of variables declaration//GEN-END:variables
}
