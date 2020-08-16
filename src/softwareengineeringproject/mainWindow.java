/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineeringproject;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 23657952
 */
public class mainWindow extends javax.swing.JFrame {
    
    /**
     * Creates new form mainWindow
     */
    public static int teamSize = 4;
    //public static int teamSizeFinal = 0;
    public static int stuCount = 0;
    public static int progCount = 0;
    public static int desiCount = 0;
    public static int reseCount = 0;
    public static int testCount = 0;
    public int progCountMain = 0;
    public int desiCountMain = 0;
    public int reseCountMain = 0;
    public int testCountMain = 0;
    public static int teamNumber = 1;
    
    static public String[] nameLabels = new String[30]; //array of name labels
    static public String[] skillLabels = new String[30]; //array of skill labels
    static public student[] studentList = new student[30]; //array of all students
    static public student[] programmerList = new student[30]; //array of all programming students
    static public student[] designerList = new student[30]; //array of all design students
    static public student[] researcherList = new student[30]; //array of all research students
    static public student[] testerList = new student[30]; //array of all testing students
    static public String[] programmerNameList = new String[30]; //array of all programming students
    static public String[] designerNameList = new String[30]; //array of all design students
    static public String[] researcherNameList = new String[30]; //array of all research students
    static public String[] testerNameList = new String[30]; //array of all testing students
    static public String[] team1Array = new String[6];
    static public String[] team2Array = new String[6];
    static public String[] team3Array = new String[6];
    static public String[] team4Array = new String[6];
    static public String[] team5Array = new String[6];
    static public String[] team6Array = new String[6];
    static public String[] team7Array = new String[6];
    static public String[] team8Array = new String[6];
    static public String[] team9Array = new String[6];
    static public String[] team10Array = new String[6];
    static public String[] team11Array = new String[6];
    static public String[] team12Array = new String[6];
    static public String[] team13Array = new String[6];
    static public String[] team14Array = new String[6];
    static public String[] team15Array = new String[6];
    
//    static public team[] team1 = new team[6];
//    static public team[] team2 = new team[6];
//    static public team[] team3 = new team[6];
//    static public team[] team4 = new team[6];
//    static public team[] team5 = new team[6];
//    static public team[] team6 = new team[6];
//    static public team[] team7 = new team[6];
//    static public team[] team8 = new team[6];
//    static public team[] team9 = new team[6];
//    static public team[] team10 = new team[6];
    static team team1 = new team(1, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team2 = new team(2, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team3 = new team(3, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team4 = new team(4, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team5 = new team(5, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team6 = new team(6, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team7 = new team(7, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team8 = new team(8, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team9 = new team(9, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    static team team10 = new team(10, new student[]{new student("",""),new student("",""),new student("",""),new student("",""),new student("",""),new student("","")});
    
    static public team[] teams = new team[]{team1, team2, team3, team4, team5, team6, team7, team8, team9, team10};
    
    //static public ArrayList<String> nameLabels = new ArrayList<String>();
    //static public ArrayList<String> skillLabels = new ArrayList<String>();
    
    
    public mainWindow() {
        initComponents();
    }
    
    public static void refresh(){
        name1.setText(mainWindow.nameLabels[0]);
        name2.setText(mainWindow.nameLabels[1]);
        name3.setText(mainWindow.nameLabels[2]);
        name4.setText(mainWindow.nameLabels[3]);
        name5.setText(mainWindow.nameLabels[4]);
        name6.setText(mainWindow.nameLabels[5]);
        name7.setText(mainWindow.nameLabels[6]);
        name8.setText(mainWindow.nameLabels[7]);
        name9.setText(mainWindow.nameLabels[8]);
        name10.setText(mainWindow.nameLabels[9]);
        name11.setText(mainWindow.nameLabels[10]);
        name12.setText(mainWindow.nameLabels[11]);
        name13.setText(mainWindow.nameLabels[12]);
        name14.setText(mainWindow.nameLabels[13]);
        name15.setText(mainWindow.nameLabels[14]);
        name16.setText(mainWindow.nameLabels[15]);
        name17.setText(mainWindow.nameLabels[16]);
        name18.setText(mainWindow.nameLabels[17]);
        name19.setText(mainWindow.nameLabels[18]);
        name20.setText(mainWindow.nameLabels[19]);
        name21.setText(mainWindow.nameLabels[20]);
        name22.setText(mainWindow.nameLabels[21]);
        name23.setText(mainWindow.nameLabels[22]);
        name24.setText(mainWindow.nameLabels[23]);
        name25.setText(mainWindow.nameLabels[24]);
        name26.setText(mainWindow.nameLabels[25]);
        name27.setText(mainWindow.nameLabels[26]);
        name28.setText(mainWindow.nameLabels[27]);
        name29.setText(mainWindow.nameLabels[28]);
        name30.setText(mainWindow.nameLabels[29]);
        skill1.setText(mainWindow.skillLabels[0]);
        skill2.setText(mainWindow.skillLabels[1]);
        skill3.setText(mainWindow.skillLabels[2]);
        skill4.setText(mainWindow.skillLabels[3]);
        skill5.setText(mainWindow.skillLabels[4]);
        skill6.setText(mainWindow.skillLabels[5]);
        skill7.setText(mainWindow.skillLabels[6]);
        skill8.setText(mainWindow.skillLabels[7]);
        skill9.setText(mainWindow.skillLabels[8]);
        skill10.setText(mainWindow.skillLabels[9]);
        skill11.setText(mainWindow.skillLabels[10]);
        skill12.setText(mainWindow.skillLabels[11]);
        skill13.setText(mainWindow.skillLabels[12]);
        skill14.setText(mainWindow.skillLabels[13]);
        skill15.setText(mainWindow.skillLabels[14]);
        skill16.setText(mainWindow.skillLabels[15]);
        skill17.setText(mainWindow.skillLabels[16]);
        skill18.setText(mainWindow.skillLabels[17]);
        skill19.setText(mainWindow.skillLabels[18]);
        skill20.setText(mainWindow.skillLabels[19]);
        skill21.setText(mainWindow.skillLabels[20]);
        skill22.setText(mainWindow.skillLabels[21]);
        skill23.setText(mainWindow.skillLabels[22]);
        skill24.setText(mainWindow.skillLabels[23]);
        skill25.setText(mainWindow.skillLabels[24]);
        skill26.setText(mainWindow.skillLabels[25]);
        skill27.setText(mainWindow.skillLabels[26]);
        skill28.setText(mainWindow.skillLabels[27]);
        skill29.setText(mainWindow.skillLabels[28]);
        skill30.setText(mainWindow.skillLabels[29]);
    }
    
    public static void createFrame(){
        java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new mainWindow().setVisible(true);
                    jLabelTeamSize.setText(Integer.toString(teamSize));
                }
            });    
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButtonNewStudent = new javax.swing.JButton();
        jButtonCreateGroups = new javax.swing.JButton();
        jButtonSetTeamSize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTeamSize = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelTeamSize = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        name13 = new javax.swing.JLabel();
        name14 = new javax.swing.JLabel();
        name15 = new javax.swing.JLabel();
        name16 = new javax.swing.JLabel();
        name17 = new javax.swing.JLabel();
        name18 = new javax.swing.JLabel();
        name19 = new javax.swing.JLabel();
        name20 = new javax.swing.JLabel();
        name21 = new javax.swing.JLabel();
        name22 = new javax.swing.JLabel();
        name23 = new javax.swing.JLabel();
        name24 = new javax.swing.JLabel();
        name25 = new javax.swing.JLabel();
        name26 = new javax.swing.JLabel();
        skill1 = new javax.swing.JLabel();
        skill2 = new javax.swing.JLabel();
        skill3 = new javax.swing.JLabel();
        skill4 = new javax.swing.JLabel();
        skill5 = new javax.swing.JLabel();
        skill6 = new javax.swing.JLabel();
        skill7 = new javax.swing.JLabel();
        skill8 = new javax.swing.JLabel();
        skill9 = new javax.swing.JLabel();
        skill10 = new javax.swing.JLabel();
        skill11 = new javax.swing.JLabel();
        skill12 = new javax.swing.JLabel();
        skill13 = new javax.swing.JLabel();
        skill14 = new javax.swing.JLabel();
        skill15 = new javax.swing.JLabel();
        skill16 = new javax.swing.JLabel();
        skill17 = new javax.swing.JLabel();
        skill18 = new javax.swing.JLabel();
        skill19 = new javax.swing.JLabel();
        skill20 = new javax.swing.JLabel();
        skill21 = new javax.swing.JLabel();
        skill22 = new javax.swing.JLabel();
        skill23 = new javax.swing.JLabel();
        skill24 = new javax.swing.JLabel();
        skill25 = new javax.swing.JLabel();
        skill26 = new javax.swing.JLabel();
        name27 = new javax.swing.JLabel();
        name28 = new javax.swing.JLabel();
        name29 = new javax.swing.JLabel();
        name30 = new javax.swing.JLabel();
        skill27 = new javax.swing.JLabel();
        skill28 = new javax.swing.JLabel();
        skill29 = new javax.swing.JLabel();
        skill30 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNewStudent.setText("Add Student");
        jButtonNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewStudentActionPerformed(evt);
            }
        });

        jButtonCreateGroups.setText("Create Teams");
        jButtonCreateGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateGroupsActionPerformed(evt);
            }
        });

        jButtonSetTeamSize.setText("Set");
        jButtonSetTeamSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetTeamSizeActionPerformed(evt);
            }
        });

        jLabel1.setText("Edge Hill Team Creator");

        jTextFieldTeamSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeamSizeActionPerformed(evt);
            }
        });

        jLabel6.setText("Team Size");

        jLabelTeamSize.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jTextFieldTeamSize, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonSetTeamSize)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTeamSize)))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCreateGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jButtonNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSetTeamSize)
                        .addComponent(jLabelTeamSize))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldTeamSize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(140, 140, 140)
                .addComponent(jButtonCreateGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Student List");

        jLabel3.setText("Student");

        jLabel4.setText("Skill");

        name1.setText(mainWindow.nameLabels[0]);

        name2.setText(mainWindow.nameLabels[1]);

        name3.setText(mainWindow.nameLabels[2]);

        name4.setText(mainWindow.nameLabels[3]);

        name5.setText(mainWindow.nameLabels[4]);

        name6.setText(mainWindow.nameLabels[5]);

        name7.setText(mainWindow.nameLabels[6]);

        name8.setText(mainWindow.nameLabels[7]);

        name9.setText(mainWindow.nameLabels[8]);

        name10.setText(mainWindow.nameLabels[9]);

        name11.setText(mainWindow.nameLabels[10]);

        name12.setText(mainWindow.nameLabels[11]);

        name13.setText(mainWindow.nameLabels[12]);

        name14.setText(mainWindow.nameLabels[13]);

        name15.setText(mainWindow.nameLabels[14]);

        name16.setText(mainWindow.nameLabels[15]);

        name17.setText(mainWindow.nameLabels[16]);

        name18.setText(mainWindow.nameLabels[17]);

        name19.setText(mainWindow.nameLabels[18]);

        name20.setText(mainWindow.nameLabels[19]);

        name21.setText(mainWindow.nameLabels[20]);

        name22.setText(mainWindow.nameLabels[21]);

        name23.setText(mainWindow.nameLabels[22]);

        name24.setText(mainWindow.nameLabels[23]);

        name25.setText(mainWindow.nameLabels[24]);

        name26.setText(mainWindow.nameLabels[25]);

        skill1.setText(mainWindow.skillLabels[0]);

        skill2.setText(mainWindow.skillLabels[1]);

        skill3.setText(mainWindow.skillLabels[2]);

        skill4.setText(mainWindow.skillLabels[3]);

        skill5.setText(mainWindow.skillLabels[4]);

        skill6.setText(mainWindow.skillLabels[5]);

        skill7.setText(mainWindow.skillLabels[6]);

        skill8.setText(mainWindow.skillLabels[7]);

        skill9.setText(mainWindow.skillLabels[8]);

        skill10.setText(mainWindow.skillLabels[9]);

        skill11.setText(mainWindow.skillLabels[10]);

        skill12.setText(mainWindow.skillLabels[11]);

        skill13.setText(mainWindow.skillLabels[12]);

        skill14.setText(mainWindow.skillLabels[13]);

        skill15.setText(mainWindow.skillLabels[14]);

        skill16.setText(mainWindow.skillLabels[15]);

        skill17.setText(mainWindow.skillLabels[16]);

        skill18.setText(mainWindow.skillLabels[17]);

        skill19.setText(mainWindow.skillLabels[18]);

        skill20.setText(mainWindow.skillLabels[19]);

        skill21.setText(mainWindow.skillLabels[20]);

        skill22.setText(mainWindow.skillLabels[21]);

        skill23.setText(mainWindow.skillLabels[22]);

        skill24.setText(mainWindow.skillLabels[23]);

        skill25.setText(mainWindow.skillLabels[24]);

        skill26.setText(mainWindow.skillLabels[25]);

        name27.setText(mainWindow.nameLabels[26]);

        name28.setText(mainWindow.nameLabels[27]);

        name29.setText(mainWindow.nameLabels[28]);

        name30.setText(mainWindow.nameLabels[29]);

        skill27.setText(mainWindow.skillLabels[26]);

        skill28.setText(mainWindow.skillLabels[27]);

        skill29.setText(mainWindow.skillLabels[28]);

        skill30.setText(mainWindow.skillLabels[29]);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(115, 115, 115))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill13))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill16))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill19))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill21))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill23))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill24))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill25))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill26)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill27))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill30))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill28))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(skill29)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1)
                    .addComponent(skill1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2)
                    .addComponent(skill2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3)
                    .addComponent(skill3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name4)
                    .addComponent(skill4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name5)
                    .addComponent(skill5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name6)
                    .addComponent(skill6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name7)
                    .addComponent(skill7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name8)
                    .addComponent(skill8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name9)
                    .addComponent(skill9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name10)
                    .addComponent(skill10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name11)
                    .addComponent(skill11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name12)
                    .addComponent(skill12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name13)
                    .addComponent(skill13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name14)
                    .addComponent(skill14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name15)
                    .addComponent(skill15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name16)
                    .addComponent(skill16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name17)
                    .addComponent(skill17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name18)
                    .addComponent(skill18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name19)
                    .addComponent(skill19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name20)
                    .addComponent(skill20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name21)
                    .addComponent(skill21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name22)
                    .addComponent(skill22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name23)
                    .addComponent(skill23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name24)
                    .addComponent(skill24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name25)
                    .addComponent(skill25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name26)
                    .addComponent(skill26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name27)
                    .addComponent(skill27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name28)
                    .addComponent(skill28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name29)
                    .addComponent(skill29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name30)
                    .addComponent(skill30))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTeamSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeamSizeActionPerformed

    }//GEN-LAST:event_jTextFieldTeamSizeActionPerformed

    private void jButtonNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewStudentActionPerformed
        newStudent.createFrame();
    }//GEN-LAST:event_jButtonNewStudentActionPerformed

    private void jButtonCreateGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateGroupsActionPerformed
        if(stuCount < 6){
            JOptionPane.showMessageDialog(this, "Please enter at least 6 students before attempting to create teams.");
        }
        else{
        int diff = 6 - teamSize; 
        int proNum = 0;
        int desNum = 0;
        int resNum = 0;
        int tesNum = 0;
        int loopProCount = 0;
        int loopDesCount = 0;
        int loopResCount = 0;
        int loopTesCount = 0;
        int loopCount = 1;
        int thisTeamSize1 = 0;
        int thisTeamSize2 = 0;
        int thisTeamSize3 = 0;
        int thisTeamSize4 = 0;
        int thisTeamSize5 = 0;
        int thisTeamSize6 = 0;
        int thisTeamSize7 = 0;
        int thisTeamSize8 = 0;
        int thisTeamSize9 = 0;
        int thisTeamSize10 = 0;
        
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[0].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize1++;
                if(thisTeamSize1 > teamSize){
                    thisTeamSize1--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[0].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize1++;
                if(thisTeamSize1 > teamSize){
                    thisTeamSize1--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[0].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize1++;
                if(thisTeamSize1 > teamSize){
                    thisTeamSize1--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[0].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize1++;
                if(thisTeamSize1 > teamSize){
                    thisTeamSize1--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[0].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[1].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize2++;
                if(thisTeamSize2 > teamSize){
                    thisTeamSize2--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[1].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize2++;
                if(thisTeamSize2 > teamSize){
                    thisTeamSize2--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[1].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize2++;
                if(thisTeamSize2 > teamSize){
                    thisTeamSize2--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[1].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize2++;
                if(thisTeamSize2 > teamSize){
                    thisTeamSize2--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[1].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[2].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize3++;
                if(thisTeamSize3 > teamSize){
                    thisTeamSize3--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[2].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize3++;
                if(thisTeamSize3 > teamSize){
                    thisTeamSize3--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[2].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize3++;
                if(thisTeamSize3 > teamSize){
                    thisTeamSize3--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[2].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize3++;
                if(thisTeamSize3 > teamSize){
                    thisTeamSize3--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[2].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[3].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize4++;
                if(thisTeamSize4 > teamSize){
                    thisTeamSize4--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[3].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize4++;
                if(thisTeamSize4 > teamSize){
                    thisTeamSize4--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[3].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize4++;
                if(thisTeamSize4 > teamSize){
                    thisTeamSize4--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[3].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize4++;
                if(thisTeamSize4 > teamSize){
                    thisTeamSize4--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[3].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[4].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize5++;
                if(thisTeamSize5 > teamSize){
                    thisTeamSize5--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[4].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize5++;
                if(thisTeamSize5 > teamSize){
                    thisTeamSize5--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[4].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize5++;
                if(thisTeamSize5 > teamSize){
                    thisTeamSize5--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[4].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize5++;
                if(thisTeamSize5 > teamSize){
                    thisTeamSize5--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[4].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[5].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize6++;
                if(thisTeamSize6 > teamSize){
                    thisTeamSize6--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[5].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize6++;
                if(thisTeamSize6 > teamSize){
                    thisTeamSize6--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[5].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize6++;
                if(thisTeamSize6 > teamSize){
                    thisTeamSize6--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[5].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize6++;
                if(thisTeamSize6 > teamSize){
                    thisTeamSize6--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[5].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[6].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize7++;
                if(thisTeamSize7 > teamSize){
                    thisTeamSize7--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[6].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize7++;
                if(thisTeamSize7 > teamSize){
                    thisTeamSize7--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[6].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize7++;
                if(thisTeamSize7 > teamSize){
                    thisTeamSize7--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[6].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize7++;
                if(thisTeamSize7 > teamSize){
                    thisTeamSize7--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[6].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[7].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize8++;
                if(thisTeamSize8 > teamSize){
                    thisTeamSize8--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[7].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize8++;
                if(thisTeamSize8 > teamSize){
                    thisTeamSize8--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[7].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize8++;
                if(thisTeamSize8 > teamSize){
                    thisTeamSize8--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[7].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize8++;
                if(thisTeamSize8 > teamSize){
                    thisTeamSize8--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[7].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[8].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize9++;
                if(thisTeamSize9 > teamSize){
                    thisTeamSize9--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[8].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize9++;
                if(thisTeamSize9 > teamSize){
                    thisTeamSize9--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[8].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize9++;
                if(thisTeamSize9 > teamSize){
                    thisTeamSize9--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[8].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize9++;
                if(thisTeamSize9 > teamSize){
                    thisTeamSize9--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[8].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        for(int i = 0; i <= teamSize; i += 4){            
            try{
                teams[9].students[i].setName(programmerList[loopProCount].getName());
                thisTeamSize10++;
                if(thisTeamSize10 > teamSize){
                    thisTeamSize10--;
                }
                else{
                    loopProCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob1){
                System.out.println("1st in loop skipped");
                i--;
            }
            try{
                teams[9].students[i+1].setName(designerList[loopDesCount].getName());
                thisTeamSize10++;
                if(thisTeamSize10 > teamSize){
                    thisTeamSize10--;
                }
                else{
                loopDesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob2){
                System.out.println("2nd in loop skipped");
                i--;                
            }
            try{
                teams[9].students[i+2].setName(researcherList[loopResCount].getName());
                thisTeamSize10++;
                if(thisTeamSize10 > teamSize){
                    thisTeamSize10--;
                }
                else{
                loopResCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob3){
                System.out.println("3rd in loop skipped");
                 i--;              
            }
            try{
                teams[9].students[i+3].setName(testerList[loopTesCount].getName());
                thisTeamSize10++;
                if(thisTeamSize10 > teamSize){
                    thisTeamSize10--;
                }
                else{
                loopTesCount++;
                }
            }
            catch(ArrayIndexOutOfBoundsException | NullPointerException oob4){
                System.out.println("4th in loop skipped");
                i--;                
            }            
            
            System.out.println("Writing Loop " + loopCount + " finished");
            loopCount++;
            if(loopCount == teamSize + 1){
                i = teamSize;
            }
            
       }
        
        proNum = 0;
        desNum = 0;
        resNum = 0;
        tesNum = 0;                
        
        proNum += loopProCount;
        desNum += loopDesCount;
        resNum += loopResCount;
        tesNum += loopTesCount;
        
        for(int diffinc = 0; diffinc < diff ; diffinc++){
            teams[9].students[teamSize + diffinc].setName("");
            System.out.println("Cleaning Loop finished" + " " + (teamSize + diffinc + 1));
       }
        
        
        loopCount = 1;
        
        
        
            teamTable.createFrame();     
        }
    }//GEN-LAST:event_jButtonCreateGroupsActionPerformed

    private void jButtonSetTeamSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetTeamSizeActionPerformed
        if(Integer.parseInt(jTextFieldTeamSize.getText()) < 3 || Integer.parseInt(jTextFieldTeamSize.getText()) > 6 ){ //jTextFieldTeamSize.getText().equals("")
        JOptionPane.showMessageDialog(this, "Team size must be 3 to 6.");
        }
        else{
            try{
                teamSize = Integer.parseInt(jTextFieldTeamSize.getText());
            }
            catch(NumberFormatException x){
                JOptionPane.showMessageDialog(this, "Please enter a numeric value from 3 to 6.");
            }
            this.dispose();
            mainWindow.createFrame();
        }
    }//GEN-LAST:event_jButtonSetTeamSizeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateGroups;
    private javax.swing.JButton jButtonNewStudent;
    private javax.swing.JButton jButtonSetTeamSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabelTeamSize;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextFieldTeamSize;
    public static javax.swing.JLabel name1;
    public static javax.swing.JLabel name10;
    public static javax.swing.JLabel name11;
    public static javax.swing.JLabel name12;
    public static javax.swing.JLabel name13;
    public static javax.swing.JLabel name14;
    public static javax.swing.JLabel name15;
    public static javax.swing.JLabel name16;
    public static javax.swing.JLabel name17;
    public static javax.swing.JLabel name18;
    public static javax.swing.JLabel name19;
    public static javax.swing.JLabel name2;
    public static javax.swing.JLabel name20;
    public static javax.swing.JLabel name21;
    public static javax.swing.JLabel name22;
    public static javax.swing.JLabel name23;
    public static javax.swing.JLabel name24;
    public static javax.swing.JLabel name25;
    public static javax.swing.JLabel name26;
    public static javax.swing.JLabel name27;
    public static javax.swing.JLabel name28;
    public static javax.swing.JLabel name29;
    public static javax.swing.JLabel name3;
    public static javax.swing.JLabel name30;
    public static javax.swing.JLabel name4;
    public static javax.swing.JLabel name5;
    public static javax.swing.JLabel name6;
    public static javax.swing.JLabel name7;
    public static javax.swing.JLabel name8;
    public static javax.swing.JLabel name9;
    public static javax.swing.JLabel skill1;
    public static javax.swing.JLabel skill10;
    public static javax.swing.JLabel skill11;
    public static javax.swing.JLabel skill12;
    public static javax.swing.JLabel skill13;
    public static javax.swing.JLabel skill14;
    public static javax.swing.JLabel skill15;
    public static javax.swing.JLabel skill16;
    public static javax.swing.JLabel skill17;
    public static javax.swing.JLabel skill18;
    public static javax.swing.JLabel skill19;
    public static javax.swing.JLabel skill2;
    public static javax.swing.JLabel skill20;
    public static javax.swing.JLabel skill21;
    public static javax.swing.JLabel skill22;
    public static javax.swing.JLabel skill23;
    public static javax.swing.JLabel skill24;
    public static javax.swing.JLabel skill25;
    public static javax.swing.JLabel skill26;
    public static javax.swing.JLabel skill27;
    public static javax.swing.JLabel skill28;
    public static javax.swing.JLabel skill29;
    public static javax.swing.JLabel skill3;
    public static javax.swing.JLabel skill30;
    public static javax.swing.JLabel skill4;
    public static javax.swing.JLabel skill5;
    public static javax.swing.JLabel skill6;
    public static javax.swing.JLabel skill7;
    public static javax.swing.JLabel skill8;
    public static javax.swing.JLabel skill9;
    // End of variables declaration//GEN-END:variables
}
