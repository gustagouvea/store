package com.example.springproject.model.response;

import com.example.springproject.entity.Cart;
import com.example.springproject.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private String name;
    private String email;
    private String login;
    private Cart cart;

    public UserResponseDTO(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.login = user.getLogin();
        this.cart = user.getCart();
    }
}
