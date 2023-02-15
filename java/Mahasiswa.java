/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//membuat class Mahasiswa dengan menunjuk parentnya yaitu SivitasAkademik
class Mahasiswa extends SivitasAkademik{
    private String nim;
    private String nama;
    private String jenis_kelamin;
    private String fakultas;
    private String prodi;

    //membuat konstruktor sekaligus mengeset atribut private
    public Mahasiswa(String nim, String nama, String jenis_kelamin, String fakultas, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    //membuat getter dan setter
    //membuat konstruktor
    public Mahasiswa(){
    }
    //membuat fungsi untuk mengeset atribut private
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama_Mahasiswa(String nama){
        this.nama = nama;
    }
    public void setJenis_Kelamin_Mahasiswa(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    //membuat fungsi untuk me-return atribut private
    public String getNim(){
        return nim;
    }
    public String getNama_Mahasiswa(){
        return nama;
    }
    public String getJenis_Kelamin_Mahasiswa(){
        return jenis_kelamin;
    }
    public String getFakultas(){
        return fakultas;
    }
    public String getProdi(){
        return prodi;
    }
}
