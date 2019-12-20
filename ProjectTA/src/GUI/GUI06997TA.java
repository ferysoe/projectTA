package GUI;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
public class GUI06997TA extends Komponen06997TA {
    
    public GUI06997TA(){
        
        JFrame frame = new JFrame();
        
        label.setBounds(230, 30, 500, 40);
        label.setFont(new Font("Consolas", Font.BOLD,45));
        label.setForeground(new Color(20, 1, 188));
        nama.setBounds(20, 100, 200, 30);
        nama.setFont(new Font("Consolas", Font.BOLD,17));
        noantri.setBounds(20, 150, 200, 30);
        noantri.setFont(new Font("Consolas", Font.BOLD,17));
        jumlah.setBounds(20, 200, 200, 30);
        jumlah.setFont(new Font("Consolas", Font.BOLD,17));
        bungkus.setBounds(270, 200, 100, 30);
        bungkus.setFont(new Font("Consolas", Font.BOLD,17));
        combo.setBounds(340,195,100,30);

        total.setBounds(20, 250, 150, 25);
        total.setBackground(new Color(2, 200, 255));
        total.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
                proses();
                
        hasiltotal.setText(String.valueOf(harga));
        thread.sleep(1000);
            }catch(Exception ex){
            
            }        
          }
        });    
        bayar.setBounds(20, 300, 200, 30);
        bayar.setFont(new Font("Consolas", Font.BOLD,17));
        bayar.setForeground(new Color(20, 1 ,188));
        nm.setBounds(200, 100, 230, 25);
        nm.setFont(new Font("Consolas", Font.BOLD,17));
        nomer.setBounds(200, 150, 230, 25);
        nomer.setFont(new Font("Consolas", Font.BOLD,17));
        br.setBounds(200, 200, 60, 25);
        hasiltotal.setBounds(200, 250, 230, 25);
        hasiltotal.setFont(new Font("Consolas", Font.BOLD,17));
        byr.setBounds(200, 300, 230, 25);
        byr.setFont(new Font("Consolas", Font.BOLD,17));
        byr.setForeground(Color.red);
        alert.setBounds(200, 445, 230, 25);
        alert.setFont(new Font("Consolas", Font.BOLD,13));
        alert.setForeground(Color.red);
        
        cetak.setBounds(20, 495, 150, 25);
        cetak.setBackground(new Color(68, 255, 71));
        cetak.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(byr.getText().equals("")){
            byr.setText("Input Jumlah Bayar");
            alert.setText("");
            }else{
            bay = Integer.parseInt(new String(byr.getText()));
                try{
                    CheckError();
                    Kembali = bay - harga;
                    Total= Total + harga;
                    alert.setText("");
                    text.setText(" ------NASI GORENG BAROKAH------\n"+
                            "NASI GORENG ANEKA MACAM\n"+
                            "--------------------\n" +
                            "  Nama         : " + nm.getText()+ "\n" +
                            "  No Antrian   : " + nomer.getText()+ "\n" +
                            "  Pilihan Menu : " + combo.getSelectedItem()+ "\n" +
                            "  Jumlah       : " + br.getText() + " Bungkus\n" +
                            "  TOTAL        : Rp." + harga + "\n" +
                            "--------------------\n"+
                            "  Bayar   : Rp."+ byr.getText() + "\n" +
                            "  Kembali : Rp." + Kembali + "\n" +
                            "--------------------\n");
                }catch(IOException ex){
                        errore();
                        }
    }
}
    });
        history.setBounds(200, 490, 100, 25);
        history.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                o++;
                data+=o+". "+nm.getText()+" - "+ combo.getSelectedItem()+" >> "+br.getText()+" Bungkus >> Rp."+harga+" >> Hasil Total : "+Total+"\n";
                text2.setText(data);
            }
        });
        c.setBounds(386, 495, 43, 25);
        c.setBackground(Color.red);
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Consolas", Font.BOLD,17));
        c.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            nm.setText("");
            nomer.setText("");
            hasiltotal.setText("");
            byr.setText("");
            text.setText("");
            alert.setText("");
        }
});
        text.setBounds(450, 250,440,270);
        text.setFont(new Font("Consolas", Font.BOLD,15));    
        text2.setBounds(450, 100,440,130);
        text2.setFont(new Font("Consolas", Font.BOLD,14));
        
        add(label);
        add(nama);
        add(noantri);
        add(jumlah);
        add(bungkus);
        add(combo);
        add(nm);
        add(nomer);
        add(br);
        add(total);
        add(hasiltotal);
        add(bayar);
        add(byr);
        add(alert);
        add(cetak);
        add(c);
        add(text);
        add(text2);
        add(history);
        
        getContentPane().setBackground(Color.cyan);
        setTitle("Nasi Goreng Barokah");
        setSize(930, 590);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        private void reset(){
            o+=0;
        }
        private void errore(){
        alert.setText("Bayar Kurang Rp. " + (harga - bay));
    }
        private void CheckError() throws IOException{
        if(bay < harga){
        throw new IOException();
      }   
    }
}