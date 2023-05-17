/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.understand.assistant;

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
public class FieldType extends Resource {
    private static final long serialVersionUID = 124097769891823L;

    public static FieldTypeCreator creator(final String pathAssistantSid, final String uniqueName){
        return new FieldTypeCreator(pathAssistantSid, uniqueName);
    }

    public static FieldTypeDeleter deleter(final String pathAssistantSid, final String pathSid){
        return new FieldTypeDeleter(pathAssistantSid, pathSid);
    }

    public static FieldTypeFetcher fetcher(final String pathAssistantSid, final String pathSid){
        return new FieldTypeFetcher(pathAssistantSid, pathSid);
    }

    public static FieldTypeReader reader(final String pathAssistantSid){
        return new FieldTypeReader(pathAssistantSid);
    }

    public static FieldTypeUpdater updater(final String pathAssistantSid, final String pathSid){
        return new FieldTypeUpdater(pathAssistantSid, pathSid);
    }

    /**
    * Converts a JSON String into a FieldType object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return FieldType object represented by the provided JSON
    */
    public static FieldType fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FieldType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a FieldType object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return FieldType object represented by the provided JSON
    */
    public static FieldType fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FieldType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final Map<String, String> links;
    private final String assistantSid;
    private final String sid;
    private final String uniqueName;
    private final URI url;

    @JsonCreator
    private FieldType(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("assistant_sid")
        final String assistantSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.links = links;
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
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
        public final Map<String, String> getLinks() {
            return this.links;
        }
        public final String getAssistantSid() {
            return this.assistantSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FieldType other = (FieldType) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(links, other.links) &&  Objects.equals(assistantSid, other.assistantSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, friendlyName, links, assistantSid, sid, uniqueName, url);
    }

}

