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

package com.twilio.rest.preview.understand.assistant.task;

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
public class TaskActions extends Resource {
    private static final long serialVersionUID = 36530790788418L;

    public static TaskActionsFetcher fetcher(final String pathAssistantSid, final String pathTaskSid){
        return new TaskActionsFetcher(pathAssistantSid, pathTaskSid);
    }

    public static TaskActionsUpdater updater(final String pathAssistantSid, final String pathTaskSid){
        return new TaskActionsUpdater(pathAssistantSid, pathTaskSid);
    }

    /**
    * Converts a JSON String into a TaskActions object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return TaskActions object represented by the provided JSON
    */
    public static TaskActions fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TaskActions.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a TaskActions object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return TaskActions object represented by the provided JSON
    */
    public static TaskActions fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, TaskActions.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String assistantSid;
    private final String taskSid;
    private final URI url;
    private final Map<String, Object> data;

    @JsonCreator
    private TaskActions(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("assistant_sid")
        final String assistantSid,

        @JsonProperty("task_sid")
        final String taskSid,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("data")
        final Map<String, Object> data
    ) {
        this.accountSid = accountSid;
        this.assistantSid = assistantSid;
        this.taskSid = taskSid;
        this.url = url;
        this.data = data;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getAssistantSid() {
            return this.assistantSid;
        }
        public final String getTaskSid() {
            return this.taskSid;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, Object> getData() {
            return this.data;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TaskActions other = (TaskActions) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(assistantSid, other.assistantSid) &&  Objects.equals(taskSid, other.taskSid) &&  Objects.equals(url, other.url) &&  Objects.equals(data, other.data)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, assistantSid, taskSid, url, data);
    }

}

