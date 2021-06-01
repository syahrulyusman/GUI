package com.tugas.gui;

import javax.swing.*;

public class FormBiodataMahasiswa {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel Hasil;
    private JLabel labelku;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;


    public FormBiodataMahasiswa() {
        buttonSave.addActionListener(ActionEvent -> {
            String nama = textNama.getText();

            String nim = textNim.getText();

            Mahasiswa Mahasiswa = new Mahasiswa();
               Mahasiswa.setNama(nama);
               Mahasiswa.setNim(nim);

                    labelku.setText(
                            "Nama\t\t; " + Mahasiswa.getNama()
                    );

                    label1.setText( "NIM\t\t; " + Mahasiswa.getNim()
                    );

                    label2.setText("Jenjang Pendidikan\t\t; " + Mahasiswa.jenjangPendidikan());
                    label3.setText("Angkatan\t\t\t\t; " + Mahasiswa.angkatan());
                    label4.setText("Fakultas\t\t\t\t; " + Mahasiswa.fakultas());
                    label5.setText("Prodi\t\t\t\t\t: " + Mahasiswa.prodi());
                    label6.setText("\nJenis Kelamin\t\t\t: " + Mahasiswa.jenisKelamin());
                    label7.setText( "\nNomor Urut Mahasiswa\t\t\t: " +Mahasiswa.noUM());


        });
    }
    public JPanel getrootPanel() {
        return Hasil;

    }
}

