/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Iam
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.iam.v1;

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
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class NewApiKey extends Resource {

    private static final long serialVersionUID = 217181042856619L;

    public static NewApiKeyCreator creator(final String accountSid) {
        return new NewApiKeyCreator(accountSid);
    }

    /**
     * Converts a JSON String into a NewApiKey object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return NewApiKey object represented by the provided JSON
     */
    public static NewApiKey fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, NewApiKey.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a NewApiKey object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return NewApiKey object represented by the provided JSON
     */
    public static NewApiKey fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, NewApiKey.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String friendlyName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String secret;
    private final Map<String, Object> policy;

    @JsonCreator
    private NewApiKey(
        @JsonProperty("sid") final String sid,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("secret") final String secret,
        @JsonProperty("policy") final Map<String, Object> policy
    ) {
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.secret = secret;
        this.policy = policy;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final Map<String, Object> getPolicy() {
        return this.policy;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NewApiKey other = (NewApiKey) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(secret, other.secret) &&
            Objects.equals(policy, other.policy)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            friendlyName,
            dateCreated,
            dateUpdated,
            secret,
            policy
        );
    }

    public enum Keytype {
        RESTRICTED("restricted");

        private final String value;

        private Keytype(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Keytype forValue(final String value) {
            return Promoter.enumFromString(value, Keytype.values());
        }
    }
}