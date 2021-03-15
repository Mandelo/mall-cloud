package com.luoxiao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private  Long id;
    private String username;
    private String password;
    private Integer status;
    private List<String> roles;

}
