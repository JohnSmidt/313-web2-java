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
public class Main {
    public static void main(String[] args) throws Exception {
        
        TwitchBot bot = new TwitchBot();
        bot.setVerbose(true);
        bot.connect("irc.twitch.tv", 6667, "oauth:eb1s0ermd2lrkgznvkucxik2nef4d0"); // Dont Steal this please!!!
        bot.joinChannel("#smidty");
        
    }
}
