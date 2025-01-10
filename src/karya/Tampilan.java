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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cbxbakso = new javax.swing.JCheckBox();
        cbxayamgoreng = new javax.swing.JCheckBox();
        cbxmieayam = new javax.swing.JCheckBox();
        cbxsate = new javax.swing.JCheckBox();
        cbxbatagorkeju = new javax.swing.JCheckBox();
        hargabakso = new javax.swing.JLabel();
        hargaayamgoreng = new javax.swing.JLabel();
        hargamieayam = new javax.swing.JLabel();
        hargasate = new javax.swing.JLabel();
        hargabatagor = new javax.swing.JLabel();
        txtjumlah1 = new javax.swing.JTextField();
        txtjumlah2 = new javax.swing.JTextField();
        txtjumlah3 = new javax.swing.JTextField();
        txtjumlah4 = new javax.swing.JTextField();
        txtjumlah5 = new javax.swing.JTextField();
        stokMieayam = new javax.swing.JLabel();
        stokSate = new javax.swing.JLabel();
        stokBatagor = new javax.swing.JLabel();
        stokBakso = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        stokAyamgoreng = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxesteh = new javax.swing.JCheckBox();
        cbxesjeruk = new javax.swing.JCheckBox();
        cbxairmineral = new javax.swing.JCheckBox();
        cbxcapucino = new javax.swing.JCheckBox();
        cbxmilktea = new javax.swing.JCheckBox();
        hargaesteh = new javax.swing.JLabel();
        hargaesjeruk = new javax.swing.JLabel();
        hargaairmineral = new javax.swing.JLabel();
        hargacapucino = new javax.swing.JLabel();
        hargamilktea = new javax.swing.JLabel();
        txtjumlah6 = new javax.swing.JTextField();
        txtjumlah7 = new javax.swing.JTextField();
        txtjumlah8 = new javax.swing.JTextField();
        txtjumlah9 = new javax.swing.JTextField();
        txtjumlah10 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        stokEsjeruk = new javax.swing.JLabel();
        stokEsteh = new javax.swing.JLabel();
        stokAirmineral = new javax.swing.JLabel();
        stokCapucino = new javax.swing.JLabel();
        stokMilktea = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnresetstok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 255, 51));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText("RM.RICA (RAHMA,ICO,CAI)");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(550, 0, 832, 73);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText(" Menu Makanan & Minuman");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 70, 710, 47);

        txapesan.setBackground(new java.awt.Color(255, 255, 102));
        txapesan.setColumns(20);
        txapesan.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txapesan.setRows(5);
        txapesan.setText("Silahkan Pesan");
        jScrollPane1.setViewportView(txapesan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 720, 570, 260);

        btnpesan.setBackground(new java.awt.Color(204, 204, 255));
        btnpesan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnpesan.setText("PESAN");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });
        jPanel1.add(btnpesan);
        btnpesan.setBounds(20, 660, 120, 50);

        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnkeluar);
        btnkeluar.setBounds(1730, 950, 110, 40);

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(160, 670, 100, 37);

        panel1.setBackground(new java.awt.Color(255, 255, 102));
        panel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText(" Makanan :");
        panel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 160, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Harga :");
        panel1.add(jLabel4);
        jLabel4.setBounds(340, 10, 90, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Jumlah :");
        panel1.add(jLabel5);
        jLabel5.setBounds(480, 10, 102, 29);

        Cbxbakso.setBackground(new java.awt.Color(255, 255, 102));
        Cbxbakso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cbxbakso.setText("Bakso");
        Cbxbakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxbaksoActionPerformed(evt);
            }
        });
        panel1.add(Cbxbakso);
        Cbxbakso.setBounds(10, 47, 110, 37);

        cbxayamgoreng.setBackground(new java.awt.Color(255, 255, 102));
        cbxayamgoreng.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxayamgoreng.setText("Ayam Goreng");
        panel1.add(cbxayamgoreng);
        cbxayamgoreng.setBounds(8, 102, 200, 37);

        cbxmieayam.setBackground(new java.awt.Color(255, 255, 102));
        cbxmieayam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxmieayam.setText("Mie Ayam");
        panel1.add(cbxmieayam);
        cbxmieayam.setBounds(8, 163, 170, 37);

        cbxsate.setBackground(new java.awt.Color(255, 255, 102));
        cbxsate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxsate.setText("Sate");
        panel1.add(cbxsate);
        cbxsate.setBounds(8, 227, 100, 37);

        cbxbatagorkeju.setBackground(new java.awt.Color(255, 255, 102));
        cbxbatagorkeju.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxbatagorkeju.setText("Batagor Keju");
        panel1.add(cbxbatagorkeju);
        cbxbatagorkeju.setBounds(8, 282, 190, 37);

        hargabakso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargabakso.setText("Rp. 20.000");
        panel1.add(hargabakso);
        hargabakso.setBounds(340, 50, 130, 29);

        hargaayamgoreng.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargaayamgoreng.setText("Rp. 25.000");
        panel1.add(hargaayamgoreng);
        hargaayamgoreng.setBounds(340, 100, 130, 29);

        hargamieayam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargamieayam.setText("Rp. 18.000");
        panel1.add(hargamieayam);
        hargamieayam.setBounds(340, 160, 130, 29);

        hargasate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargasate.setText("Rp. 20.000");
        panel1.add(hargasate);
        hargasate.setBounds(340, 230, 130, 29);

        hargabatagor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargabatagor.setText("Rp. 25.000");
        panel1.add(hargabatagor);
        hargabatagor.setBounds(340, 290, 140, 29);

        txtjumlah1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah1.setBounds(516, 54, 43, 28);

        txtjumlah2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah2.setBounds(516, 109, 43, 28);

        txtjumlah3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah3.setBounds(516, 170, 43, 28);

        txtjumlah4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah4.setBounds(516, 234, 43, 28);

        txtjumlah5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah5.setBounds(516, 289, 43, 28);

        stokMieayam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokMieayam.setText("15");
        panel1.add(stokMieayam);
        stokMieayam.setBounds(240, 170, 30, 29);

        stokSate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokSate.setText("15");
        panel1.add(stokSate);
        stokSate.setBounds(240, 230, 30, 29);

        stokBatagor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokBatagor.setText("15");
        panel1.add(stokBatagor);
        stokBatagor.setBounds(240, 290, 30, 29);

        stokBakso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokBakso.setText("50");
        panel1.add(stokBakso);
        stokBakso.setBounds(240, 50, 30, 29);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Stok :");
        panel1.add(jLabel32);
        jLabel32.setBounds(210, 0, 70, 50);

        stokAyamgoreng.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokAyamgoreng.setText("15");
        stokAyamgoreng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stokAyamgorengKeyPressed(evt);
            }
        });
        panel1.add(stokAyamgoreng);
        stokAyamgoreng.setBounds(240, 110, 30, 29);

        jPanel1.add(panel1);
        panel1.setBounds(20, 130, 590, 330);

        panel2.setBackground(new java.awt.Color(255, 255, 102));
        panel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText(" Minuman :");
        panel2.add(jLabel6);
        jLabel6.setBounds(0, 10, 133, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Harga :");
        panel2.add(jLabel7);
        jLabel7.setBounds(330, 10, 87, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Jumlah :");
        panel2.add(jLabel8);
        jLabel8.setBounds(450, 10, 102, 29);

        cbxesteh.setBackground(new java.awt.Color(255, 255, 102));
        cbxesteh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxesteh.setText("Es teh");
        cbxesteh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxestehActionPerformed(evt);
            }
        });
        panel2.add(cbxesteh);
        cbxesteh.setBounds(10, 50, 101, 37);

        cbxesjeruk.setBackground(new java.awt.Color(255, 255, 102));
        cbxesjeruk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxesjeruk.setText("Es jeruk");
        panel2.add(cbxesjeruk);
        cbxesjeruk.setBounds(10, 100, 125, 37);

        cbxairmineral.setBackground(new java.awt.Color(255, 255, 102));
        cbxairmineral.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxairmineral.setText("Air Mineral");
        panel2.add(cbxairmineral);
        cbxairmineral.setBounds(10, 150, 157, 37);

        cbxcapucino.setBackground(new java.awt.Color(255, 255, 102));
        cbxcapucino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxcapucino.setText("Capucino");
        panel2.add(cbxcapucino);
        cbxcapucino.setBounds(10, 210, 139, 37);

        cbxmilktea.setBackground(new java.awt.Color(255, 255, 102));
        cbxmilktea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cbxmilktea.setText("Milk tea");
        panel2.add(cbxmilktea);
        cbxmilktea.setBounds(10, 270, 123, 37);

        hargaesteh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargaesteh.setText("Rp. 8.000");
        panel2.add(hargaesteh);
        hargaesteh.setBounds(330, 60, 115, 29);

        hargaesjeruk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargaesjeruk.setText("Rp. 10.000");
        panel2.add(hargaesjeruk);
        hargaesjeruk.setBounds(330, 110, 130, 29);

        hargaairmineral.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargaairmineral.setText("Rp. 6.000");
        panel2.add(hargaairmineral);
        hargaairmineral.setBounds(330, 160, 115, 29);

        hargacapucino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargacapucino.setText("Rp. 15.000");
        panel2.add(hargacapucino);
        hargacapucino.setBounds(330, 220, 130, 29);

        hargamilktea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hargamilktea.setText("Rp. 15.000");
        panel2.add(hargamilktea);
        hargamilktea.setBounds(330, 280, 130, 29);

        txtjumlah6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah6.setBounds(500, 60, 42, 28);

        txtjumlah7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah7.setBounds(500, 110, 42, 28);

        txtjumlah8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah8.setBounds(500, 160, 42, 28);

        txtjumlah9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah9.setBounds(500, 220, 42, 28);

        txtjumlah10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        txtjumlah10.setBounds(500, 280, 42, 28);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setText("Stok :");
        panel2.add(jLabel26);
        jLabel26.setBounds(210, 0, 70, 50);

        stokEsjeruk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokEsjeruk.setText("50");
        panel2.add(stokEsjeruk);
        stokEsjeruk.setBounds(230, 110, 30, 29);

        stokEsteh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokEsteh.setText("15");
        panel2.add(stokEsteh);
        stokEsteh.setBounds(230, 60, 30, 29);

        stokAirmineral.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokAirmineral.setText("15");
        panel2.add(stokAirmineral);
        stokAirmineral.setBounds(230, 160, 30, 29);

        stokCapucino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokCapucino.setText("15");
        panel2.add(stokCapucino);
        stokCapucino.setBounds(230, 220, 30, 29);

        stokMilktea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stokMilktea.setText("15");
        panel2.add(stokMilktea);
        stokMilktea.setBounds(230, 280, 30, 29);

        jPanel1.add(panel2);
        panel2.setBounds(1310, 140, 560, 330);

        jLabel21.setIcon(new javax.swing.ImageIcon("D:\\projek\\3d41cc499985301228c48fccc20da116.png")); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(530, 710, 310, 310);

        jLabel22.setBackground(new java.awt.Color(204, 0, 0));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karya/pngtree-ice-tea-drink-in-a-fresh-glass-cup-png-image_7692811.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(420, 90, 910, 1150);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("PROMOOO!!!!");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 490, 166, 55);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel23.setText("Beli Bakso Lebih Dari 5. Diskon 30%");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(30, 550, 680, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel24.setText("Beli Es Jeruk lebih Dari 5. Diskon 30%");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(30, 580, 710, 70);

        jLabel25.setIcon(new javax.swing.ImageIcon("D:\\projek\\pngtree-meatball-bakso-png-image_7966192.png")); // NOI18N
        jPanel1.add(jLabel25);
        jLabel25.setBounds(960, 360, 1110, 940);

        jLabel39.setIcon(new javax.swing.ImageIcon("D:\\2505473772452ad05e010156fed0819e.png")); // NOI18N
        jPanel1.add(jLabel39);
        jLabel39.setBounds(-190, -350, 900, 900);

        btnresetstok.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnresetstok.setText("RESET STOK");
        btnresetstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetstokActionPerformed(evt);
            }
        });
        jPanel1.add(btnresetstok);
        btnresetstok.setBounds(270, 670, 160, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
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

        Cbxbakso.setSelected(false);
        cbxayamgoreng.setSelected(false);
        cbxmieayam.setSelected(false);
        cbxsate.setSelected(false);
        cbxbatagorkeju.setSelected(false);
        cbxesteh.setSelected(false);
        cbxesjeruk.setSelected(false);
        cbxairmineral.setSelected(false);
        cbxcapucino.setSelected(false);
        cbxmilktea.setSelected(false);
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
        stokBakso.setText(pilihMaki(0, txtjumlah1, 20000, stokBakso, Cbxbakso, "BAKSO"));
        stokAyamgoreng.setText(pilihMaki(1, txtjumlah2, 25000, stokAyamgoreng, cbxayamgoreng, "AYAM GORENG"));
        stokMieayam.setText(pilihMaki(2, txtjumlah3, 18000, stokMieayam, cbxmieayam, "MIE AYAM"));
        stokSate.setText(pilihMaki(3, txtjumlah4, 20000, stokSate, cbxsate, "SATE"));
        stokBatagor.setText(pilihMaki(4, txtjumlah5, 25000, stokBatagor, cbxbatagorkeju, "BATAGOR KEJU"));
        // menu minuman
        stokEsteh.setText(pilihMaki(5, txtjumlah6, 8000, stokEsteh, cbxesteh, "ES TEH"));
        stokEsjeruk.setText(pilihMaki(6, txtjumlah7, 10000, stokEsjeruk, cbxesjeruk, "ES JERUK"));
        stokAirmineral.setText(pilihMaki(7, txtjumlah8, 6000, stokAirmineral, cbxairmineral, "AIR  MINERAL"));
        stokCapucino.setText(pilihMaki(8, txtjumlah9, 15000, stokCapucino, cbxcapucino, "CAPUCINO"));
        stokMilktea.setText(pilihMaki(9, txtjumlah10, 15000, stokMilktea, cbxmilktea, "MILK TEA"));
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
                        if (jumlah > 5 && info.equals("BAKSO")){
                        diskon = (float) (0.3 * (jumlah * hrg)) ;
                        }
//                       else {
//                            diskon = 0;  
//                        }
                       else  if (jumlah > 6 && info.equals("ES JERUK")){
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


    private void cbxestehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxestehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxestehActionPerformed

    private void txtjumlah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah4ActionPerformed

    private void txtjumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah2ActionPerformed

    private void CbxbaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxbaksoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxbaksoActionPerformed

    private void txtjumlah1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah1KeyPressed

        Cbxbakso.setSelected(true);

    }//GEN-LAST:event_txtjumlah1KeyPressed

    private void txtjumlah1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah1FocusLost
        // TODO add your handling code here:

        if (txtjumlah1.getText().equals("")) {
            Cbxbakso.setSelected(false);
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
        cbxayamgoreng.setSelected(true);

    }//GEN-LAST:event_txtjumlah2KeyPressed

    private void txtjumlah2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah2FocusLost
        // TODO add your handling code here:
        if (txtjumlah2.getText().equals("")) {
            cbxayamgoreng.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah2FocusLost

    private void txtjumlah3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah3KeyPressed
        // TODO add your handling code here:
        cbxmieayam.setSelected(true);

    }//GEN-LAST:event_txtjumlah3KeyPressed

    private void txtjumlah3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah3FocusLost
        // TODO add your handling code here:
        if (txtjumlah3.getText().equals("")) {
            cbxmieayam.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah3FocusLost

    private void txtjumlah4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah4KeyPressed
        // TODO add your handling code here:
        cbxsate.setSelected(true);

    }//GEN-LAST:event_txtjumlah4KeyPressed

    private void txtjumlah4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah4FocusLost
        // TODO add your handling code here:
        if (txtjumlah4.getText().equals("")) {
            cbxsate.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah4FocusLost

    private void txtjumlah5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah5KeyPressed
        // TODO add your handling code here:
        cbxbatagorkeju.setSelected(true);

    }//GEN-LAST:event_txtjumlah5KeyPressed

    private void txtjumlah5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah5FocusLost
        // TODO add your handling code here:
        if (txtjumlah5.getText().equals("")) {
            cbxbatagorkeju.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah5FocusLost

    private void txtjumlah6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah6KeyPressed
        // TODO add your handling code here:
        cbxesteh.setSelected(true);

    }//GEN-LAST:event_txtjumlah6KeyPressed

    private void txtjumlah6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah6FocusLost
        // TODO add your handling code here:
        if (txtjumlah6.getText().equals("")) {
            cbxesteh.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah6FocusLost

    private void txtjumlah7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah7KeyPressed
        // TODO add your handling code here:
        cbxesjeruk.setSelected(true);

    }//GEN-LAST:event_txtjumlah7KeyPressed

    private void txtjumlah7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah7FocusLost
        // TODO add your handling code here:
        if (txtjumlah7.getText().equals("")) {
            cbxesjeruk.setSelected(false);
        }

    }//GEN-LAST:event_txtjumlah7FocusLost

    private void txtjumlah8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah8KeyPressed
        // TODO add your handling code here:
        cbxairmineral.setSelected(true);

    }//GEN-LAST:event_txtjumlah8KeyPressed

    private void txtjumlah8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah8FocusLost
        // TODO add your handling code here:
        if (txtjumlah8.getText().equals("")) {
            cbxairmineral.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah8FocusLost

    private void txtjumlah9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah9KeyPressed
        // TODO add your handling code here:
        cbxcapucino.setSelected(true);

    }//GEN-LAST:event_txtjumlah9KeyPressed

    private void txtjumlah9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah9FocusLost
        // TODO add your handling code here:
        if (txtjumlah9.getText().equals("")) {
            cbxcapucino.setSelected(false);
        }
    }//GEN-LAST:event_txtjumlah9FocusLost

    private void txtjumlah10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlah10KeyPressed
        cbxmilktea.setSelected(true);

    }//GEN-LAST:event_txtjumlah10KeyPressed

    private void txtjumlah10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjumlah10FocusLost
        if (txtjumlah10.getText().equals("")) {
            cbxmilktea.setSelected(false);
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
        stokBakso.setText("50");
        stokAyamgoreng.setText("15");
        stokMieayam.setText("15");
        stokSate.setText("15");
        stokBatagor.setText("15");
        stokEsteh.setText("15");
        stokEsjeruk.setText("50");
        stokAirmineral.setText("15");
        stokCapucino.setText("15");
        stokMilktea.setText("15");

    }//GEN-LAST:event_btnresetstokActionPerformed

    private void stokAyamgorengKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stokAyamgorengKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stokAyamgorengKeyPressed

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
    private javax.swing.JCheckBox Cbxbakso;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnresetstok;
    private javax.swing.JCheckBox cbxairmineral;
    private javax.swing.JCheckBox cbxayamgoreng;
    private javax.swing.JCheckBox cbxbatagorkeju;
    private javax.swing.JCheckBox cbxcapucino;
    private javax.swing.JCheckBox cbxesjeruk;
    private javax.swing.JCheckBox cbxesteh;
    private javax.swing.JCheckBox cbxmieayam;
    private javax.swing.JCheckBox cbxmilktea;
    private javax.swing.JCheckBox cbxsate;
    private javax.swing.JLabel hargaairmineral;
    private javax.swing.JLabel hargaayamgoreng;
    private javax.swing.JLabel hargabakso;
    private javax.swing.JLabel hargabatagor;
    private javax.swing.JLabel hargacapucino;
    private javax.swing.JLabel hargaesjeruk;
    private javax.swing.JLabel hargaesteh;
    private javax.swing.JLabel hargamieayam;
    private javax.swing.JLabel hargamilktea;
    private javax.swing.JLabel hargasate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JLabel stokAirmineral;
    private javax.swing.JLabel stokAyamgoreng;
    private javax.swing.JLabel stokBakso;
    private javax.swing.JLabel stokBatagor;
    private javax.swing.JLabel stokCapucino;
    private javax.swing.JLabel stokEsjeruk;
    private javax.swing.JLabel stokEsteh;
    private javax.swing.JLabel stokMieayam;
    private javax.swing.JLabel stokMilktea;
    private javax.swing.JLabel stokSate;
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
