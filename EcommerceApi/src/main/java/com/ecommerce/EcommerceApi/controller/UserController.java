package com.ecommerce.EcommerceApi.controller;

import com.ecommerce.EcommerceApi.model.User;
import com.ecommerce.EcommerceApi.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/User")
    public ResponseEntity<String> saveUser(@RequestBody String requestUser){
        JSONObject json =new JSONObject(requestUser);
        List<String> validationList=validateUser(json);
        if(validateUser(json).isEmpty()){
            User user=setUser(json);
            userService.saveUser(user);
            return  new ResponseEntity<>("User saved", HttpStatus.CREATED);
        }else {
            String[] ans= Arrays.copyOf(
                    validationList.toArray(),validationList.size(),String[].class);
            return  new ResponseEntity<>("please pass mandatory these parameters-  "+Arrays.toString(ans),HttpStatus.BAD_REQUEST);

        }
    }

    private List<String> validateUser(JSONObject json) {
        List<String> errorList=new ArrayList<>();
        if(!json.has("userId")){
            errorList.add("userId");
        }
        return errorList;
    }
    public User setUser(JSONObject json){
        User user=new User();
        String userId=json.getString("userId");
        user.setUserId(Integer.valueOf(userId));

        String userName=json.getString("userName");
        user.setUserName(userName);

        String email=json.getString("email");
        user.setEmail(email);

        String  password=json.getString("password");
        user.setPassword(password);

        String phoneNumber=json.getString("phoneNumber");
        user.setPhoneNumber(phoneNumber);


        return user;
    }

}
