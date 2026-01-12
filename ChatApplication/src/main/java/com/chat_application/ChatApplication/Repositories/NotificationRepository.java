package com.chat_application.ChatApplication.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat_application.ChatApplication.Entities.Notification;
import com.chat_application.ChatApplication.Entities.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    List<Notification> findAllByReceptUser(User user);
}
