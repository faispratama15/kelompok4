package karya;

import java.text.DecimalFormat;
import javax.swing.JFrame;
import static karya.Tampilan.menu;
import static karya.Tampilan.tampil;

public class Transaksi extends javax.swing.JFrame{
    double ttl;
    double dis;
    private void hitungTotal(){
        ttl = 0;
        dis = 0;
        String produk = "<HTML>";
        String qty = "<HTML>";
        String hrg = "<HTML>";
        String total ="<HTML>";
        String diskonList = "<HTML>"; // Tambahkan string untuk diskon
        
        for (ModelMenu menu : Tampilan.menu) {
            if (menu.getPilih())
            {
                produk += menu.getNama() + "<br>";
                qty += menu.getJumlah()+"<br>";
                hrg += fNo(menu.getHarga())+"<br>";
                
                double t = menu.getHarga() * menu.getJumlah();
                double diskon = menu.getDiskon();
                double d = menu.getDiskon();
                
                
                ttl += t -diskon ;
                dis += d ;
                total+= fNo(t)+"<br>";
                diskonList += fNo(dis) + "<br>"; // Tambahkan nilai `dis` ke daftar
                
            }
            
        }
        produk += "</HTML>";
        qty +="</HTML>";
        hrg+="</HTML>";
        total+="</HTML>";
        diskonList += "</HTML>"; // Akhiri string HTML untuk diskon
        
        listProduk.setText(produk);
        listQty.setText(qty);
        listHarga.setText(hrg);
        listTotal.setText(total);
        grandTotal.setText(fNo(ttl) + "");
        diskkon.setText(fNo(dis) + "");
      
    }
    public Transaksi() {
        initComponents();
        hitungTotal();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Bukti Transaksi");
        setLocationRelativeTo(null);
    }
    
private String fNo(double e){
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(e);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namajalan8 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        btnBatal1 = new javax.swing.JButton();
        namaJalan = new javax.swing.JLabel();
        tgl1 = new javax.swing.JLabel();
        namaJalan1 = new javax.swing.JLabel();
        namaJalan2 = new javax.swing.JLabel();
        namaJalan3 = new javax.swing.JLabel();
        namaJalan4 = new javax.swing.JLabel();
        listProduk = new javax.swing.JLabel();
        listQty = new javax.swing.JLabel();
        listHarga = new javax.swing.JLabel();
        listTotal = new javax.swing.JLabel();
        namaJalan6 = new javax.swing.JLabel();
        namaJalan7 = new javax.swing.JLabel();
        grandTotal = new javax.swing.JLabel();
        namaJalan9 = new javax.swing.JLabel();
        kembalian = new javax.swing.JLabel();
        namaJalan8 = new javax.swing.JLabel();
        diskkon = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namajalan8.setBackground(new java.awt.Color(255, 255, 204));

        header.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("RUMAH MAKAN RICA");
        header.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnBatal1.setBackground(new java.awt.Color(255, 0, 0));
        btnBatal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBatal1.setText("BATAL");
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        namaJalan.setText("Jalan BTN Antara Blok A11 No.02 Makassar, Sulawesi Selatan");

        tgl1.setText("Tanggal");

        namaJalan1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaJalan1.setText("Qty");

        namaJalan2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan2.setText("Produk");

        namaJalan3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namaJalan3.setText("Harga");

        namaJalan4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namaJalan4.setText("Total");

        listProduk.setText("Produk");
        listProduk.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        listProduk.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        listQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listQty.setText("Qty");
        listQty.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        listHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        listHarga.setText("Harga");
        listHarga.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        listTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        listTotal.setText("Total");
        listTotal.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        namaJalan6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan6.setText("Bayar");

        namaJalan7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan7.setText("Grand Total");

        grandTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        grandTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        grandTotal.setText("0");

        namaJalan9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan9.setText("Kembalian");

        kembalian.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        kembalian.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kembalian.setText("0");

        namaJalan8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        namaJalan8.setText("Diskon");

        diskkon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        diskkon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        diskkon.setText("0");

        bayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bayar.setText("0");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        btnBayar.setBackground(new java.awt.Color(0, 255, 0));
        btnBayar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namajalan8Layout = new javax.swing.GroupLayout(namajalan8);
        namajalan8.setLayout(namajalan8Layout);
        namajalan8Layout.setHorizontalGroup(
            namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tgl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(namaJalan, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
            .addGroup(namajalan8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namajalan8Layout.createSequentialGroup()
                        .addComponent(namaJalan7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaJalan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namajalan8Layout.createSequentialGroup()
                                .addComponent(namaJalan1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaJalan3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namajalan8Layout.createSequentialGroup()
                                .addComponent(listQty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaJalan4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addComponent(namaJalan8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diskkon, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addComponent(namaJalan6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addComponent(namaJalan9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        namajalan8Layout.setVerticalGroup(
            namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namajalan8Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(namaJalan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJalan1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaJalan2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaJalan3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaJalan4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listProduk))
                    .addGroup(namajalan8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(listHarga)
                                .addComponent(listTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                            .addComponent(listQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJalan8)
                    .addComponent(diskkon))
                .addGap(18, 18, 18)
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJalan7)
                    .addComponent(grandTotal))
                .addGap(18, 18, 18)
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJalan6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJalan9)
                    .addComponent(kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(namajalan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBayar)
                    .addComponent(btnBatal1))
                .addContainerGap(695, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namajalan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namajalan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
       
        this.setVisible(false);
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed

    }//GEN-LAST:event_bayarActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
           int JumlahBayar=Integer.parseInt(bayar.getText());
          
           if(JumlahBayar>=ttl){
               double x = JumlahBayar-ttl;
               kembalian.setText(String.valueOf( fNo(x)));
           }
           else{
               int k = (int) (ttl - JumlahBayar);
               kembalian.setText("Uang anda kurang : " + fNo(k) );
           }
    }//GEN-LAST:event_btnBayarActionPerformed
 public static void main(String args[]) {
  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnBayar;
    private javax.swing.JLabel diskkon;
    private javax.swing.JLabel grandTotal;
    private javax.swing.JLabel header;
    private javax.swing.JLabel kembalian;
    private javax.swing.JLabel listHarga;
    private javax.swing.JLabel listProduk;
    private javax.swing.JLabel listQty;
    private javax.swing.JLabel listTotal;
    private javax.swing.JLabel namaJalan;
    private javax.swing.JLabel namaJalan1;
    private javax.swing.JLabel namaJalan2;
    private javax.swing.JLabel namaJalan3;
    private javax.swing.JLabel namaJalan4;
    private javax.swing.JLabel namaJalan6;
    private javax.swing.JLabel namaJalan7;
    private javax.swing.JLabel namaJalan8;
    private javax.swing.JLabel namaJalan9;
    private javax.swing.JPanel namajalan8;
    private javax.swing.JLabel tgl1;
    // End of variables declaration//GEN-END:variables
}


