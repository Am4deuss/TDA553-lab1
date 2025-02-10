import java.util.ArrayList;

public class Garage {
    public ArrayList<Car> vehiclesStored;
    public int maxVehicles;
    public String[] vehicleTypes;

    public void Garage(int maxVehicles){
        vehiclesStored = new ArrayList<>();
        this.maxVehicles = maxVehicles;
    }

    public void Garage(int maxVehicles, String[] acceptedModels) {
        vehiclesStored = new ArrayList<>();
        this.maxVehicles = maxVehicles;
        vehicleTypes = acceptedModels;
    }

    public Car[] getVehicleTypes() {
        return vehicleTypes;
    }

    void addVehicle(Car vehicle) {
        // check if instance of the right type with accepted Vehicle()
        if(isAccepted(vehicle)) {
            vehiclesStored.add(vehicle);
        }
    }

    private boolean isAccepted(Car vehicle) {
        if(vehiclesStored.size() == this.maxVehicles){
            return false;
        } else if(vehicleTypes.length != 0) {
            for (String element : vehicleTypes) {
                if (element.equals(vehicle.getCarModel())) {
                    return true;
                } else {
                    return false;
                }

            }
        } else {
            return true;
        }
    }
}