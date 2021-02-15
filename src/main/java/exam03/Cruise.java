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

    public void bookPassenger(Passenger passenger) {
        if (getPassengers().size() < boat.getMaxPassengers()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("There is not enough seat on the ship for the passenger!");
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getPriceRate();

    }

    public Passenger findPassengerByName(String name) {
        Passenger lookUpPassenger = null;
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                lookUpPassenger = passenger;
            }
        }
        return lookUpPassenger;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> names = new ArrayList<>();
        for (Passenger passenger: passengers){
            names.add(passenger.getName());
        }
        Collections.sort(names);
        return names;
    }

    public double sumAllBookingsCharged() {
        double income = 0.0;
        for (Passenger passenger: passengers){
            income += passenger.getCruiseClass().getPriceRate() * basicPrice;
        }
        return income;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> reservations = new HashMap<>();
        for (Passenger passenger: passengers){
            if (!reservations.containsKey(passenger.getCruiseClass())) {
                reservations.put(passenger.getCruiseClass(), 1);
            } else {
                reservations.put(passenger.getCruiseClass(), reservations.get(passenger.getCruiseClass()) + 1);
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
        return new ArrayList<>(passengers);
    }

}