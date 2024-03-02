//NAMA  : Ari Perdian
//NIM   : 20220040072
//KELAS : TI22J

public class Komputer {
    /*1.public class Komputer { Ini adalah deklarasi kelas Java dengan nama "Komputer".
    Modifikator public berarti kelas ini dapat diakses dari kelas lain.
    */
    
    String jenis_komputer;
    private String merk;
    /*
    2.jenis_komputer dan merk adalah atribut.atribut yang mewakili jenis dan merk dari objek komputer.
    Atribut-atribut ini adalah bagian integral dari objek dan menyimpan informasi yang relevan terkait objek tersebut.
    */

    public void setDataKomputer(String jenis, String merk) {
        jenis_komputer = jenis;
        this.merk = merk;
    }
    /*
    3.	Bagian tersebut adalah metode atau fungsi yang disebut setDataKomputer. 
    Metode ini bertanggung jawab untuk mengatur nilai dari variabel jenis_komputer dan merk 
    berdasarkan parameter yang diberikan kepadanya. metode ini digunakan untuk mengatur jenis dan merk komputer pada objek kelas Komputer.
    */
    
    public String getJenis() {
        return jenis_komputer;
    }
    /*
    4.Bagian tersebut adalah metode atau fungsi yang disebut getJenis. 
    Metode ini berfungsi untuk mengembalikan nilai dari variabel jenis_komputer.metode ini digunakan sebagai "getter" 
    untuk mendapatkan nilai jenis komputer dari objek kelas Komputer.
    */
    
    public String getMerk(){
        return merk;
    }
    /*
    5.Bagian tersebut juga adalah metode atau fungsi, yang disebut getMerk. Sama seperti getJenis, 
    metode tersebut berfungsi sebagai "getter" untuk mengembalikan nilai dari variabel merk. 
    metode tersebut digunakan untuk mendapatkan nilai merk komputer dari objek kelas Komputer.
    */
    
    public static void main(String []args){
        Komputer mykom = new Komputer();
        /*
        6.Bagian tersebut adalah pembuatan objek atau instansiasi objek dari kelas Komputer.
        */
        
        mykom.setDataKomputer("LAPTOP", "MACBOOK");
        /*
        7.Bagian tersebut adalah pemanggilan metode setDataKomputer pada objek mykom yang telah
        dibuat sebelumnya.
        */
        
        System.out.println(mykom.getJenis());
        System.out.println(mykom.getMerk());
        /*
        8.Bagian tersebut mencetak nilai dari objek mykom menggunakan metode getJenis dan getMerk.
        */
    }
}
