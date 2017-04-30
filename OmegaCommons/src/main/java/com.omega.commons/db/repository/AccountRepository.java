package com.omega.commons.db.repository;


import com.omega.commons.db.model.Account;
import com.omega.commons.db.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByClient(Client client);

}
