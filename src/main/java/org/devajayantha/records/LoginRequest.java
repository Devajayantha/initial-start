package org.devajayantha.records;

public record LoginRequest(String username, String password) {

    /** optional add this contructor */
    public LoginRequest {
        System.out.println("LoginRequest constructor");
    }
}
