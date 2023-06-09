/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Kho_PN_PX;

import BLL.ExecuteData;
import BLL.GetData;
import DTO.KhoNguyenLieu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HieuThao
 */
public class QuanLyKho extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyKho
     */
    public QuanLyKho() {
        initComponents();
        showDataOnTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_tennl = new Ultilities.swing.Controls.TextField();
        txt_donvi = new Ultilities.swing.Controls.TextField();
        txt_sl = new Ultilities.swing.Controls.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Ultilities.swing.Controls.Table();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_them = new Ultilities.swing.Controls.ButtonGradient();
        btn_xoa = new Ultilities.swing.Controls.ButtonGradient();
        btn_sua = new Ultilities.swing.Controls.ButtonGradient();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(1100, 660));
        setPreferredSize(new java.awt.Dimension(1100, 660));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nguyên liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên nguyên liệu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Đơn vị");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Số lượng");

        txt_tennl.setForeground(new java.awt.Color(0, 0, 0));
        txt_tennl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_donvi.setForeground(new java.awt.Color(0, 0, 0));
        txt_donvi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_sl.setForeground(new java.awt.Color(0, 0, 0));
        txt_sl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_donvi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(txt_tennl, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_donvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(txt_tennl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 476, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 222, -1, -1));

        btn_them.setText("Thêm");
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });
        jPanel2.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 50));

        btn_xoa.setText("Xóa");
        btn_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaMouseClicked(evt);
            }
        });
        jPanel2.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, 50));

        btn_sua.setText("Sửa");
        btn_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaMouseClicked(evt);
            }
        });
        jPanel2.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int row = table1.getSelectedRow();
        String ten = table1.getValueAt(row, 1).toString();
        String dv = table1.getValueAt(row, 2).toString();
        String sl = table1.getValueAt(row, 3).toString();
        txt_tennl.setText(ten);
        txt_donvi.setText(dv);
        txt_sl.setText(sl);
        
    }//GEN-LAST:event_table1MouseClicked

    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        // TODO add your handling code here:
        String ten = txt_tennl.getText();
        String donvi = txt_donvi.getText();
        int sl = 0;
        try{
             sl = Integer.parseInt( txt_sl.getText());
        }catch(Exception ex)
        {
            sl = 0;
        }
       
        KhoNguyenLieu kho = new KhoNguyenLieu();
        kho.setTennl(ten);
        kho.setDonvi(donvi);
        kho.setSoluong(sl);
        if(donvi.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa điền thông tin đơn vị của nguyên liệu");
            return;
        }
        if(ExecuteData.insertKhoNL(kho))
        {
             JOptionPane.showMessageDialog(this, "Thêm Thành Công");
             resetText();
            showDataOnTable();
        }
       else
        {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
        
    }//GEN-LAST:event_btn_themMouseClicked

    private void btn_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaMouseClicked
        // TODO add your handling code here:
        int row = table1.getSelectedRow();
        KhoNguyenLieu kho = new KhoNguyenLieu();
        kho.setManl(table1.getValueAt(row, 0).toString());
        if(row==-1)
        {
             JOptionPane.showMessageDialog(this, "Bạn chưa click chuột vào nguyên liệu cần xóa");
             return;
        }
        if(ExecuteData.delecteKhoNL(kho))
        {
             JOptionPane.showMessageDialog(this, "Xóa Thành Công");
            resetText();
            showDataOnTable();
        }
       else
        {
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btn_xoaMouseClicked

    private void btn_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaMouseClicked
        // TODO add your handling code here:
        String ten = txt_tennl.getText();
        String donvi = txt_donvi.getText();
        int sl = 0;
        try{
             sl = Integer.parseInt( txt_sl.getText());
        }catch(Exception ex)
        {
            sl = 0;
        }
        int row = table1.getSelectedRow();
        if(row==-1)
        {
             JOptionPane.showMessageDialog(this, "Bạn chưa click chuột vào nguyên liệu cần xóa");
             return;
        }
        
        KhoNguyenLieu kho = new KhoNguyenLieu();
        kho.setTennl(ten);
        kho.setDonvi(donvi);
        kho.setSoluong(sl);
        kho.setManl(table1.getValueAt(row, 0).toString());
        if(ExecuteData.updateKhoNL(kho))
        {
            JOptionPane.showMessageDialog(this, "Sửa Thành Công");
            resetText();
            showDataOnTable();
        }
       else
        {
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btn_suaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ultilities.swing.Controls.ButtonGradient btn_sua;
    private Ultilities.swing.Controls.ButtonGradient btn_them;
    private Ultilities.swing.Controls.ButtonGradient btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private Ultilities.swing.Controls.Table table1;
    private Ultilities.swing.Controls.TextField txt_donvi;
    private Ultilities.swing.Controls.TextField txt_sl;
    private Ultilities.swing.Controls.TextField txt_tennl;
    // End of variables declaration//GEN-END:variables
    GetData x ;
    public void showDataOnTable(){
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        x = new GetData();
        Object[][] info=  x.getDataKhoNguyenLieu();
        String[] tenCot = {"Mã nguyên liệu","Tên nguyên liệu","Đơn vị","Số lượng"};
        model.setDataVector(info, tenCot);
        table1.setRowHeight(50);
    }

    private void resetText() {
        txt_donvi.setText("");
        txt_sl.setText("");
        txt_tennl.setText("");
    }
}
