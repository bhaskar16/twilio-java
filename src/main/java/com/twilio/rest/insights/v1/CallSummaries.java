/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Insights
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.insights.v1;

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

import java.util.List;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class CallSummaries extends Resource {
    private static final long serialVersionUID = 172892476359030L;

    public static CallSummariesReader reader(){
        return new CallSummariesReader();
    }

    /**
    * Converts a JSON String into a CallSummaries object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return CallSummaries object represented by the provided JSON
    */
    public static CallSummaries fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, CallSummaries.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a CallSummaries object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return CallSummaries object represented by the provided JSON
    */
    public static CallSummaries fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, CallSummaries.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum AnsweredBy {
        UNKNOWN("unknown"),
        MACHINE_START("machine_start"),
        MACHINE_END_BEEP("machine_end_beep"),
        MACHINE_END_SILENCE("machine_end_silence"),
        MACHINE_END_OTHER("machine_end_other"),
        HUMAN("human"),
        FAX("fax");

        private final String value;

        private AnsweredBy(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static AnsweredBy forValue(final String value) {
            return Promoter.enumFromString(value, AnsweredBy.values());
        }
    }
    public enum CallState {
        RINGING("ringing"),
        COMPLETED("completed"),
        BUSY("busy"),
        FAIL("fail"),
        NOANSWER("noanswer"),
        CANCELED("canceled"),
        ANSWERED("answered"),
        UNDIALED("undialed");

        private final String value;

        private CallState(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CallState forValue(final String value) {
            return Promoter.enumFromString(value, CallState.values());
        }
    }
    public enum CallType {
        CARRIER("carrier"),
        SIP("sip"),
        TRUNKING("trunking"),
        CLIENT("client");

        private final String value;

        private CallType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CallType forValue(final String value) {
            return Promoter.enumFromString(value, CallType.values());
        }
    }
    public enum ProcessingState {
        COMPLETE("complete"),
        PARTIAL("partial");

        private final String value;

        private ProcessingState(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static ProcessingState forValue(final String value) {
            return Promoter.enumFromString(value, ProcessingState.values());
        }
    }
    public enum ProcessingStateRequest {
        COMPLETED("completed"),
        STARTED("started"),
        PARTIAL("partial"),
        ALL("all");

        private final String value;

        private ProcessingStateRequest(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static ProcessingStateRequest forValue(final String value) {
            return Promoter.enumFromString(value, ProcessingStateRequest.values());
        }
    }
    public enum SortBy {
        START_TIME("start_time"),
        END_TIME("end_time");

        private final String value;

        private SortBy(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static SortBy forValue(final String value) {
            return Promoter.enumFromString(value, SortBy.values());
        }
    }

    private final String accountSid;
    private final String callSid;
    private final CallSummaries.AnsweredBy answeredBy;
    private final CallSummaries.CallType callType;
    private final CallSummaries.CallState callState;
    private final CallSummaries.ProcessingState processingState;
    private final ZonedDateTime createdTime;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final Integer duration;
    private final Integer connectDuration;
    private final Map<String, Object> from;
    private final Map<String, Object> to;
    private final Map<String, Object> carrierEdge;
    private final Map<String, Object> clientEdge;
    private final Map<String, Object> sdkEdge;
    private final Map<String, Object> sipEdge;
    private final List<String> tags;
    private final URI url;
    private final Map<String, Object> attributes;
    private final Map<String, Object> properties;
    private final Map<String, Object> trust;

    @JsonCreator
    private CallSummaries(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("call_sid")
        final String callSid,

        @JsonProperty("answered_by")
        final CallSummaries.AnsweredBy answeredBy,

        @JsonProperty("call_type")
        final CallSummaries.CallType callType,

        @JsonProperty("call_state")
        final CallSummaries.CallState callState,

        @JsonProperty("processing_state")
        final CallSummaries.ProcessingState processingState,

        @JsonProperty("created_time")
        final String createdTime,

        @JsonProperty("start_time")
        final String startTime,

        @JsonProperty("end_time")
        final String endTime,

        @JsonProperty("duration")
        final Integer duration,

        @JsonProperty("connect_duration")
        final Integer connectDuration,

        @JsonProperty("from")
        final Map<String, Object> from,

        @JsonProperty("to")
        final Map<String, Object> to,

        @JsonProperty("carrier_edge")
        final Map<String, Object> carrierEdge,

        @JsonProperty("client_edge")
        final Map<String, Object> clientEdge,

        @JsonProperty("sdk_edge")
        final Map<String, Object> sdkEdge,

        @JsonProperty("sip_edge")
        final Map<String, Object> sipEdge,

        @JsonProperty("tags")
        final List<String> tags,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("attributes")
        final Map<String, Object> attributes,

        @JsonProperty("properties")
        final Map<String, Object> properties,

        @JsonProperty("trust")
        final Map<String, Object> trust
    ) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.answeredBy = answeredBy;
        this.callType = callType;
        this.callState = callState;
        this.processingState = processingState;
        this.createdTime = DateConverter.iso8601DateTimeFromString(createdTime);
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.duration = duration;
        this.connectDuration = connectDuration;
        this.from = from;
        this.to = to;
        this.carrierEdge = carrierEdge;
        this.clientEdge = clientEdge;
        this.sdkEdge = sdkEdge;
        this.sipEdge = sipEdge;
        this.tags = tags;
        this.url = url;
        this.attributes = attributes;
        this.properties = properties;
        this.trust = trust;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getCallSid() {
            return this.callSid;
        }
        public final CallSummaries.AnsweredBy getAnsweredBy() {
            return this.answeredBy;
        }
        public final CallSummaries.CallType getCallType() {
            return this.callType;
        }
        public final CallSummaries.CallState getCallState() {
            return this.callState;
        }
        public final CallSummaries.ProcessingState getProcessingState() {
            return this.processingState;
        }
        public final ZonedDateTime getCreatedTime() {
            return this.createdTime;
        }
        public final ZonedDateTime getStartTime() {
            return this.startTime;
        }
        public final ZonedDateTime getEndTime() {
            return this.endTime;
        }
        public final Integer getDuration() {
            return this.duration;
        }
        public final Integer getConnectDuration() {
            return this.connectDuration;
        }
        public final Map<String, Object> getFrom() {
            return this.from;
        }
        public final Map<String, Object> getTo() {
            return this.to;
        }
        public final Map<String, Object> getCarrierEdge() {
            return this.carrierEdge;
        }
        public final Map<String, Object> getClientEdge() {
            return this.clientEdge;
        }
        public final Map<String, Object> getSdkEdge() {
            return this.sdkEdge;
        }
        public final Map<String, Object> getSipEdge() {
            return this.sipEdge;
        }
        public final List<String> getTags() {
            return this.tags;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }
        public final Map<String, Object> getProperties() {
            return this.properties;
        }
        public final Map<String, Object> getTrust() {
            return this.trust;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CallSummaries other = (CallSummaries) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(callSid, other.callSid) &&  Objects.equals(answeredBy, other.answeredBy) &&  Objects.equals(callType, other.callType) &&  Objects.equals(callState, other.callState) &&  Objects.equals(processingState, other.processingState) &&  Objects.equals(createdTime, other.createdTime) &&  Objects.equals(startTime, other.startTime) &&  Objects.equals(endTime, other.endTime) &&  Objects.equals(duration, other.duration) &&  Objects.equals(connectDuration, other.connectDuration) &&  Objects.equals(from, other.from) &&  Objects.equals(to, other.to) &&  Objects.equals(carrierEdge, other.carrierEdge) &&  Objects.equals(clientEdge, other.clientEdge) &&  Objects.equals(sdkEdge, other.sdkEdge) &&  Objects.equals(sipEdge, other.sipEdge) &&  Objects.equals(tags, other.tags) &&  Objects.equals(url, other.url) &&  Objects.equals(attributes, other.attributes) &&  Objects.equals(properties, other.properties) &&  Objects.equals(trust, other.trust)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, callSid, answeredBy, callType, callState, processingState, createdTime, startTime, endTime, duration, connectDuration, from, to, carrierEdge, clientEdge, sdkEdge, sipEdge, tags, url, attributes, properties, trust);
    }

}

