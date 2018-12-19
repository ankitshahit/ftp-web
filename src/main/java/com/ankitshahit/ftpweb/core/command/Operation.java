package com.ankitshahit.ftpweb.core.command;

import com.ankitshahit.ftpweb.core.permission.OperationType;
import com.ankitshahit.ftpweb.core.permission.PermissionControlType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    private PermissionControlType permissionControlType;
    private OperationType requestedOperationType;
}
