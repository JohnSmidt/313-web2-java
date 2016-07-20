/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchplays;

/**
 *
 * @author John
 */
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.jibble.pircbot.*;
public class TwitchBot extends PircBot {
    static { /* works fine! ! */
      System.setProperty("java.awt.headless", "false");
      System.out.println("is this working?");
      System.out.println(java.awt.GraphicsEnvironment.isHeadless());
      /* ---> prints true */
    }
    
    
    public TwitchBot() {
        this.setName("smidty");
    }
    
    public void onMessage(String channel, String sender, String login, String hostname, String message) {
        
        if(message.equalsIgnoreCase("up")) {
            try {
                
                Robot r = new Robot();
                System.setProperty("java.awt.headless", "false");
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
                System.setProperty("java.awt.headless", "false");
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
                System.setProperty("java.awt.headless", "false");
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
                System.setProperty("java.awt.headless", "false");
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
                System.setProperty("java.awt.headless", "false");
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
                System.setProperty("java.awt.headless", "false");
                r.keyPress(KeyEvent.VK_X);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_X);
                
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            
            
        }
        
        if (message.equalsIgnoreCase("spinslash")) {
				try {
                                    System.setProperty("java.awt.headless", "false");
                                    Robot r = new Robot();
					// Up, then attack
					r.keyPress(KeyEvent.VK_UP);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_UP);
					r.keyPress(KeyEvent.VK_Z);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_Z);
					// Right, then attack
					r.keyPress(KeyEvent.VK_RIGHT);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_RIGHT);
					r.keyPress(KeyEvent.VK_Z);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_Z);
					// Down, then attack
					r.keyPress(KeyEvent.VK_DOWN);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_DOWN);
					r.keyPress(KeyEvent.VK_Z);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_Z);
					// Left, then attack
					r.keyPress(KeyEvent.VK_LEFT);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_LEFT);
					r.keyPress(KeyEvent.VK_Z);
					r.delay(200);
					r.keyRelease(KeyEvent.VK_Z);
					// Back to facing up
					r.keyPress(KeyEvent.VK_UP);
					r.delay(100);
					r.keyRelease(KeyEvent.VK_UP);
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
