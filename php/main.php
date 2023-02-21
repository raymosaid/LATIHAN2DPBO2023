<?php

/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//memanggil class yang sudah dibuat sebelumnya
include "SivitasAkademik.php";
include "Mahasiswa.php";
include "Human.php";

//membuat class human, serta mengset atribut dari class Human beserta parentnya (Mahasiswa dan SivitasAkademiik) dengan hanya memanggil Human saja
$human = new Human();
$human->setNik("123456789");
$human->setNama("Fer D Sam");
$human->setJenisKelamin("Binary");
$human->setNim("987654321");
$human->setFakultas("Teknik");
$human->setProdi("Teknik Nguli");
$human->setAsalUniversitas("Universitas Tertutup");
$human->setEmailEdu("ferdsam@ut.edu");

//menampilkan isi dari class Human, serta hasil dari proses yang terjadi di konstruktor class Human (inheritance)
echo "NIK: ". $human->getNik() ."<br/>";
echo "Nama: ". $human->getNama() ."<br>";
echo "Jenis Kelamin: ". $human->getJenisKelamin() ."<br>";
echo "NIM: ". $human->getNim() ."<br>";
echo "Fakultas: ". $human->getFakultas() ."<br>";
echo "Prodi: ". $human->getProdi() ."<br>";
echo "Asal Universitas: ". $human->getAsalUniversitas() ."<br>";
echo "Email: ". $human->getEmailEdu() ."<br>";
?>