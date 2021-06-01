package Praktikum6;
class Netbook extends Komputer implements Mouse, Keyboard, Printer{
    @Override
    void hidupkan_os() {
        System.out.println("Turning on the Netbook...");
        System.out.println("Starting Ubuntu...");
        System.out.println("Welcome");
    }
    @Override
    void matikan_os() {
        System.out.println("Shutting down...");
    }
    @Override
    public void klik_kanan() {
        System.out.println("(right-click)->'show options for item'");
    }
    @Override
    public void klik_kiri() {
        System.out.println("(left-click)->'select item'");
    }
    @Override
    public void tekan_enter() {
        System.out.println("(Enter-button)->'confirm option to run'");
    }
    @Override
    public void cetak_data() {
        System.out.println("Printing...");
        System.out.println(" _________________");
        System.out.println("| Hello World!    |");
        System.out.println("| By : Netbook    |");
        System.out.println("|_________________|");
    }
}