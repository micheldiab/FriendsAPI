package com.michel.friendsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin//to enable external like angular
public class FriendController {

    @Autowired
    private FriendService service;
    @GetMapping("/friends")

    public List<Friend> getFriends()
    {
        return service.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(@RequestBody Friend friend)
    {
        service.addFriend(friend);
    }
    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Integer id,@RequestBody Friend friend)
    {
service.updateFriend(friend);
    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriend(@PathVariable("id") Integer id)
    {
service.deleteFriend(id);
    }
}
