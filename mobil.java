
public class mobil {
    String tipe;
    int model;
    Double harga = 1200.0;
    Double baterei;

    Double Getharga() {
        Double Newharga = harga - (baterei * 100);
        return Newharga;
    }
}