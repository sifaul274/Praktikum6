package Praktikum6;
final class KomputerCetak {
    final static void cetak(Komputer[]obj){
        obj[0] = new PC();
        obj[1] = new Laptop();
        obj[2] = new Netbook();
        
        for (int i = 0; i < obj.length; i++) {
            obj[i].hidupkan_os();
            obj[i].klik_kiri();
            obj[i].klik_kanan();
            obj[i].tekan_enter();
            obj[i].cetak_data();
            obj[i].matikan_os();
            System.out.println("");
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Komputer[] com = new Komputer[3];
        cetak(com);
    }
}