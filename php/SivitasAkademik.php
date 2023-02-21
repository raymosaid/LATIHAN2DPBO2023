<?php

/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//membuat class SivitasAkademik sebagai parent dari seluruh proses inheritance
class SivitasAkademik{
    //membuat atribut private
	private $asal_universitas = "";
    private $email_edu = "";

    //membuat konstruktor sekaligus mengeset atribut private
    function __construct($asal_universitas, $email_edu){
        $this->asal_universitas = $asal_universitas;
        $this->email_edu = $email_edu;
    }

    //membuat fungsi untuk mengeset atribut private
    function setAsalUniversitas($asal_universitas){
        $this->asal_universitas = $asal_universitas;
    }
    function setEmailEdu($email_edu){
        $this->email_edu = $email_edu;
    }

    //membuat fungsi untuk me-return atribut private
    function getAsalUniversitas(){
        return $this->asal_universitas;
    }
    function getEmailEdu(){
        return $this->email_edu;
    }

    //membuat destruktor
    function __destruct(){
    }
}
?>
