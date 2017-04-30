package com.omega.commons.service;


import com.omega.commons.db.model.Account;
import com.omega.commons.db.model.Client;
import com.omega.commons.db.repository.AccountRepository;
import com.omega.commons.db.repository.ClientRepository;
import com.omega.commons.service.exception.InvalidAccountCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private ClientRepository clientRepository;
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(ClientRepository clientRepository, AccountRepository accountRepository) {
        this.clientRepository = clientRepository;
        this.accountRepository = accountRepository;
    }

    public Account createAccount(String clientNumber) {
        Client client = clientRepository.findByNumber(clientNumber)
            .orElse(clientRepository.save(new Client(clientNumber)));

        if (accountRepository.findByClient(client).isPresent()) {
            throw new InvalidAccountCreationException("Client " + client.getNumber() + " already has an account");
        }

        return accountRepository.save(new Account(client));
    }

}
