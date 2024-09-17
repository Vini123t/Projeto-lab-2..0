
package Visao;

//import DAO.BD;
import DAO.BD_2;
import Entidades.Endereco;
import javax.swing.JOptionPane;
import Entidades.RespFinJuridico;


public class tela_RespFinJuridico extends javax.swing.JFrame {

    /**
     * Creates new form RespFinJuridico
     */
    private RespFinJuridico r;
    private Endereco e;

    public tela_RespFinJuridico() {
        initComponents();
        setVisible(true);
        ceptxt.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cnpjtxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        salvarbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telfixotxt = new javax.swing.JTextField();
        numtxt = new javax.swing.JTextField();
        ceptxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE RESPONSÁVEL FINANCEIRO - PESSOA JURÍDICA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/9.gif"))); // NOI18N

        jLabel3.setText("RAZÃO SOCIAL");

        jLabel5.setText("E-MAIL");

        jLabel6.setText("CNPJ");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancelar.png"))); // NOI18N
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        salvarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/disquete22.gif"))); // NOI18N
        salvarbtn.setText("SALVAR");
        salvarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarbtnActionPerformed(evt);
            }
        });

        jLabel8.setText("TELEFONE FIXO");

        jLabel9.setText("NUMERO");

        jLabel10.setText("CEP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addGap(27, 27, 27)
                            .addComponent(salvarbtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                                .addComponent(nometxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telfixotxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ceptxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cnpjtxt))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ceptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telfixotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cnpjtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(salvarbtn))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(724, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro cancelado pelo usuário");
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void salvarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarbtnActionPerformed
        String nome = nometxt.getText();
        String email = emailtxt.getText();
        char[] cnpj = cnpjtxt.getText().toCharArray();
        String cep = ceptxt.getText();
        String telfixo = telfixotxt.getText();
        boolean valido = true;
        int num = 0;
        if (!numtxt.getText().equals("")) {
            try {
                num = Integer.parseInt(numtxt.getText());
            } catch (Exception deupau) {
                valido = false;
                JOptionPane.showMessageDialog(null, "Numero inválido!\n" + deupau);
            }
        }

        if (nometxt.getText().equals(null)) {
            JOptionPane.showMessageDialog(null, "O campo Razão Social não pode ser vazio");
            valido = false;
        }
        if (emailtxt.getText().equals(null)) {
            JOptionPane.showMessageDialog(null, "O campo E-MAIL não pode ser vazio");
            valido = false;
        }
        if (cnpj.length != 14 && cnpj.length != 0) {
            JOptionPane.showMessageDialog(null, "CNPJ inválido. utilize o formato de 14 digitos");
            valido = false;
        }
        if (cnpj.length == 0) {
            JOptionPane.showMessageDialog(null, "O campo CNPJ não pode ser vazio");
            valido = false;
        }
        if (cep.length() != 8) {
            valido = false;
            JOptionPane.showMessageDialog(null, "CEP invalido. Utilize 8 digitos numericos");
        }
        if (telfixo.length() != 10 && telfixo.length() != 0) {
            valido = false;
            JOptionPane.showMessageDialog(null, "Telefone fixo inválido. Utilize 10 digitos numericos");
        }

        if (valido) {
            r = new RespFinJuridico();
            r.setnome(nome);
            if (telfixo.equals("")) {
            e = new Endereco(cep, num, null);
            } else {
                e = new Endereco(cep, num, telfixo);
            }
            //BD.add(e);
            //ATUALIZADO
            BD_2.add(e);
            e.setcodigo(BD_2.getCodEndereco(new String(e.getcep()), e.getnumero()));
            r.setendereco(e);
            r.setemail(email);
            r.setcnpj(cnpj);
            //BD.add(r);
            //ATUALIZADO
            BD_2.add(r);
            dispose();
        }

    }//GEN-LAST:event_salvarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ceptxt;
    private javax.swing.JTextField cnpjtxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nometxt;
    private javax.swing.JTextField numtxt;
    private javax.swing.JButton salvarbtn;
    private javax.swing.JTextField telfixotxt;
    // End of variables declaration//GEN-END:variables
}
