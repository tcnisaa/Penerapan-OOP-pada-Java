// Tangguh Chairunnisa
// 21120122140103
// PBO kelas C
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    private JPanel lingkaranPanel;
    private JLabel lingkarangLabel;
    private JLabel labelRumus;
    private JTextField tfJariJari;
    private JTextField tfLuas;
    private JButton hitungButton;
    private JButton keluarButton;
    private JLabel labelLuas;
    private JLabel labelJariJari;

    public Lingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double jariJari, luas;
                    double pi = 3.14;

                    // Membaca input dari pengguna
                    jariJari = Double.parseDouble(tfJariJari.getText());

                    // Menghitung luas lingkaran
                    luas = pi * (jariJari * jariJari);

                    // Menampilkan hasil
                    tfLuas.setText(String.valueOf(luas));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Masukkan angka yang valid untuk jari-jari!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Menutup aplikasi
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Membuat frame untuk aplikasi
        JFrame frame = new JFrame("Perhitungan Luas Lingkaran");
        frame.setContentPane(new Lingkaran().lingkaranPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
