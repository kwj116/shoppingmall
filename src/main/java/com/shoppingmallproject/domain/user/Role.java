package com.shoppingmallproject.domain.user;

public enum Role {
    ROLE_USER("ROLE_USER"),
    ROLE_GUEST("ROLE_GUEST"),
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_VIP("ROLE_VIP");

    String role;

    Role(String role){
        this.role = role;
    }

    public String value(){
        return role;
    }
}
