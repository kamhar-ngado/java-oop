public class manusia {
    String nama;
    int umur;
    int tinggi;
    String bolaMata;

    String jus = "wortel";
    String ikan = "bobara";
    String minuman = "kopi";

    public manusia() {

    }

    public void bicara() {
        System.out.println("hello, nama saya adalah " + nama);
        System.out.println("umur saya " + umur);
        System.out.println("tinggi saya " + tinggi);
        System.out.println("saya memiliki bola mata berwarna " + bolaMata);
    }
 
    public void makanan() {
        System.out.println("___________batas___________");
        System.out.println("makan apa saja yang penting halal dan toyiban");
        System.out.println("jus yang disukai oleh mas kamhar adalah " + jus);
        System.out.println("ikan yang paling disukai oleh mas kamhar adalah " + ikan);
        System.out.println("minuman yang disukai oleh mas kamhar adalah " + minuman);

    }

    public void berjalan() {
        System.out.println("berjalan melewati gunung dan lembah");
    }

    public void bekerja() {
        System.out.println("bekerja untuk mencari uanga panai");
    }

    public void handsome() {
        Boolean tamvan = true;
        System.out.println("kamhar memang handsome");
        System.out.println("kamhar handsome dan itu " + tamvan);
    }




}