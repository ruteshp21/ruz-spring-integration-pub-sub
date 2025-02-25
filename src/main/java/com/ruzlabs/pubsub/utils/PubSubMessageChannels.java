/*
 * Copyright (c)  Rutesh Patil
 */

package com.ruzlabs.pubsub.utils;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface PubSubMessageChannels {

    /**
     * Message channel for subscribing to web domains.
     *
     * @return a message channel
     */
    @Input(TopicConstants.WEB_DOMAINS)
    MessageChannel subscribeWebDomain();

    /**
     * Message channel for publishing web domains.
     *
     * @return a message channel
     */
    @Output(TopicConstants.WEB_DOMAINS)
    MessageChannel publishWebDomain();

}
