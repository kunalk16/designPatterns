package com.kk.dp.behavioral.interpreter;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public class User {
    private final String name;

    private final Collection<String> permissions;

    public User(String name, String... permissions) {
        this.name = name;
        this.permissions = new HashSet<>();
        Stream.of(permissions).map(String::toLowerCase).forEach(this.permissions::add);
    }

    public String getName() {
        return this.name;
    }

    public Collection<String> getPermissions() {
        return this.permissions;
    }
}
