package impl;

import dao.AuthorityRepository;
import domain.security.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("MyUserDetailsService")
public class AuthorityServiceImpl implements UserDetailsService {
    private final AuthorityRepository authorityRepository;

    @Autowired
    public AuthorityServiceImpl(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SystemUser user = authorityRepository.findSystemUserByUserName(userName);
        if(user == null){
            throw new UsernameNotFoundException("用户：" + userName + "不存在");
        }
        return user;
    }
}
