package edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sonaxaton
 */
public class AllGamesViewPanel extends javax.swing.JPanel {

    /**
     *
     */
    private static final long serialVersionUID = -6990619499118841478L;

    /**
     * Creates new form GameViewPanel
     */
    public AllGamesViewPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SummaryTablePanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        requirementsPanel2 = new edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.RequirementsPanel();
        jPanel1 = new javax.swing.JPanel();
        votePanel1 = new edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.VotePanel();

        SummaryTablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout SummaryTablePanelLayout = new javax.swing.GroupLayout(SummaryTablePanel);
        SummaryTablePanel.setLayout(SummaryTablePanelLayout);
        SummaryTablePanelLayout.setHorizontalGroup(
            SummaryTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        SummaryTablePanelLayout.setVerticalGroup(
            SummaryTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setTopComponent(requirementsPanel2);

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(votePanel1, "card2");

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SummaryTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(SummaryTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SummaryTablePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.RequirementsPanel requirementsPanel2;
    private edu.wpi.cs.wpisuitetng.modules.planningpoker.view.main.VotePanel votePanel1;
    // End of variables declaration//GEN-END:variables
}
