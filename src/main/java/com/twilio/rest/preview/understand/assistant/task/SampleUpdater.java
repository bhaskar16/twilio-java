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

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class SampleUpdater extends Updater<Sample>{
    private String assistantSid;
    private String taskSid;
    private String sid;
    private String language;
    private String taggedText;
    private String sourceChannel;

    public SampleUpdater(final String assistantSid, final String taskSid, final String sid){
        this.assistantSid = assistantSid;
        this.taskSid = taskSid;
        this.sid = sid;
    }

    public SampleUpdater setLanguage(final String language){
        this.language = language;
        return this;
    }
    public SampleUpdater setTaggedText(final String taggedText){
        this.taggedText = taggedText;
        return this;
    }
    public SampleUpdater setSourceChannel(final String sourceChannel){
        this.sourceChannel = sourceChannel;
        return this;
    }

    @Override
    public Sample update(final TwilioRestClient client){
        String path = "/understand/Assistants/{AssistantSid}/Tasks/{TaskSid}/Samples/{Sid}";

        path = path.replace("{"+"AssistantSid"+"}", this.assistantSid.toString());
        path = path.replace("{"+"TaskSid"+"}", this.taskSid.toString());
        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Sample update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Sample.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (language != null) {
            request.addPostParam("Language", language);
    
        }
        if (taggedText != null) {
            request.addPostParam("TaggedText", taggedText);
    
        }
        if (sourceChannel != null) {
            request.addPostParam("SourceChannel", sourceChannel);
    
        }
    }
}