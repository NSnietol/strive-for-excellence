package com.epam.engx.task4;

import com.epam.engx.task4.thirdpartyjar.Car;
import com.epam.engx.task4.thirdpartyjar.CarService;
import com.epam.engx.task4.thirdpartyjar.UnavailableCarException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.*;

class CarRentalTest {

    @Test
    void rent_givenValidCar_shouldBookCar() throws UnavailableCarException {
        Car carToRent = new Car(1,"BMW");
        //Mock type
        CarService carService = mock(CarService.class);

        CarRental carRental = new CarRental(carService);
        carRental.rent(carToRent);

        verify(carService).validate(carToRent);
        verify(carService).book(carToRent);

    }

    @Test
    void rent_givenInvalidCar_shouldNotBookCar() throws UnavailableCarException {
        Car carToRent = new Car(2,"Audi");
        //Mock type
        CarService carService = mock(CarService.class);
        Mockito.doThrow(new UnavailableCarException()).when(carService).validate(carToRent);


        CarRental carRental = new CarRental(carService);
        carRental.rent(carToRent);

        verify(carService).validate(carToRent);
        verify(carService,never()).book(carToRent);
    }

}