
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lopez
 */
public class principal extends javax.swing.JFrame {

    
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        this.setLocationRelativeTo(null); 
         this.setResizable(false);
        jlabelletras.setText("a");
        
        jlabelnumeros.setText("0");
       
        transparente(ingresoletra);
        transparente(ingresonumero);
        centrar(jlabelletras);
        centrar(jlabelnumeros);
        botones(iniciarnumeros);
        botones(iniciarletras);
        
         
    }
    public void transparente(JTextField x){
         x.setOpaque(false);
        x.setBackground(new Color(0,0,0,0));          
        x.setHorizontalAlignment(x.CENTER);
    }
    public void botones(JButton x){
        x.setOpaque(false);
       
    }
    public void centrar(JLabel x){
         x.setOpaque(false);
        x.setBackground(new Color(0,0,0,0));          
        x.setHorizontalAlignment(x.CENTER);
    }
        int posicion=0;
    boolean activacion=false;
    public void letras(String x){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresonumero = new javax.swing.JTextField();
        ingresoletra = new javax.swing.JTextField();
        jlabelletras = new javax.swing.JLabel();
        jlabelnumeros = new javax.swing.JLabel();
        iniciarletras = new javax.swing.JButton();
        iniciarnumeros = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresonumero.setFont(new java.awt.Font("Ebrima", 1, 45)); // NOI18N
        ingresonumero.setForeground(new java.awt.Color(255, 255, 255));
        ingresonumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresonumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingresonumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresonumeroKeyTyped(evt);
            }
        });
        getContentPane().add(ingresonumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, 70));

        ingresoletra.setFont(new java.awt.Font("Ebrima", 1, 45)); // NOI18N
        ingresoletra.setForeground(new java.awt.Color(255, 255, 255));
        ingresoletra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoletra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingresoletra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoletraKeyTyped(evt);
            }
        });
        getContentPane().add(ingresoletra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 110, 70));

        jlabelletras.setFont(new java.awt.Font("Ebrima", 1, 100)); // NOI18N
        jlabelletras.setForeground(new java.awt.Color(255, 255, 255));
        jlabelletras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlabelletras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 150, 130));

        jlabelnumeros.setFont(new java.awt.Font("Ebrima", 1, 100)); // NOI18N
        jlabelnumeros.setForeground(new java.awt.Color(255, 255, 255));
        jlabelnumeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlabelnumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, 130));

        iniciarletras.setBackground(new java.awt.Color(0, 102, 153));
        iniciarletras.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        iniciarletras.setText("Iniciar");
        iniciarletras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        iniciarletras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarletrasActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarletras, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 90, 40));

        iniciarnumeros.setBackground(new java.awt.Color(0, 102, 153));
        iniciarnumeros.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        iniciarnumeros.setText("Iniciar");
        iniciarnumeros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        iniciarnumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarnumerosActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarnumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 90, 40));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("Ingrese un número:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setText("Ingrese una letra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1a8b6a638a6d578d0e1b6aa96fde1017.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 430));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresonumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresonumeroKeyTyped
       char car = evt.getKeyChar();
       if(Character.isDigit(car)){
          
        }else {
            evt.consume();
            getToolkit().beep();
        }
            if (ingresonumero.getText().length() == 3) {
           evt.consume();
            }
       
           
    }//GEN-LAST:event_ingresonumeroKeyTyped

    private void ingresoletraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoletraKeyTyped
        char car = evt.getKeyChar();
       if(Character.isLetter(car)){
          
        }else {
            evt.consume();
            getToolkit().beep();
        }
            if (ingresoletra.getText().length() == 1) {
           evt.consume();
            }
    }//GEN-LAST:event_ingresoletraKeyTyped
 String letmin;
    private void iniciarletrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarletrasActionPerformed
        Hilo letras = new Hilo();
        letras.start();
    }//GEN-LAST:event_iniciarletrasActionPerformed

    private void iniciarnumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarnumerosActionPerformed
        Actualizar mostrar = new Actualizar();
        mostrar.start();
    }//GEN-LAST:event_iniciarnumerosActionPerformed
    
    public class Actualizar extends Thread{
       int num = Integer.parseInt(ingresonumero.getText());
       @Override
       public void run(){
            for(int j=num; j< 101; j++){
                jlabelnumeros.setText(String.valueOf(j));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }     
            }
       }
    }
    public class Hilo extends Thread{
       private String letrasmin=ingresoletra.getText().toLowerCase();
        @Override
        public void run(){
            String [] abc = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
    
        for(int i = 0; i < abc.length; i++){ 
            if(letrasmin.equals(abc[i])){
                System.out.println("si es letra");
                System.out.println("el numero de posicion es: "+i);
                posicion=i;
                activacion=true;
                
            }
        }
        if(activacion==true){
            for(int i = posicion+1; i < abc.length; i++){ 
                System.out.print(abc[i]+" ");
                
                try {
                    jlabelletras.setText(abc[i]);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
            
        }
        }
        
        
    }// fin del hilo
    
    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ingresoletra;
    private javax.swing.JTextField ingresonumero;
    private javax.swing.JButton iniciarletras;
    private javax.swing.JButton iniciarnumeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlabelletras;
    private javax.swing.JLabel jlabelnumeros;
    // End of variables declaration//GEN-END:variables
}
