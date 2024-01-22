package proxy;

import SmartVehicleBookingSystem.src.dbobjects.UserIdentity;
import SmartVehicleBookingSystem.src.iface.AuthResponse;
import SmartVehicleBookingSystem.src.iface.Authenticator;

public class AuthenticationProxy implements Authenticator {

    @Override
    public AuthResponse authenticate(UserIdentity id) {
        return null;
    }
}
