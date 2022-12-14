package com.app.loans.reposiories;


import java.util.List;

import com.app.loans.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoansRepository extends JpaRepository<Loans, Integer> {


    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}