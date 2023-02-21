<?php

/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//membuat class Mahasiswa dengan menunjuk parentnya yaitu SivitasAkademik
class Mahasiswa extends SivitasAkademik{
    //membuat atribut private
	private $nim = "";
	private $nama = "";
    private $jenis_kelamin = "";
	private $fakultas = "";
    private $prodi = "";

    //membuat konstruktor sekaligus mengeset atribut private
    function __construct($nim, $nama, $jenis_kelamin, $fakultas, $prodi){
        $this->nim = $nim;
        $this->nama = $nama;
        $this->jenis_kelamin = $jenis_kelamin;
        $this->fakultas = $fakultas;
        $this->prodi = $prodi;
    }

    //membuat fungsi untuk mengeset atribut private
    function setNim($nim){
        $this->nim = $nim;
    }
    function setNama($nama){
        $this->nama = $nama;
    }
    function setJenisKelamin($jenis_kelamin){
        $this->jenis_kelamin = $jenis_kelamin;
    }
    function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }
    function setProdi($prodi){
        $this->prodi = $prodi;
    }

    //membuat fungsi untuk me-return atribut private
    function getNim(){
        return $this->nim;
    }
    function getNama(){
        return $this->nama;
    }
    function getJenisKelamin(){
        return $this->jenis_kelamin;
    }
    function getFakultas(){
        return $this->fakultas;
    }
    function getProdi(){
        return $this->prodi;
    }

    //membuat destruktor
    function __destruct(){
    }
}
?>
