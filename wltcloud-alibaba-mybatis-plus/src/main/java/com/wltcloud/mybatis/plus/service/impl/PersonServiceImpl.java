package com.wltcloud.mybatis.plus.service.impl;

import com.wltcloud.mybatis.plus.entity.Person;
import com.wltcloud.mybatis.plus.mapper.PersonMapper;
import com.wltcloud.mybatis.plus.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wulitian
 * @since 2019-11-05
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
