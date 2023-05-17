/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Trunking
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.trunking.v1.trunk;

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



import java.net.URI;

public class OriginationUrlCreator extends Creator<OriginationUrl>{
    private String pathTrunkSid;
    private Integer weight;
    private Integer priority;
    private Boolean enabled;
    private String friendlyName;
    private URI sipUrl;

    public OriginationUrlCreator(final String pathTrunkSid, final Integer weight, final Integer priority, final Boolean enabled, final String friendlyName, final URI sipUrl) {
        this.pathTrunkSid = pathTrunkSid;
        this.weight = weight;
        this.priority = priority;
        this.enabled = enabled;
        this.friendlyName = friendlyName;
        this.sipUrl = sipUrl;
    }

    public OriginationUrlCreator setWeight(final Integer weight){
        this.weight = weight;
        return this;
    }
    public OriginationUrlCreator setPriority(final Integer priority){
        this.priority = priority;
        return this;
    }
    public OriginationUrlCreator setEnabled(final Boolean enabled){
        this.enabled = enabled;
        return this;
    }
    public OriginationUrlCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public OriginationUrlCreator setSipUrl(final URI sipUrl){
        this.sipUrl = sipUrl;
        return this;
    }

    public OriginationUrlCreator setSipUrl(final String sipUrl){
        return setSipUrl(Promoter.uriFromString(sipUrl));
    }

    @Override
    public OriginationUrl create(final TwilioRestClient client){
        String path = "/v1/Trunks/{TrunkSid}/OriginationUrls";

        path = path.replace("{"+"TrunkSid"+"}", this.pathTrunkSid.toString());
        path = path.replace("{"+"Weight"+"}", this.weight.toString());
        path = path.replace("{"+"Priority"+"}", this.priority.toString());
        path = path.replace("{"+"Enabled"+"}", this.enabled.toString());
        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());
        path = path.replace("{"+"SipUrl"+"}", this.sipUrl.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TRUNKING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("OriginationUrl creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return OriginationUrl.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (weight != null) {
            request.addPostParam("Weight", weight.toString());
    
        }
        if (priority != null) {
            request.addPostParam("Priority", priority.toString());
    
        }
        if (enabled != null) {
            request.addPostParam("Enabled", enabled.toString());
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (sipUrl != null) {
            request.addPostParam("SipUrl", sipUrl.toString());
    
        }
    }
}
