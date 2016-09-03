package org.jjoinodt.ui;

import com.jd.swing.custom.component.button.ButtonType;
import com.jd.swing.custom.component.button.StandardButton;
import com.jd.swing.util.Theme;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import org.jjoinodt.component.CustomGradientPanel;

/**
 *
 * @author antosamalona
 */
public class FrameUi extends javax.swing.JFrame {
    
    private JFileChooser jFileChooser;

    public FrameUi(String title) {
        super(title);
        initComponents();
        setProperties();
        setAction();
    }
    
    private void setProperties(){
        setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width)/2 - getWidth()/2, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height)/2 - getHeight()/2);
        tbODTFile.getTableHeader().setFont(new Font("Liberation Sans", Font.BOLD, 12));
        tbODTFile.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        setTableRenderer(tbODTFile, "CENTER", "HEADER", 0, 3);
        int[] width = {30, 280, 400, 95};
        for(int i = 0;i<width.length;i++)
            tbODTFile.getColumnModel().getColumn(i).setPreferredWidth(width[i]);
    }
    
    private void setAction(){
        
        this.jFileChooser = new JFileChooser();
        
        fieldDirectory.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                pickFile();
            }
        });
    }
    
    private void pickFile(){
        switch(jFileChooser.showOpenDialog(null)){
            case JFileChooser.APPROVE_OPTION:
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                break;
        }
    }
    private void setTableRenderer(JTable table, String align, String source, int startColumn, int endColumn) {
        DefaultTableCellRenderer tableCellRenderer = null;
        int alignValue = 0;
        
        if (align.equals("CENTER")) alignValue = JLabel.CENTER;
        else if (align.equals("RIGHT")) alignValue = JLabel.RIGHT;
        else if (align.equals("LEFT")) alignValue = JLabel.LEFT; 
        
        if (source.equals("HEADER")) {
            tableCellRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
            tableCellRenderer.setHorizontalAlignment(alignValue);
            for (int i = startColumn; i <= endColumn; i++) table.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(tableCellRenderer);
        } else if (source.equals("COLUMN")) {
            tableCellRenderer = new DefaultTableCellRenderer();
            tableCellRenderer.setHorizontalAlignment(alignValue);
            for (int i = startColumn; i <= endColumn; i++) table.getColumnModel().getColumn(i).setCellRenderer(tableCellRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbODTFile = new javax.swing.JTable();
        jPanel2 = new CustomGradientPanel(Color.RED, new Color(166, 10, 109));
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addFBtn = new StandardButton("", Theme.GLOSSY_MULTILIGHTORANGE_THEME, ButtonType.BUTTON_ROUNDED_RECTANGLUR);
        addFoBtn = new StandardButton("", Theme.GLOSSY_MULTILIGHTORANGE_THEME, ButtonType.BUTTON_ROUNDED_RECTANGLUR);
        mvDownBtn = new StandardButton("", Theme.GLOSSY_MULTILIGHTORANGE_THEME, ButtonType.BUTTON_ROUNDED_RECTANGLUR);
        mvUpBtn = new StandardButton("", Theme.GLOSSY_MULTILIGHTORANGE_THEME, ButtonType.BUTTON_ROUNDED_RECTANGLUR);
        jPanel4 = new javax.swing.JPanel();
        fieldDirectory = new javax.swing.JTextField();
        progressBar = new javax.swing.JProgressBar();
        startJoinBtn = new StandardButton("", Theme.GLOSSY_MULTILIGHTORANGE_THEME, ButtonType.BUTTON_ROUNDED_RECTANGLUR);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 12))); // NOI18N

        tbODTFile.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        tbODTFile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "File Name", "Path", "Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbODTFile);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 247, 247));
        jLabel1.setText("Join ODT ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        addFBtn.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        addFBtn.setText("Add File");

        addFoBtn.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        addFoBtn.setText("Add Folder");

        mvDownBtn.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        mvDownBtn.setText("Move Down");

        mvUpBtn.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        mvUpBtn.setText("Move Up");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mvDownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mvUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addFoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(addFBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mvDownBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mvUpBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fieldDirectory.setEditable(false);
        fieldDirectory.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        fieldDirectory.setText("Click Here !!! To set Output Directory");

        progressBar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        startJoinBtn.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        startJoinBtn.setText("Start Join");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldDirectory)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(startJoinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startJoinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFBtn;
    private javax.swing.JButton addFoBtn;
    private javax.swing.JTextField fieldDirectory;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mvDownBtn;
    private javax.swing.JButton mvUpBtn;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton startJoinBtn;
    private javax.swing.JTable tbODTFile;
    // End of variables declaration//GEN-END:variables
}
