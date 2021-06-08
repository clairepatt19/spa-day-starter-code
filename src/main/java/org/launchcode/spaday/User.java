package org.launchcode.spaday;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Username is required")
    @Size(min=5, max=15)
    private static String username;

    @Email
    private static String email;

    @NotBlank(message="Password is Required")
    @Size(min=6)
    private static String password;

    @NotBlank(message="Passwords Must Match")
    private static String verify;

    public User() {
        this.username=username;
        this.email=email;
        this.password=password;
        this.verify=verify;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }
}
