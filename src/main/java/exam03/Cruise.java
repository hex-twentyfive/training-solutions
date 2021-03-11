package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {       //1.
        if (passengers.size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("There is not enough seat on the boat for teh passenger!");
        }
    }

    public double getPriceForPassenger(Passenger passenger) {       //2.    ???
        return passenger.getCruiseClass().getPriceRate() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {             //3.
        for (Passenger e : passengers) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        throw new IllegalStateException("There is no passenger with this name! --> " + name);
    }

    public List<String> getPassengerNamesOrdered() {                //4.
        List<String> names = new ArrayList<>();
        for (Passenger e : passengers) {
            names.add(e.getName());
        }
        Collections.sort(names);
        return names;
    }

    public double sumAllBookingsCharged() {                     //5.
        double sumIncome = 0.0;
        for (Passenger e : passengers) {
            sumIncome += getPriceForPassenger(e);
        }
        return sumIncome;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {      //6.
        Map<CruiseClass, Integer> reservations = new HashMap<>();
        for (Passenger e : passengers) {
            if (!reservations.containsKey(e.getCruiseClass())) {
                reservations.put(e.getCruiseClass(), 1);
            } else {
                reservations.put(e.getCruiseClass(), reservations.get(e.getCruiseClass()) + 1);
            }
        }
        return reservations;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

}