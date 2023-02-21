#Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
#Aamiin.

#Memeanggil class Human agar bisa dipakai
from Human import Human

#Membuat class human1
human1 = Human(None, None, None)

#Mengeset isi class hardwre1
human1.set_nik("123456789")
human1.set_nama("Fer D Sam")
human1.set_jenis_kelamin("Binary")
human1.set_nim("987654321")
human1.set_fakultas("Teknik")
human1.set_prodi("Teknik Nguli")
human1.set_asal_universitas("Universitas Tertutup")
human1.set_email_edu("ferdsam@ut.edu")

#Menampilkan isi dari class human1, serta hasil dari proses yang terjadi di konstruktor class human (inheritance)
print("NIK: " + str(human1.get_nik()))
print("Nama: " + str(human1.get_nama()))
print("Jenis Kelamin: " + str(human1.get_jenis_kelamin()))
print("Fakultas: " + str(human1.get_fakultas()))
print("Prodi: " + str(human1.get_prodi()))
print("Asal Universitas: " + str(human1.get_asal_universitas()))
print("Email: " + str(human1.get_email_edu()))
