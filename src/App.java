public class App {
    public static void main(String[] args) {

        Kubus kubus = new Kubus("Kubus");
        Tabung tabung = new Tabung("Tabung");
        Balok balok = new Balok("Balok");
        
        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

    }
}
