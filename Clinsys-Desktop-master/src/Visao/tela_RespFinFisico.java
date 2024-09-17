
package Visao;

//import DAO.BD;
import DAO.BD_2;
import Entidades.Endereco;
import Entidades.PessoaFisica;
import Entidades.RespFinFisico;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class tela_RespFinFisico extends javax.swing.JFrame {

    private Endereco e;
    public RespFinFisico rff;

    /**
     * Creates new form RespFinFisico
     */
    public tela_RespFinFisico() {
        initComponents();
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulolb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rgtxt = new javax.swing.JTextField();
        cpftxt = new javax.swing.JTextField();
        sexoM = new javax.swing.JRadioButton();
        sexoF = new javax.swing.JRadioButton();
        celulartxt = new javax.swing.JTextField();
        datanasclb = new javax.swing.JLabel();
        diabox = new javax.swing.JComboBox<>();
        mesbox = new javax.swing.JComboBox<>();
        anobox = new javax.swing.JComboBox<>();
        salvarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        ceptxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        telfixotxt = new javax.swing.JTextField();
        numtxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        titulolb.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        titulolb.setText("RESPONSÁVEL FINANCEIRO - PESSOA FÍSICA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/paciente.png"))); // NOI18N

        jLabel2.setText("NOME");

        jLabel3.setText("E-MAIL");

        jLabel5.setText("RG");

        jLabel6.setText("CPF");

        jLabel7.setText("SEXO");

        jLabel8.setText("CELULAR");

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

        datanasclb.setText("DATA DE NASCIMENTO");

        diabox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Dia","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
        diabox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaboxActionPerformed(evt);
            }
        });

        mesbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Mes","janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"}));

        anobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ano","1900","1901","1902","1903","1904","1905","1906","1907","1908","1909","1910","1911","1912","1913","1914","1915","1916","1917","1918","1919","1920","1921","1922","1923","1924","1925","1926","1927","1928","1929","1930","1931","1932","1933","1934","1935","1936","1937","1938","1939","1940","1941","1942","1943","1944","1945","1946","1947","1948","1949","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"}));

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

        jLabel10.setText("TELEFONE FIXO");

        jLabel9.setText("NUMERO");

        jLabel11.setText("CEP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datanasclb)
                        .addGap(29, 29, 29)
                        .addComponent(diabox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesbox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anobox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sexoM)
                                .addGap(18, 18, 18)
                                .addComponent(sexoF))
                            .addComponent(celulartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelarbtn)
                                    .addGap(35, 35, 35)
                                    .addComponent(salvarbtn))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nometxt)
                                    .addComponent(emailtxt)
                                    .addComponent(rgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(titulolb, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ceptxt)
                                    .addComponent(numtxt)
                                    .addComponent(telfixotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulolb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ceptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(telfixotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sexoM)
                    .addComponent(sexoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(celulartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datanasclb)
                    .addComponent(diabox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarbtn)
                    .addComponent(salvarbtn))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(867, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void diaboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaboxActionPerformed

    private void salvarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarbtnActionPerformed

        String nome, email, rg, cpf, celular;
        char sexo = ' ';
        rff = new RespFinFisico();
        

        String dd, MM, yyyy;
        Date dataNasc = new Date();

        nome = nometxt.getText();
        email = emailtxt.getText();
        rg = rgtxt.getText();
        cpf = cpftxt.getText();
        celular = celulartxt.getText();
        boolean valido = true;
        String cep = ceptxt.getText();
        String telfixo = telfixotxt.getText();
        int num = 0;
        if (!numtxt.getText().equals("")) {
        try {
            num = Integer.parseInt(numtxt.getText());
        }
        catch(Exception e) {
            valido = false;
            JOptionPane.showMessageDialog(null,"Numero inválido. utilize apenas numeros.\no erro foi: "+e);
        }
        }

        
        if (sexoF.isSelected()) {
            sexo = 'F';
        } else if (sexoM.isSelected()) {
            sexo = 'M';
        } else {
            JOptionPane.showMessageDialog(null, "É necessário escolher um sexo");
            valido = false;
        }

//      
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
            Logger.getLogger(CadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
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
            JOptionPane.showMessageDialog(null,"Cep invalido");
        }
        if (telfixo.length() != 10 && telfixo.length() != 0) {
            valido = false;
            JOptionPane.showMessageDialog(null,"Telefone fixo invalido");
        }
        

        //após as verificações
        if (valido) {
            if (telfixo.equals("")){
                e = new Endereco(cep,num,null);
            } else {
                e = new Endereco(cep,num,telfixo);
            }
            rff.setnome(nome);
            if (!celular.equals(""))rff.setcelular(celular);
            rff.setcpf(cpf);
            rff.setdataNasc(dataNasc);
            rff.setemail(email);
            rff.setrg(rg);
            rff.setsexo(sexo);
            //BD.add(e);
            //ATUALIZADO
            BD_2.add(e);
            e.setcodigo(BD_2.getCodEndereco(new String(e.getcep()), e.getnumero()));
            rff.setendereco(e);
            
            //BD.add(rff)
            //ATUALIZADO
            BD_2.add(rff);
            dispose();
        }
    }//GEN-LAST:event_salvarbtnActionPerformed

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro cancelado pelo usuário");
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
            java.util.logging.Logger.getLogger(tela_RespFinFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_RespFinFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_RespFinFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_RespFinFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_RespFinFisico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anobox;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JTextField celulartxt;
    private javax.swing.JTextField ceptxt;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JLabel datanasclb;
    private javax.swing.JComboBox<String> diabox;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mesbox;
    private javax.swing.JTextField nometxt;
    private javax.swing.JTextField numtxt;
    private javax.swing.JTextField rgtxt;
    private javax.swing.JButton salvarbtn;
    private javax.swing.JRadioButton sexoF;
    private javax.swing.JRadioButton sexoM;
    private javax.swing.JTextField telfixotxt;
    private javax.swing.JLabel titulolb;
    // End of variables declaration//GEN-END:variables

}
