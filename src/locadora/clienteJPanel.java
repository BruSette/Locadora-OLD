/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author brunosette
 */
public class clienteJPanel extends javax.swing.JPanel {

    /**
     * Creates new form clienteJPanel
     */
    public clienteJPanel() {
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

        cadastrarjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        telefonejTextField = new javax.swing.JTextField();
        telefonejLabel = new javax.swing.JLabel();
        celularjTextField = new javax.swing.JTextField();
        celularjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        ruajTextField = new javax.swing.JTextField();
        ruajLabel = new javax.swing.JLabel();
        complementojTextField = new javax.swing.JTextField();
        complementojLabel = new javax.swing.JLabel();
        bairrojTextField = new javax.swing.JTextField();
        bairrojLabel = new javax.swing.JLabel();
        cepjTextField = new javax.swing.JTextField();
        cepjLabel = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        cidadejLabel = new javax.swing.JLabel();
        estadojLabel = new javax.swing.JLabel();
        estadojTextField = new javax.swing.JTextField();
        rgjLabel = new javax.swing.JLabel();
        rgjTextField = new javax.swing.JTextField();
        cpfjLabel = new javax.swing.JLabel();
        cpfjTextField = new javax.swing.JTextField();
        nascimentojTextField = new javax.swing.JTextField();
        nascimentojLabel = new javax.swing.JLabel();
        nacionalidadejTextField = new javax.swing.JTextField();
        nacionalidadejLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18)))); // NOI18N

        cadastrarjButton.setText("Cadastrar");

        limparjButton.setText("Limpar");
        limparjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparjButtonActionPerformed(evt);
            }
        });

        nomejLabel.setText("Nome:");

        telefonejLabel.setText("Telefone:");

        celularjLabel.setText("Celular:");

        emailjLabel.setText("Email:");

        ruajLabel.setText("Rua:");

        complementojLabel.setText("Complemento:");

        bairrojLabel.setText("Bairro:");

        cepjLabel.setText("Cep:");

        cidadejLabel.setText("Cidade:");

        estadojLabel.setText("Estado");

        rgjLabel.setText("Rg:");

        rgjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgjTextFieldActionPerformed(evt);
            }
        });

        cpfjLabel.setText("CPF:");

        cpfjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfjTextFieldActionPerformed(evt);
            }
        });

        nascimentojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentojTextFieldActionPerformed(evt);
            }
        });

        nascimentojLabel.setText("Nascimento:");

        nacionalidadejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadejTextFieldActionPerformed(evt);
            }
        });

        nacionalidadejLabel.setText("Nacionalidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telefonejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(celularjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celularjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailjLabel)
                            .addComponent(rgjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpfjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nascimentojLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nascimentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nacionalidadejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nacionalidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cepjLabel)
                            .addGap(18, 18, 18)
                            .addComponent(cepjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bairrojLabel)
                                .addGap(18, 18, 18)
                                .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ruajLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(complementojLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limparjButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cidadejLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(estadojLabel)
                        .addGap(18, 18, 18)
                        .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrarjButton)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomejLabel)
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonejLabel)
                            .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruajLabel)
                            .addComponent(ruajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complementojLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(celularjLabel)
                        .addComponent(celularjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bairrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bairrojLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailjLabel)
                        .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cepjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cepjLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadejLabel)
                    .addComponent(rgjLabel)
                    .addComponent(rgjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadojLabel)
                    .addComponent(cpfjLabel)
                    .addComponent(cpfjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nascimentojLabel)
                    .addComponent(nascimentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadejLabel)
                    .addComponent(nacionalidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarjButton)
                    .addComponent(limparjButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rgjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgjTextFieldActionPerformed

    private void cpfjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfjTextFieldActionPerformed

    private void nascimentojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentojTextFieldActionPerformed

    private void nacionalidadejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadejTextFieldActionPerformed

    private void limparjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparjButtonActionPerformed
        // TODO add your handling code here:
        
        nomejTextField.setText("");
        telefonejTextField.setText("");
        celularjTextField.setText("");
        emailjTextField.setText("");
        rgjTextField.setText("");
        cpfjTextField.setText("");
        nascimentojTextField.setText("");
        nacionalidadejTextField.setText("");
        ruajTextField.setText("");
        complementojTextField.setText("");
        bairrojTextField.setText("");
        cepjTextField.setText("");
        cidadejTextField.setText("");
        estadojTextField.setText("");
        
    }//GEN-LAST:event_limparjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairrojLabel;
    private javax.swing.JTextField bairrojTextField;
    private javax.swing.JButton cadastrarjButton;
    private javax.swing.JLabel celularjLabel;
    private javax.swing.JTextField celularjTextField;
    private javax.swing.JLabel cepjLabel;
    private javax.swing.JTextField cepjTextField;
    private javax.swing.JLabel cidadejLabel;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JLabel complementojLabel;
    private javax.swing.JTextField complementojTextField;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JTextField cpfjTextField;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel estadojLabel;
    private javax.swing.JTextField estadojTextField;
    private javax.swing.JButton limparjButton;
    private javax.swing.JLabel nacionalidadejLabel;
    private javax.swing.JTextField nacionalidadejTextField;
    private javax.swing.JLabel nascimentojLabel;
    private javax.swing.JTextField nascimentojTextField;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JLabel rgjLabel;
    private javax.swing.JTextField rgjTextField;
    private javax.swing.JLabel ruajLabel;
    private javax.swing.JTextField ruajTextField;
    private javax.swing.JLabel telefonejLabel;
    private javax.swing.JTextField telefonejTextField;
    // End of variables declaration//GEN-END:variables
}
