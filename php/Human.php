<?php

/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//membuat class Human dengan menunjuk parentnya yaitu Mahasiswa
class Human extends Mahasiswa{
    //membuat atribut private
	private $nik = "";

    //membuat konstruktor
    function __construct(){
    }

    //membuat fungsi untuk mengeset atribut private
    function setNik($nik){
        $this->nik = $nik;
    }

    //membuat fungsi untuk me-return atribut private
    function getNik(){
        return $this->nik;
    }

    //membuat destruktor
    function __destruct(){
    }
}
?>
