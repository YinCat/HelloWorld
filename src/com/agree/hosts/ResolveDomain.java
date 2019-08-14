package com.agree.hosts;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;

public class ResolveDomain {
    
    private Logger log = Logger.getLogger(ResolveDomain.class);
    
    public static void main(String[] args) throws UnknownHostException {  
        ResolveDomain rd = new ResolveDomain();
        rd.resolveDomain("www.baidu.com", "114.114.114.114", new ConcurrentLinkedQueue<String>());
    }
    
    public void resolveDomain(String domain, String DNS, ConcurrentLinkedQueue<String> queue){
        System.setProperty("sun.net.spi.nameservice.provider.1", "dns,sun");
        System.setProperty("sun.net.spi.nameservice.nameservers", DNS);
        InetAddress[] addresses;
        try {
            addresses = InetAddress.getAllByName(domain);    //IP or domain
            for (int i = 0; i < addresses.length; i++) {
                String ip = addresses[i].getHostAddress();
                log.info(DNS + "\t" + domain + "\t" + ip);
                System.out.println(DNS + "\t" + domain + "\t" + ip);
                queue.add(DNS + "\t" + domain + "\t" + ip);
            } 
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
    }
}