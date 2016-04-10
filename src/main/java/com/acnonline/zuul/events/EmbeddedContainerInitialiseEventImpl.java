package com.acnonline.zuul.events;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Aranga on 9/04/2016.
 */
@Configuration
public class EmbeddedContainerInitialiseEventImpl implements ApplicationListener<EmbeddedServletContainerInitializedEvent>
{

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        System.out.println("HELLO PORT:"+event.getEmbeddedServletContainer().getPort());

    }
}
