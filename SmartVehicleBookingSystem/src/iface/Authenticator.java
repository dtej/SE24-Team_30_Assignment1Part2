package SmartVehicleBookingSystem.src.iface;

import SmartVehicleBookingSystem.src.dbobjects.UserIdentity;


public interface Authenticator {
       public AuthResponse authenticate(UserIdentity id);
}

