/*
 * Copyright (c)  Rutesh Patil
 */

package com.ruzlabs.pubsub.subscriber;

import com.ruzlabs.pubsub.utils.PubSubMessageChannels;
import com.ruzlabs.pubsub.utils.TopicConstants;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(PubSubMessageChannels.class)
public class SubscriberServiceImpl {

    /**
     * Handles messages from the "web.domains" topic.
     *
     * @param message payload of the message
     */
    @StreamListener(TopicConstants.WEB_DOMAINS)
    public void subscribe(@Payload String message) {
        System.out.println("Received Message : " + message);
    }
}
