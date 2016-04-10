package com.acnonline.zuul.events;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Aranga on 9/04/2016.
 */
public class AppStartEventImpl implements ApplicationListener<ApplicationStartedEvent>
{

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event)
    {

    }
}
