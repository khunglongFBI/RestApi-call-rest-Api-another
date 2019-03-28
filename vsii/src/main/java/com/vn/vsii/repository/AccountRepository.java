package com.vn.vsii.repository;

import com.vn.vsii.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByUserName(String username);
    Iterable<Account> findAll();
    Optional<Account> findAllById(Long id);
}
