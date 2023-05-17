/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Studio
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.studio.v1.flow.engagement.step;

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

import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class StepContext extends Resource {
    private static final long serialVersionUID = 81685274380880L;

    public static StepContextFetcher fetcher(final String pathFlowSid, final String pathEngagementSid, final String pathStepSid){
        return new StepContextFetcher(pathFlowSid, pathEngagementSid, pathStepSid);
    }

    /**
    * Converts a JSON String into a StepContext object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return StepContext object represented by the provided JSON
    */
    public static StepContext fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, StepContext.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a StepContext object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return StepContext object represented by the provided JSON
    */
    public static StepContext fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, StepContext.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Map<String, Object> context;
    private final String engagementSid;
    private final String flowSid;
    private final String stepSid;
    private final URI url;

    @JsonCreator
    private StepContext(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("context")
        final Map<String, Object> context,

        @JsonProperty("engagement_sid")
        final String engagementSid,

        @JsonProperty("flow_sid")
        final String flowSid,

        @JsonProperty("step_sid")
        final String stepSid,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.context = context;
        this.engagementSid = engagementSid;
        this.flowSid = flowSid;
        this.stepSid = stepSid;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Map<String, Object> getContext() {
            return this.context;
        }
        public final String getEngagementSid() {
            return this.engagementSid;
        }
        public final String getFlowSid() {
            return this.flowSid;
        }
        public final String getStepSid() {
            return this.stepSid;
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

        StepContext other = (StepContext) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(context, other.context) &&  Objects.equals(engagementSid, other.engagementSid) &&  Objects.equals(flowSid, other.flowSid) &&  Objects.equals(stepSid, other.stepSid) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, context, engagementSid, flowSid, stepSid, url);
    }

}

