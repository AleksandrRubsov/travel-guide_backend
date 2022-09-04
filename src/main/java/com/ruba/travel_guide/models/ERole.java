package com.ruba.travel_guide.models;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum ERole {

    USER(Set.of(Permission.CITY_READ)),
    MODERATOR(Set.of(Permission.CITY_WRITE, Permission.CITY_READ)),
    ADMIN(Set.of(Permission.CITY_WRITE, Permission.CITY_READ));

    private final Set<Permission> permissions;
    ERole(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities()
    {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }






}
