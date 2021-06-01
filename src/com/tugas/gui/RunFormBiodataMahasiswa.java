package com.tugas.gui;

import com.tugas.NIM;

import javax.swing.*;
import java.util.Scanner;

public class RunFormBiodataMahasiswa {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Biodata Mahasiswa");
        jFrame.setContentPane(new FormBiodataMahasiswa().getrootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
