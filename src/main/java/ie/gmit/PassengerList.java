package ie.gmit;


import java.security.InvalidParameterException;
import java.util.ArrayList;

public class PassengerList {

    ArrayList<Passenger> listOfPassenger = new ArrayList<>();
    public void addPassenger(Passenger newPassenger) {
        for(Passenger passenger : listOfPassenger)
            if (passenger.getName().equals(newPassenger.getName()))
                throw new InvalidParameterException("Name already in list");
        listOfPassenger.add(newPassenger);
    }

    public Passenger findByName(String name) {
        for(Passenger passenger : listOfPassenger) {
            if (passenger.getName().equalsIgnoreCase(name)) {
                return passenger;
            }else{
                throw new InvalidParameterException("Name not in list");
            }
        }
        return null;
    }

}



