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

package com.twilio.rest.preview.wireless;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;



public class RatePlanCreator extends Creator<RatePlan>{
    private String uniqueName;
    private String friendlyName;
    private Boolean dataEnabled;
    private Integer dataLimit;
    private String dataMetering;
    private Boolean messagingEnabled;
    private Boolean voiceEnabled;
    private Boolean commandsEnabled;
    private Boolean nationalRoamingEnabled;
    private List<String> internationalRoaming;

    public RatePlanCreator() {
    }

    public RatePlanCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public RatePlanCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public RatePlanCreator setDataEnabled(final Boolean dataEnabled){
        this.dataEnabled = dataEnabled;
        return this;
    }
    public RatePlanCreator setDataLimit(final Integer dataLimit){
        this.dataLimit = dataLimit;
        return this;
    }
    public RatePlanCreator setDataMetering(final String dataMetering){
        this.dataMetering = dataMetering;
        return this;
    }
    public RatePlanCreator setMessagingEnabled(final Boolean messagingEnabled){
        this.messagingEnabled = messagingEnabled;
        return this;
    }
    public RatePlanCreator setVoiceEnabled(final Boolean voiceEnabled){
        this.voiceEnabled = voiceEnabled;
        return this;
    }
    public RatePlanCreator setCommandsEnabled(final Boolean commandsEnabled){
        this.commandsEnabled = commandsEnabled;
        return this;
    }
    public RatePlanCreator setNationalRoamingEnabled(final Boolean nationalRoamingEnabled){
        this.nationalRoamingEnabled = nationalRoamingEnabled;
        return this;
    }
    public RatePlanCreator setInternationalRoaming(final List<String> internationalRoaming){
        this.internationalRoaming = internationalRoaming;
        return this;
    }
    public RatePlanCreator setInternationalRoaming(final String internationalRoaming){
        return setInternationalRoaming(Promoter.listOfOne(internationalRoaming));
    }

    @Override
    public RatePlan create(final TwilioRestClient client){
        String path = "/wireless/RatePlans";


        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("RatePlan creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return RatePlan.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (dataEnabled != null) {
            request.addPostParam("DataEnabled", dataEnabled.toString());
    
        }
        if (dataLimit != null) {
            request.addPostParam("DataLimit", dataLimit.toString());
    
        }
        if (dataMetering != null) {
            request.addPostParam("DataMetering", dataMetering);
    
        }
        if (messagingEnabled != null) {
            request.addPostParam("MessagingEnabled", messagingEnabled.toString());
    
        }
        if (voiceEnabled != null) {
            request.addPostParam("VoiceEnabled", voiceEnabled.toString());
    
        }
        if (commandsEnabled != null) {
            request.addPostParam("CommandsEnabled", commandsEnabled.toString());
    
        }
        if (nationalRoamingEnabled != null) {
            request.addPostParam("NationalRoamingEnabled", nationalRoamingEnabled.toString());
    
        }
        if (internationalRoaming != null) {
            for (String prop : internationalRoaming) {
                request.addPostParam("InternationalRoaming", prop);
            }
    
        }
    }
}
