package com.ankitshahit.ftpweb.core.user;

import com.ankitshahit.ftpweb.core.command.Operation;

import java.util.List;

public interface IUserService {

    void addUser(Client client);

    void modifyUser(Client client);

    void disableUser(Client client);

    List<Client> getAllClients();

    Client findClientByEmail(String email);

    List<Client> findAllClients(Operation operation);
}
