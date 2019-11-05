package com.wltcloud.mybatis.service;

import com.wltcloud.mybatis.entity.Person;
import com.wltcloud.mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public void insert(Person person){
        personMapper.insert(person);
    }
    public void updateByPrimaryKey(Person person){
        personMapper.updateByPrimaryKey(person);
    }
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }
    public List<Person> selectByPerson(Person person){
        return personMapper.select(person);
    }
    public void deleteById(Person person){
        personMapper.deleteByPrimaryKey(person.getId());
    }
}
