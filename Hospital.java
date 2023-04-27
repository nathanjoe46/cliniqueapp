package Main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.ImageIcon;

/**
 *
 * @author Sajeeb
 */
public class Hospital extends javax.swing.JFrame {

    public Hospital() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
                //  appel au methide de hashage
        String hashForAdmin = Hospital.hashPassword("jonathan");
        
         System.out.println(hashForAdmin);

    }


//  Hash Pasword : C'est une methode de classe : Une méthode de classe ou une méthode statique est une méthode qui n'agit pas sur des variables d'instance mais uniquement sur des variables de classe.
    public static String hashPassword(String password) {
        try {
            // fonction de hashage cryptographique La fonction utilise l'algorithme SHA-256 pour calculer le hachage, qui est une fonction de hachage cryptographique considérée comme sécurisée et résistante aux collisions.
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedPassword = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedPassword) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//  On declare et initialise les variables pour la classe Hopital, ...Composant Graphiques 
        MainF = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        adminIcon = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        mLabel = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        receptionIcon = new javax.swing.JLabel();
        receptionLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        doctorIcon = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenue au Polyclinique de Delmas");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));
// Afficher l'entete de la fenetre
        MainF.setName("Bienvenue au Polyclinique de Delmas"); // NOI18N

        jPanel1.setBackground(java.awt.Color.lightGray);

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin.png"))); // NOI18N
        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminIconMouseClicked(evt);
            }
        });

        // Component 1
        adminLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setText("Admin");
        adminLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            // Lorque l'admin clique on fait appel a la fonction adminlabelmouseclicked
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLabelMouseClicked(evt);
            }
        });

        //  GroupLayout :   gestionnaire de mise en page (layout) flexible et puissant fourni dans la bibliothèque Swing de Java pour créer des interfaces utilisateur graphiques. Il permet de positionner les composants graphiques de manière précise et cohérente, tout en offrant une grande flexibilité pour la disposition des éléments.
        
        // Le GroupLayout fonctionne en définissant des groupes de composants graphiques et en spécifiant comment ces groupes doivent être alignés. Chaque groupe peut être aligné verticalement ou horizontalement, et peut inclure un ou plusieurs composants graphiques. Les groupes sont définis à l'aide de la méthode createParallelGroup() pour créer un groupe parallèle et createSequentialGroup() pour créer un groupe séquentiel.

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminLabel)
                    .addComponent(adminIcon))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Arial", 0, 34)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Polyclinic of Delmas");

        jPanel2.setBackground(java.awt.Color.lightGray);

        // Component for Receptionist
        receptionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reception.png"))); // NOI18N

        // Fonction qui declenche au click d'un utilisateur sur le bouton receptionis
        receptionIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionIconMouseClicked(evt);
            }
        });

        receptionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        receptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        receptionLabel.setText("Receptionist");
        receptionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(receptionLabel)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(receptionIcon)
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receptionIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receptionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.lightGray);

        // Component 2

        doctorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/doctor.png"))); // NOI18N
        doctorIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorIconMouseClicked(evt);
            }
        });

        doctorLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        doctorLabel.setForeground(new java.awt.Color(255, 255, 255));
        doctorLabel.setText("Doctor");
        doctorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorLabel)
                    .addComponent(doctorIcon))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doctorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        // Le titre
        jLabel1.setText("Login As");
//  Ici on a le container : Ce bout de code permert de designer un container et d'appliquer une couleur
        // javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        // jPanel4.setLayout(jPanel4Layout);
        // jPanel4Layout.setHorizontalGroup(
        //     jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        //         .addContainerGap(88, Short.MAX_VALUE)
        //         .addComponent(jLabel1)
        //         .addContainerGap())
        // );
        // jPanel4Layout.setVerticalGroup(
        //     jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        //     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        //         .addContainerGap(23, Short.MAX_VALUE)
        //         .addComponent(jLabel1)
        //         .addGap(20, 20, 20))
        // );

        // jPanel5.setBackground(new java.awt.Color(0, 102, 102));
// Le texte qui s'affiche dans le carre
        // jLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        // jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel2.setText("Welcome");

        // jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        // jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel3.setText("to");

        // jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 30)); // NOI18N
        // jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel4.setText("Mini Hospital");
        // jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainFLayout = new javax.swing.GroupLayout(MainF);
        MainF.setLayout(MainFLayout);
        MainFLayout.setHorizontalGroup(
            MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainFLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(MainFLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainFLayout.setVerticalGroup(
            MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(mLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainFLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainFLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(MainFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // On cree la fonction adminMouseCliked , c'est cette fonction qui va declencher au click de l'admin
    
    private void adminLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminLabelMouseClicked

    private void doctorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabelMouseClicked
        Doctor doctor = new Doctor();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorLabelMouseClicked

    private void receptionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionLabelMouseClicked
        Receptionist receptionist = new Receptionist();
        receptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_receptionLabelMouseClicked

    private void adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminIconMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminIconMouseClicked

    private void doctorIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorIconMouseClicked
        Doctor doctor = new Doctor();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorIconMouseClicked

    private void receptionIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionIconMouseClicked
        Receptionist receptionist = new Receptionist();
        receptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_receptionIconMouseClicked

    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
           Hospital hp = new Hospital();
          hp.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainF;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel doctorIcon;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label mLabel;
    private javax.swing.JLabel receptionIcon;
    private javax.swing.JLabel receptionLabel;
    // End of variables declaration//GEN-END:variables
}


