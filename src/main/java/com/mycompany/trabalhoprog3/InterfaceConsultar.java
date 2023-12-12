/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhoprog3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author hugop
 */
public class InterfaceConsultar extends javax.swing.JFrame {
    private ArrayList<Object> listaColaboradores;
    
    public InterfaceConsultar(ArrayList<Object> listaColaboradores) {
        initComponents();
        this.listaColaboradores = listaColaboradores;
        inicializador();
    }
    
    public InterfaceConsultar() {
        initComponents();
        inicializador();
    }
    public void inicializador() {
        setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nome", "Tipo Colaborador", "Data Contratação", "Salário", "Turno", "Área Programação", "Bonus", "Bonus Cooparticipação"});
        jTable1.setModel(model);
        atualizarTabela();
    }
    private void fecharJanela() {
        this.dispose();
        // Atualize a listaColaboradores na TrabalhoProg3
        if (getParent() instanceof TrabalhoProg3) {
            TrabalhoProg3 interfacePrincipal = (TrabalhoProg3) getParent();
            interfacePrincipal.setListaColaboradores(listaColaboradores);
        }
    }  
    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Object colaborador : listaColaboradores) {
            String tipoColaborador = "Desconhecido"; // Valor padrão, caso não seja nenhum tipo conhecido

            if (colaborador instanceof Executivo) {
                tipoColaborador = "Executivo";
            } else if (colaborador instanceof Gerente) {
                tipoColaborador = "Gerente";
            } else if (colaborador instanceof Programador) {
                tipoColaborador = "Programador";
            }else if (colaborador instanceof Secretario) {
                tipoColaborador = "Secretario";
            } else if (colaborador instanceof Empregado) {
                tipoColaborador = "Empregado";
            }
           if (colaborador instanceof Executivo) {
                Executivo executivo = (Executivo) colaborador;
                model.addRow(new Object[]{
                    executivo.getNome(),
                    tipoColaborador,
                    executivo.getDataContracao(),
                    executivo.getSalario(),
                    null,
                    null,
                    executivo.getBonus(),
                    executivo.getBonusCoop()
                });
            } else if (colaborador instanceof Gerente) {
                Gerente gerente = (Gerente) colaborador;
                model.addRow(new Object[]{
                    gerente.getNome(),
                    tipoColaborador,
                    gerente.getDataContracao(),
                    gerente.getSalario(),
                    null,
                    null,
                    gerente.getBonus(),
                    null
                });
            }  else if (colaborador instanceof Programador) {
                Programador programador = (Programador) colaborador;
                model.addRow(new Object[]{
                    programador.getNome(),
                    tipoColaborador,
                    programador.getDataContracao(),
                    programador.getSalario(),
                    null,
                    programador.getAreaProg(),
                    null,
                    null,
                });
            } else if (colaborador instanceof Secretario) {
                Secretario secretario = (Secretario) colaborador;
                model.addRow(new Object[]{
                    secretario.getNome(),
                    tipoColaborador,
                    secretario.getDataContracao(),
                    secretario.getSalario(),
                    secretario.getTurnoString(),
                    null,
                    null,
                    null
                });
            } else if (colaborador instanceof Empregado) {
                Empregado empregado = (Empregado) colaborador;
                model.addRow(new Object[]{
                    empregado.getNome(),
                    tipoColaborador,
                    empregado.getDataContracao(),
                    empregado.getSalario(),
                    null,
                    null,
                    null,
                    null
                });
            } 
        }

        String[] columnNames = {"Nome", "Tipo Colaborador", "Data Contratação", "Salário", "Turno", "Área Programação", "Bonus", "Bonus Cooparticipação"};
        model.setColumnIdentifiers(columnNames);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Data Contratação", "Salário", "Turno", "Área Programação", "Bonus", "Bonus Cooparticipação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Colaboradores cadastrados");

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarBtn)
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1)
                        .addGap(0, 372, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(voltarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        fecharJanela();
    }//GEN-LAST:event_voltarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InterfaceConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InterfaceConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InterfaceConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InterfaceConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InterfaceConsultar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
