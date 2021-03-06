package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.MaritalStatus;
import com.websystique.springmvc.model.Skill;
import com.websystique.springmvc.utils.Utils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


@Repository("SkillDao")
public class SkillDaoImpl extends AbstractDao<Integer, Skill> implements SkillDao {


    public List<Skill> allSkills(){
        String u = new Utils("SkillsDaoImpl", "allSkills").toString();
        Criteria criteria = createEntityCriteria();
        List<Skill> skills = (List<Skill>) criteria.list();
        return  skills;
    }

    @Override
    public Skill findById(Integer id) {
        String u = new Utils("SkillsDaoImpl", "findById").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("skillId", id));
        return (Skill) criteria.uniqueResult();
    }

    @Override
    public Skill findByName(String name){
        String u = new Utils("SkillsDaoImpl", "findByName").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("name", name));
        return (Skill) criteria.uniqueResult();
    }


}