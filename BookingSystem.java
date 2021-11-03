package ooc.yoursolution;
/**
 *
 * @author Eric Mabe 2020366
 */
import java.io.BufferedReader;
import java.io.IOException;

public class BookingSystem implements BookingSystemInterface {
    
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String input;
        String[] parameters;
        int numberOfCars = 0;
        List<CarInterface> cars;
    
        while ((input = in.readLine()) != null) {
            parameters = input.split(":");
            Car newCar = new Car();
            newCar.setMake(Make.valueOf(parameters[0]);
            // provavelmente precisa converter a rate pra double
            newCar.setRate(parameters[1]);
            cars.add(newCar);
            numberOfCars += parameters[2];
        }

        RentACarInterface rentACar = new RentACar();
        rentACar.setCars(cars);
        rentACar.setNumberOfCars(numberOfCars);

        return rentACar;
    }
    
}
