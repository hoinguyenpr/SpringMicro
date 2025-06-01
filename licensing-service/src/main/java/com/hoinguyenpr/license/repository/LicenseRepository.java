package com.hoinguyenpr.license.repository;

import com.hoinguyenpr.license.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
    public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
