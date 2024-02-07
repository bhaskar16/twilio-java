/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Deleter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;



public class InsightsQuestionnairesDeleter extends Deleter<InsightsQuestionnaires> {
    private String pathQuestionnaireSid;
    private String authorization;

    public InsightsQuestionnairesDeleter(final String pathQuestionnaireSid){
        this.pathQuestionnaireSid = pathQuestionnaireSid;
    }

    public InsightsQuestionnairesDeleter setAuthorization(final String authorization){
        this.authorization = authorization;
        return this;
    }

    @Override
    public boolean delete(final TwilioRestClient client) {
        String path = "/v1/Insights/QualityManagement/Questionnaires/{QuestionnaireSid}";

        path = path.replace("{"+"QuestionnaireSid"+"}", this.pathQuestionnaireSid.toString());

        Request request = new Request(
            HttpMethod.DELETE,
            Domains.FLEXAPI.toString(),
            path
        );
        addHeaderParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("InsightsQuestionnaires delete failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }
        return response.getStatusCode() == 204;
    }
    private void addHeaderParams(final Request request) {
        if (authorization != null) {
            request.addHeaderParam("Authorization", authorization);

        }
    }
}
