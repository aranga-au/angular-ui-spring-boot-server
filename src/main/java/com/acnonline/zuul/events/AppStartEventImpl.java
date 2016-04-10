package com.acnonline.zuul.events;

import org.apache.http.util.NetUtils;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.util.SocketUtils;
import sun.net.util.IPAddressUtil;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * give new unique id for application instance
 * (multiple app instance available in high avail environment)
 * Created by Aranga on 9/04/2016.
 */

public class AppStartEventImpl implements ApplicationListener<ApplicationStartedEvent>
{

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event)
    {
        System.setProperty("app.unique.id", "I-"+UUID.randomUUID().toString().substring(0,8));
        System.setProperty("app.selected.port", String.valueOf(SocketUtils.findAvailableTcpPort(6200,6500)));
        String ipAddr = "127.0.0.1";
        try
        {
            ipAddr = InetAddress.getLocalHost().getHostAddress();

        } catch (Exception e) {
            e.printStackTrace();
        }
        final String ip = ipAddr.replaceAll("\\.","-");
        System.setProperty("app.ipaddr",ipAddr);
    }
}
