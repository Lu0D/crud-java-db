/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.FichaDAO;
import DAO.TreinoDAO;
import academia.Aluno;
import academia.Treino;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

    



/**
 *
 * @author Lenovo
 */
public class TreinoGUI extends javax.swing.JFrame {
    public TreinoGUI() {
        initComponents();
        carregarTabela();
        tblTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = tblTreino.getSelectedRow();
                if (selectedRow != -1) {
                    // Pega o ID do Aluno da coluna 1 (índice 1) da tabela
                    // (Coluna 0 é "ID do Treino", Coluna 1 é "ID Aluno")
                    Object alunoIdObj = tblTreino.getValueAt(selectedRow, 1); 
                    
                    if (alunoIdObj != null) {
                        txtAluno_Id.setText(alunoIdObj.toString());
                    }
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAluno_Id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipo_treino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDuracao_minutos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtData_inicio = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnListarTreinosAluno = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTreino = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Cadastro Treino");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CADASTRO DE TREINO:");

        jLabel4.setText("ID Aluno:");

        txtAluno_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAluno_IdActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de treino:");

        jLabel6.setText("Descrição:");

        jLabel7.setText("Duração em minutos:");

        txtDuracao_minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracao_minutosActionPerformed(evt);
            }
        });

        jLabel8.setText("Data de Início:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnListarTreinosAluno.setText("Listar Treinos do Aluno");
        btnListarTreinosAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTreinosAlunoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblTreino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID do Treino", "ID Aluno", "Tipo de Treino", "Descrição", "Duração em minutos", "Data de Início"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTreino);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(btnInserir)
                                        .addGap(90, 90, 90)
                                        .addComponent(btnListarTreinosAluno)
                                        .addGap(77, 77, 77)
                                        .addComponent(btnExcluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtAluno_Id)
                                                .addGap(27, 27, 27))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel3))
                                                .addGap(74, 74, 74)))
                                        .addGap(148, 148, 148)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(txtTipo_treino, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescricao)
                                    .addComponent(jLabel8)
                                    .addComponent(txtData_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDuracao_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAluno_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo_treino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracao_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnListarTreinosAluno)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDuracao_minutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracao_minutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracao_minutosActionPerformed

    private void txtAluno_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAluno_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAluno_IdActionPerformed

private boolean mostrandoTreinosDoAluno = false;

    
private void atualizarTabela(List<Treino> treinos) {
    DefaultTableModel model = (DefaultTableModel) tblTreino.getModel();
    model.setRowCount(0);
        for (Treino t : treinos) {
        model.addRow(new Object[]{
            t.getId(),
            t.getAlunoId(),
            t.getTipo_treino(),
            t.getDescricao(),
            t.getDuracao_minutos(),
            t.getData_inicio()
        });
    }
}


    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        System.out.println("botão incluir apertado");
       
       Treino novoTreino = new Treino();
       novoTreino.setAlunoId(Integer.parseInt(this.txtAluno_Id.getText()));
       novoTreino.setTipo_treino(this.txtTipo_treino.getText());
       novoTreino.setDescricao(this.txtDescricao.getText());
       novoTreino.setDuracao_minutos(Integer.parseInt(this.txtDuracao_minutos.getText()));
       novoTreino.setData_inicio(new GregorianCalendar());
       
       TreinoDAO treino = new TreinoDAO();
       treino.inserir(novoTreino);
       limparCampos();
       carregarTabela();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    int linhaSelecionada = tblTreino.getSelectedRow();

    if (linhaSelecionada != -1) {
        int idTreino = Integer.parseInt(tblTreino.getValueAt(linhaSelecionada, 0).toString());

        TreinoDAO dao = new TreinoDAO();
        dao.excluir(idTreino);

        carregarTabela();
    } else {
        JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.");
    }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListarTreinosAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTreinosAlunoActionPerformed
    if (!mostrandoTreinosDoAluno) {
        String idAlunoStr = txtAluno_Id.getText().trim();

        if (!idAlunoStr.isEmpty()) {
            try {
                int idAluno = Integer.parseInt(idAlunoStr);
                TreinoDAO dao = new TreinoDAO();
                List<Treino> treinos = dao.listarPorIdAluno(idAluno);
                atualizarTabela(treinos);
                mostrandoTreinosDoAluno = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID do Aluno inválido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite um ID de Aluno.");
        }
    } else {
        TreinoDAO dao = new TreinoDAO();
        List<Treino> treinos = dao.listar();
        atualizarTabela(treinos);
        mostrandoTreinosDoAluno = false;
    }

    
    }//GEN-LAST:event_btnListarTreinosAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(TreinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreinoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreinoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnListarTreinosAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblTreino;
    private javax.swing.JTextField txtAluno_Id;
    private javax.swing.JTextField txtData_inicio;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDuracao_minutos;
    private javax.swing.JTextField txtTipo_treino;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
    txtAluno_Id.setText("");
    txtTipo_treino.setText("");
    txtDescricao.setText("");
    txtDuracao_minutos.setText("");
    txtData_inicio.setText("");
    }

    private void carregarTabela() {
    DefaultTableModel model = (DefaultTableModel) tblTreino.getModel();
    model.setRowCount(0); 

    TreinoDAO dao = new TreinoDAO();
    List<Treino> lista = dao.listar(); 

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    for (Treino treino : lista) {
        model.addRow(new Object[]{
            treino.getId(),
            treino.getAlunoId(),
            treino.getTipo_treino(),
            treino.getDescricao(),
            treino.getDuracao_minutos(),
            formato.format(treino.getData_inicio().toInstant()
                    .atZone(java.time.ZoneId.systemDefault())
                    .toLocalDate())
        });
        }

    }
}



