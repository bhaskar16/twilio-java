/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace;

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
public class Workflow extends Resource {
    private static final long serialVersionUID = 204168447451968L;

    public static WorkflowCreator creator(final String pathWorkspaceSid, final String friendlyName, final String configuration){
        return new WorkflowCreator(pathWorkspaceSid, friendlyName, configuration);
    }

    public static WorkflowDeleter deleter(final String pathWorkspaceSid, final String pathSid){
        return new WorkflowDeleter(pathWorkspaceSid, pathSid);
    }

    public static WorkflowFetcher fetcher(final String pathWorkspaceSid, final String pathSid){
        return new WorkflowFetcher(pathWorkspaceSid, pathSid);
    }

    public static WorkflowReader reader(final String pathWorkspaceSid){
        return new WorkflowReader(pathWorkspaceSid);
    }

    public static WorkflowUpdater updater(final String pathWorkspaceSid, final String pathSid){
        return new WorkflowUpdater(pathWorkspaceSid, pathSid);
    }

    /**
    * Converts a JSON String into a Workflow object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Workflow object represented by the provided JSON
    */
    public static Workflow fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workflow.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Workflow object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Workflow object represented by the provided JSON
    */
    public static Workflow fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workflow.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final URI assignmentCallbackUrl;
    private final String configuration;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String documentContentType;
    private final URI fallbackAssignmentCallbackUrl;
    private final String friendlyName;
    private final String sid;
    private final Integer taskReservationTimeout;
    private final String workspaceSid;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Workflow(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("assignment_callback_url")
        final URI assignmentCallbackUrl,

        @JsonProperty("configuration")
        final String configuration,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("document_content_type")
        final String documentContentType,

        @JsonProperty("fallback_assignment_callback_url")
        final URI fallbackAssignmentCallbackUrl,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("task_reservation_timeout")
        final Integer taskReservationTimeout,

        @JsonProperty("workspace_sid")
        final String workspaceSid,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.accountSid = accountSid;
        this.assignmentCallbackUrl = assignmentCallbackUrl;
        this.configuration = configuration;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.documentContentType = documentContentType;
        this.fallbackAssignmentCallbackUrl = fallbackAssignmentCallbackUrl;
        this.friendlyName = friendlyName;
        this.sid = sid;
        this.taskReservationTimeout = taskReservationTimeout;
        this.workspaceSid = workspaceSid;
        this.url = url;
        this.links = links;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final URI getAssignmentCallbackUrl() {
            return this.assignmentCallbackUrl;
        }
        public final String getConfiguration() {
            return this.configuration;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getDocumentContentType() {
            return this.documentContentType;
        }
        public final URI getFallbackAssignmentCallbackUrl() {
            return this.fallbackAssignmentCallbackUrl;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getSid() {
            return this.sid;
        }
        public final Integer getTaskReservationTimeout() {
            return this.taskReservationTimeout;
        }
        public final String getWorkspaceSid() {
            return this.workspaceSid;
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

        Workflow other = (Workflow) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(assignmentCallbackUrl, other.assignmentCallbackUrl) &&  Objects.equals(configuration, other.configuration) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(documentContentType, other.documentContentType) &&  Objects.equals(fallbackAssignmentCallbackUrl, other.fallbackAssignmentCallbackUrl) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(sid, other.sid) &&  Objects.equals(taskReservationTimeout, other.taskReservationTimeout) &&  Objects.equals(workspaceSid, other.workspaceSid) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, assignmentCallbackUrl, configuration, dateCreated, dateUpdated, documentContentType, fallbackAssignmentCallbackUrl, friendlyName, sid, taskReservationTimeout, workspaceSid, url, links);
    }

}

