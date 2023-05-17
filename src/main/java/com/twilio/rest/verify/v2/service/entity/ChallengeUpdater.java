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

package com.twilio.rest.verify.v2.service.entity;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;


import java.util.Map;


public class ChallengeUpdater extends Updater<Challenge>{
    private String pathServiceSid;
    private String pathIdentity;
    private String pathSid;
    private String authPayload;
    private Map<String, Object> metadata;

    public ChallengeUpdater(final String pathServiceSid, final String pathIdentity, final String pathSid){
        this.pathServiceSid = pathServiceSid;
        this.pathIdentity = pathIdentity;
        this.pathSid = pathSid;
    }

    public ChallengeUpdater setAuthPayload(final String authPayload){
        this.authPayload = authPayload;
        return this;
    }
    public ChallengeUpdater setMetadata(final Map<String, Object> metadata){
        this.metadata = metadata;
        return this;
    }

    @Override
    public Challenge update(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Entities/{Identity}/Challenges/{Sid}";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"Identity"+"}", this.pathIdentity.toString());
        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.VERIFY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Challenge update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Challenge.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (authPayload != null) {
            request.addPostParam("AuthPayload", authPayload);
    
        }
        if (metadata != null) {
            request.addPostParam("Metadata",  Converter.mapToJson(metadata));
    
        }
    }
}
