package com.refer.you.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refer.you.model.ReferralRequest;
import com.refer.you.repository.ReferralRequestRepository;

import java.util.List;

@Service
public class ReferralRequestService {
    @Autowired
    private ReferralRequestRepository referralRequestRepository;

    public ReferralRequest createReferralRequest(ReferralRequest referralRequest) {
        return referralRequestRepository.save(referralRequest);
    }

    public List<ReferralRequest> getReferralRequestsByCompanyName(String companyName) {
        return referralRequestRepository.findByCompanyName(companyName);
    }
}
