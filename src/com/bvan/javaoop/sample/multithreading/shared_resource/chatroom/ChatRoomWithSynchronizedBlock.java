package com.bvan.javaoop.sample.multithreading.shared_resource.chatroom;

import com.bvan.javaoop.sample.multithreading.annotations.GuardedBy;
import com.bvan.javaoop.sample.multithreading.annotations.ThreadSafe;

/**
 * @author bvanchuhov
 */
@ThreadSafe
public class ChatRoomWithSynchronizedBlock implements ChatRoom {

    @GuardedBy("this")
    private final StringBuilder room = new StringBuilder(); // unsafe resource

    @Override
    public void send(String message) {
        synchronized (room) {
            room.append(message + "\n"); // ok
        }
    }

    @Override
    public String getContent() {
        synchronized (room) {
            return room.toString(); // ok
        }
    }
}
