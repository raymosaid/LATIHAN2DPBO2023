/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//membuat class Product sebagai parent dari seluruh proses inheritance
class Human extends Mahasiswa{
    //membuat atribut private
    private String nik;
    private String nama;
    private String jenis_kelamin;

    //membuat konstruktor sekaligus mengeset atribut private
    public Human(String nik, String nama, String jenis_kelamin){
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    //membuat konstruktor
    public Human(){
    }
    //membuat fungsi untuk mengeset atribut private
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setNama_Human(String nama){
        this.nama = getNama_Mahasiswa();
    }
    public void setJenis_Kelamin_Human(String jenis_kelamin){
        this.jenis_kelamin = getJenis_Kelamin_Mahasiswa();
    }
    
    //membuat fungsi untuk me-return atribut private
    public String getNik(){
        return nik;
    }
    public String getNama_Human(){
        return nama;
    }
    public String getJenis_Kelamin_Human(){
        return jenis_kelamin;
    }
}
