/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author under
 */
public class Panel_del_juego extends javax.swing.JFrame {

    /**
     * Creates new form Panel_del_juego
     */
    public Panel_del_juego() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static String usuario="";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtInformacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        edtComo = new javax.swing.JTextArea();
        frmJuego = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSelleccion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnInformacion = new javax.swing.JRadioButton();
        javax.swing.JRadioButton btncomo = new javax.swing.JRadioButton();
        btnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        edtJugador = new javax.swing.JTextField();

        edtInformacion.setColumns(20);
        edtInformacion.setRows(5);
        edtInformacion.setText("The original version \nwas transmitted on Saturday nights,\n however episodes are now also broadcast \non weekday evenings. While the weekend \nversion shows a more solemn environment \n(with a top prize of 5,000,000 pesos,\n about US$262,500), the weekday version \nseems more informal and fun (with a top\n prize of 1,000,000 pesos, about US$53,000).\n Héctor Sandarti presents the show, \nand he has also done the Spanish-language\n American version (using the same title)\n for Telemundo. ");
        jScrollPane1.setViewportView(edtInformacion);

        edtComo.setColumns(20);
        edtComo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        edtComo.setRows(5);
        edtComo.setText("Preselección\nTanto en la versión argentina, la salvadoreña y en la chilena de Trato hecho se \nrealiza una pre-selección para escoger al participante final. \nEn Argentina y Chile la mecánica consiste en varias fases. \nEn la primera se divide al público\nen 2 sectores. Se realizan preguntas de conocimientos varios\n y el sector que obtenga el mayor puntaje pasa a la siguiente ronda.\n Luego el sector ganador se divide en 5 sectores de 25 personas cada uno. \nSe vuelve a realizar una serie de preguntas y el sector ganador pasa a la siguiente\n trivia. Antes de que se hagan las preguntas se incorpora al sector ganador una \npersona elegida al azar entre quienes hayan quedado relegados en las rondas \nanteriores. Después de realizada la tercera ronda de preguntas, los 2 puntajes \nmás altos se enfrentan en problemas matemáticos. Quien gane participará por el \npremio máximo, y las otras 25 personas que hayan llegado a la parte final de la \npre-selección tomarán un maletín. \nEn la versión salvadoreña la mecánica de pre-selección es distinta, en el primer filtro, \nel participante debe de descargar un formulario en la página web del programa, \nluego de llenarlo (únicamente a mano), debe grabar un video de 5 minutos diciendo \npor qué deben elegirlo y de presentar a las personas que deseen lo acompañen en\n el foro. El siguiente filtro es una entrevista presencial con la producción y si pasa\n los dos filtros está listo para participar en futura fecha, en el programa elije un \nmaletín y comienza el juego. \nCada vez que el concursante final elige un maletín, quien lo posea puede adivinar \nla cantidad que contiene. Si acierta se ganará una cierta cantidad de dinero. \nEtapa de los maletines\nEl programa consiste en un número de maletines (generalmente 26) que representan \ndiversas cantidades de dinero. Sin saber a que cantidad corresponde cada maletín,\n el concursante escoge uno, el cual se supone contiene el premio máximo. \nLuego el participante va abriendo maletines uno por uno para saber el valor \nque representaban. Mientras ocurre eso el concursante puede recibir ofertas \nde la \"banca\", la cual desea comprar su maletín por el menor valor posible, \nel cual depende de las cantidades que queden.\n El concursante puede aceptar la oferta o seguir abriendo maletines. \nComo ambos (el concursante y la banca) desconocen el valor de su maletín, \npuede que el concursante haga muy buen negocio al vender a un buen precio \nun maletín que puede contener cifras mínimas ($1). Si opta por seguir abriendo \nmaletines y estos corresponden a cifras menores, aumentará el valor de la oferta\n de la banca. \nHay solo dos rutas para que el concursante gane el premio mayor: \nElegir al comienzo el maletín correcto y nunca aceptar una oferta de la banca.\nMantener la opción del premio máximo hasta que queden solo 2 maletines y\ncambiarlo por el suyo.");
        jScrollPane2.setViewportView(edtComo);

        jLabel3.setText("holi");

        javax.swing.GroupLayout frmJuegoLayout = new javax.swing.GroupLayout(frmJuego.getContentPane());
        frmJuego.getContentPane().setLayout(frmJuegoLayout);
        frmJuegoLayout.setHorizontalGroup(
            frmJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmJuegoLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        frmJuegoLayout.setVerticalGroup(
            frmJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmJuegoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        txtSelleccion.setColumns(20);
        txtSelleccion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtSelleccion.setRows(5);
        txtSelleccion.setText("\n\nSelecciona tu maletin");
        txtSelleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jScrollPane3.setViewportView(txtSelleccion);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frmPrincipal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido A Deal or Not deal");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        buttonGroup1.add(btnInformacion);
        btnInformacion.setText("Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(btncomo);
        btncomo.setText("Como se juega?");
        btncomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomoActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel2.setText("ingresa tu nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncomo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtJugador))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncomo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        if(btnInformacion.isSelected()){
            JOptionPane.showMessageDialog(this,edtInformacion.getText() , "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btncomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomoActionPerformed
        JOptionPane.showMessageDialog(this, edtComo.getText(), "Como se juega?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btncomoActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       usuario=edtJugador.getText();
       String error="Introduce tu nombre de usuario";
       if(!"".equals(usuario)){
           JOptionPane.showMessageDialog(this, String.format("Bienvenido %s:", edtJugador.getText()), "Deal or not deal", JOptionPane.INFORMATION_MESSAGE);
           Juego abrir=new Juego();
           abrir.setVisible(true);
           this.setVisible(false);
           JOptionPane.showMessageDialog(this, txtSelleccion.getText()," ", JOptionPane.ERROR_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(this, String.format("%s", error), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
       
       
       
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Panel_del_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_del_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_del_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_del_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_del_juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnInformacion;
    private javax.swing.JButton btnIniciar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea edtComo;
    private javax.swing.JTextArea edtInformacion;
    private javax.swing.JTextField edtJugador;
    private javax.swing.JFrame frmJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtSelleccion;
    // End of variables declaration//GEN-END:variables
}
