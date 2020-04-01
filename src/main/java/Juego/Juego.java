/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.JOptionPane;

/**
 *
 * @author under
 */
public class Juego extends javax.swing.JFrame {
    int random,valormaletin,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,valorG;
    int nummaletin,i=0;
    public static Integer value;
    public static Integer maletin;
    int rango=24;
    int[] valores={-1,1,10,100,200,300,500,1000,2000,3000,5000,8000,10000,20000,30000,50000,80000,90000,100000,200000,300000,500000,700000,1000000};
    int arreglo[]=new int [24];
    int maletines[]=new int [24];
    
        
        
    public void Valoresmaletines(){
        
        for (i = 0; i < 24; i++){
            
                arreglo[i]=(int)(Math.random()*rango);
                for (int j = 1; j < i; j++) {
                    if(arreglo[i]==arreglo[j]){
                        i--;
                    }
                }
        }
        for (int j = 0; j < 24; j++) {
            if(maletines[j]==0){
                maletines[arreglo[j]]=valores[j];
               
         }
        }
    }
    
    private Integer promedio(){
        Integer prom=0,aux,i=0;
        if(rbd1.isSelected()){
            aux=Integer.valueOf(chbox1.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd2.isSelected()){
            aux=Integer.valueOf(chbox2.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd3.isSelected()){
            aux=Integer.valueOf(chbox3.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd4.isSelected()){
            aux=Integer.valueOf(chbox4.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd5.isSelected()){
            aux=Integer.valueOf(chbox5.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd6.isSelected()){
            aux=Integer.valueOf(checkbox6.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd7.isSelected()){
            aux=Integer.valueOf(chbox7.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd8.isSelected()){
            aux=Integer.valueOf(chbox8.getText());
            prom=prom+aux;
            i++;
        }
        if(rb9.isSelected()){
            aux=Integer.valueOf(chbox9.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd10.isSelected()){
            aux=Integer.valueOf(chbox10.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd11.isSelected()){
            aux=Integer.valueOf(chbox11.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd12.isSelected()){
            aux=Integer.valueOf(chbox12.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd13.isSelected()){
            aux=Integer.valueOf(chbox13.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd14.isSelected()){
            aux=Integer.valueOf(chbox14.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd15.isSelected()){
            aux=Integer.valueOf(chbos15.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd16.isSelected()){
            aux=Integer.valueOf(chbox16.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd17.isSelected()){
            aux=Integer.valueOf(chbox17.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd18.isSelected()){
            aux=Integer.valueOf(chbox18.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd19.isSelected()){
            aux=Integer.valueOf(chbos19.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd20.isSelected()){
            aux=Integer.valueOf(chbox20.getText());
            prom=prom+aux;
        }
        if(rbd21.isSelected()){
            aux=Integer.valueOf(chbox21.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd22.isSelected()){
            aux=Integer.valueOf(chbox22.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd23.isSelected()){
            aux=Integer.valueOf(chbox23.getText());
            prom=prom+aux;
            i++;
        }
        if(rbd24.isSelected()){
            aux=Integer.valueOf(chbox24.getText());
            prom=prom+aux;
            i++;
        }
        return (prom/i);
    }
    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        this.setLocationRelativeTo(null);
        random=0;
        valormaletin=0;
        valorG=0;
        cont1=6;
        cont2=5;
        cont3=4;
        cont4=3;
        cont5=2;
        cont6=1;
        cont7=1;
        cont8=1;
        cont9=1;
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chbox12 = new javax.swing.JCheckBox();
        chbox11 = new javax.swing.JCheckBox();
        chbox10 = new javax.swing.JCheckBox();
        chbox9 = new javax.swing.JCheckBox();
        chbox8 = new javax.swing.JCheckBox();
        chbox7 = new javax.swing.JCheckBox();
        checkbox6 = new javax.swing.JCheckBox();
        chbox5 = new javax.swing.JCheckBox();
        chbox4 = new javax.swing.JCheckBox();
        chbox3 = new javax.swing.JCheckBox();
        chbox2 = new javax.swing.JCheckBox();
        chbox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        chbox13 = new javax.swing.JCheckBox();
        chbox14 = new javax.swing.JCheckBox();
        chbos15 = new javax.swing.JCheckBox();
        chbox16 = new javax.swing.JCheckBox();
        chbox17 = new javax.swing.JCheckBox();
        chbox18 = new javax.swing.JCheckBox();
        chbos19 = new javax.swing.JCheckBox();
        chbox20 = new javax.swing.JCheckBox();
        chbox21 = new javax.swing.JCheckBox();
        chbox22 = new javax.swing.JCheckBox();
        chbox23 = new javax.swing.JCheckBox();
        chbox24 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rbd1 = new javax.swing.JRadioButton();
        rbd2 = new javax.swing.JRadioButton();
        rbd3 = new javax.swing.JRadioButton();
        rbd4 = new javax.swing.JRadioButton();
        rbd5 = new javax.swing.JRadioButton();
        rbd6 = new javax.swing.JRadioButton();
        rbd7 = new javax.swing.JRadioButton();
        rbd8 = new javax.swing.JRadioButton();
        rbd16 = new javax.swing.JRadioButton();
        rbd15 = new javax.swing.JRadioButton();
        rbd14 = new javax.swing.JRadioButton();
        rbd13 = new javax.swing.JRadioButton();
        rbd12 = new javax.swing.JRadioButton();
        rbd11 = new javax.swing.JRadioButton();
        rbd10 = new javax.swing.JRadioButton();
        rb9 = new javax.swing.JRadioButton();
        rbd17 = new javax.swing.JRadioButton();
        rbd18 = new javax.swing.JRadioButton();
        rbd19 = new javax.swing.JRadioButton();
        rbd20 = new javax.swing.JRadioButton();
        rbd21 = new javax.swing.JRadioButton();
        rbd22 = new javax.swing.JRadioButton();
        rbd23 = new javax.swing.JRadioButton();
        rbd24 = new javax.swing.JRadioButton();
        lblMaletin = new javax.swing.JLabel();
        lblContador = new javax.swing.JLabel();
        txtJuego = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DEAL OR NOT DEAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        chbox12.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox12.setText("8000");

        chbox11.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox11.setText("5000");

        chbox10.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox10.setText("3000");

        chbox9.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox9.setText("2000");

        chbox8.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox8.setText("1000");

        chbox7.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox7.setText("500");

        checkbox6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        checkbox6.setText("300");

        chbox5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox5.setText("200");
        chbox5.setActionCommand("200");

        chbox4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox4.setText("100");

        chbox3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox3.setText("10");

        chbox2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox2.setText("1");

        chbox1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox1.setText("-1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbox12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        chbox13.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox13.setText("10000");

        chbox14.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox14.setText("20000");

        chbos15.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbos15.setText("30000");

        chbox16.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox16.setText("50000");

        chbox17.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox17.setText("80000");

        chbox18.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox18.setText("90000");

        chbos19.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbos19.setText("100000");

        chbox20.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox20.setText("200000");

        chbox21.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox21.setText("300000");

        chbox22.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox22.setText("500000");

        chbox23.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox23.setText("700000");

        chbox24.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        chbox24.setText("1000000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbox23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbos19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbos15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbox24))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbox13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbos15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbos19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbox23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbox24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 0), null));

        rbd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd1.setText("1");
        rbd1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd1.setBorderPainted(true);
        rbd1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd1ItemStateChanged(evt);
            }
        });
        rbd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd1ActionPerformed(evt);
            }
        });

        rbd2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd2.setText("2");
        rbd2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd2.setBorderPainted(true);
        rbd2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd2ItemStateChanged(evt);
            }
        });
        rbd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd2ActionPerformed(evt);
            }
        });

        rbd3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd3.setText("3");
        rbd3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd3.setBorderPainted(true);
        rbd3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd3ItemStateChanged(evt);
            }
        });
        rbd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd3ActionPerformed(evt);
            }
        });

        rbd4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd4.setText("4");
        rbd4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd4.setBorderPainted(true);
        rbd4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd4ItemStateChanged(evt);
            }
        });
        rbd4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rbd4InputMethodTextChanged(evt);
            }
        });
        rbd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd4ActionPerformed(evt);
            }
        });

        rbd5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd5.setText("5");
        rbd5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd5.setBorderPainted(true);
        rbd5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd5ItemStateChanged(evt);
            }
        });
        rbd5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rbd5InputMethodTextChanged(evt);
            }
        });
        rbd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd5ActionPerformed(evt);
            }
        });

        rbd6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd6.setText("6");
        rbd6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd6.setBorderPainted(true);
        rbd6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd6ItemStateChanged(evt);
            }
        });
        rbd6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rbd6InputMethodTextChanged(evt);
            }
        });
        rbd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd6ActionPerformed(evt);
            }
        });

        rbd7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd7.setText("7");
        rbd7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd7.setBorderPainted(true);
        rbd7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd7ItemStateChanged(evt);
            }
        });
        rbd7.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rbd7InputMethodTextChanged(evt);
            }
        });
        rbd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd7ActionPerformed(evt);
            }
        });

        rbd8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd8.setText("8");
        rbd8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd8.setBorderPainted(true);
        rbd8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd8ItemStateChanged(evt);
            }
        });
        rbd8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                rbd8InputMethodTextChanged(evt);
            }
        });
        rbd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd8ActionPerformed(evt);
            }
        });

        rbd16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd16.setText("16");
        rbd16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd16.setBorderPainted(true);
        rbd16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd16ItemStateChanged(evt);
            }
        });
        rbd16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd16ActionPerformed(evt);
            }
        });

        rbd15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd15.setText("15");
        rbd15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd15.setBorderPainted(true);
        rbd15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd15ItemStateChanged(evt);
            }
        });
        rbd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd15ActionPerformed(evt);
            }
        });

        rbd14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd14.setText("14");
        rbd14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd14.setBorderPainted(true);
        rbd14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd14ItemStateChanged(evt);
            }
        });
        rbd14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd14ActionPerformed(evt);
            }
        });

        rbd13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd13.setText("13");
        rbd13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd13.setBorderPainted(true);
        rbd13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd13ItemStateChanged(evt);
            }
        });
        rbd13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd13ActionPerformed(evt);
            }
        });

        rbd12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd12.setText("12");
        rbd12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd12.setBorderPainted(true);
        rbd12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd12ItemStateChanged(evt);
            }
        });
        rbd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd12ActionPerformed(evt);
            }
        });

        rbd11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd11.setText("11");
        rbd11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd11.setBorderPainted(true);
        rbd11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd11ItemStateChanged(evt);
            }
        });
        rbd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd11ActionPerformed(evt);
            }
        });

        rbd10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd10.setText("10");
        rbd10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd10.setBorderPainted(true);
        rbd10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd10ItemStateChanged(evt);
            }
        });
        rbd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd10ActionPerformed(evt);
            }
        });

        rb9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb9.setText("9");
        rb9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rb9.setBorderPainted(true);
        rb9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb9ItemStateChanged(evt);
            }
        });
        rb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb9ActionPerformed(evt);
            }
        });

        rbd17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd17.setText("17");
        rbd17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd17.setBorderPainted(true);
        rbd17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd17ItemStateChanged(evt);
            }
        });
        rbd17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd17ActionPerformed(evt);
            }
        });

        rbd18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd18.setText("18");
        rbd18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd18.setBorderPainted(true);
        rbd18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd18ItemStateChanged(evt);
            }
        });
        rbd18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd18ActionPerformed(evt);
            }
        });

        rbd19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd19.setText("19");
        rbd19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd19.setBorderPainted(true);
        rbd19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd19ItemStateChanged(evt);
            }
        });
        rbd19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd19ActionPerformed(evt);
            }
        });

        rbd20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd20.setText("20");
        rbd20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd20.setBorderPainted(true);
        rbd20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd20ItemStateChanged(evt);
            }
        });
        rbd20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd20ActionPerformed(evt);
            }
        });

        rbd21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd21.setText("21");
        rbd21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd21.setBorderPainted(true);
        rbd21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd21ItemStateChanged(evt);
            }
        });
        rbd21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd21ActionPerformed(evt);
            }
        });

        rbd22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd22.setText("22");
        rbd22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd22.setBorderPainted(true);
        rbd22.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd22ItemStateChanged(evt);
            }
        });
        rbd22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd22ActionPerformed(evt);
            }
        });

        rbd23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd23.setText("23");
        rbd23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd23.setBorderPainted(true);
        rbd23.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd23ItemStateChanged(evt);
            }
        });
        rbd23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd23ActionPerformed(evt);
            }
        });

        rbd24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbd24.setText("24");
        rbd24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rbd24.setBorderPainted(true);
        rbd24.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbd24ItemStateChanged(evt);
            }
        });
        rbd24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbd1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbd2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rbd3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rb9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbd10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rbd11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbd17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbd18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rbd19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbd16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbd8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbd17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbd24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblMaletin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblContador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtJuego.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel2.setText("Maletines para");

        jLabel3.setText("que la Banca llame");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMaletin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3))
                        .addComponent(txtJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMaletin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd2ActionPerformed
       
        int cantidad = Integer.valueOf(rbd2.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[1];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox2.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[1];
            maletin=Integer.valueOf(valor);
        }
        
    }//GEN-LAST:event_rbd2ActionPerformed

    private void rbd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd3ActionPerformed
        int cantidad = Integer.valueOf(rbd3.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[2];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[2];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd3ActionPerformed

    private void rbd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd15ActionPerformed
        int cantidad = Integer.valueOf(rbd15.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[14];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[14];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd15ActionPerformed

    private void rbd14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd14ActionPerformed
        int cantidad = Integer.valueOf(rbd14.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[13];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[13];
            
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd14ActionPerformed

    private void rbd13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd13ActionPerformed
        int cantidad = Integer.valueOf(rbd13.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[12];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[12];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd13ActionPerformed

    private void rbd17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd17ActionPerformed
        int cantidad = Integer.valueOf(rbd17.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[16];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[16];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd17ActionPerformed

    private void rbd24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd24ActionPerformed
        int cantidad = Integer.valueOf(rbd24.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[23];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[23];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd24ActionPerformed

    private void rbd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd4ActionPerformed
        int cantidad = Integer.valueOf(rbd4.getText());
        
        int valor;
        
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[3];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[3];
            maletin=Integer.valueOf(valor);
            
        }
    }//GEN-LAST:event_rbd4ActionPerformed

    private void rbd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd1ActionPerformed
        int cantidad = Integer.valueOf(rbd1.getText());
        
        int valor;
        
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[0];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
            
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[0];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd1ActionPerformed

    private void rbd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd5ActionPerformed
        int cantidad = Integer.valueOf(rbd5.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[4];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[4];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd5ActionPerformed

    private void rbd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd6ActionPerformed
        int cantidad = Integer.valueOf(rbd6.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[5];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[5];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd6ActionPerformed

    private void rbd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd7ActionPerformed
        int cantidad = Integer.valueOf(rbd7.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[6];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[6];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd7ActionPerformed

    private void rbd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd8ActionPerformed
        int cantidad = Integer.valueOf(rbd8.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[7];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[7];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd8ActionPerformed

    private void rb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb9ActionPerformed
        int cantidad = Integer.valueOf(rb9.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[8];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[8];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rb9ActionPerformed

    private void rbd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd10ActionPerformed
        int cantidad = Integer.valueOf(rbd10.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[9];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[9];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd10ActionPerformed

    private void rbd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd11ActionPerformed
        int cantidad = Integer.valueOf(rbd11.getText());
        int valor;
        
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[10];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[10];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd11ActionPerformed

    private void rbd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd12ActionPerformed
        int cantidad = Integer.valueOf(rbd12.getText());
       
        int valor;
        
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[11];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[11];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd12ActionPerformed

    private void rbd16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd16ActionPerformed
        int cantidad = Integer.valueOf(rbd16.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[15];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[15];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd16ActionPerformed

    private void rbd18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd18ActionPerformed
        int cantidad = Integer.valueOf(rbd18.getText());

        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[17];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[17];
            maletin=Integer.valueOf(valor);
            
        }
    }//GEN-LAST:event_rbd18ActionPerformed

    private void rbd19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd19ActionPerformed
        int cantidad = Integer.valueOf(rbd19.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[18];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[18];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd19ActionPerformed

    private void rbd20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd20ActionPerformed
        int cantidad = Integer.valueOf(rbd20.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[19];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[19];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd20ActionPerformed

    private void rbd21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd21ActionPerformed
        int cantidad = Integer.valueOf(rbd21.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[20];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[20];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd21ActionPerformed

    private void rbd22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd22ActionPerformed
        int cantidad = Integer.valueOf(rbd22.getText());
        
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[21];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[21];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd22ActionPerformed

    private void rbd23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd23ActionPerformed
        int cantidad = Integer.valueOf(rbd23.getText());
       
        int valor;
        if(lblMaletin.getText().contains("Tu")){
            valor=maletines[22];
            txtJuego.setText(String.format("El Valor del Maletin %d es de :\n %d", cantidad,valor));
            int comp1=Integer.valueOf(chbox1.getText());
            int comp2=Integer.valueOf(chbox2.getText());
            int comp3=Integer.valueOf(chbox3.getText());
            int comp4=Integer.valueOf(chbox4.getText());
            int comp5=Integer.valueOf(chbox5.getText());
            int comp6=Integer.valueOf(checkbox6.getText());
            int comp7=Integer.valueOf(chbox7.getText());
            int comp8=Integer.valueOf(chbox8.getText());
            int comp9=Integer.valueOf(chbox9.getText());
            int comp10=Integer.valueOf(chbox10.getText());
            int comp11=Integer.valueOf(chbox11.getText());
            int comp12=Integer.valueOf(chbox12.getText());
            int comp13=Integer.valueOf(chbox13.getText());
            int comp14=Integer.valueOf(chbox14.getText());
            int comp15=Integer.valueOf(chbos15.getText());
            int comp16=Integer.valueOf(chbox16.getText());
            int comp17=Integer.valueOf(chbox17.getText());
            int comp18=Integer.valueOf(chbox18.getText());
            int comp19=Integer.valueOf(chbos19.getText());
            int comp20=Integer.valueOf(chbox20.getText());
            int comp21=Integer.valueOf(chbox21.getText());
            int comp22=Integer.valueOf(chbox22.getText());
            int comp23=Integer.valueOf(chbox23.getText());
            int comp24=Integer.valueOf(chbox24.getText());
            
            if(valor==comp1){
                chbox1.setSelected(true);
            }else if(valor==comp2){
                chbox12.setSelected(true);
            }else if(valor==comp3){
                chbox3.setSelected(true);
            }else if(valor==comp4){
                chbox4.setSelected(true);
            }else if(valor==comp5){
                chbox5.setSelected(true);
            }else if(valor==comp6){
                checkbox6.setSelected(true);
            }else if(valor==comp7){
                chbox7.setSelected(true);
            }else if(valor==comp8){
                chbox8.setSelected(true);
            }else if(valor==comp9){
                chbox9.setSelected(true);
            }else if(valor==comp10){
                chbox10.setSelected(true);
            }else if(valor==comp11){
                chbox11.setSelected(true);
            }else if(valor==comp12){
                chbox12.setSelected(true);
            }else if(valor==comp13){
                chbox13.setSelected(true);
            }else if(valor==comp14){
                chbox14.setSelected(true);
            }else if(valor==comp15){
                chbos15.setSelected(true);
            }else if(valor==comp16){
                chbox16.setSelected(true);
            }else if(valor==comp17){
                chbox17.setSelected(true);
            }else if(valor==comp18){
                chbox18.setSelected(true);
            }else if(valor==comp19){
                chbos19.setSelected(true);
            }else if(valor==comp20){
                chbox20.setSelected(true);
            }else if(valor==comp21){
                chbox21.setSelected(true);
            }else if(valor==comp22){
                chbox22.setSelected(true);
            }else if(valor==comp23){
                chbox23.setSelected(true);
            }else if(valor==comp24){
                chbox24.setSelected(true);
            }
        }else{
            lblMaletin.setText(String.format("Tu Maletin es el #%d", cantidad));
            Valoresmaletines();
            valor=maletines[22];
            maletin=Integer.valueOf(valor);
        }
    }//GEN-LAST:event_rbd23ActionPerformed

    private void rbd1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd1ItemStateChanged
        if(rbd1.isSelected()){
            //cont1=cont1+1;
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
            
    }//GEN-LAST:event_rbd1ItemStateChanged

    private void rbd2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd2ItemStateChanged
        if(rbd2.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd2ItemStateChanged

    private void rbd3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd3ItemStateChanged
        if(rbd3.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd3ItemStateChanged

    private void rbd4InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rbd4InputMethodTextChanged
     
    }//GEN-LAST:event_rbd4InputMethodTextChanged

    private void rbd5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rbd5InputMethodTextChanged
       
    }//GEN-LAST:event_rbd5InputMethodTextChanged

    private void rbd6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rbd6InputMethodTextChanged
        
    }//GEN-LAST:event_rbd6InputMethodTextChanged

    private void rbd7InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rbd7InputMethodTextChanged
        
    }//GEN-LAST:event_rbd7InputMethodTextChanged

    private void rbd8InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_rbd8InputMethodTextChanged
        
    }//GEN-LAST:event_rbd8InputMethodTextChanged

    private void rb9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb9ItemStateChanged
        if(rb9.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rb9ItemStateChanged

    private void rbd4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd4ItemStateChanged
            if(rbd4.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd4ItemStateChanged

    private void rbd5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd5ItemStateChanged
        if(rbd5.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd5ItemStateChanged

    private void rbd6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd6ItemStateChanged
        if(rbd6.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd6ItemStateChanged

    private void rbd7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd7ItemStateChanged
        if(rbd7.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd7ItemStateChanged

    private void rbd8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd8ItemStateChanged
        if(rbd8.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd8ItemStateChanged

    private void rbd10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd10ItemStateChanged
        if(rbd10.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd10ItemStateChanged

    private void rbd11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd11ItemStateChanged
        if(rbd11.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd11ItemStateChanged

    private void rbd12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd12ItemStateChanged
        if(rbd12.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd12ItemStateChanged

    private void rbd13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd13ItemStateChanged
        if(rbd13.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd13ItemStateChanged

    private void rbd14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd14ItemStateChanged
        if(rbd14.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd14ItemStateChanged

    private void rbd15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd15ItemStateChanged
        if(rbd15.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd15ItemStateChanged

    private void rbd16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd16ItemStateChanged
        if(rbd16.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd16ItemStateChanged

    private void rbd17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd17ItemStateChanged
        if(rbd17.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd17ItemStateChanged

    private void rbd18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd18ItemStateChanged
        if(rbd18.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd18ItemStateChanged

    private void rbd19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd19ItemStateChanged
        if(rbd19.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd19ItemStateChanged

    private void rbd20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd20ItemStateChanged
        if(rbd20.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd20ItemStateChanged

    private void rbd21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd21ItemStateChanged
        if(rbd21.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd21ItemStateChanged

    private void rbd22ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd22ItemStateChanged
        if(rbd22.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9+1));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd22ItemStateChanged

    private void rbd23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd23ItemStateChanged
        if(rbd23.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd23ItemStateChanged

    private void rbd24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbd24ItemStateChanged
        if(rbd24.isSelected()){
            if(cont1!=0&&cont1!=-1){
                cont1--;
                valorG=1;
            }else if(cont2!=0&&cont2!=-1){
                cont2--;
                valorG=2;
            }else if(cont3!=0&&cont3!=-1){
                cont3--;
                valorG=3;
            }else if(cont4!=0&&cont4!=-1){
                cont4--;
                valorG=4;
            }else if(cont5!=0&&cont5!=-1){
                cont5--;
                valorG=5;
            }else if(cont6!=0&&cont6!=-1){
                cont6--;
                valorG=6;
            }else if(cont7!=0&&cont7!=-1){
                cont7--;
                valorG=7;
            }else if(cont8!=0&&cont8!=-1){
                cont8--;
                valorG=8;
            }else if(cont9!=0&&cont9!=-1){
                cont9--;
                valorG=8;
            }
        }
        switch (valorG) {
            case 1:
                lblContador.setText(String.valueOf(cont1));
                break;
            case 2:
                lblContador.setText(String.valueOf(cont2));
                break;
            case 3:
                lblContador.setText(String.valueOf(cont3));
                break;
            case 4:
                lblContador.setText(String.valueOf(cont4));
                break;
            case 5:
                lblContador.setText(String.valueOf(cont5));
                break;
            case 6:
                lblContador.setText(String.valueOf(cont6));
                break;
            case 7:
                lblContador.setText(String.valueOf(cont7));
                break;
            case 8:
                lblContador.setText(String.valueOf(cont8));
                break;
            case 9:
                lblContador.setText(String.valueOf(cont9));
                break;
            default:
                break;
        }
        if(cont1==0 || cont2==0|| cont3==0|| cont4==0|| cont5==0|| cont6==0|| cont7==0|| cont8==0|| cont9==0){
            if(cont1==0){
                cont1=-1;
            }else if(cont2==0){
                cont2=-1;
            }else if(cont3==0){
                cont3=-1;
            }else if(cont4==0){
                cont4=-1;
            }else if(cont5==0){
                cont5=-1;
            }else if(cont6==0){
                cont6=-1;
            }else if(cont7==0){
                cont7=-1;
            }else if(cont8==0){
                cont8=-1;
            }else if(cont9==0){
                cont9=-1;
            }
            value=promedio();
            Banca abrirbanca=new Banca();
            abrirbanca.setVisible(true);
        }
    }//GEN-LAST:event_rbd24ItemStateChanged

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbos15;
    private javax.swing.JCheckBox chbos19;
    private javax.swing.JCheckBox chbox1;
    private javax.swing.JCheckBox chbox10;
    private javax.swing.JCheckBox chbox11;
    private javax.swing.JCheckBox chbox12;
    private javax.swing.JCheckBox chbox13;
    private javax.swing.JCheckBox chbox14;
    private javax.swing.JCheckBox chbox16;
    private javax.swing.JCheckBox chbox17;
    private javax.swing.JCheckBox chbox18;
    private javax.swing.JCheckBox chbox2;
    private javax.swing.JCheckBox chbox20;
    private javax.swing.JCheckBox chbox21;
    private javax.swing.JCheckBox chbox22;
    private javax.swing.JCheckBox chbox23;
    private javax.swing.JCheckBox chbox24;
    private javax.swing.JCheckBox chbox3;
    private javax.swing.JCheckBox chbox4;
    private javax.swing.JCheckBox chbox5;
    private javax.swing.JCheckBox chbox7;
    private javax.swing.JCheckBox chbox8;
    private javax.swing.JCheckBox chbox9;
    private javax.swing.JCheckBox checkbox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblMaletin;
    private javax.swing.JRadioButton rb9;
    private javax.swing.JRadioButton rbd1;
    private javax.swing.JRadioButton rbd10;
    private javax.swing.JRadioButton rbd11;
    private javax.swing.JRadioButton rbd12;
    private javax.swing.JRadioButton rbd13;
    private javax.swing.JRadioButton rbd14;
    private javax.swing.JRadioButton rbd15;
    private javax.swing.JRadioButton rbd16;
    private javax.swing.JRadioButton rbd17;
    private javax.swing.JRadioButton rbd18;
    private javax.swing.JRadioButton rbd19;
    private javax.swing.JRadioButton rbd2;
    private javax.swing.JRadioButton rbd20;
    private javax.swing.JRadioButton rbd21;
    private javax.swing.JRadioButton rbd22;
    private javax.swing.JRadioButton rbd23;
    private javax.swing.JRadioButton rbd24;
    private javax.swing.JRadioButton rbd3;
    private javax.swing.JRadioButton rbd4;
    private javax.swing.JRadioButton rbd5;
    private javax.swing.JRadioButton rbd6;
    private javax.swing.JRadioButton rbd7;
    private javax.swing.JRadioButton rbd8;
    private javax.swing.JLabel txtJuego;
    // End of variables declaration//GEN-END:variables
}
