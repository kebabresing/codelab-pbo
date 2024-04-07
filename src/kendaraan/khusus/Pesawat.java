package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Menyalakan pesawat " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Pesawat " + this.getName() + " berhenti"); //menambahkan perintah berhenti
    }

    @Override
    public void fly(String vehicle) {
        System.out.println("Pesawat " + this.getName() + " lepas landas");
    }
}
