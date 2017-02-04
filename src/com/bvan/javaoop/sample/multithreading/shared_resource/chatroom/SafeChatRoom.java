package com.bvan.javaoop.sample.multithreading.shared_resource.chatroom;

import com.bvan.javaoop.sample.multithreading.annotations.GuardedBy;
import com.bvan.javaoop.sample.multithreading.annotations.ThreadSafe;

/**
 * @author bvanchuhov
 */
@ThreadSafe
public class SafeChatRoom implements ChatRoom {

    @GuardedBy("SafeChatRoom.this")
    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public synchronized void send(String message) {
        room.append(message + "\n"); // ok
    }

    @Override
    public synchronized String getContent() {
        return room.toString(); // ok
    }
}
