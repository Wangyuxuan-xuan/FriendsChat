package com.example.friendschat.messages;

public class MessagesList {

    private String email , username , password;

    private int unseenMessages;

    public MessagesList(String email, String username, String password, int unseenMessages) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.unseenMessages = unseenMessages;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUnseenMessages() {
        return unseenMessages;
    }
}
