/*
 * Copyright (c)  Rutesh Patil
 */

package com.ruzlabs.pubsub.publish;

import com.ruzlabs.pubsub.utils.PubSubMessageChannels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(PubSubMessageChannels.class)
public class PublishingServiceImpl implements PublishingService {

    @Autowired
    PubSubMessageChannels pubSubMessageChannels;

    /**
     * Publishes a message to the {@code web.domains} topic. The message
     * payload is "Hello World".
     */
    public void publish() {
        Message<String> message = MessageBuilder.withPayload("Hello World").build();
        MessageChannel publishMessageChannel = pubSubMessageChannels.publishWebDomain();
        publishMessageChannel.send(message);
    }

}
