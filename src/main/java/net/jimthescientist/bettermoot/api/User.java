package net.jimthescientist.bettermoot.api;

import net.jimthescientist.bettermoot.Main;

public class User {
    public String sessionToken;

    public User(){
        Main.debugInfo("Creating User...");
    }
    public void setUserToken(String sessionToken){
        this.sessionToken = sessionToken;
    }
}
