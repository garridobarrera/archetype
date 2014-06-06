#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.io.Serializable;

public interface IBaseGenericDAO<T, K extends Serializable> {
	T create(T entity);

    T update(T entity);

    void delete(T entity);

    T findById(K key);
    
    T getReference(K key);
}
