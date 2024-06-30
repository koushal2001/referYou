package com.refer.you.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.*;

import com.refer.you.model.ReferralRequest;
import com.refer.you.service.ReferralRequestService;

import java.util.List;

@RestController
@RequestMapping("/referrals")
public class ReferralController {
    @Autowired
    private ReferralRequestService referralRequestService;

    @PostMapping("/request")
    public ReferralRequest createReferralRequest(@RequestBody ReferralRequest referralRequest, @AuthenticationPrincipal OidcUser principal) {
        referralRequest.setRefereeId((Long) principal.getAttributes().get("sub"));
        return referralRequestService.createReferralRequest(referralRequest);
    }

    @GetMapping("/{companyName}")
    public List<ReferralRequest> getReferralRequests(@PathVariable String companyName) {
        return referralRequestService.getReferralRequestsByCompanyName(companyName);
    }
}
