/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Verify
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.verify.v2.service;

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
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Verification extends Resource {

    private static final long serialVersionUID = 3815558292528L;

    public static VerificationCreator creator(
        final String pathServiceSid,
        final String to,
        final String channel
    ) {
        return new VerificationCreator(pathServiceSid, to, channel);
    }

    public static VerificationFetcher fetcher(
        final String pathServiceSid,
        final String pathSid
    ) {
        return new VerificationFetcher(pathServiceSid, pathSid);
    }

    public static VerificationUpdater updater(
        final String pathServiceSid,
        final String pathSid,
        final Verification.Status status
    ) {
        return new VerificationUpdater(pathServiceSid, pathSid, status);
    }

    /**
     * Converts a JSON String into a Verification object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Verification object represented by the provided JSON
     */
    public static Verification fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Verification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Verification object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Verification object represented by the provided JSON
     */
    public static Verification fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Verification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String serviceSid;
    private final String accountSid;
    private final String to;
    private final Verification.Channel channel;
    private final String status;
    private final Boolean valid;
    private final Map<String, Object> lookup;
    private final String amount;
    private final String payee;
    private final List<Map<String, Object>> sendCodeAttempts;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Map<String, Object> sna;
    private final URI url;

    @JsonCreator
    private Verification(
        @JsonProperty("sid") final String sid,
        @JsonProperty("service_sid") final String serviceSid,
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("to") final String to,
        @JsonProperty("channel") final Verification.Channel channel,
        @JsonProperty("status") final String status,
        @JsonProperty("valid") final Boolean valid,
        @JsonProperty("lookup") final Map<String, Object> lookup,
        @JsonProperty("amount") final String amount,
        @JsonProperty("payee") final String payee,
        @JsonProperty("send_code_attempts") final List<
            Map<String, Object>
        > sendCodeAttempts,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("sna") final Map<String, Object> sna,
        @JsonProperty("url") final URI url
    ) {
        this.sid = sid;
        this.serviceSid = serviceSid;
        this.accountSid = accountSid;
        this.to = to;
        this.channel = channel;
        this.status = status;
        this.valid = valid;
        this.lookup = lookup;
        this.amount = amount;
        this.payee = payee;
        this.sendCodeAttempts = sendCodeAttempts;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sna = sna;
        this.url = url;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getServiceSid() {
        return this.serviceSid;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getTo() {
        return this.to;
    }

    public final Verification.Channel getChannel() {
        return this.channel;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Boolean getValid() {
        return this.valid;
    }

    public final Map<String, Object> getLookup() {
        return this.lookup;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getPayee() {
        return this.payee;
    }

    public final List<Map<String, Object>> getSendCodeAttempts() {
        return this.sendCodeAttempts;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final Map<String, Object> getSna() {
        return this.sna;
    }

    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Verification other = (Verification) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(serviceSid, other.serviceSid) &&
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(to, other.to) &&
            Objects.equals(channel, other.channel) &&
            Objects.equals(status, other.status) &&
            Objects.equals(valid, other.valid) &&
            Objects.equals(lookup, other.lookup) &&
            Objects.equals(amount, other.amount) &&
            Objects.equals(payee, other.payee) &&
            Objects.equals(sendCodeAttempts, other.sendCodeAttempts) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(sna, other.sna) &&
            Objects.equals(url, other.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            serviceSid,
            accountSid,
            to,
            channel,
            status,
            valid,
            lookup,
            amount,
            payee,
            sendCodeAttempts,
            dateCreated,
            dateUpdated,
            sna,
            url
        );
    }

    public enum RiskCheck {
        ENABLE("enable"),
        DISABLE("disable");

        private final String value;

        private RiskCheck(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static RiskCheck forValue(final String value) {
            return Promoter.enumFromString(value, RiskCheck.values());
        }
    }

    public enum Status {
        CANCELED("canceled"),
        APPROVED("approved");

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

    public enum Channel {
        SMS("sms"),
        CALL("call"),
        EMAIL("email"),
        WHATSAPP("whatsapp"),
        SNA("sna");

        private final String value;

        private Channel(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Channel forValue(final String value) {
            return Promoter.enumFromString(value, Channel.values());
        }
    }
}
