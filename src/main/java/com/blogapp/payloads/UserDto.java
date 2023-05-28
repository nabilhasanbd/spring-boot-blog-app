package com.blogapp.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    //we will use only those entity which data we want to transfer
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;

}
