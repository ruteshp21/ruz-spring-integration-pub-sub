/*
 * Copyright (c)  Rutesh Patil
 */

package com.ruzlabs.pubsub.controller;

import com.ruzlabs.pubsub.publish.PublishingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BasicController {

    private final PublishingService publishingService;

    public BasicController(PublishingService publishingService) {
        this.publishingService = publishingService;
    }

    /**
     * Triggers a message to be published to the "web.domains" topic.
     * @return "OK" if the message is published successfully.
     */
    @GetMapping("/test")
    public String test() {
        publishingService.publish();
        return "OK";
    }
}
