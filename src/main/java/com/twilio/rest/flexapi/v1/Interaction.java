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

package com.twilio.rest.flexapi.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Map;
import java.util.Objects;

import lombok.ToString;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Interaction extends Resource {
    private static final long serialVersionUID = 1684368631913L;

    

    public static InteractionCreator creator(final Map<String, Object> channel, final Map<String, Object> routing){
        return new InteractionCreator(channel, routing);
    }

    public static InteractionFetcher fetcher(final String pathSid){
        return new InteractionFetcher(pathSid);
    }

    /**
    * Converts a JSON String into a Interaction object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Interaction object represented by the provided JSON
    */
    public static Interaction fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Interaction.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Interaction object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Interaction object represented by the provided JSON
    */
    public static Interaction fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Interaction.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String sid;
    private final Map<String, Object> channel;
    private final Map<String, Object> routing;
    private final URI url;
    private final Map<String, String> links;
    private final String interactionContextSid;

    @JsonCreator
    private Interaction(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("channel")
        final Map<String, Object> channel,

        @JsonProperty("routing")
        final Map<String, Object> routing,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("interaction_context_sid")
        final String interactionContextSid
    ) {
        this.sid = sid;
        this.channel = channel;
        this.routing = routing;
        this.url = url;
        this.links = links;
        this.interactionContextSid = interactionContextSid;
    }

        public final String getSid() {
            return this.sid;
        }
        public final Map<String, Object> getChannel() {
            return this.channel;
        }
        public final Map<String, Object> getRouting() {
            return this.routing;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }
        public final String getInteractionContextSid() {
            return this.interactionContextSid;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Interaction other = (Interaction) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(channel, other.channel) &&  Objects.equals(routing, other.routing) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links) &&  Objects.equals(interactionContextSid, other.interactionContextSid)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, channel, routing, url, links, interactionContextSid);
    }


}

