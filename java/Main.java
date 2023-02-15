/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        //membuat class hardware1, serta mengset atribut dari class hardware1 beserta parentnya (Memory dan Product) dengan hanya memanggil Hardware saja
        Human human = new Human();
        human.setNik("123456789");
        human.setNama_Mahasiswa("Fer D Sam Ball");
        human.setJenis_Kelamin_Mahasiswa("Binary");
        human.setNim("987654321");
        human.setFakultas("Teknik");
        human.setProdi("Teknik Kriminoloig");
        human.setAsal_Universitas("Universitas Tertutup");
        human.setEmail_Edu("ferdsam@ut.edu");

        // menampilkan isi dari class hardware1, serta hasil dari proses yang terjadi di konstruktor class hardware (inheritance)
        System.out.println("NIK : " + human.getNik());
        System.out.println("Nama : " + human.getNama_Mahasiswa());
        System.out.println("Jenis Kelamin : " + human.getJenis_Kelamin_Mahasiswa());
        System.out.println("NIM : " + human.getNim());
        System.out.println("Fakultas : " + human.getFakultas());
        System.out.println("Prodi : " + human.getProdi());
        System.out.println("Universitas : " + human.getAsal_Universitas());
        System.out.println("Email : " + human.getEmail_Edu());
    }
}
