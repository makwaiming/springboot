package com.omega.commons.service;


import com.omega.commons.db.model.Client;
import com.omega.commons.db.repository.ClientRepository;
import com.omega.commons.service.exception.ClientNameAlreadyExistsException;
import com.omega.commons.service.exception.InvalidClientNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CreateClientService {

    private ClientRepository clientRepository;

    @Autowired
    public CreateClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(String name) {
        if(StringUtils.isEmpty(name)) {
            throw new InvalidClientNameException();
        }

        if (clientRepository.findByName(name).isPresent()) {
            throw new ClientNameAlreadyExistsException();
        }

        return clientRepository.save(new Client(name));
    }
}
