package com.bvan.javaoop.sample.multithreading.shared_resource.chatroom;

import com.bvan.javaoop.sample.multithreading.annotations.ThreadSafe;

/**
 * @author bvanchuhov
 */
@ThreadSafe
public class ChatRoomWithSafeResource implements ChatRoom {

    private final StringBuffer room = new StringBuffer(); // safe resource

    @Override
    public void send(String message) {
        room.append(message + "\n"); // ok
    }

    @Override
    public String getContent() {
        return room.toString(); // ok
    }
}
