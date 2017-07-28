package com.javayou13131.javarep.dao;

import java.util.List;

public interface BaseMapper<T,Q> {

    int updateByOptimisticLock(T entity);

    int updateByPrimaryKey(T entity);

    T findByPrimaryKey(Long id);

    List<T> findList(T entity);

    long countByQuery(Q query);

    int deleteByQuery(Q query);

    List<T> selectByQuery(Q query);

    int updateByQuerySelective(T entity, Q query);

    List<T> findListBySelectiveList(List<T> entityList);

    T selectOneByQuery(Q query);

    T selectOneBySelective(T entity);

}