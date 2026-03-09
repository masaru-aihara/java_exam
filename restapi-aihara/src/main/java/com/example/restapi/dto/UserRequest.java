package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {
    @NotBlank(message = "名前を入力してください")
    private String name;
    @Email(message = "有効なメールアドレスを入力してください")
    @NotBlank(message = "メールアドレスを入力してください")
    private String email;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "UserRequest [name=" + name + ", email=" + email + "]";
    }

    
}
