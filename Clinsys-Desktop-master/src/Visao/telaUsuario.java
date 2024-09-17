
package Visao;

import DAO.BD_2;
import Entidades.Endereco;
import java.util.Date;
import javax.swing.JOptionPane;
import Entidades.PessoaFisica;
import Entidades.Usuario;
import java.text.ParseException;


public class telaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form telaUsuario
     */
    public telaUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        senhatxt1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        rgtxt = new javax.swing.JTextField();
        cpftxt = new javax.swing.JTextField();
        celulartxt = new javax.swing.JTextField();
        telFixotxt = new javax.swing.JTextField();
        ceptxt = new javax.swing.JTextField();
        numtxt = new javax.swing.JTextField();
        logintxt = new javax.swing.JTextField();
        senhatxt2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        diabox = new javax.swing.JComboBox<>();
        mesbox = new javax.swing.JComboBox<>();
        anobox = new javax.swing.JComboBox<>();
        sexoM = new javax.swing.JRadioButton();
        sexoF = new javax.swing.JRadioButton();
        salvarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuários");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        jLabel1.setText("                        Novo Usuário do Sistema ClinSys");

        jLabel2.setText("Nome");

        jLabel3.setText("E-mail");

        jLabel4.setText("RG");

        jLabel5.setText("CPF");

        jLabel6.setText("Celular");

        jLabel7.setText("Telefone Fixo");

        jLabel8.setText("CEP");

        jLabel9.setText("Numero");

        jLabel10.setText("Login");

        jLabel11.setText("Senha");

        jLabel12.setText("repita a senha");

        jLabel13.setText("Sexo");

        jLabel14.setText("Data de Nascimento");

        diabox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Dia","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
        diabox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaboxActionPerformed(evt);
            }
        });

        mesbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Mes","janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"}));

        anobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ano","1900","1901","1902","1903","1904","1905","1906","1907","1908","1909","1910","1911","1912","1913","1914","1915","1916","1917","1918","1919","1920","1921","1922","1923","1924","1925","1926","1927","1928","1929","1930","1931","1932","1933","1934","1935","1936","1937","1938","1939","1940","1941","1942","1943","1944","1945","1946","1947","1948","1949","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"}));

        sexoM.setText("Masculino");
        sexoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoMActionPerformed(evt);
            }
        });

        sexoF.setText("Feminino");
        sexoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoFActionPerformed(evt);
            }
        });

        salvarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/disquete22.gif"))); // NOI18N
        salvarbtn.setText("SALVAR");
        salvarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarbtnActionPerformed(evt);
            }
        });

        cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancelar.png"))); // NOI18N
        cancelarbtn.setText("CANCELAR");
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sexoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sexoF))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(rgtxt)
                                .addComponent(cpftxt)
                                .addComponent(celulartxt)
                                .addComponent(telFixotxt)
                                .addComponent(nometxt)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ceptxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logintxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(senhatxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(77, 77, 77)
                                        .addComponent(senhatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(diabox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mesbox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(anobox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(cancelarbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salvarbtn)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(rgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ceptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(celulartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(telFixotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexoM)
                            .addComponent(sexoF)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(senhatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhatxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(diabox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarbtn)
                    .addComponent(salvarbtn))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void diaboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaboxActionPerformed

    private void sexoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoMActionPerformed
        if (sexoM.isSelected()) {
            sexoF.setSelected(false);
        }
    }//GEN-LAST:event_sexoMActionPerformed

    private void sexoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoFActionPerformed
        if (sexoF.isSelected()) {
            sexoM.setSelected(false);
        }
    }//GEN-LAST:event_sexoFActionPerformed

    private void salvarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarbtnActionPerformed

        String nome, email, rg, cpf, celular;
        char sexo = ' ';
        Usuario u = new Usuario();

        String dd, MM, yyyy;
        Date dataNasc = new Date();

        nome = nometxt.getText();
        email = emailtxt.getText();
        rg = rgtxt.getText();
        cpf = cpftxt.getText();
        celular = celulartxt.getText();
        String cep = ceptxt.getText();
        String telfixo = telFixotxt.getText();
        String login = logintxt.getText();
        String senha = "";
        int num = 0;
        boolean valido = true;
        if (senhatxt1.getText().equals(senhatxt2.getText()) && !senhatxt1.equals("")) {
            senha = senhatxt1.getText();
        } else if (senha.equals("")){
            valido = false;
            JOptionPane.showMessageDialog(null,"A senha não pode ser nula ");
        } else {
            valido = false;
            JOptionPane.showMessageDialog(null,"As senahs não conferem");
        }

        try {
            num = Integer.parseInt(numtxt.getText());
        } catch (Exception e) {
            valido = false;
            JOptionPane.showMessageDialog(null, "numero invalido\n" + e);
        }

        if (sexoF.isSelected()) {
            sexo = 'F';
        } else if (sexoM.isSelected()) {
            sexo = 'M';
        } else {
            JOptionPane.showMessageDialog(null, "É necessário escolher um sexo");
            valido = false;
        }


        dd = diabox.getSelectedItem().toString();
        MM = mesbox.getSelectedItem().toString();
        yyyy = anobox.getSelectedItem().toString();

        switch (MM) {
            case "janeiro":
                MM = "01";
                break;
            case "fevereiro":
                MM = "02";
                break;
            case "março":
                MM = "03";
                break;
            case "abril":
                MM = "05";
                break;
            case "maio":
                MM = "06";
                break;
            case "junho":
                MM = "06";
                break;
            case "julho":
                MM = "07";
                break;
            case "agosto":
                MM = "08";
                break;
            case "setembro":
                MM = "09";
                break;
            case "outubro":
                MM = "10";
                break;
            case "novembro":
                MM = "11";
                break;
            case "dezembro":
                MM = "12";
                break;
        }
        String datanas = dd + "-" + MM + "-" + yyyy;
        try {
            dataNasc = PessoaFisica.FormatarData(datanas);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "ERRO NA PASSAGEM DA DATA DE NASCIMENTO");
            valido = false;
        }

        //verificações:
        if (nometxt.getText() == null) {
            valido = false;
            JOptionPane.showMessageDialog(null, "O campo NOME não pode ser vazio.");
        }
        if (emailtxt.getText() == null) {
            valido = false;
            JOptionPane.showMessageDialog(null, "O campo EMAIL não pode ser vazio");
        }
        if (rgtxt.getText() == null) {
            valido = false;
            JOptionPane.showMessageDialog(null, "O campo RG não pode ser vazio");
        }
        if (rg.length() != 9) {
            valido = false;
            JOptionPane.showMessageDialog(null, "RG inválido. utilize o formato de 7 digitos e 2 letras");
        }
        if (cpftxt.getText() == null) {
            valido = false;
            JOptionPane.showMessageDialog(null, "O campo CPF não pode ser vazio");
        }
        if (cpf.length() != 11) {
            valido = false;
            JOptionPane.showMessageDialog(null, "CPF invalido, utilize 11 digitos numericos sem pontuação");
        }
        if (celulartxt.getText() == null) {
            JOptionPane.showMessageDialog(null, "Celular está em branco. cadastrando sem celular.");
        }
        if (celular.length() != 11 && celulartxt.getText().length() != 0) {
            valido = false;
            JOptionPane.showMessageDialog(null, "Celular inválido. utilize 11 digitos numericos");
        }
        if (cep.length() != 8) {
            valido = false;
            JOptionPane.showMessageDialog(null, "cep invalido");
        }
        if (telfixo.length() != 10 && telfixo.length() != 0) {
            valido = false;
            JOptionPane.showMessageDialog(null, "Telefone fixo invalido");
        }

        //após as verificações
        if (valido) {
            Endereco e = new Endereco(cep, num, telfixo);
            BD_2.add(e);
            
            e.setcodigo(BD_2.getCodEndereco(new String(e.getcep()), e.getnumero()));
            u.setendereco(e);
            u.setnome(nome);
            u.setcelular(celular);
            u.setcpf(cpf);
            u.setdataNasc(dataNasc);
            u.setemail(email);
            u.setrg(rg);
            u.setsexo(sexo);
            u.setlogin(login);
            u.setsenha(senha);
            u.setstatus(true);
            BD_2.add(u);
            dispose();
        }
    }//GEN-LAST:event_salvarbtnActionPerformed

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anobox;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField celulartxt;
    private javax.swing.JTextField ceptxt;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JComboBox<String> diabox;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField logintxt;
    private javax.swing.JComboBox<String> mesbox;
    private javax.swing.JTextField nometxt;
    private javax.swing.JTextField numtxt;
    private javax.swing.JTextField rgtxt;
    private javax.swing.JButton salvarbtn;
    private javax.swing.JPasswordField senhatxt1;
    private javax.swing.JPasswordField senhatxt2;
    private javax.swing.JRadioButton sexoF;
    private javax.swing.JRadioButton sexoM;
    private javax.swing.JTextField telFixotxt;
    // End of variables declaration//GEN-END:variables
}
