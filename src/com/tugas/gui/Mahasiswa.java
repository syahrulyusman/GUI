package com.tugas.gui;

public class Mahasiswa {
    private String nama;
    private String Nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
        this.Nim = Nim;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        this.Nim = nim;
    }
    public String jenjangPendidikan() {
        String jenjang = this.Nim.substring(0,1);
        // Jenjang
        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "NOT FOUND";
    }

    // Angkatan Anda Dikampus
    public String angkatan() {
        if (this.Nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.Nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.Nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "NOT FOUND";
        }
    }

    // Fakultas Anda Dikampus
    public String fakultas() {
        String fac =  this.Nim.substring(3,4);
        if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Tarbiyah dan Keguruan";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas Syari'ah dan Hukum";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Ushuluddin";
        }else if (fac.equalsIgnoreCase("4")) {
            return "Fakultas Dakwah dan Komunikasi";
        }else if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Sains dan Teknologi";
        }else if (fac.equalsIgnoreCase("6")) {
            return "Psikologi";
        }else if (fac.equalsIgnoreCase("7")) {
            return "Fakultas Ekonomi dan Ilmu Sosial";
        }else if (fac.equalsIgnoreCase("8")) {
            return "Fakultas Pertanian dan Peternakan";
        }else {
            return "NOT FOUND";
        }
    }

    // Prodi Anda Dikampus
    public String prodi() {
        if (this.Nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Teknik Informatika";
        }else if (this.Nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Teknik Industri";
        }else if (this.Nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }else if (this.Nim.substring(4, 6).equalsIgnoreCase("04")) {
            return "Matematika";
        }else if (this.Nim.substring(4, 6).equalsIgnoreCase("05")) {
            return "Teknik Elektro";
        }
        return "NOT FOUND";
    }

    // Jenis Kelamin Anda
    public String jenisKelamin() {
        if (this.Nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.Nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "NOT FOUND";
    }

    public String noUM() {
        return this.Nim.substring(7,11);
    }
}


