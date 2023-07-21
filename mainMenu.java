package MenuNotpad;


import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class mainMenu extends javax.swing.JFrame {

    public mainMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        openShort = new javax.swing.JMenuItem();
        saveShort = new javax.swing.JMenuItem();
        exitShort = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jMenu5.setText("Document");

        openShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openShort.setText("Open ");
        openShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openShortActionPerformed(evt);
            }
        });
        jMenu5.add(openShort);

        saveShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveShort.setText("Save");
        saveShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveShortActionPerformed(evt);
            }
        });
        jMenu5.add(saveShort);

        exitShort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitShort.setText("Exit");
        exitShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitShortActionPerformed(evt);
            }
        });
        jMenu5.add(exitShort);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");

        jMenu1.setText("Color");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Change Color");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenu6.add(jMenu1);

        jMenu3.setText("Type");

        jMenuItem6.setText("Arial");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem3.setText("Time Roman");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu6.add(jMenu3);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openShortActionPerformed
      JFileChooser jf = new JFileChooser();
      int i = jf.showOpenDialog(this);
      
        if (i==JFileChooser.APPROVE_OPTION) {
            File file = jf.getSelectedFile();
           try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
                    String  text="";
                    
                    while (scanner.hasNextLine()) {
                            text+=scanner.nextLine();
                   
               }
                    textArea.setText(text);
                    
           } catch (FileNotFoundException ex) {
              Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
          }
           
        
 
      
        } 
    }//GEN-LAST:event_openShortActionPerformed

    private void saveShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveShortActionPerformed
      JFileChooser jf = new JFileChooser();
      int input = jf.showSaveDialog(this);
      
      if(input==JFileChooser.APPROVE_OPTION){
          String document = jf.getSelectedFile().getPath();
          try(FileWriter filewr = new FileWriter(document)){
              
              filewr.write(textArea.getText());
              
          
          } catch (IOException ex) {
              Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
          }
          
      }
      
    }//GEN-LAST:event_saveShortActionPerformed

    private void exitShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitShortActionPerformed
      JOptionPane.showMessageDialog(this, "Programdan cixilir");
      System.exit(0);
      
      
    }//GEN-LAST:event_exitShortActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Color color = JColorChooser.showDialog(this, "Bir reng secin", Color.yellow);
        textArea.setForeground(color);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Font font = new Font("Times New Roman",Font.PLAIN,22);
       textArea.setFont(font);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       Font font = new Font("Arial",Font.PLAIN,20);
       textArea.setFont(font);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitShort;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openShort;
    private javax.swing.JMenuItem saveShort;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
