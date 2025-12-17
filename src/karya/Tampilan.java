package karya;

import java.text.DecimalFormat;
import javafx.scene.control.CheckBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tampilan extends javax.swing.JFrame {

    //deklarasi variabel
    public static ModelMenu[] menu;
    public static String tampil;
    int bayar;
    float diskon;
    public static String seteruk;

    public Tampilan() {
        initComponents();
       //etExtendedState(this.MAXIMIZED_BOTH);
       //etLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txapesan = new javax.swing.JTextArea();
        btnpesan = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Piring = new javax.swing.JCheckBox();
        Pisau = new javax.swing.JCheckBox();
        Sendok = new javax.swing.JCheckBox();
        Mangkok = new javax.swing.JCheckBox();
        Garpu = new javax.swing.JCheckBox();
        hrgPiring = new javax.swing.JLabel();
        hrgPisau = new javax.swing.JLabel();
        hrgSendok = new javax.swing.JLabel();
        hrgMangkok = new javax.swing.JLabel();
        hrgGarpu = new javax.swing.JLabel();
        txtjumlah1 = new javax.swing.JTextField();
        txtjumlah2 = new javax.swing.JTextField();
        txtjumlah3 = new javax.swing.JTextField();
        txtjumlah4 = new javax.swing.JTextField();
        txtjumlah5 = new javax.swing.JTextField();
        stokSendok = new javax.swing.JLabel();
        stokMangkok = new javax.swing.JLabel();
        stokGarpu = new javax.swing.JLabel();
        stokPiring = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        stokPisau = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Kasur = new javax.swing.JCheckBox();
        Tikar = new javax.swing.JCheckBox();
        Cermin = new javax.swing.JCheckBox();
        Bantal = new javax.swing.JCheckBox();
        Kipas = new javax.swing.JCheckBox();
        hrgKasur = new javax.swing.JLabel();
        hrgTikar = new javax.swing.JLabel();
        hrgCermin = new javax.swing.JLabel();
        hrgBantal = new javax.swing.JLabel();
        hrgKipas = new javax.swing.JLabel();
        txtjumlah6 = new javax.swing.JTextField();
        txtjumlah7 = new javax.swing.JTextField();
        txtjumlah8 = new javax.swing.JTextField();
        txtjumlah9 = new javax.swing.JTextField();
        txtjumlah10 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        stokTikar = new javax.swing.JLabel();
        stokKasur = new javax.swing.JLabel();
        stokCermin = new javax.swing.JLabel();
        stokBantal = new javax.swing.JLabel();
        stokKipas = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnresetstok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 255, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Alat Perabot Rumah Tangga");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 50, 520, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 10, 47);

        txapesan.setColumns(20);
        txapesan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txapesan.setRows(5);
        txapesan.setText("Silahkan Pesan");
        jScrollPane1.setViewportView(txapesan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 410, 440, 180);

        btnpesan.setBackground(new java.awt.Color(204, 204, 255));
        btnpesan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnpesan.setText("PESAN");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesan);
        btnpesan.setBounds(30, 380, 90, 30);

        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar);
        btnkeluar.setBounds(1170, 560, 80, 30);

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(130, 380, 80, 30);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Harga :");
        panel1.add(jLabel4);
        jLabel4.setBounds(180, 20, 60, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Jumlah :");
        panel1.add(jLabel5);
        jLabel5.setBounds(360, 20, 70, 17);

        Piring.setBackground(new java.awt.Color(255, 255, 255));
        Piring.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Piring.setText("Piring");
        Piring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiringActionPerformed(evt);
            }
        });
        panel1.add(Piring);
        Piring.setBounds(10, 40, 100, 20);

        Pisau.setBackground(new java.awt.Color(255, 255, 255));
        Pisau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pisau.setText("Pisau");
        panel1.add(Pisau);
        Pisau.setBounds(10, 60, 65, 20);

        Sendok.setBackground(new java.awt.Color(255, 255, 255));
        Sendok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sendok.setText("Sendok");
        panel1.add(Sendok);
        Sendok.setBounds(10, 80, 90, 20);

        Mangkok.setBackground(new java.awt.Color(255, 255, 255));
        Mangkok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mangkok.setText("Mangkok");
        panel1.add(Mangkok);
        Mangkok.setBounds(10, 100, 100, 20);

        Garpu.setBackground(new java.awt.Color(255, 255, 255));
        Garpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Garpu.setText("Garpu");
        panel1.add(Garpu);
        Garpu.setBounds(10, 120, 80, 25);

        hrgPiring.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgPiring.setText("Rp. 20.000");
        panel1.add(hrgPiring);
        hrgPiring.setBounds(250, 40, 76, 17);

        hrgPisau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgPisau.setText("Rp. 25.000");
        panel1.add(hrgPisau);
        hrgPisau.setBounds(250, 60, 76, 17);

        hrgSendok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgSendok.setText("Rp. 3.000");
        panel1.add(hrgSendok);
        hrgSendok.setBounds(250, 80, 67, 17);

        hrgMangkok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgMangkok.setText("Rp. 20.000");
        panel1.add(hrgMangkok);
        hrgMangkok.setBounds(250, 100, 76, 17);

        hrgGarpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgGarpu.setText("Rp. 3.000");
        panel1.add(hrgGarpu);
        hrgGarpu.setBounds(250, 120, 70, 17);

        txtjumlah1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah1FocusLost(evt);
            }
        });
        txtjumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah1ActionPerformed(evt);
            }
        });
        txtjumlah1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah1KeyReleased(evt);
            }
        });
        panel1.add(txtjumlah1);
        txtjumlah1.setBounds(430, 40, 30, 20);

        txtjumlah2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah2FocusLost(evt);
            }
        });
        txtjumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah2ActionPerformed(evt);
            }
        });
        txtjumlah2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah2KeyReleased(evt);
            }
        });
        panel1.add(txtjumlah2);
        txtjumlah2.setBounds(430, 60, 30, 20);

        txtjumlah3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah3FocusLost(evt);
            }
        });
        txtjumlah3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah3KeyReleased(evt);
            }
        });
        panel1.add(txtjumlah3);
        txtjumlah3.setBounds(430, 80, 30, 20);

        txtjumlah4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah4FocusLost(evt);
            }
        });
        txtjumlah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah4ActionPerformed(evt);
            }
        });
        txtjumlah4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah4KeyReleased(evt);
            }
        });
        panel1.add(txtjumlah4);
        txtjumlah4.setBounds(430, 100, 30, 20);

        txtjumlah5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah5FocusLost(evt);
            }
        });
        txtjumlah5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah5KeyReleased(evt);
            }
        });
        panel1.add(txtjumlah5);
        txtjumlah5.setBounds(430, 120, 30, 20);

        stokSendok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokSendok.setText("15");
        panel1.add(stokSendok);
        stokSendok.setBounds(130, 80, 18, 17);

        stokMangkok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokMangkok.setText("15");
        panel1.add(stokMangkok);
        stokMangkok.setBounds(130, 100, 18, 17);

        stokGarpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokGarpu.setText("15");
        panel1.add(stokGarpu);
        stokGarpu.setBounds(130, 120, 18, 20);

        stokPiring.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokPiring.setText("50");
        panel1.add(stokPiring);
        stokPiring.setBounds(130, 40, 20, 17);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Stok :");
        panel1.add(jLabel32);
        jLabel32.setBounds(80, 10, 50, 30);

        stokPisau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokPisau.setText("15");
        stokPisau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stokPisauKeyPressed(evt);
            }
        });
        panel1.add(stokPisau);
        stokPisau.setBounds(130, 60, 20, 20);

        jPanel1.add(panel1);
        panel1.setBounds(40, 120, 480, 160);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Harga :");
        panel2.add(jLabel7);
        jLabel7.setBounds(210, 30, 51, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Jumlah :");
        panel2.add(jLabel8);
        jLabel8.setBounds(390, 30, 60, 20);

        Kasur.setBackground(new java.awt.Color(255, 255, 255));
        Kasur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kasur.setText("Kasur");
        Kasur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KasurActionPerformed(evt);
            }
        });
        panel2.add(Kasur);
        Kasur.setBounds(10, 50, 69, 20);

        Tikar.setBackground(new java.awt.Color(255, 255, 255));
        Tikar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tikar.setText("Tikar");
        panel2.add(Tikar);
        Tikar.setBounds(10, 70, 63, 20);

        Cermin.setBackground(new java.awt.Color(255, 255, 255));
        Cermin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cermin.setText("Cermin");
        panel2.add(Cermin);
        Cermin.setBounds(10, 90, 80, 20);

        Bantal.setBackground(new java.awt.Color(255, 255, 255));
        Bantal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bantal.setText("Bantal");
        panel2.add(Bantal);
        Bantal.setBounds(10, 110, 73, 20);

        Kipas.setBackground(new java.awt.Color(255, 255, 255));
        Kipas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kipas.setText("Kipas");
        panel2.add(Kipas);
        Kipas.setBounds(10, 130, 65, 20);

        hrgKasur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgKasur.setText("Rp. 200.000");
        panel2.add(hrgKasur);
        hrgKasur.setBounds(270, 50, 90, 17);

        hrgTikar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgTikar.setText("Rp. 100.000");
        panel2.add(hrgTikar);
        hrgTikar.setBounds(270, 70, 90, 17);

        hrgCermin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgCermin.setText("Rp. 50.000");
        panel2.add(hrgCermin);
        hrgCermin.setBounds(270, 90, 80, 17);

        hrgBantal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgBantal.setText("Rp. 35.000");
        panel2.add(hrgBantal);
        hrgBantal.setBounds(270, 110, 76, 17);

        hrgKipas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hrgKipas.setText("Rp. 150.000");
        panel2.add(hrgKipas);
        hrgKipas.setBounds(270, 130, 90, 17);

        txtjumlah6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah6FocusLost(evt);
            }
        });
        txtjumlah6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah6KeyReleased(evt);
            }
        });
        panel2.add(txtjumlah6);
        txtjumlah6.setBounds(460, 50, 20, 20);

        txtjumlah7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah7FocusLost(evt);
            }
        });
        txtjumlah7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah7KeyReleased(evt);
            }
        });
        panel2.add(txtjumlah7);
        txtjumlah7.setBounds(460, 70, 20, 20);

        txtjumlah8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah8FocusLost(evt);
            }
        });
        txtjumlah8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah8KeyReleased(evt);
            }
        });
        panel2.add(txtjumlah8);
        txtjumlah8.setBounds(460, 90, 20, 20);

        txtjumlah9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah9FocusLost(evt);
            }
        });
        txtjumlah9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah9KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah9KeyReleased(evt);
            }
        });
        panel2.add(txtjumlah9);
        txtjumlah9.setBounds(460, 110, 20, 20);

        txtjumlah10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjumlah10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjumlah10FocusLost(evt);
            }
        });
        txtjumlah10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlah10KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlah10KeyReleased(evt);
            }
        });
        panel2.add(txtjumlah10);
        txtjumlah10.setBounds(460, 130, 20, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Stok :");
        panel2.add(jLabel26);
        jLabel26.setBounds(100, 30, 50, 20);

        stokTikar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokTikar.setText("50");
        panel2.add(stokTikar);
        stokTikar.setBounds(150, 70, 18, 17);

        stokKasur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokKasur.setText("15");
        panel2.add(stokKasur);
        stokKasur.setBounds(150, 50, 18, 17);

        stokCermin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokCermin.setText("15");
        panel2.add(stokCermin);
        stokCermin.setBounds(150, 90, 18, 17);

        stokBantal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokBantal.setText("15");
        panel2.add(stokBantal);
        stokBantal.setBounds(150, 110, 18, 17);

        stokKipas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stokKipas.setText("15");
        panel2.add(stokKipas);
        stokKipas.setBounds(150, 130, 18, 17);

        jPanel1.add(panel2);
        panel2.setBounds(730, 110, 520, 180);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(530, 710, 310, 310);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("PROMOOO!!!!");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(40, 280, 130, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Beli Piring Lebih Dari 5. Diskon 30%");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(40, 310, 330, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Beli Tikar lebih Dari 6. Diskon 30%");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(40, 340, 330, 30);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(1390, 980, 70, 40);

        btnresetstok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnresetstok.setText("RESET STOK");
        btnresetstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetstokActionPerformed(evt);
            }
        });
        jPanel1.add(btnresetstok);
        btnresetstok.setBounds(220, 380, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karya/house.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 80, 510, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed

        txtjumlah1.setText("");
        txtjumlah2.setText("");
        txtjumlah3.setText("");
        txtjumlah4.setText("");
        txtjumlah5.setText("");
        txtjumlah6.setText("");
        txtjumlah7.setText("");
        txtjumlah8.setText("");
        txtjumlah9.setText("");
        txtjumlah10.setText("");

        Piring.setSelected(false);
        Pisau.setSelected(false);
        Sendok.setSelected(false);
        Mangkok.setSelected(false);
        Garpu.setSelected(false);
        Kasur.setSelected(false);
        Tikar.setSelected(false);
        Cermin.setSelected(false);
        Bantal.setSelected(false);
        Kipas.setSelected(false);
        txapesan.setText("Silahkan Pesan");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        tampil = "";
        bayar = 0;
        // menu makanan
        menu = null;
        menu = new ModelMenu[10];
        for (int c = 0; c < menu.length; c++) {
            menu[c] = new ModelMenu();
            menu[c].setHarga(0);
            menu[c].setId(c);
            menu[c].setJenis(false);
            menu[c].setJumlah(0);
            menu[c].setNama("");
            menu[c].setPilih(false);
        }
        menu[0].setDiskon(0.3);
        menu[6].setDiskon(0.2);
        stokPiring.setText(pilihMaki(0, txtjumlah1, 20000, stokPiring, Piring, "Piring"));
        stokPisau.setText(pilihMaki(1, txtjumlah2, 25000, stokPisau, Pisau, "Pisau"));
        stokSendok.setText(pilihMaki(2, txtjumlah3, 3000, stokSendok, Sendok, "sendok"));
        stokMangkok.setText(pilihMaki(3, txtjumlah4, 20000, stokMangkok, Mangkok, "mangkok"));
        stokGarpu.setText(pilihMaki(4, txtjumlah5, 3000, stokGarpu, Garpu, "garpu"));
        // menu minuman
        stokKasur.setText(pilihMaki(5, txtjumlah6, 200000, stokKasur, Kasur, "Kasur"));
        stokTikar.setText(pilihMaki(6, txtjumlah7, 100000, stokTikar, Tikar, "Tikar"));
        stokCermin.setText(pilihMaki(7, txtjumlah8, 50000, stokCermin, Cermin, "Cermin"));
        stokBantal.setText(pilihMaki(8, txtjumlah9, 35000, stokBantal, Bantal, "Bantal"));
        stokKipas.setText(pilihMaki(9, txtjumlah10, 150000, stokKipas, Kipas, "Kipas"));
        Transaksi byr = new Transaksi();
        byr.setVisible(true);
        byr.setAlwaysOnTop(true);
     
    }//GEN-LAST:event_btnpesanActionPerformed

    // pungsi nomor
    private String fNo(int e) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(e);
    }
    private String fNodesimal(float e) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(e);
    }

    //PilihMaki
    private String pilihMaki(int nomor, JTextField jum, int hrg, JLabel stok, JCheckBox cbPilih, String info) {
        
        
        if (cbPilih.isSelected()) {
            if (!jum.getText().isEmpty()) {
                int jumlah = Integer.parseInt(jum.getText());
                if (jumlah > 0) {
                    int total = 0;
                    int st = Integer.parseInt(stok.getText());
                    if (jumlah <= st) {
                        if (jumlah > 5 && info.equals("Piring")){
                        diskon = (float) (0.3 * (jumlah * hrg)) ;
                        }
//                       else {
//                            diskon = 0;  
//                        }
                       else  if (jumlah > 6 && info.equals("Tikar")){
                        diskon = (float) (0.2 * (jumlah * hrg)) ;
                        }
                          else{
                            diskon = 0;  
                        }
                        total = jumlah * hrg;
                        bayar = (int) ((bayar + total)-diskon);
                        tampil += cbPilih.getText() + " " + fNo(hrg) + " x " + jumlah + " = " + fNo(total)  +"\n" + "\nDiskon = "+fNodesimal(diskon)+"\n" +"Total bayar"+ " = " + fNo(bayar)+"\n";
                        st = st - jumlah;
                        menu[nomor].setHarga(hrg);
                        menu[nomor].setJumlah(jumlah);
                        menu[nomor].setNama(info);
                        menu[nomor].setDiskon(diskon);
                        menu[nomor].setPilih(true);
                        txapesan.setText(tampil);
                        return String.valueOf(st);
                    } else {
                        tampil += "\n" + "MAAF STOK " + info + " TIDAK CUKUP" + "\n";
                    }
                    txapesan.setText(tampil + "=============================" + "\n");
                } else {
                    tampil += "Isi jumlah pesanan Anda" + "\n";
                }
                txapesan.setText(tampil + "=============================");
            } else {
                tampil += "Isi jumlah pesanan Anda" + "\n";
            }
            txapesan.setText(tampil + "=============================");
        }
        txapesan.setText(tampil + "============================="+"\n");
        return stok.getText();
    }


    private void KasurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KasurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KasurActionPerformed

    private void txtjumlah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah4ActionPerformed

    private void txtjumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah2ActionPerformed

    private void PiringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PiringActionPerformed

    private void txtjumlah1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah1KeyPressed

        Piring.setSelected(true);

    }//GEN-LAST:event_txtjumlah1KeyPressed

    private void txtjumlah1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah1FocusLost
        // TODO add your handling code here:

        if (txtjumlah1.getText().equals("")) {
            Piring.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah1FocusLost

    private void txtjumlah1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah1KeyReleased
        // TODO add your handling code here:
        txtjumlah1.setText(txtjumlah1.getText().replaceAll("[^0-9]", ""));

    }//GEN-LAST:event_txtjumlah1KeyReleased

    private void txtjumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtjumlah1ActionPerformed

    private void txtjumlah2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah2KeyPressed
        // TODO add your handling code here:
        Pisau.setSelected(true);

    }//GEN-LAST:event_txtjumlah2KeyPressed

    private void txtjumlah2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah2FocusLost
        // TODO add your handling code here:
        if (txtjumlah2.getText().equals("")) {
            Pisau.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah2FocusLost

    private void txtjumlah3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah3KeyPressed
        // TODO add your handling code here:
        Sendok.setSelected(true);

    }//GEN-LAST:event_txtjumlah3KeyPressed

    private void txtjumlah3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah3FocusLost
        // TODO add your handling code here:
        if (txtjumlah3.getText().equals("")) {
            Sendok.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah3FocusLost

    private void txtjumlah4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah4KeyPressed
        // TODO add your handling code here:
        Mangkok.setSelected(true);

    }//GEN-LAST:event_txtjumlah4KeyPressed

    private void txtjumlah4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah4FocusLost
        // TODO add your handling code here:
        if (txtjumlah4.getText().equals("")) {
            Mangkok.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah4FocusLost

    private void txtjumlah5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah5KeyPressed
        // TODO add your handling code here:
        Garpu.setSelected(true);

    }//GEN-LAST:event_txtjumlah5KeyPressed

    private void txtjumlah5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah5FocusLost
        // TODO add your handling code here:
        if (txtjumlah5.getText().equals("")) {
            Garpu.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah5FocusLost

    private void txtjumlah6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah6KeyPressed
        // TODO add your handling code here:
        Kasur.setSelected(true);

    }//GEN-LAST:event_txtjumlah6KeyPressed

    private void txtjumlah6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah6FocusLost
        // TODO add your handling code here:
        if (txtjumlah6.getText().equals("")) {
            Kasur.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah6FocusLost

    private void txtjumlah7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah7KeyPressed
        // TODO add your handling code here:
        Tikar.setSelected(true);

    }//GEN-LAST:event_txtjumlah7KeyPressed

    private void txtjumlah7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah7FocusLost
        // TODO add your handling code here:
        if (txtjumlah7.getText().equals("")) {
            Tikar.setSelected(false);
        }

    }//GEN-LAST:event_txtjumlah7FocusLost

    private void txtjumlah8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah8KeyPressed
        // TODO add your handling code here:
        Cermin.setSelected(true);

    }//GEN-LAST:event_txtjumlah8KeyPressed

    private void txtjumlah8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah8FocusLost
        // TODO add your handling code here:
        if (txtjumlah8.getText().equals("")) {
            Cermin.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah8FocusLost

    private void txtjumlah9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah9KeyPressed
        // TODO add your handling code here:
        Bantal.setSelected(true);

    }//GEN-LAST:event_txtjumlah9KeyPressed

    private void txtjumlah9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah9FocusLost
        // TODO add your handling code here:
        if (txtjumlah9.getText().equals("")) {
            Bantal.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah9FocusLost

    private void txtjumlah10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah10KeyPressed
        Kipas.setSelected(true);

    }//GEN-LAST:event_txtjumlah10KeyPressed

    private void txtjumlah10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah10FocusLost
        if (txtjumlah10.getText().equals("")) {
            Kipas.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah10FocusLost

    private void txtjumlah2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah2KeyReleased
        txtjumlah2.setText(txtjumlah2.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah2KeyReleased

    private void txtjumlah3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah3KeyReleased
        txtjumlah3.setText(txtjumlah3.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah3KeyReleased

    private void txtjumlah4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah4KeyReleased
        txtjumlah4.setText(txtjumlah4.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah4KeyReleased

    private void txtjumlah5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah5KeyReleased
        txtjumlah5.setText(txtjumlah5.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah5KeyReleased

    private void txtjumlah6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah6KeyReleased
        txtjumlah6.setText(txtjumlah6.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah6KeyReleased

    private void txtjumlah7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah7KeyReleased
        txtjumlah7.setText(txtjumlah7.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah7KeyReleased

    private void txtjumlah8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah8KeyReleased
        txtjumlah8.setText(txtjumlah8.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah8KeyReleased

    private void txtjumlah9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah9KeyReleased
        txtjumlah9.setText(txtjumlah9.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah9KeyReleased

    private void txtjumlah10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah10KeyReleased
        txtjumlah10.setText(txtjumlah10.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_txtjumlah10KeyReleased

    private void btnresetstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetstokActionPerformed
        stokPiring.setText("50");
        stokPisau.setText("15");
        stokSendok.setText("15");
        stokMangkok.setText("15");
        stokGarpu.setText("15");
        stokKasur.setText("15");
        stokTikar.setText("50");
        stokCermin.setText("15");
        stokBantal.setText("15");
        stokKipas.setText("15");

    }//GEN-LAST:event_btnresetstokActionPerformed

    private void stokPisauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stokPisauKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokPisauKeyPressed

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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Bantal;
    private javax.swing.JCheckBox Cermin;
    private javax.swing.JCheckBox Garpu;
    private javax.swing.JCheckBox Kasur;
    private javax.swing.JCheckBox Kipas;
    private javax.swing.JCheckBox Mangkok;
    private javax.swing.JCheckBox Piring;
    private javax.swing.JCheckBox Pisau;
    private javax.swing.JCheckBox Sendok;
    private javax.swing.JCheckBox Tikar;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnresetstok;
    private javax.swing.JLabel hrgBantal;
    private javax.swing.JLabel hrgCermin;
    private javax.swing.JLabel hrgGarpu;
    private javax.swing.JLabel hrgKasur;
    private javax.swing.JLabel hrgKipas;
    private javax.swing.JLabel hrgMangkok;
    private javax.swing.JLabel hrgPiring;
    private javax.swing.JLabel hrgPisau;
    private javax.swing.JLabel hrgSendok;
    private javax.swing.JLabel hrgTikar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JLabel stokBantal;
    private javax.swing.JLabel stokCermin;
    private javax.swing.JLabel stokGarpu;
    private javax.swing.JLabel stokKasur;
    private javax.swing.JLabel stokKipas;
    private javax.swing.JLabel stokMangkok;
    private javax.swing.JLabel stokPiring;
    private javax.swing.JLabel stokPisau;
    private javax.swing.JLabel stokSendok;
    private javax.swing.JLabel stokTikar;
    private javax.swing.JTextArea txapesan;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah10;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextField txtjumlah4;
    private javax.swing.JTextField txtjumlah5;
    private javax.swing.JTextField txtjumlah6;
    private javax.swing.JTextField txtjumlah7;
    private javax.swing.JTextField txtjumlah8;
    private javax.swing.JTextField txtjumlah9;
    // End of variables declaration//GEN-END:variables
}
