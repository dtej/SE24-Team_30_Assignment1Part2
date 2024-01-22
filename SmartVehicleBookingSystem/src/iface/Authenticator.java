package iface;

import dbobjects.UserIdentity;

public interface Authenticator {
	public AuthResponse authenticate(UserIdentity id);
}
