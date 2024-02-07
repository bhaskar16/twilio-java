/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Proxy
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.proxy.v1.service;

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
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;

import com.twilio.type.PhoneNumberCapabilities;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class PhoneNumber extends Resource {
    private static final long serialVersionUID = 71034679090032L;

    

    public static PhoneNumberCreator creator(final String pathServiceSid){
        return new PhoneNumberCreator(pathServiceSid);
    }

    public static PhoneNumberDeleter deleter(final String pathServiceSid, final String pathSid){
        return new PhoneNumberDeleter(pathServiceSid, pathSid);
    }

    public static PhoneNumberFetcher fetcher(final String pathServiceSid, final String pathSid){
        return new PhoneNumberFetcher(pathServiceSid, pathSid);
    }

    public static PhoneNumberReader reader(final String pathServiceSid){
        return new PhoneNumberReader(pathServiceSid);
    }

    public static PhoneNumberUpdater updater(final String pathServiceSid, final String pathSid){
        return new PhoneNumberUpdater(pathServiceSid, pathSid);
    }

    /**
    * Converts a JSON String into a PhoneNumber object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return PhoneNumber object represented by the provided JSON
    */
    public static PhoneNumber fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a PhoneNumber object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return PhoneNumber object represented by the provided JSON
    */
    public static PhoneNumber fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final com.twilio.type.PhoneNumber phoneNumber;
    private final String friendlyName;
    private final String isoCountry;
    private final PhoneNumberCapabilities capabilities;
    private final URI url;
    private final Boolean isReserved;
    private final Integer inUse;

    @JsonCreator
    private PhoneNumber(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("phone_number")
        final com.twilio.type.PhoneNumber phoneNumber,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("iso_country")
        final String isoCountry,

        @JsonProperty("capabilities")
        final PhoneNumberCapabilities capabilities,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("is_reserved")
        final Boolean isReserved,

        @JsonProperty("in_use")
        final Integer inUse
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.phoneNumber = phoneNumber;
        this.friendlyName = friendlyName;
        this.isoCountry = isoCountry;
        this.capabilities = capabilities;
        this.url = url;
        this.isReserved = isReserved;
        this.inUse = inUse;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final com.twilio.type.PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getIsoCountry() {
            return this.isoCountry;
        }
        public final PhoneNumberCapabilities getCapabilities() {
            return this.capabilities;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Boolean getIsReserved() {
            return this.isReserved;
        }
        public final Integer getInUse() {
            return this.inUse;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PhoneNumber other = (PhoneNumber) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(phoneNumber, other.phoneNumber) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(isoCountry, other.isoCountry) &&  Objects.equals(capabilities, other.capabilities) &&  Objects.equals(url, other.url) &&  Objects.equals(isReserved, other.isReserved) &&  Objects.equals(inUse, other.inUse)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, serviceSid, dateCreated, dateUpdated, phoneNumber, friendlyName, isoCountry, capabilities, url, isReserved, inUse);
    }


}

