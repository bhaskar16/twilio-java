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

package com.twilio.rest.api.v2010;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;

import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Account extends Resource {
    private static final long serialVersionUID = 224328589339754L;

    public static AccountCreator creator(){
        return new AccountCreator();
    }

    public static AccountFetcher fetcher(){
        return new AccountFetcher();
    }
    public static AccountFetcher fetcher(final String pathSid){
        return new AccountFetcher(pathSid);
    }

    public static AccountReader reader(){
        return new AccountReader();
    }

    public static AccountUpdater updater(){
        return new AccountUpdater();
    }
    public static AccountUpdater updater(final String pathSid){
        return new AccountUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Account object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Account object represented by the provided JSON
    */
    public static Account fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Account.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Account object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Account object represented by the provided JSON
    */
    public static Account fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Account.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        ACTIVE("active"),
        SUSPENDED("suspended"),
        CLOSED("closed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }
    public enum Type {
        TRIAL("Trial"),
        FULL("Full");

        private final String value;

        private Type(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Type forValue(final String value) {
            return Promoter.enumFromString(value, Type.values());
        }
    }

    private final String authToken;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final String ownerAccountSid;
    private final String sid;
    private final Account.Status status;
    private final Map<String, String> subresourceUris;
    private final Account.Type type;
    private final String uri;

    @JsonCreator
    private Account(
        @JsonProperty("auth_token")
        final String authToken,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("owner_account_sid")
        final String ownerAccountSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("status")
        final Account.Status status,

        @JsonProperty("subresource_uris")
        final Map<String, String> subresourceUris,

        @JsonProperty("type")
        final Account.Type type,

        @JsonProperty("uri")
        final String uri
    ) {
        this.authToken = authToken;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.ownerAccountSid = ownerAccountSid;
        this.sid = sid;
        this.status = status;
        this.subresourceUris = subresourceUris;
        this.type = type;
        this.uri = uri;
    }

        public final String getAuthToken() {
            return this.authToken;
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
        public final String getOwnerAccountSid() {
            return this.ownerAccountSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final Account.Status getStatus() {
            return this.status;
        }
        public final Map<String, String> getSubresourceUris() {
            return this.subresourceUris;
        }
        public final Account.Type getType() {
            return this.type;
        }
        public final String getUri() {
            return this.uri;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account other = (Account) o;

        return Objects.equals(authToken, other.authToken) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(ownerAccountSid, other.ownerAccountSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(status, other.status) &&  Objects.equals(subresourceUris, other.subresourceUris) &&  Objects.equals(type, other.type) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authToken, dateCreated, dateUpdated, friendlyName, ownerAccountSid, sid, status, subresourceUris, type, uri);
    }

}

