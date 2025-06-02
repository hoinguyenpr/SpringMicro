package com.hoinguyenpr.license.service;

import com.hoinguyenpr.license.config.ServiceConfig;
import com.hoinguyenpr.license.model.License;
import com.hoinguyenpr.license.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;
import java.util.ServiceConfigurationError;
import java.util.UUID;

@Service
public class LicenseService {

    @Autowired
    MessageSource message;

//    @Autowired
//    private LicenseRepository repository;

    @Autowired
    ServiceConfig config;

    public License getLicense(String licenseId, String organizationId, Locale locale) {
//        License license = repository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
//        if (license == null) {
//            throw new IllegalArgumentException(
//                    String.format(message.getMessage(
//                            "license.search.error.message", null, locale),
//                            licenseId, organizationId)
//            );
//        }
        License license = new License();
        return license.withComment(config.getProperty());
    }

    public License createLicense(License license, String organizationId, Locale locale) {
        license.setLicenseId(UUID.randomUUID().toString());
//        repository.save(license);
        return license.withComment(config.getProperty());
    }

    public License updateLicense(License license, String organizationId, Locale locale) {
//        repository.save(license);
        return license.withComment(config.getProperty());
    }
    public String deleteLicense(String licenseId, String organizationId, Locale locale) {
        String responseMessage = null;
        License license = new License();
        license.setLicenseId(licenseId);
//        repository.delete(license);
        responseMessage = String.format(message.getMessage(
                        "license.update.message", null, locale),
                licenseId, organizationId);
        return responseMessage;
    }
}
