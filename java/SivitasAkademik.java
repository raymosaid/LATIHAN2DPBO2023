/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//membuat class SivitasAkademik sebagai Super Class
class SivitasAkademik{
    //membuat atribut private
    private String asal_universitas;
    private String email_edu;

    //membuat konstruktor sekaligus mengeset atribut private
    public SivitasAkademik(String asal_universitas, String email_edu){
        this.asal_universitas = email_edu;
        this.email_edu = email_edu;
    }

    //membuat getter dan setter
    //membuat konstruktor
    public SivitasAkademik(){
    }
    //membuat fungsi untuk mengeset atribut private
    public void setAsal_Universitas(String asal_universitas){
        this.asal_universitas = asal_universitas;
    }
    public void setEmail_Edu(String email_edu){
        this.email_edu = email_edu;
    }
    
    //membuat fungsi untuk me-return atribut private
    public String getAsal_Universitas(){
        return asal_universitas;
    }
    public String getEmail_Edu(){
        return email_edu;
    }
}
