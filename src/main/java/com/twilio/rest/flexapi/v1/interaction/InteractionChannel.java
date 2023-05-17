/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1.interaction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InteractionChannel extends Resource {
    private static final long serialVersionUID = 96183028905472L;

    public static InteractionChannelFetcher fetcher(final String pathInteractionSid, final String pathSid){
        return new InteractionChannelFetcher(pathInteractionSid, pathSid);
    }

    public static InteractionChannelReader reader(final String pathInteractionSid){
        return new InteractionChannelReader(pathInteractionSid);
    }

    public static InteractionChannelUpdater updater(final String pathInteractionSid, final String pathSid, final InteractionChannel.Status status){
        return new InteractionChannelUpdater(pathInteractionSid, pathSid, status);
    }

    /**
    * Converts a JSON String into a InteractionChannel object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return InteractionChannel object represented by the provided JSON
    */
    public static InteractionChannel fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InteractionChannel.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a InteractionChannel object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return InteractionChannel object represented by the provided JSON
    */
    public static InteractionChannel fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InteractionChannel.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum ChannelStatus {
        SETUP("setup"),
        ACTIVE("active"),
        FAILED("failed"),
        CLOSED("closed");

        private final String value;

        private ChannelStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static ChannelStatus forValue(final String value) {
            return Promoter.enumFromString(value, ChannelStatus.values());
        }
    }
    public enum Status {
        CLOSED("closed"),
        WRAPUP("wrapup");

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
        VOICE("voice"),
        SMS("sms"),
        EMAIL("email"),
        WEB("web"),
        WHATSAPP("whatsapp"),
        CHAT("chat"),
        MESSENGER("messenger"),
        GBM("gbm");

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

    private final String sid;
    private final String interactionSid;
    private final InteractionChannel.Type type;
    private final InteractionChannel.ChannelStatus status;
    private final Integer errorCode;
    private final String errorMessage;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private InteractionChannel(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("interaction_sid")
        final String interactionSid,

        @JsonProperty("type")
        final InteractionChannel.Type type,

        @JsonProperty("status")
        final InteractionChannel.ChannelStatus status,

        @JsonProperty("error_code")
        final Integer errorCode,

        @JsonProperty("error_message")
        final String errorMessage,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.sid = sid;
        this.interactionSid = interactionSid;
        this.type = type;
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.url = url;
        this.links = links;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getInteractionSid() {
            return this.interactionSid;
        }
        public final InteractionChannel.Type getType() {
            return this.type;
        }
        public final InteractionChannel.ChannelStatus getStatus() {
            return this.status;
        }
        public final Integer getErrorCode() {
            return this.errorCode;
        }
        public final String getErrorMessage() {
            return this.errorMessage;
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

        InteractionChannel other = (InteractionChannel) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(interactionSid, other.interactionSid) &&  Objects.equals(type, other.type) &&  Objects.equals(status, other.status) &&  Objects.equals(errorCode, other.errorCode) &&  Objects.equals(errorMessage, other.errorMessage) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, interactionSid, type, status, errorCode, errorMessage, url, links);
    }

}

