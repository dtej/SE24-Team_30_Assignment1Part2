package SmartVehicleBookingSystem.src.manager;

import SmartVehicleBookingSystem.src.dbobjects.Location;
import SmartVehicleBookingSystem.src.dbobjects.VehicleStatus;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {

    /* Retrieves status (such as availability) of a given VehicleID.  */
    public VehicleStatus getVehicleStatus(String vehicleID){
        return null;
    }

    /**/
    public void updateVehicleStatus(String vehicleId,VehicleStatus vs ){

    }
    public dbobjects.SmartVehicle getVehicleDetails(String vehicleId){
        return (new dbobjects.SmartVehicle ());
    }

    /* Updates details which are different from Vehicle status. Updates Database */
    public void updateVehicleDetails(dbobjects.SmartVehicle svm){

    }

    public List<dbobjects.SmartVehicle>
    getNearestVehicles(Location currentLocation) {
        return (new ArrayList<>());
    }
    VehicleStatus checkAvailability(dbobjects.SmartVehicle svm) {
        return (new VehicleStatus());
    }

    /*
    * Initiates reservation of smart vehicle sequence
    * */
    VehicleStatus reserveSmartVehicle(dbobjects.User usr, dbobjects.SmartVehicle svm) {
        return (new VehicleStatus());
    }
}
