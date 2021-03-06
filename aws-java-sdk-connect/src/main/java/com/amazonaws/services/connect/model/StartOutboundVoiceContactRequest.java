/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartOutboundVoiceContactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The phone number, in E.164 format, of the customer to call with the outbound contact.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon Resource
     * Name (ARN) values are not supported.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow designer.
     * The ID for the contact flow is displayed in the address bar as part of the URL. For example, an address displayed
     * when you open a contact flow is similar to the following:
     * <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     * . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     * <code>ContactFlowID</code> for this contact flow is <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>.
     * Make sure to include only the GUID after the "contact-flow/" in your requests.
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your Amazon
     * Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect console</a>. Select
     * the instance alias of the instance and view the instance ID in the <b>Overview</b> section. For example, the
     * instance ID is the set of characters at the end of the instance ARN, after "instance/", such as
     * 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the outbound
     * call.
     * </p>
     */
    private String sourcePhoneNumber;
    /**
     * <p>
     * The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the phone number
     * defined for the queue. If you do not specify a queue, the queue used is the queue defined in the contact flow
     * specified by <code>ContactFlowId</code>.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for the queue
     * is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value is the set of
     * characters at the end of the URL, after "queue/", such as <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     * and can be accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only alphanumeric,
     * dash, and underscore characters.
     * </p>
     * <p>
     * For example, to play a greeting when the customer answers the call, you can pass the customer name in attributes
     * similar to the following:
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The phone number, in E.164 format, of the customer to call with the outbound contact.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The phone number, in E.164 format, of the customer to call with the outbound contact.
     */

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format, of the customer to call with the outbound contact.
     * </p>
     * 
     * @return The phone number, in E.164 format, of the customer to call with the outbound contact.
     */

    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format, of the customer to call with the outbound contact.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The phone number, in E.164 format, of the customer to call with the outbound contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon Resource
     * Name (ARN) values are not supported.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow designer.
     * The ID for the contact flow is displayed in the address bar as part of the URL. For example, an address displayed
     * when you open a contact flow is similar to the following:
     * <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     * . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     * <code>ContactFlowID</code> for this contact flow is <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>.
     * Make sure to include only the GUID after the "contact-flow/" in your requests.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon
     *        Resource Name (ARN) values are not supported.</p>
     *        <p>
     *        To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow
     *        designer. The ID for the contact flow is displayed in the address bar as part of the URL. For example, an
     *        address displayed when you open a contact flow is similar to the following:
     *        <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     *        . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     *        <code>ContactFlowID</code> for this contact flow is
     *        <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>. Make sure to include only the GUID after the
     *        "contact-flow/" in your requests.
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon Resource
     * Name (ARN) values are not supported.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow designer.
     * The ID for the contact flow is displayed in the address bar as part of the URL. For example, an address displayed
     * when you open a contact flow is similar to the following:
     * <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     * . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     * <code>ContactFlowID</code> for this contact flow is <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>.
     * Make sure to include only the GUID after the "contact-flow/" in your requests.
     * </p>
     * 
     * @return The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon
     *         Resource Name (ARN) values are not supported.</p>
     *         <p>
     *         To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow
     *         designer. The ID for the contact flow is displayed in the address bar as part of the URL. For example, an
     *         address displayed when you open a contact flow is similar to the following:
     *         <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     *         . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     *         <code>ContactFlowID</code> for this contact flow is
     *         <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>. Make sure to include only the GUID after the
     *         "contact-flow/" in your requests.
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon Resource
     * Name (ARN) values are not supported.
     * </p>
     * <p>
     * To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow designer.
     * The ID for the contact flow is displayed in the address bar as part of the URL. For example, an address displayed
     * when you open a contact flow is similar to the following:
     * <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     * . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     * <code>ContactFlowID</code> for this contact flow is <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>.
     * Make sure to include only the GUID after the "contact-flow/" in your requests.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier for the contact flow to execute for the outbound call. This is a GUID value only. Amazon
     *        Resource Name (ARN) values are not supported.</p>
     *        <p>
     *        To find the <code>ContactFlowId</code>, open the contact flow to use in the Amazon Connect contact flow
     *        designer. The ID for the contact flow is displayed in the address bar as part of the URL. For example, an
     *        address displayed when you open a contact flow is similar to the following:
     *        <code>https://myconnectinstance.awsapps.com/connect/contact-flows/edit?id=arn:aws:connect:us-east-1:361814831152:instance/2fb42df9-78a2-4b99-b484-f5cf80dc300c/contact-flow/<i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>
     *        . At the end of the URL, you see <code>contact-flow/b0b8f2dd-ed1b-4c44-af36-ce189a178181</code>. The
     *        <code>ContactFlowID</code> for this contact flow is
     *        <code> <i>b0b8f2dd-ed1b-4c44-af36-ce189a178181</i> </code>. Make sure to include only the GUID after the
     *        "contact-flow/" in your requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your Amazon
     * Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect console</a>. Select
     * the instance alias of the instance and view the instance ID in the <b>Overview</b> section. For example, the
     * instance ID is the set of characters at the end of the instance ARN, after "instance/", such as
     * 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @param instanceId
     *        The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your Amazon
     *        Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect console</a>.
     *        Select the instance alias of the instance and view the instance ID in the <b>Overview</b> section. For
     *        example, the instance ID is the set of characters at the end of the instance ARN, after "instance/", such
     *        as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your Amazon
     * Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect console</a>. Select
     * the instance alias of the instance and view the instance ID in the <b>Overview</b> section. For example, the
     * instance ID is the set of characters at the end of the instance ARN, after "instance/", such as
     * 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @return The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your
     *         Amazon Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect
     *         console</a>. Select the instance alias of the instance and view the instance ID in the <b>Overview</b>
     *         section. For example, the instance ID is the set of characters at the end of the instance ARN, after
     *         "instance/", such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your Amazon
     * Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect console</a>. Select
     * the instance alias of the instance and view the instance ID in the <b>Overview</b> section. For example, the
     * instance ID is the set of characters at the end of the instance ARN, after "instance/", such as
     * 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @param instanceId
     *        The identifier for your Amazon Connect instance. To find the <code>InstanceId</code> value for your Amazon
     *        Connect instance, open the <a href="https://console.aws.amazon.com/connect/">Amazon Connect console</a>.
     *        Select the instance alias of the instance and view the instance ID in the <b>Overview</b> section. For
     *        example, the instance ID is the set of characters at the end of the instance ARN, after "instance/", such
     *        as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token
     *        is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the
     *        contact is disconnected, a new contact is started.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token
     *         is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the
     *         contact is disconnected, a new contact is started.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid
     * for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is
     * disconnected, a new contact is started.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token
     *        is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the
     *        contact is disconnected, a new contact is started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the outbound
     * call.
     * </p>
     * 
     * @param sourcePhoneNumber
     *        The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the
     *        outbound call.
     */

    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the outbound
     * call.
     * </p>
     * 
     * @return The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the
     *         outbound call.
     */

    public String getSourcePhoneNumber() {
        return this.sourcePhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the outbound
     * call.
     * </p>
     * 
     * @param sourcePhoneNumber
     *        The phone number, in E.164 format, associated with your Amazon Connect instance to use to place the
     *        outbound call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withSourcePhoneNumber(String sourcePhoneNumber) {
        setSourcePhoneNumber(sourcePhoneNumber);
        return this;
    }

    /**
     * <p>
     * The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the phone number
     * defined for the queue. If you do not specify a queue, the queue used is the queue defined in the contact flow
     * specified by <code>ContactFlowId</code>.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for the queue
     * is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value is the set of
     * characters at the end of the URL, after "queue/", such as <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     * 
     * @param queueId
     *        The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the phone
     *        number defined for the queue. If you do not specify a queue, the queue used is the queue defined in the
     *        contact flow specified by <code>ContactFlowId</code>.</p>
     *        <p>
     *        To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for the
     *        queue is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value is
     *        the set of characters at the end of the URL, after "queue/", such as
     *        <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the phone number
     * defined for the queue. If you do not specify a queue, the queue used is the queue defined in the contact flow
     * specified by <code>ContactFlowId</code>.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for the queue
     * is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value is the set of
     * characters at the end of the URL, after "queue/", such as <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     * 
     * @return The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the
     *         phone number defined for the queue. If you do not specify a queue, the queue used is the queue defined in
     *         the contact flow specified by <code>ContactFlowId</code>.</p>
     *         <p>
     *         To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for
     *         the queue is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value
     *         is the set of characters at the end of the URL, after "queue/", such as
     *         <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the phone number
     * defined for the queue. If you do not specify a queue, the queue used is the queue defined in the contact flow
     * specified by <code>ContactFlowId</code>.
     * </p>
     * <p>
     * To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for the queue
     * is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value is the set of
     * characters at the end of the URL, after "queue/", such as <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * </p>
     * 
     * @param queueId
     *        The queue to which to add the call. If you specify a queue, the phone displayed for caller ID is the phone
     *        number defined for the queue. If you do not specify a queue, the queue used is the queue defined in the
     *        contact flow specified by <code>ContactFlowId</code>.</p>
     *        <p>
     *        To find the <code>QueueId</code>, open the queue to use in the Amazon Connect queue editor. The ID for the
     *        queue is displayed in the address bar as part of the URL. For example, the <code>QueueId</code> value is
     *        the set of characters at the end of the URL, after "queue/", such as
     *        <code>aeg40574-2d01-51c3-73d6-bf8624d2168c</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     * and can be accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only alphanumeric,
     * dash, and underscore characters.
     * </p>
     * <p>
     * For example, to play a greeting when the customer answers the call, you can pass the customer name in attributes
     * similar to the following:
     * </p>
     * 
     * @return Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect
     *         attributes, and can be accessed in contact flows just like any other contact attributes.</p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only
     *         alphanumeric, dash, and underscore characters.
     *         </p>
     *         <p>
     *         For example, to play a greeting when the customer answers the call, you can pass the customer name in
     *         attributes similar to the following:
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     * and can be accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only alphanumeric,
     * dash, and underscore characters.
     * </p>
     * <p>
     * For example, to play a greeting when the customer answers the call, you can pass the customer name in attributes
     * similar to the following:
     * </p>
     * 
     * @param attributes
     *        Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect
     *        attributes, and can be accessed in contact flows just like any other contact attributes.</p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only
     *        alphanumeric, dash, and underscore characters.
     *        </p>
     *        <p>
     *        For example, to play a greeting when the customer answers the call, you can pass the customer name in
     *        attributes similar to the following:
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes,
     * and can be accessed in contact flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only alphanumeric,
     * dash, and underscore characters.
     * </p>
     * <p>
     * For example, to play a greeting when the customer answers the call, you can pass the customer name in attributes
     * similar to the following:
     * </p>
     * 
     * @param attributes
     *        Specify a custom key-value pair using an attribute map. The attributes are standard Amazon Connect
     *        attributes, and can be accessed in contact flows just like any other contact attributes.</p>
     *        <p>
     *        There can be up to 32,768 UTF-8 bytes across all key-value pairs. Attribute keys can include only
     *        alphanumeric, dash, and underscore characters.
     *        </p>
     *        <p>
     *        For example, to play a greeting when the customer answers the call, you can pass the customer name in
     *        attributes similar to the following:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public StartOutboundVoiceContactRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOutboundVoiceContactRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: ").append(getDestinationPhoneNumber()).append(",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSourcePhoneNumber() != null)
            sb.append("SourcePhoneNumber: ").append(getSourcePhoneNumber()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOutboundVoiceContactRequest == false)
            return false;
        StartOutboundVoiceContactRequest other = (StartOutboundVoiceContactRequest) obj;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSourcePhoneNumber() == null ^ this.getSourcePhoneNumber() == null)
            return false;
        if (other.getSourcePhoneNumber() != null && other.getSourcePhoneNumber().equals(this.getSourcePhoneNumber()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSourcePhoneNumber() == null) ? 0 : getSourcePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public StartOutboundVoiceContactRequest clone() {
        return (StartOutboundVoiceContactRequest) super.clone();
    }

}
