# LATIHAN2DPBO2023

Penjelasan program:
1. Pada latihan ini saya membuat 3 class, diantaranya Mahasiswa, Human, dan SivitasAkademik, tidak lupa saya juga membuat Main
2. Sesuai soal yang diminta saya membuat multiple inheritance dengan gambar desain akan saya lampirkan di bawah bagian penjelasan desain class
3. Pada program ini akan menampilkan data mahasiswa sesuai dengan inputan yg ada (Hard Code)
4. Hasil dari program saya lampirkan di bawah dan penjelasan detail program ada di comment setiap file
![Screenshot (12)](https://user-images.githubusercontent.com/99600360/218931159-675072fe-f762-4f38-8195-2d1bd93a0050.png)

Penjelasan desain class:
![image](https://user-images.githubusercontent.com/99600360/218932101-18f36d7e-3a24-4941-83b0-3699e9302bab.png)
Desain Class saya adalah seperti gambar di atas, alasannya adalah:
1. Class Sivitas akademik menaungi mahasiswa dan di dalam mahasiswa ada data diri manusia seperti NIK dan jenis kelamin, oleh karena itu Human adalah class yang paling bawah karena class human perlu mengakses data mahasiswanya dan juga data sivitas akademiknya
2. Apabila program ini dikembangkan dan kita hanya ingin mengakses data mahasiswa kita tidak bisa melihat nama kampus dan email mahasiswa hal ini bisa dilakukan. apabila posisi inheritance class dibalik maka tidak akan bisa, karena mahasiswa tidak akan bisa mengakses class SivitasAkademik akibat posisinya yang diatas Sivitas Akademik. Oleh karena itu posisi class seperti yang terlampir di gambar
