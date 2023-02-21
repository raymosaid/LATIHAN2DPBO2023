/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//memanggil header yang dibutuhkan
#include <iostream>
#include <string.h>

using namespace std;

//membuat class human dan memanggil class parentnya yaitu mahasiswa
class human : public mahasiswa{
    //membuat atribut private
	private:
        string nik;

    public:
        //membuat konstruktor tanpa parameter
        human(){
        }

        //membuat konstruktordengan parameter
        human(string nik){
            this->nik = nik;
        }

        //membuat fungsi untuk mengeset atribut private
        void set_nik(string nik){
            this->nik = nik;
        }

        //membuat fungsi untuk me-return atribut private
        string get_nik(){
            return nik;
        }

        //membuat destruktor
        ~human(){
        }
};
