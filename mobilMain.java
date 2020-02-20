
public class mobilMain {
    public static void main(String[] args) 
    {
        
        mobil mobil1 = new mobil();
        mobil1.tipe = "Tesla";
        mobil1.model = 2020;
        mobil1.baterei = 5.0;

        mobil mobil2 = new mobil();
        mobil2.harga = 1400.0;
        mobil2.baterei = 6.0;


        System.out.println("harga mobil Tesla v1 : " + mobil1.Getharga() + " juta");
        System.out.println("harga mobil Tesla v2 : " + mobil2.Getharga() + " juta");

        System.out.println("handsome kamhar");
	    System.out.println("kamhar selalu handsome as usual");
	    System.out.println("kamhar memang handsome");
	


    }
}
