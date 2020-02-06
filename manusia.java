public class manusia {
    String nama;
    int umur;
    int tinggi;
    String bolaMata;

    public manusia() {
        
    }

    public void bicara() {
        System.out.println("hello, nama saya adalah " + nama);
        System.out.println("umur saya " + umur);
        System.out.println("tinggi saya " + tinggi);
        System.out.println("saya memiliki bola mata berwarna " + bolaMata);
    }

    public void makanan() {
        System.out.println("makan apa saja yang penting halal dan toyiban");
    }

    public void berjalan() {
        System.out.println("berjalan melewati gunung dan lembah");
    }

    public void bekerja() {
        System.out.println("bekerja untuk mencari uanga panai");
    }
}