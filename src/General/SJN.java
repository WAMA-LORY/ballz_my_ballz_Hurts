/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package General;


public class SJN extends javax.swing.JFrame {

 
    public SJN() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProcessTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Input_Process = new javax.swing.JTextField();
        SetProcessNum = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Outputfield = new javax.swing.JTextArea();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ProcessTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Arrival Time", "Burst Time"
            }
        ));
        jScrollPane1.setViewportView(ProcessTable);

        jLabel1.setText("Input Number of Processes");

        Input_Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_ProcessActionPerformed(evt);
            }
        });

        SetProcessNum.setText("Set to Table");
        SetProcessNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetProcessNumActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Outputfield.setColumns(20);
        Outputfield.setRows(5);
        jScrollPane2.setViewportView(Outputfield);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input_Process, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(SetProcessNum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Input_Process, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetProcessNum))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Input_ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_ProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_ProcessActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
                                            
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ProcessTable.getModel();
    int rowCount = model.getRowCount();

    if (rowCount == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please set process count and populate the table first.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 2D Array: [rowCount][8]
    // [i][0]: Process ID | [i][1]: Arrival Time | [i][2]: Burst Time
    // [i][3]: Start Time | [i][4]: Waiting Time | [i][5]: Done Flag
    // [i][6]: Completion Time (CT)              | [i][7]: Turnaround Time (TAT)
int[][] proc = new int[rowCount][8];

    // 1. Read table inputs
    try {
        for (int i = 0; i < rowCount; i++) {
            proc[i][0] = i + 1; // P1, P2, P3
            proc[i][1] = Integer.parseInt(model.getValueAt(i, 1).toString().trim());//to need to turn the AT ToString and the parse the string to int and we trim the whitespace
            proc[i][2] = Integer.parseInt(model.getValueAt(i, 2).toString().trim());//same here but BT
        }   
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill all table cells with valid numbers.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Parallel arrays to record Gantt Chart execution order
    int[] ganttPid = new int[rowCount];
    int[] ganttStartTime = new int[rowCount];
    int[] ganttEndTime = new int[rowCount];
    int ganttIndex = 0;

    int currentTime = 0;//what is the current amount of time that has passed aka the sum of burst time
    int completed = 0;//

    while (completed < rowCount) {
        int shortest = -1; 
        int minBurst = Integer.MAX_VALUE;// set to max in value

        // Find the available process with the shortest burst time
        for (int i = 0; i < rowCount; i++) {
            if (proc[i][5] == 0 && proc[i][1] <= currentTime) { // proc[5] checking of the process is done
                                                                //proc[1] checking if a AT is under or equal to the current time
                    if (proc[i][2] < minBurst) {                // ill explain it this person its a bit hard to put on text
                    minBurst = proc[i][2];
                    shortest = i;
                }
            }
        }

        
        if (shortest == -1) {
            currentTime++;
            continue;
        }

        // Calculate Process Times
    proc[shortest][3] = currentTime;                                        // Start Time
    proc[shortest][4] = proc[shortest][3] - proc[shortest][1];              // Waiting Time = Start - Arrival
    currentTime += proc[shortest][2];                                       // Advance clock by Burst Time
    proc[shortest][6] = currentTime;                                        // Completion Time (CT)
    proc[shortest][7] = proc[shortest][6] - proc[shortest][1];              // Turnaround Time (TAT) = CT - AT
    proc[shortest][5] = 1;                                                  // Mark as done
    completed++;

        // Record Gantt chart block values
        ganttPid[ganttIndex] = proc[shortest][0];               //p1
        ganttStartTime[ganttIndex] = proc[shortest][3];         // starttime
        ganttEndTime[ganttIndex] = currentTime;                 
        ganttIndex++;
    }

   
    Outputfield.setText(""); //cleaner

    // header
    Outputfield.append("===============================================================\n");
    Outputfield.append(" Process | Arrival | Burst | Start Time | Completion | TAT | Waiting \n");
    Outputfield.append("===============================================================\n");

    double totalWT = 0;
    double totalTAT = 0;

    for (int i = 0; i < rowCount; i++) {
    totalWT += proc[i][4];
    totalTAT += proc[i][7];

    // each row in a proc
    Outputfield.append(String.format("   P%-10d|   %-10d|  %-10d|     %-10d|     %-15d| %-10d|   %-10d\n",
        proc[i][0], proc[i][1], proc[i][2], proc[i][3], proc[i][6], proc[i][7], proc[i][4]));
}

    // header
    Outputfield.append("===============================================================\n");
    Outputfield.append(String.format("Total Waiting Time          : %.2f\n", totalWT));
    Outputfield.append(String.format("Average Waiting Time (AWT)   : %.2f\n", (totalWT / rowCount)));
    Outputfield.append(String.format("Total Turnaround Time       : %.2f\n", totalTAT));
    Outputfield.append(String.format("Average Turnaround (ATAT)    : %.2f\n", (totalTAT / rowCount)));
    Outputfield.append("===============================================================\n\n");

    // print the header
    Outputfield.append("GANTT CHART:\n");

    // top line
    for (int i = 0; i < ganttIndex; i++) {
        Outputfield.append("+--------");
    }
    Outputfield.append("+\n");// add a + :3

    // P1 and stuff
    for (int i = 0; i < ganttIndex; i++) {
        Outputfield.append(String.format("|   P%-4d ", ganttPid[i])); // the P1 and stuff
    }
    Outputfield.append("|\n");

    // line
    for (int i = 0; i < ganttIndex; i++) {
        Outputfield.append("+--------"); 
    }
    Outputfield.append("+\n");

    // the start time and stuff
    if (ganttIndex > 0) {
        Outputfield.append(String.valueOf(ganttStartTime[0]));
        for (int i = 0; i < ganttIndex; i++) {
            Outputfield.append(String.format("   %8d", ganttEndTime[i]));
        }
    }
    Outputfield.append("\n");
    }//GEN-LAST:event_CalculateActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
                                 
    Input_Process.setText("");
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)  
    ProcessTable.getModel();
    model.setRowCount(0);
    Outputfield.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void SetProcessNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetProcessNumActionPerformed
                                       
    try {
        int count = Integer.parseInt(Input_Process.getText().trim()); // the trim remove the whites space if ever enterd
        if (count <= 0) { // just cheacking if the entered count is 0 if yes gives a showmessage 
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a process count greater than 0.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) 
        ProcessTable.getModel(); // the javax.swing.table.DefaultTableMode gives us to .getmodel swithc basically gives us acess to munipulating the rows and columns
        model.setRowCount(0); // Clear existing rows

        for (int i = 1; i <= count; i++) {
            model.addRow(new Object[]{"P" + i, "", ""});// we are just adding rows to model aka the processTable
        }
    } catch (Exception e) { // catch me them ballz
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid integer number of processes.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } 

    }//GEN-LAST:event_SetProcessNumActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Dashboard dashboard = new Dashboard();
    dashboard.setVisible(true);
    dashboard.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SJN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField Input_Process;
    private javax.swing.JTextArea Outputfield;
    private javax.swing.JTable ProcessTable;
    private javax.swing.JButton Reset;
    private javax.swing.JButton SetProcessNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}