package com.bvan.javaoop.sample.multithreading.shared_resource.chatroom;

/**
 * @author bvanchuhov
 */
public interface ChatRoom {
    void send(String message);
    String getContent();
}
