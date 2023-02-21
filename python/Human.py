#Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
#Aamiin.

#Memeanggil class Mahasiswa agar bisa dipakai
from Mahasiswa import Mahasiswa

#Membuat class Human dengan Mahasiswa sebagai parentnya
class Human(Mahasiswa):

    #variable/atribut private
    __nik = ""

    #membuat konsruktor untuk mengubah/mengakses variabel/atribut private
    def __init__(self, nik_, nama, jenis_kelamin):
        self.__nik = nik_
    
    #membuat fungsi untuk mengeset variabel/atribut private
    def set_nik(self, nik):
        self.__nik = nik

    #membuat fungsi untuk me-return hasil proses konstruktor sebelumnya
    def get_nik(self):
        return self.__nik
    #pass agar bisa mengakses class parent
    pass
