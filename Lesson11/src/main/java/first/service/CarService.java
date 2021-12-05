package first.service;

import first.my_exception.MyException;

public interface CarService {
    void startCar() throws MyException;

    void carGoes();

    void turnOffCar();

    void viewDistance();

    void viewFuel();
}
