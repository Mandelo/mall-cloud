package com.luoxiao.service;

import cn.hutool.core.collection.CollUtil;
import com.luoxiao.dto.SecurityUser;
import com.luoxiao.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: luox
 * @date： 2021/3/15
 */
@Service
public class UserServiceImpl implements UserDetailsService {

    private List<UserDTO> userList;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void initData() {
        String password = passwordEncoder.encode("123456");
        userList = new ArrayList<UserDTO>();
        userList.add(new UserDTO(1L, "macro", password, 1, CollUtil.toList("ADMIN")));
        userList.add(new UserDTO(2L, "andy", password, 1, CollUtil.toList("TEST")));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<UserDTO> findUserList = userList.stream().filter(item -> item.getUsername().equals(username)).collect(Collectors.toList());
        if (CollUtil.isEmpty(findUserList)) {
            throw new UsernameNotFoundException("密码错误");
        }
        SecurityUser securityUser = new SecurityUser(findUserList.get(0));
        if (!securityUser.isEnabled()) {
            throw new DisabledException("123");
        } else if (!securityUser.isAccountNonLocked()) {
            throw new LockedException("2222");
        } else if (!securityUser.isAccountNonExpired()) {
            throw new AccountExpiredException("232323");
        } else if (!securityUser.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("1232132323");
        }
        return securityUser;
    }

}
