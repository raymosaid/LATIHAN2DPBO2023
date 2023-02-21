#Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
#Aamiin.

#Memeanggil class SivitasAakademik agar bisa dipakai
from SivitasAkademik import SivitasAkademik

#Membuat class Mahasiswa dengan SivitasAkademik sebagai parentnya
class Mahasiswa(SivitasAkademik):

    #variable/atribut private
    __nim = ""
    __nama = ""
    __jenis_kelamin = ""
    __fakultas = ""
    __prodi = ""

    #membuat konsruktor untuk mengubah/mengakses variabel/atribut private
    def __init__(self, nim, nama, jenis_kelamin, fakultas, prodi):
        self.__nim = nim
        self.__nama = nama
        self.__jenis_kelamin = jenis_kelamin
        self.__fakultas = fakultas
        self.__prodi = prodi
    
    #membuat fungsi untuk mengeset variabel/atribut private
    def set_nim(self, nim):
        self.__nim = nim
    def set_nama(self, nama):
        self.__nama = nama
    def set_jenis_kelamin(self, jenis_kelamin):
        self.__jenis_kelamin = jenis_kelamin
    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas
    def set_prodi(self, prodi):
        self.__prodi = prodi

    #membuat fungsi untuk me-return hasil proses konstruktor sebelumnya
    def get_nim(self):
        return self.__nim
    def get_nama(self):
        return self.__nama
    def get_jenis_kelamin(self):
        return self.__jenis_kelamin
    def get_fakultas(self):
        return self.__fakultas
    def get_prodi(self):
        return self.__prodi
    #pass agar bisa mengakses class parent
    pass
