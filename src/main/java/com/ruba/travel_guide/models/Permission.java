
package com.ruba.travel_guide.models;

public enum Permission {
    CITY_READ("city:read"),
    CITY_WRITE("city:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
