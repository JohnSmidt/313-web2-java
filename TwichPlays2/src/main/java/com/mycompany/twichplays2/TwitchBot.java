/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twichplays2;

/**
 *
 * @author John
 */
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.jibble.pircbot.*;
public class TwitchBot extends PircBot {
    
    public TwitchBot() {
        this.setName("smidty");
    }
    
    public void onMessage(String channel, String sender, String login, String hostname, String message) {
        
        if(message.equalsIgnoreCase("up")) {
            try {
                
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_UP);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_UP);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        
        if(message.equalsIgnoreCase("down")) {
            try {
                
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_DOWN);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        
        if(message.equalsIgnoreCase("left")) {
            try {
                
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_LEFT);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_LEFT);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
        
        if(message.equalsIgnoreCase("right")) {
            try {
                
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_RIGHT);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_RIGHT);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
        
        if(message.equalsIgnoreCase("a")) {
            try {
                
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_Z);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_Z);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
        
        if(message.equalsIgnoreCase("b")) {
            try {
                
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_X);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_X);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
        
        if(message.equalsIgnoreCase("hello")) {
            try {
                sendMessage(channel, "hello yourself");
//                Robot r = new Robot();
//                r.keyPress(KeyEvent.VK_UP);
//                r.delay(100);
//                r.keyRelease(KeyEvent.VK_UP);
                
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
        
    }
}
