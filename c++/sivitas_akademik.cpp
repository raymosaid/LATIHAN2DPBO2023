/*
    Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
    Aamiin.
*/

//memanggil header yang dibutuhkan
#include <iostream>
#include <string.h>

using namespace std;

//membuat class sivitas_akademik sebagai parent dari seluruh proses inheritance
class sivitas_akademik{
    //membuat atribut private
	private:
        string asal_universitas;
        string email_edu;

    public:
        //membuat konstruktor tanpa parameter
        sivitas_akademik(){
            this->asal_universitas = "";
            this->email_edu = "";
        }

        //membuat konstruktor dengan parameter
        sivitas_akademik(string asal_universitas, string email_edu){
            this->asal_universitas = asal_universitas;
            this->email_edu = email_edu;
        }

        //membuat fungsi untuk mengeset atribut private
        void set_asal_univ(string asal_universitas){
            this->asal_universitas = asal_universitas;
        }
        void set_email(string email_edu){
            this->email_edu = email_edu;
        }

        //membuat fungsi untuk me-return atribut private
        string get_asal_univ(){
            return asal_universitas;
        }
        string get_email(){
            return email_edu;
        }

        //membuat destruktor
        ~sivitas_akademik(){
        }
};
