package com.wltcloud.oauth2.config.service;

import com.wltcloud.oauth2.entity.TbPermission;
import com.wltcloud.oauth2.entity.TbUser;
import com.wltcloud.oauth2.service.TbUserService;
import com.wltcloud.oauth2.service.TbPermissionService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserDetailesServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUserName(username);

        List<GrantedAuthority> grantedAuthoritys = Lists.newArrayList();

        if(tbUser!=null){
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission->{
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthoritys.add(grantedAuthority);
            });

        }
        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthoritys);
    }
}
