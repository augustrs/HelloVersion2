package com.example.helloversion2.repositories;

import com.example.helloversion2.models.Message;

import java.util.ArrayList;
import java.util.List;

public class messageRepository {

    List<Message> messageList = new ArrayList<>(List.of(new Message(1, "hello"), new Message(2, "hej")));

public Message getMessage(int id) {

}
}
