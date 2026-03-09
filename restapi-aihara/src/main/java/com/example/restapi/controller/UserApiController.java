package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@Validated
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
    RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Integer id) {
        User user = userService.findById(id);
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());

        return ResponseEntity.ok(response);
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> searchUsers(
           @ModelAttribute @Valid UserRequest userRequest) {
       User user = new User (null, userRequest.getName(), userRequest.getEmail(), null, null);
        List<User> users = userService.searchUsers(user);
        List<UserResponse> userResponses = new ArrayList<>();
        for (User u : users) {
             UserResponse response = new UserResponse();
            response.setId(u.getId());
            response.setName(u.getName());
            response.setEmail(u.getEmail());
            userResponses.add(response);
        }
        return ResponseEntity.ok(userResponses);
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping("")
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());

        User createdUser = userService.createUser(user);

        UserResponse response = new UserResponse();
        response.setId(createdUser.getId());
        response.setName(createdUser.getName());
        response.setEmail(createdUser.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Integer id, @Valid @RequestBody UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());

        User updatedUser = userService.updateUser(id, user);

        UserResponse response = new UserResponse();
        response.setId(updatedUser.getId());
        response.setName(updatedUser.getName());
        response.setEmail(updatedUser.getEmail());

        return ResponseEntity.ok(response);
    }

}
