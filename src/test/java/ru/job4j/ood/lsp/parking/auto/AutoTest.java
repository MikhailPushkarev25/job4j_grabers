package ru.job4j.ood.lsp.parking.auto;

import org.junit.Test;
import ru.job4j.ood.lsp.parking.auto.parking.CarParking;
import ru.job4j.ood.lsp.parking.auto.parking.CargoParking;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AutoTest {


    @Test
    public void whenTestAutoParkingCar() {
        Auto auto = new Auto("Audi", 354);
        CarParking carParking = new CarParking();
        assertThat(carParking.result(auto, 1), is(true));
    }

    @Test
    public void whenTestAutoParkingCarError() {
        Auto auto = new Auto("Toyota", 888);
        CarParking carParking = new CarParking();
        assertThat(carParking.result(auto, 0), is(false));
    }

    @Test
    public void whenTestAutoParkingCargo() {
        Auto auto = new Auto("Kamaz", 265);
        CargoParking cargoParking = new CargoParking();
        assertThat(cargoParking.result(auto, 5), is(true));
    }

    @Test
    public void whenTestAutoParkingCargoError() {
        Auto auto = new Auto("Maz", 878);
        CargoParking cargoParking = new CargoParking();
        assertThat(cargoParking.result(auto, 1), is(false));
    }
}