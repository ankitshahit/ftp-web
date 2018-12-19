package com.ankitshahit.ftpweb.core.user;

import java.util.List;

public interface UserDataSource {
    void addUser(Client client);

    void modifyUser(Client client);

    void deleteUser(Client client);

    List<Client> getAllClients();


}
