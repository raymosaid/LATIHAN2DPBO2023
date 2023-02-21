/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//memanggil header yang dibutuhkan
#include <iostream>
#include <string.h>

using namespace std;

//membuat class mahasiswa dengan menunjuk parentnya yaitu sivitas_akademik
class mahasiswa : public sivitas_akademik{
    //membuat atribut private
	private:
        string nim;
        string nama;
        string jenis_kelamin;
        string fakultas;
        string prodi;

    public:
        //membuat konstruktor tanpa parameter
        mahasiswa(){
        }

        //membuat konstruktordengan parameter
        mahasiswa(string nim, string nama, string jenis_kelamin, string fakultas, string prodi){
            this->nim = nim;
            this->nama = nama;
            this->jenis_kelamin = jenis_kelamin;
            this->fakultas = fakultas;
            this->prodi = prodi;
        }

        //membuat fungsi untuk mengeset atribut private
        void set_nim(string nim){
            this->nim = nim;
        }
        void set_nama(string nama){
            this->nama = nama;
        }
        void set_jenis_kelamin(string jenis_kelamin){
            this->jenis_kelamin = jenis_kelamin;
        }
        void set_fakultas(string fakultas){
            this->fakultas = fakultas;
        }
        void set_prodi(string prodi){
            this->prodi = prodi;
        }

        //membuat fungsi untuk me-return atribut private
        string get_nim(){
            return nim;
        }
        string get_nama(){
            return nama;
        }
        string get_jenis_kelamin(){
            return jenis_kelamin;
        }
        string get_fakultas(){
            return fakultas;
        }
        string get_prodi(){
            return prodi;
        }

        //membuat destruktor
        ~mahasiswa(){
        }
};
