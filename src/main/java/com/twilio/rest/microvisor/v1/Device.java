/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Microvisor
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.microvisor.v1;

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


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Device extends Resource {
    private static final long serialVersionUID = 266652017538801L;

    public static DeviceFetcher fetcher(final String pathSid){
        return new DeviceFetcher(pathSid);
    }

    public static DeviceReader reader(){
        return new DeviceReader();
    }

    public static DeviceUpdater updater(final String pathSid){
        return new DeviceUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Device object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Device object represented by the provided JSON
    */
    public static Device fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Device.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Device object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Device object represented by the provided JSON
    */
    public static Device fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Device.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final Map<String, Object> app;
    private final Map<String, Object> logging;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Device(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("app")
        final Map<String, Object> app,

        @JsonProperty("logging")
        final Map<String, Object> logging,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.app = app;
        this.logging = logging;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Map<String, Object> getApp() {
            return this.app;
        }
        public final Map<String, Object> getLogging() {
            return this.logging;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Device other = (Device) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(app, other.app) &&  Objects.equals(logging, other.logging) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, uniqueName, accountSid, app, logging, dateCreated, dateUpdated, url, links);
    }

}

