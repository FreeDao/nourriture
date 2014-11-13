package edu.bjtu.nourriture_web.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.bjtu.nourriture_web.bean.Flavour;
import edu.bjtu.nourriture_web.idao.IFlavourDao;

public class FlavourDao extends HibernateDaoSupport implements IFlavourDao {

	public Flavour getById(int id) {
		Flavour f = getHibernateTemplate().get(Flavour.class, id);
		return f;
	} /** 查看定級分類?*/
	
	public int add(Flavour  flavour) {
		getHibernateTemplate().save(flavour);
		return flavour.getId(); /**增加口味*/
	}
	public void update(Flavour flavour) {
		getHibernateTemplate().saveOrUpdate(flavour);
	}/**更新口味*/
	/** check if the flavour is exsit **/
	public boolean isFlavourExist(int flavourId){
		List<Flavour> list = getHibernateTemplate().find("from Flavour where id = ?", flavourId);
		return !list.isEmpty();
	}

}
