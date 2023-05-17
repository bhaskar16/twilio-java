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

package com.twilio.rest.preview.sync.service.syncmap;

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
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SyncMapItem extends Resource {
    private static final long serialVersionUID = 40990956939472L;

    public static SyncMapItemCreator creator(final String pathServiceSid, final String pathMapSid, final String key, final Map<String, Object> data){
        return new SyncMapItemCreator(pathServiceSid, pathMapSid, key, data);
    }

    public static SyncMapItemDeleter deleter(final String pathServiceSid, final String pathMapSid, final String pathKey){
        return new SyncMapItemDeleter(pathServiceSid, pathMapSid, pathKey);
    }

    public static SyncMapItemFetcher fetcher(final String pathServiceSid, final String pathMapSid, final String pathKey){
        return new SyncMapItemFetcher(pathServiceSid, pathMapSid, pathKey);
    }

    public static SyncMapItemReader reader(final String pathServiceSid, final String pathMapSid){
        return new SyncMapItemReader(pathServiceSid, pathMapSid);
    }

    public static SyncMapItemUpdater updater(final String pathServiceSid, final String pathMapSid, final String pathKey, final Map<String, Object> data){
        return new SyncMapItemUpdater(pathServiceSid, pathMapSid, pathKey, data);
    }

    /**
    * Converts a JSON String into a SyncMapItem object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SyncMapItem object represented by the provided JSON
    */
    public static SyncMapItem fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncMapItem.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SyncMapItem object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SyncMapItem object represented by the provided JSON
    */
    public static SyncMapItem fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncMapItem.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum QueryFromBoundType {
        INCLUSIVE("inclusive"),
        EXCLUSIVE("exclusive");

        private final String value;

        private QueryFromBoundType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static QueryFromBoundType forValue(final String value) {
            return Promoter.enumFromString(value, QueryFromBoundType.values());
        }
    }
    public enum QueryResultOrder {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private QueryResultOrder(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static QueryResultOrder forValue(final String value) {
            return Promoter.enumFromString(value, QueryResultOrder.values());
        }
    }

    private final String key;
    private final String accountSid;
    private final String serviceSid;
    private final String mapSid;
    private final URI url;
    private final String revision;
    private final Map<String, Object> data;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String createdBy;

    @JsonCreator
    private SyncMapItem(
        @JsonProperty("key")
        final String key,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("map_sid")
        final String mapSid,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("revision")
        final String revision,

        @JsonProperty("data")
        final Map<String, Object> data,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("created_by")
        final String createdBy
    ) {
        this.key = key;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.mapSid = mapSid;
        this.url = url;
        this.revision = revision;
        this.data = data;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.createdBy = createdBy;
    }

        public final String getKey() {
            return this.key;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getMapSid() {
            return this.mapSid;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final String getRevision() {
            return this.revision;
        }
        public final Map<String, Object> getData() {
            return this.data;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getCreatedBy() {
            return this.createdBy;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SyncMapItem other = (SyncMapItem) o;

        return Objects.equals(key, other.key) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(mapSid, other.mapSid) &&  Objects.equals(url, other.url) &&  Objects.equals(revision, other.revision) &&  Objects.equals(data, other.data) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(createdBy, other.createdBy)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, accountSid, serviceSid, mapSid, url, revision, data, dateCreated, dateUpdated, createdBy);
    }

}

