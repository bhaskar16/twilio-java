/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Wireless
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.wireless.v1;

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
import com.twilio.http.HttpMethod;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;

import lombok.ToString;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Sim extends Resource {
    private static final long serialVersionUID = 183328816720636L;

    

    public static SimDeleter deleter(final String pathSid){
        return new SimDeleter(pathSid);
    }

    public static SimFetcher fetcher(final String pathSid){
        return new SimFetcher(pathSid);
    }

    public static SimReader reader(){
        return new SimReader();
    }

    public static SimUpdater updater(final String pathSid){
        return new SimUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Sim object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Sim object represented by the provided JSON
    */
    public static Sim fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Sim object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Sim object represented by the provided JSON
    */
    public static Sim fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum ResetStatus {
        RESETTING("resetting");

        private final String value;

        private ResetStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static ResetStatus forValue(final String value) {
            return Promoter.enumFromString(value, ResetStatus.values());
        }
    }
    public enum Status {
        NEW("new"),
        READY("ready"),
        ACTIVE("active"),
        SUSPENDED("suspended"),
        DEACTIVATED("deactivated"),
        CANCELED("canceled"),
        SCHEDULED("scheduled"),
        UPDATING("updating");

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

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String ratePlanSid;
    private final String friendlyName;
    private final String iccid;
    private final String eId;
    private final Sim.Status status;
    private final Sim.ResetStatus resetStatus;
    private final URI commandsCallbackUrl;
    private final HttpMethod commandsCallbackMethod;
    private final HttpMethod smsFallbackMethod;
    private final URI smsFallbackUrl;
    private final HttpMethod smsMethod;
    private final URI smsUrl;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceUrl;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;
    private final String ipAddress;

    @JsonCreator
    private Sim(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("rate_plan_sid")
        final String ratePlanSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("iccid")
        final String iccid,

        @JsonProperty("e_id")
        final String eId,

        @JsonProperty("status")
        final Sim.Status status,

        @JsonProperty("reset_status")
        final Sim.ResetStatus resetStatus,

        @JsonProperty("commands_callback_url")
        final URI commandsCallbackUrl,

        @JsonProperty("commands_callback_method")
        final HttpMethod commandsCallbackMethod,

        @JsonProperty("sms_fallback_method")
        final HttpMethod smsFallbackMethod,

        @JsonProperty("sms_fallback_url")
        final URI smsFallbackUrl,

        @JsonProperty("sms_method")
        final HttpMethod smsMethod,

        @JsonProperty("sms_url")
        final URI smsUrl,

        @JsonProperty("voice_fallback_method")
        final HttpMethod voiceFallbackMethod,

        @JsonProperty("voice_fallback_url")
        final URI voiceFallbackUrl,

        @JsonProperty("voice_method")
        final HttpMethod voiceMethod,

        @JsonProperty("voice_url")
        final URI voiceUrl,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("ip_address")
        final String ipAddress
    ) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.ratePlanSid = ratePlanSid;
        this.friendlyName = friendlyName;
        this.iccid = iccid;
        this.eId = eId;
        this.status = status;
        this.resetStatus = resetStatus;
        this.commandsCallbackUrl = commandsCallbackUrl;
        this.commandsCallbackMethod = commandsCallbackMethod;
        this.smsFallbackMethod = smsFallbackMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsMethod = smsMethod;
        this.smsUrl = smsUrl;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceUrl = voiceUrl;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
        this.ipAddress = ipAddress;
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
        public final String getRatePlanSid() {
            return this.ratePlanSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getIccid() {
            return this.iccid;
        }
        public final String getEId() {
            return this.eId;
        }
        public final Sim.Status getStatus() {
            return this.status;
        }
        public final Sim.ResetStatus getResetStatus() {
            return this.resetStatus;
        }
        public final URI getCommandsCallbackUrl() {
            return this.commandsCallbackUrl;
        }
        public final HttpMethod getCommandsCallbackMethod() {
            return this.commandsCallbackMethod;
        }
        public final HttpMethod getSmsFallbackMethod() {
            return this.smsFallbackMethod;
        }
        public final URI getSmsFallbackUrl() {
            return this.smsFallbackUrl;
        }
        public final HttpMethod getSmsMethod() {
            return this.smsMethod;
        }
        public final URI getSmsUrl() {
            return this.smsUrl;
        }
        public final HttpMethod getVoiceFallbackMethod() {
            return this.voiceFallbackMethod;
        }
        public final URI getVoiceFallbackUrl() {
            return this.voiceFallbackUrl;
        }
        public final HttpMethod getVoiceMethod() {
            return this.voiceMethod;
        }
        public final URI getVoiceUrl() {
            return this.voiceUrl;
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
        public final String getIpAddress() {
            return this.ipAddress;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sim other = (Sim) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(ratePlanSid, other.ratePlanSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(iccid, other.iccid) &&  Objects.equals(eId, other.eId) &&  Objects.equals(status, other.status) &&  Objects.equals(resetStatus, other.resetStatus) &&  Objects.equals(commandsCallbackUrl, other.commandsCallbackUrl) &&  Objects.equals(commandsCallbackMethod, other.commandsCallbackMethod) &&  Objects.equals(smsFallbackMethod, other.smsFallbackMethod) &&  Objects.equals(smsFallbackUrl, other.smsFallbackUrl) &&  Objects.equals(smsMethod, other.smsMethod) &&  Objects.equals(smsUrl, other.smsUrl) &&  Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) &&  Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) &&  Objects.equals(voiceMethod, other.voiceMethod) &&  Objects.equals(voiceUrl, other.voiceUrl) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links) &&  Objects.equals(ipAddress, other.ipAddress)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, uniqueName, accountSid, ratePlanSid, friendlyName, iccid, eId, status, resetStatus, commandsCallbackUrl, commandsCallbackMethod, smsFallbackMethod, smsFallbackUrl, smsMethod, smsUrl, voiceFallbackMethod, voiceFallbackUrl, voiceMethod, voiceUrl, dateCreated, dateUpdated, url, links, ipAddress);
    }


}

