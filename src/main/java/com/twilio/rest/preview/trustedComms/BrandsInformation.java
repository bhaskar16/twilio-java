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

package com.twilio.rest.preview.trustedComms;

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



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class BrandsInformation extends Resource {
    private static final long serialVersionUID = 179070511344198L;


    public static BrandsInformationFetcher fetcher(){
        return new BrandsInformationFetcher();
    }




    /**
    * Converts a JSON String into a BrandsInformation object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return BrandsInformation object represented by the provided JSON
    */
    public static BrandsInformation fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BrandsInformation.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a BrandsInformation object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return BrandsInformation object represented by the provided JSON
    */
    public static BrandsInformation fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BrandsInformation.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final ZonedDateTime updateTime;
    private final URI fileLink;
    private final String fileLinkTtlInSeconds;
    private final URI url;

    @JsonCreator
    private BrandsInformation(
        @JsonProperty("update_time")
        final String updateTime,

        @JsonProperty("file_link")
        final URI fileLink,

        @JsonProperty("file_link_ttl_in_seconds")
        final String fileLinkTtlInSeconds,

        @JsonProperty("url")
        final URI url
    ) {
        this.updateTime = DateConverter.iso8601DateTimeFromString(updateTime);
        this.fileLink = fileLink;
        this.fileLinkTtlInSeconds = fileLinkTtlInSeconds;
        this.url = url;
    }

        public final ZonedDateTime getUpdateTime() {
            return this.updateTime;
        }
        public final URI getFileLink() {
            return this.fileLink;
        }
        public final String getFileLinkTtlInSeconds() {
            return this.fileLinkTtlInSeconds;
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

        BrandsInformation other = (BrandsInformation) o;

        return Objects.equals(updateTime, other.updateTime) &&  Objects.equals(fileLink, other.fileLink) &&  Objects.equals(fileLinkTtlInSeconds, other.fileLinkTtlInSeconds) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime, fileLink, fileLinkTtlInSeconds, url);
    }

}
