package com.quynx.microservice.usersModule.rest.users.dtos;

import com.quynx.microservice.usersModule.rest.users.entities.Permission;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PermissionDTO implements java.io.Serializable {

    private Long id;
    private String permission;
    private boolean enabled;
    private String note;

    public PermissionDTO(Permission permission) {
        this.id = permission.getId();
        this.permission = permission.getPermission();
        this.enabled = permission.isEnabled();
        this.note = permission.getNote();
    }

}
