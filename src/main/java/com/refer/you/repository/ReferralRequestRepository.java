package com.refer.you.repository;

import com.refer.you.model.ReferralRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferralRequestRepository extends JpaRepository<ReferralRequest, Long> {
    List<ReferralRequest> findByCompanyName(String companyName);
}
