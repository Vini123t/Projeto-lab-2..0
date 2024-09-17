
package Visao;

//import DAO.BD;
import DAO.BD_2;
import Entidades.Endereco;
import Entidades.Paciente;
import javax.swing.JOptionPane;

public class telaEndereco extends javax.swing.JFrame {

    private Endereco e;

    /**
     * Creates new form telaEndereco
     */
    public telaEndereco(Endereco E) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        e = E;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ceptxt = new javax.swing.JTextField();
        numerotxt = new javax.swing.JTextField();
        telfixotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salvarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de novos endereços");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CEP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 130, 40, 17);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NUMERO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 170, 80, 17);

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TELEFONE FIXO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 210, 130, 17);
        getContentPane().add(ceptxt);
        ceptxt.setBounds(290, 120, 314, 30);
        getContentPane().add(numerotxt);
        numerotxt.setBounds(290, 160, 314, 30);
        getContentPane().add(telfixotxt);
        telfixotxt.setBounds(290, 200, 314, 30);

        jLabel5.setFont(new java.awt.Font("Kunstler Script", 0, 48)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, -30, 525, 204);

        salvarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/disquete22.gif"))); // NOI18N
        salvarbtn.setText("SALVAR");
        salvarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(salvarbtn);
        salvarbtn.setBounds(480, 240, 120, 30);

        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancelar.png"))); // NOI18N
        cancelarbtn.setText("CANCELAR");
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarbtn);
        cancelarbtn.setBounds(330, 240, 130, 30);

        setSize(new java.awt.Dimension(637, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarbtnActionPerformed
        char[] cep = ceptxt.getText().toCharArray();
        int numero = Integer.parseInt(numerotxt.getText());
        char[] telfixo = telfixotxt.getText().toCharArray();

        //pequena rotina para testar os dados antes de instanciar o objeto
        boolean valido = true;
        if (cep.length != 8) {
            valido = false;
            JOptionPane.showMessageDialog(null, "Cep inválido");
        }

        if (telfixotxt.getText() == null) {
            JOptionPane.showMessageDialog(null, "Registrando um endereço sem telefone fixo");
        } else if (telfixo.length != 10 && telfixo.length != 0) {
            valido = false;
            JOptionPane.showMessageDialog(null, "TelFixo inválido. Use o formato de 10 digitos");
        }

        if (numerotxt.getText() == null) {
            JOptionPane.showMessageDialog(null, "Registrando um endereço sem numero");
        }

        if (valido) {
            e.setcep(cep);
            if (numerotxt.getText() != null) {
                e.setnumero(numero);
            }
            if (telfixotxt.getText() != null) {
                e.settelFixo(telfixo);
            }
            //BD.add(e);
            //ATUALIZADO
            BD_2.add(e);
            dispose();
        }
    }//GEN-LAST:event_salvarbtnActionPerformed

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro cancelado pelo usuário");
        dispose();
    }//GEN-LAST:event_cancelarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField ceptxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField numerotxt;
    private javax.swing.JButton salvarbtn;
    private javax.swing.JTextField telfixotxt;
    // End of variables declaration//GEN-END:variables
}
