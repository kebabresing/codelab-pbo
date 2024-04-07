package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble { //menyempurnakan ShootAble
    @Override
    public void Start() {
        System.out.println("Menyalakan tank " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Tank " + this.getName() + " berhenti"); //revisi perintah brake
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank  " + vehicle + " menembak"); //menyempurnakan "vehicle"
    }
}
