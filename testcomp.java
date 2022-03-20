//membuat composition

//composition adalah agregasi spesial di mana hubungan penyusunnya tidak dapat berdiri sendiri


//misal, sebuah sepeda yang terdiri dari casis, ban, dan stang

class casis{

    private String merk;

    casis(String merk){

        this.merk = merk;
    }

    public String getMerk(){

        return this.merk;
    }
}

class ban{

    private String merk;

    ban(String merk){

        this.merk = merk;
    }

    public String getMerk(){

        return this.merk;
    }
}

class stang{

    private String merk;

    stang(String stang){

        this.merk = stang;
    }

    public String getMerk(){

        return this.merk;
    }
}



class sepeda{

    public stang stangg;
    public ban bann;
    public casis casiss;
    private static String merk;

    sepeda(String merk,stang stang, ban ban, casis casis){

        this.stangg = stang;
        this.bann = ban;S
        this.casiss = casis;
        this.merk = merk; 
    }

    public String getMerk(){

        return this.merk;
    }

    public stang getStang(){

        return this.stangg;
    }

    public ban getBan(){

        return merk;
    }

    public casis getCasis(){

        return this.casiss;
    }

    public float getAddress(){

       return addressOf(this);
    }

    
}


//testing
public class testcomp{

    public static void main(String[] args){

        System.out.println(" Membuat komposisi");
        casis casis1 = new casis("Strudel");
        ban ban1 = new ban("Dunlop");
        stang stang1 = new stang("United");
        sepeda sepeda1 = new sepeda("Wimcycle",stang1, ban1, casis1);
        System.out.println("Merk sepeda: "+ sepeda1.getMerk());
        System.out.println("Merk Stang: "+ sepeda1.stangg.getMerk());
        System.out.println("Merk Casis: "+ sepeda1.casiss.getMerk()); //ini kurang baik sebenarnya, tapi gas aja asal working
         System.out.println("Merk Ban: "+ ban1.getMerk()); //private string, hanya bisa diakses dari kelasnya
        //System.out.println("Memory address " + VM.current().addressOf(sepeda1)); */
       

        //perhatiin output dari sysout
        //coba instansiasi lagi dan lihat outputnya
        //cari penjelasana mengapa bisa begitu


    }
}
