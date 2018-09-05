package io.mindgames.validatorbeaninjection.service;

import io.mindgames.validatorbeaninjection.model.Organization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Override
    public Organization create(Organization organization) {
        log.info("create has been Invoked!");
        return null;
    }
}
