/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1.assistant.task;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class SampleCreator extends Creator<Sample>{
    private String pathAssistantSid;
    private String pathTaskSid;
    private String language;
    private String taggedText;
    private String sourceChannel;

    public SampleCreator(final String pathAssistantSid, final String pathTaskSid, final String language, final String taggedText) {
        this.pathAssistantSid = pathAssistantSid;
        this.pathTaskSid = pathTaskSid;
        this.language = language;
        this.taggedText = taggedText;
    }

    public SampleCreator setLanguage(final String language){
        this.language = language;
        return this;
    }
    public SampleCreator setTaggedText(final String taggedText){
        this.taggedText = taggedText;
        return this;
    }
    public SampleCreator setSourceChannel(final String sourceChannel){
        this.sourceChannel = sourceChannel;
        return this;
    }

    @Override
    public Sample create(final TwilioRestClient client){
        String path = "/v1/Assistants/{AssistantSid}/Tasks/{TaskSid}/Samples";

        path = path.replace("{"+"AssistantSid"+"}", this.pathAssistantSid.toString());
        path = path.replace("{"+"TaskSid"+"}", this.pathTaskSid.toString());
        path = path.replace("{"+"Language"+"}", this.language.toString());
        path = path.replace("{"+"TaggedText"+"}", this.taggedText.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Sample creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
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
