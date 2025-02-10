import java.util.ArrayList;

public class Garage {
    public ArrayList<Car> vehiclesStored;
    public int maxVehicles;
    public String[] vehicleTypes;

    public Garage(int maxVehicles){
        vehiclesStored = new ArrayList<>();
        this.maxVehicles = maxVehicles;
    }

    public Garage(int maxVehicles, String[] acceptedModels) {
        vehiclesStored = new ArrayList<>();
        this.maxVehicles = maxVehicles;
        vehicleTypes = acceptedModels;
    }

    public ArrayList<Car> getVehiclesStored() {
        return vehiclesStored;
    }

    public String[] getVehicleTypes() {
        return vehicleTypes;
    }

    void addVehicle(Car vehicle) {
        // check if instance of the right type with accepted Vehicle()
        if(isAccepted(vehicle)) {
            vehiclesStored.add(vehicle);
        } else {
            throw new IllegalArgumentException("Wrong car type :P");
        }
    }

    Car removeVehicle(int vehicleIndex) {
       Car removedCar = null;
       if(vehicleIndex != 0 && vehicleIndex < vehiclesStored.size()) {
           removedCar = vehiclesStored.get(vehicleIndex);
           vehiclesStored.remove(vehicleIndex);
       }
       return removedCar;
    }

    private boolean isAccepted(Car vehicle) {
        if (vehiclesStored.size() == this.maxVehicles) {
            return false;
        } else if (vehicleTypes.length != 0) {
            for (String element : vehicleTypes) {
                if (element.equals(vehicle.getCarModel())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
