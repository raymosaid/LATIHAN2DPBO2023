#Saya Mohammad Ray Mosaid mengerjakan Latihan 2 dalam mata kuliah DPBO
#untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
#Aamiin.

#Memeanggil class SivitasAkademik
class SivitasAkademik:

    #variable/atribut private
    __asal_universitas = ""
    __email_edu = ""

    #membuat konsruktor untuk mengubah/mengakses variabel/atribut private
    def __init__(self, asal_universitas, email_edu):
        self.__asal_universitas = asal_universitas
        self.__email_edu = email_edu
    
    #membuat fungsi untuk mengeset variabel/atribut private
    def set_asal_universitas(self, asal_universitas):
        self.__asal_universitas = asal_universitas
    def set_email_edu(self, email_edu):
        self.__email_edu = email_edu
        
    #membuat fungsi untuk me-return hasil
    def get_asal_universitas(self):
        return self.__asal_universitas
    def get_email_edu(self):
        return self.__email_edu
    