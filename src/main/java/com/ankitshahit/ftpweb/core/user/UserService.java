package com.ankitshahit.ftpweb.core.user;

import com.ankitshahit.ftpweb.core.ClientOperationException;
import com.ankitshahit.ftpweb.core.ExceptionHandler;
import com.ankitshahit.ftpweb.core.Optional;
import com.ankitshahit.ftpweb.core.command.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ankitshahit.ftpweb.core.ErrorMessages.*;

@Slf4j
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void addUser(Client client) {
        try {

            Optional.validationExceptionOnNull(client,
                    CLIENT_INFORMATION_MANDATORY);
            Optional.validationExceptionOnNull(client.getName(),
                    CLIENT_NAME_MANDATORY);
            Optional.validationExceptionOnNull(client.getEmail(),
                    CLIENT_EMAIL_MANDATORY);
            Optional.validationExceptionOnNull(client.getHash(),
                    CLIENT_PASSWORD_MANDATORY);
            client.setAccountStatus(AccountStatus.ACTIVE);
            this.userRepo.save(client);
        } catch (Exception ex) {
            log.error(ExceptionHandler.parseException(ex));
            throw new ClientOperationException(ex);
        }
    }

    @Override
    public void modifyUser(Client client) {
        try {
            this.userRepo.save(client);
        } catch (Exception ex) {
            log.error(ExceptionHandler.parseException(ex));
            throw new ClientOperationException(ex);
        }
    }

    @Override
    public void disableUser(Client client) {

    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public Client findClientByEmail(String email) {
        return null;
    }

    @Override
    public List<Client> findAllClients(Operation operation) {
        return null;
    }
}
