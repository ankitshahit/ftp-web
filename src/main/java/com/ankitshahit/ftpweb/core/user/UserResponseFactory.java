package com.ankitshahit.ftpweb.core.user;

import com.ankitshahit.ftpweb.core.ResponseFactory;
import com.ankitshahit.ftpweb.core.command.Operation;
import com.ankitshahit.ftpweb.core.command.RequestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserResponseFactory {
    @Autowired
    private IUserService userService;

    public ResponseFactory userManagement(Client client, RequestFactory requestFactory) {

        switch (requestFactory.pop().getRequestedOperationType()) {
            case CREATE_ONLY:
                this.userService.addUser(client);
                break;
            case UPDATE_ONLY:
                this.userService.modifyUser(client);
                break;
            case DELETE_ONLY:
                this.userService.disableUser(client);
                break;
        }
        return ResponseFactory.okRequest("");
    }

    public ResponseFactory retrieveClients(RequestFactory requestFactory) {
        Operation operation = requestFactory.pop();
//        operation.getPermissionControlType()
        switch (requestFactory.pop().getPermissionControlType()) {

        }
        return ResponseFactory.okRequest("");
    }
}
