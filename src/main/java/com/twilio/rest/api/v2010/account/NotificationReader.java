/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class NotificationReader extends Reader<Notification> {
    private String pathAccountSid;
    private Integer log;
    private LocalDate messageDate;
    private LocalDate messageDateBefore;
    private LocalDate messageDateAfter;
    private Integer pageSize;

    public NotificationReader(){
    }
    public NotificationReader(final String pathAccountSid){
        this.pathAccountSid = pathAccountSid;
    }

    public NotificationReader setLog(final Integer log){
        this.log = log;
        return this;
    }
    public NotificationReader setMessageDate(final LocalDate messageDate){
        this.messageDate = messageDate;
        return this;
    }
    public NotificationReader setMessageDateBefore(final LocalDate messageDateBefore){
        this.messageDateBefore = messageDateBefore;
        return this;
    }
    public NotificationReader setMessageDateAfter(final LocalDate messageDateAfter){
        this.messageDateAfter = messageDateAfter;
        return this;
    }
    public NotificationReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Notification> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Notification> firstPage(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/Notifications.json";
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Notification> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Notification read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "notifications",
            response.getContent(),
            Notification.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Notification> previousPage(final Page<Notification> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Notification> nextPage(final Page<Notification> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Notification> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (log != null) {
    
            request.addQueryParam("Log", log.toString());
        }
        if (messageDate != null) {
            request.addQueryParam("MessageDate", messageDate.format(DateTimeFormatter.ofPattern(Request.QUERY_STRING_DATE_FORMAT)));
        }
        else if (messageDateAfter != null || messageDateBefore != null) {
            request.addQueryDateRange("MessageDate", messageDateAfter, messageDateBefore);
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
