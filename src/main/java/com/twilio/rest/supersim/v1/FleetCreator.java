/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.supersim.v1;

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

public class FleetCreator extends Creator<Fleet>{
    private String networkAccessProfile;
    private String uniqueName;
    private Boolean dataEnabled;
    private Integer dataLimit;
    private URI ipCommandsUrl;
    private HttpMethod ipCommandsMethod;
    private Boolean smsCommandsEnabled;
    private URI smsCommandsUrl;
    private HttpMethod smsCommandsMethod;

    public FleetCreator(final String networkAccessProfile) {
        this.networkAccessProfile = networkAccessProfile;
    }

    public FleetCreator setNetworkAccessProfile(final String networkAccessProfile){
        this.networkAccessProfile = networkAccessProfile;
        return this;
    }
    public FleetCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public FleetCreator setDataEnabled(final Boolean dataEnabled){
        this.dataEnabled = dataEnabled;
        return this;
    }
    public FleetCreator setDataLimit(final Integer dataLimit){
        this.dataLimit = dataLimit;
        return this;
    }
    public FleetCreator setIpCommandsUrl(final URI ipCommandsUrl){
        this.ipCommandsUrl = ipCommandsUrl;
        return this;
    }

    public FleetCreator setIpCommandsUrl(final String ipCommandsUrl){
        return setIpCommandsUrl(Promoter.uriFromString(ipCommandsUrl));
    }
    public FleetCreator setIpCommandsMethod(final HttpMethod ipCommandsMethod){
        this.ipCommandsMethod = ipCommandsMethod;
        return this;
    }
    public FleetCreator setSmsCommandsEnabled(final Boolean smsCommandsEnabled){
        this.smsCommandsEnabled = smsCommandsEnabled;
        return this;
    }
    public FleetCreator setSmsCommandsUrl(final URI smsCommandsUrl){
        this.smsCommandsUrl = smsCommandsUrl;
        return this;
    }

    public FleetCreator setSmsCommandsUrl(final String smsCommandsUrl){
        return setSmsCommandsUrl(Promoter.uriFromString(smsCommandsUrl));
    }
    public FleetCreator setSmsCommandsMethod(final HttpMethod smsCommandsMethod){
        this.smsCommandsMethod = smsCommandsMethod;
        return this;
    }

    @Override
    public Fleet create(final TwilioRestClient client){
        String path = "/v1/Fleets";

        path = path.replace("{"+"NetworkAccessProfile"+"}", this.networkAccessProfile.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.SUPERSIM.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Fleet creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Fleet.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (networkAccessProfile != null) {
            request.addPostParam("NetworkAccessProfile", networkAccessProfile);
    
        }
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (dataEnabled != null) {
            request.addPostParam("DataEnabled", dataEnabled.toString());
    
        }
        if (dataLimit != null) {
            request.addPostParam("DataLimit", dataLimit.toString());
    
        }
        if (ipCommandsUrl != null) {
            request.addPostParam("IpCommandsUrl", ipCommandsUrl.toString());
    
        }
        if (ipCommandsMethod != null) {
            request.addPostParam("IpCommandsMethod", ipCommandsMethod.toString());
    
        }
        if (smsCommandsEnabled != null) {
            request.addPostParam("SmsCommandsEnabled", smsCommandsEnabled.toString());
    
        }
        if (smsCommandsUrl != null) {
            request.addPostParam("SmsCommandsUrl", smsCommandsUrl.toString());
    
        }
        if (smsCommandsMethod != null) {
            request.addPostParam("SmsCommandsMethod", smsCommandsMethod.toString());
    
        }
    }
}
