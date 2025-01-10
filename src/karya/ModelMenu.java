// Typedata bentukan
package karya;
public class ModelMenu {
    private String nama;
    private int id,harga,jumlah;
    private boolean jenis, pilih;
    public String struk;
    private double diskon;
    public double getDiskon(){
        return diskon;
    }
    public void setDiskon(double diskon){
        this.diskon = diskon;
    }
    public String getStruk(){
        return struk;
    }
    public void setStruk(String struk){
        this.struk = struk;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNama(){ 
        return nama;
    }
    public void setNama(String nama){
      this.nama = nama;
     }
    public int getHarga(){
        return harga;
    }
     public void setHarga(int harga){
      this.harga = harga;
     }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public boolean getJenis(){
        return jenis;
    }
    public void setJenis(boolean jenis){
        this.jenis = jenis;
    }
    public boolean getPilih(){
        return pilih;
    }
    public void setPilih(boolean pilih){
        this.pilih = pilih;
    }
    }