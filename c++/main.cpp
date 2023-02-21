/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//memanggil header yang dibutuhkan
#include <iostream>
#include <string.h>
using namespace std;

//memanggil class yang sudah dibuat
#include "sivitas_akademik.cpp"
#include "mahasiswa.cpp"
#include "human.cpp"

int main(){
    //membuat class human1, serta mengset atribut dari class human1 beserta parentnya (Memory dan Product) dengan hanya memanggil Hardware saja
    human human1;
	human1.set_nik("123456789");
	human1.set_nama("Fer D Sam");
	human1.set_jenis_kelamin("Binary");
	human1.set_nim("987654321");
	human1.set_prodi("Sastra Mesin");
	human1.set_fakultas("Sastra dan Bahasa");
	human1.set_asal_univ("UPI");
	human1.set_email("ferdsam@upi.edu");

	//menampilkan isi dari class human1, serta hasil dari proses yang terjadi di konstruktor class hardware (inheritance)
    cout << "NIK: " << human1.get_nik() << endl;
	cout << "Nama: " << human1.get_nama() << endl;
	cout << "Jenis Kelamin: " << human1.get_jenis_kelamin() << endl;
	cout << "Nama: " << human1.get_nim() << endl;
	cout << "Prodi: " << human1.get_prodi() << endl;
	cout << "Fakultas: " << human1.get_fakultas() << endl;
	cout << "Asal Universitas: " << human1.get_asal_univ() << endl;
	cout << "Email: " << human1.get_email() << endl;
	
	return 0;
}
