package com.github.msemys.esjc;

import static com.github.msemys.esjc.util.Preconditions.checkNotNull;

/**
 * A username/password pair used for authentication and authorization operations.
 */
public class UserCredentials {

    public final String username;
    public final String password;

    public UserCredentials(String username, String password) {
        checkNotNull(username, "User name is not specified.");
        checkNotNull(password, "Password is not specified.");
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserCredentials{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='****").append('\'');
        sb.append('}');
        return sb.toString();
    }
}
