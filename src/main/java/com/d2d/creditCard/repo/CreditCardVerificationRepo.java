package com.d2d.creditCard.repo;

import com.d2d.creditCard.entity.CreditCardVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardVerificationRepo extends JpaRepository<CreditCardVerification,Long> {
}
