package proxy;

import dbobjects.UserIdentity;
import iface.AuthResponse;
import iface.Authenticator;

public class AuthenticationProxy implements Authenticator {

    @Override
    public AuthResponse authenticate(UserIdentity id) {
        return null;
    }
}
