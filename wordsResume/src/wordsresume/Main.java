/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsresume;

import Classes.dotEnv;
import Classes.my_thread;
import Classes.pdfReader;
import Classes.textProcessing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author josue
 */
public class Main extends javax.swing.JFrame {

    static String[] words_to_search = new String[]{"regalos", "besos", "cachondeo", "delicioso", "compañia", "confianza", "comunicación", "pasión", "apoyo"};
    static dotEnv env = new dotEnv();
    
    private String file_path;
    private String directory_path;
    
    private boolean isFileSelected;
    private boolean isDirectorySelected;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.isDirectorySelected = false;
        this.isFileSelected = false;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        fileButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        directoryButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        words = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        directoryButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(38, 65, 143));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 40));

        jPanel5.setBackground(new java.awt.Color(225, 226, 225));

        fileButton.setBackground(new java.awt.Color(92, 107, 192));
        fileButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        fileButton.setForeground(new java.awt.Color(255, 255, 255));
        fileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azul2.png"))); // NOI18N
        fileButton.setText("Seleccionar");
        fileButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Selecciona un archivo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("o selecciona un directorio");

        directoryButton.setBackground(new java.awt.Color(92, 107, 192));
        directoryButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        directoryButton.setForeground(new java.awt.Color(255, 255, 255));
        directoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azul2.png"))); // NOI18N
        directoryButton.setText("Seleccionar");
        directoryButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        directoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryButtonActionPerformed(evt);
            }
        });

        startButton.setBackground(new java.awt.Color(92, 107, 192));
        startButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azul2.png"))); // NOI18N
        startButton.setText("Iniciar");
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Escriba las palabras a buscar separadas por comas");

        words.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordsActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(213, 0, 0));
        jLabel7.setText("En caso de no escribir palabras, las palabras por default son: regalos, besos, cachondeo, delicioso, compañia");

        jLabel8.setForeground(new java.awt.Color(213, 0, 0));
        jLabel8.setText("confianza,comunicación, pasión y apoyo.");

        directoryButton1.setBackground(new java.awt.Color(92, 107, 192));
        directoryButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        directoryButton1.setForeground(new java.awt.Color(255, 255, 255));
        directoryButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azul2.png"))); // NOI18N
        directoryButton1.setText("Salir");
        directoryButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        directoryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(281, 281, 281)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addGap(29, 29, 29)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(words, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(directoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(directoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(words, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(directoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 990, 390));

        jPanel4.setBackground(new java.awt.Color(92, 107, 192));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLICACIONES PARA COMUNICACION DE RED");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTEO DE PALABRAS EN TEXTO USANDO HILOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        pdfReader reader = new pdfReader();
        textProcessing processor = new textProcessing();
        String[] stop_words = null;
        if(isDirectorySelected) {
            JOptionPane.showMessageDialog(null,"Procesando los archivos en el directorio");
            try {
                stop_words = processor.getStopWords();
                this.processDirectory(processor, reader, stop_words);
            } catch (InterruptedException | FileNotFoundException | UnsupportedEncodingException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Procesando el archivo");
            try {
                stop_words = processor.getStopWords();
                this.processFile(processor, reader, stop_words);
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_startButtonActionPerformed

    
    private void wordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordsActionPerformed

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        pdfReader reader = new pdfReader();
        this.file_path = reader.rute(env.getInitialPath(),"Select file","pdf",true);
        this.isFileSelected = true;
        this.isDirectorySelected = false;
    }//GEN-LAST:event_fileButtonActionPerformed

    private void processFile(textProcessing processor, pdfReader reader , String[] stop_words) throws IOException, InterruptedException {
        String text = reader.readFile(this.file_path);
        if(words.getText().length() > 0) {
            words_to_search = words.getText().split(","); 
        }
        my_thread thread = new my_thread(text, stop_words, words_to_search);
        Thread new_thread = new Thread(thread);
        new_thread.start();
        new_thread.join();
        
        Map<String,Integer> result = new HashMap<>();
        result = thread.get_results();
        result.put("total_words", thread.get_total_words());
        
        reader.write_file(result,this.file_path);
    }
    
    private void directoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryButtonActionPerformed
        pdfReader reader = new pdfReader();
        this.directory_path = reader.rute(env.getInitialPath(),"Select file","pdf",false);
        this.isFileSelected = false;
        this.isDirectorySelected = true;
    }//GEN-LAST:event_directoryButtonActionPerformed

    private void directoryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_directoryButton1ActionPerformed

    private void processDirectory(textProcessing processor, pdfReader reader , String[] stop_words) throws InterruptedException, FileNotFoundException, UnsupportedEncodingException {
        ArrayList<String> files;
        ArrayList<String> texts = new ArrayList<>();
        files = reader.getFilesOnDirectory(this.directory_path);
        ArrayList<String> texts_paths = new ArrayList<>();
        if(words.getText().length() > 0) {
            words_to_search = words.getText().split(","); 
        }
        for(int index = 0; index < files.size(); index++){
            File new_file = new File(files.get(index));
            texts_paths.add(this.directory_path + "\\" + new_file);
        }
        Thread[] thread_array = new Thread[files.size()];
        texts_paths.forEach((String file) -> {
            System.out.println(file);
            try {
                texts.add(reader.readFile(file));
            } catch (IOException ex) { Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); }
        });
        my_thread threads[] = new my_thread[texts.size()];
        for(int index = 0; index < texts.size(); index++) { threads[index] = new my_thread(texts.get(index),stop_words, words_to_search); }
        
        for(int index = 0; index < texts.size(); index++) {
            thread_array[index] = new Thread(threads[index]);
            thread_array[index].start();
        }
        
        Map<String,Integer> list_of_results[] = new HashMap[texts.size()];
        
        for(int index = 0; index < texts.size(); index++){list_of_results[index] = new HashMap<>(); }
        
        for(int index = 0; index < texts.size(); index++) {
            thread_array[index].join();
            list_of_results[index] = threads[index].get_results();
            list_of_results[index].put("total_words", threads[index].get_total_words());
        }
        reader.write_file(list_of_results, files);
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton directoryButton;
    private javax.swing.JButton directoryButton1;
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField words;
    // End of variables declaration//GEN-END:variables
}
