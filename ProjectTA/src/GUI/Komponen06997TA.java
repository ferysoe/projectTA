package GUI;
import javax.swing.*;
public class Komponen06997TA extends JFrame{
    String pilihan []={"Nasi Goreng","Mie Goreng","CapJay","Kwetiau"};
    int Total;
    
    JLabel label = new JLabel("WARUNG BAROKAH");
    JLabel nama = new JLabel("Nama Pelanggan  ");
    JLabel noantri = new JLabel("Nomor Antrian  ");
    JLabel jumlah = new JLabel("Jumlah ");
    JLabel bungkus = new JLabel("Bungkus");
    JLabel bayar = new JLabel("BAYAR ");
    JLabel alert = new JLabel();
    
    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();
    JTextField pilih = new JTextField();
    JTextField br = new JTextField();
    JComboBox combo = new JComboBox(pilihan);
    
    JButton total = new JButton(" TOTAL ");
    JTextField hasiltotal = new JTextField();
    JTextField byr = new JTextField();
    JButton cetak = new JButton("CETAK");
    JButton c = new JButton("C");
    JButton history = new JButton("HISTORY");
    
    JTextPane text = new JTextPane();
    JTextPane text2 = new JTextPane();
    protected String pro="", metodee="",data="";
    protected int harga, Kembali=0, bay, o=0;
    Thread thread = Thread.currentThread();
    public void proses(){
        harga = Integer.parseInt(br.getText()) * 15000;
    }
}