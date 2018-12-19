package com.ankitshahit.ftpweb.core.permission;

/**
 * Operation doesn't supersede any other available operation type.
 * Individual operation only refers to their allowed type that can be performed on requestedOperationType object.
 */
public enum OperationType {
    CREATE_ONLY, READ_ONLY, UPDATE_ONLY, DELETE_ONLY
}
