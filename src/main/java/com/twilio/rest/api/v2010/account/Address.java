/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Address extends Resource {
    private static final long serialVersionUID = 73808189531379L;

    

    public static AddressCreator creator(final String customerName, final String street, final String city, final String region, final String postalCode, final String isoCountry){
        return new AddressCreator(customerName, street, city, region, postalCode, isoCountry);
    }
    public static AddressCreator creator(final String pathAccountSid, final String customerName, final String street, final String city, final String region, final String postalCode, final String isoCountry){
        return new AddressCreator(pathAccountSid, customerName, street, city, region, postalCode, isoCountry);
    }

    public static AddressDeleter deleter(final String pathSid){
        return new AddressDeleter(pathSid);
    }
    public static AddressDeleter deleter(final String pathAccountSid, final String pathSid){
        return new AddressDeleter(pathAccountSid, pathSid);
    }

    public static AddressFetcher fetcher(final String pathSid){
        return new AddressFetcher(pathSid);
    }
    public static AddressFetcher fetcher(final String pathAccountSid, final String pathSid){
        return new AddressFetcher(pathAccountSid, pathSid);
    }

    public static AddressReader reader(){
        return new AddressReader();
    }
    public static AddressReader reader(final String pathAccountSid){
        return new AddressReader(pathAccountSid);
    }

    public static AddressUpdater updater(final String pathSid){
        return new AddressUpdater(pathSid);
    }
    public static AddressUpdater updater(final String pathAccountSid, final String pathSid){
        return new AddressUpdater(pathAccountSid, pathSid);
    }

    /**
    * Converts a JSON String into a Address object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Address object represented by the provided JSON
    */
    public static Address fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Address.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Address object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Address object represented by the provided JSON
    */
    public static Address fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Address.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String accountSid;
    private final String city;
    private final String customerName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final String isoCountry;
    private final String postalCode;
    private final String region;
    private final String sid;
    private final String street;
    private final String uri;
    private final Boolean emergencyEnabled;
    private final Boolean validated;
    private final Boolean verified;
    private final String streetSecondary;

    @JsonCreator
    private Address(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("city")
        final String city,

        @JsonProperty("customer_name")
        final String customerName,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("iso_country")
        final String isoCountry,

        @JsonProperty("postal_code")
        final String postalCode,

        @JsonProperty("region")
        final String region,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("street")
        final String street,

        @JsonProperty("uri")
        final String uri,

        @JsonProperty("emergency_enabled")
        final Boolean emergencyEnabled,

        @JsonProperty("validated")
        final Boolean validated,

        @JsonProperty("verified")
        final Boolean verified,

        @JsonProperty("street_secondary")
        final String streetSecondary
    ) {
        this.accountSid = accountSid;
        this.city = city;
        this.customerName = customerName;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.isoCountry = isoCountry;
        this.postalCode = postalCode;
        this.region = region;
        this.sid = sid;
        this.street = street;
        this.uri = uri;
        this.emergencyEnabled = emergencyEnabled;
        this.validated = validated;
        this.verified = verified;
        this.streetSecondary = streetSecondary;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getCity() {
            return this.city;
        }
        public final String getCustomerName() {
            return this.customerName;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getIsoCountry() {
            return this.isoCountry;
        }
        public final String getPostalCode() {
            return this.postalCode;
        }
        public final String getRegion() {
            return this.region;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getStreet() {
            return this.street;
        }
        public final String getUri() {
            return this.uri;
        }
        public final Boolean getEmergencyEnabled() {
            return this.emergencyEnabled;
        }
        public final Boolean getValidated() {
            return this.validated;
        }
        public final Boolean getVerified() {
            return this.verified;
        }
        public final String getStreetSecondary() {
            return this.streetSecondary;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Address other = (Address) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(city, other.city) &&  Objects.equals(customerName, other.customerName) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(isoCountry, other.isoCountry) &&  Objects.equals(postalCode, other.postalCode) &&  Objects.equals(region, other.region) &&  Objects.equals(sid, other.sid) &&  Objects.equals(street, other.street) &&  Objects.equals(uri, other.uri) &&  Objects.equals(emergencyEnabled, other.emergencyEnabled) &&  Objects.equals(validated, other.validated) &&  Objects.equals(verified, other.verified) &&  Objects.equals(streetSecondary, other.streetSecondary)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, city, customerName, dateCreated, dateUpdated, friendlyName, isoCountry, postalCode, region, sid, street, uri, emergencyEnabled, validated, verified, streetSecondary);
    }


}

