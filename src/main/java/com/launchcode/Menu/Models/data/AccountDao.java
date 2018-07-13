package com.launchcode.Menu.Models.data;

import com.launchcode.Menu.Models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AccountDao extends CrudRepository<Account, Integer> {
}
