#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ${package}.dao.IUsuarioDAO;
import ${package}.domain.Usuario;

@Repository
public class UsuarioDAOImpl extends AbstractBaseGenericDAOImpl<Usuario, Long> implements IUsuarioDAO{

	private static final long serialVersionUID = 7781154947735130926L;

	@Override
	public Usuario findByCodigo(String username) {
		TypedQuery<Usuario> query=em.createNamedQuery(Usuario.QUERY_GETBYUSERNAME, Usuario.class);
		query.setParameter(1, username);
		return query.getSingleResult();
	}

	@Override
	public int getTotal() {
		TypedQuery<Long> query=em.createNamedQuery(Usuario.QUERY_GETTOTAL, Long.class);
		return query.getSingleResult().intValue();
	}

	@Override
	public List<Usuario> getAll(Integer inicio, Integer total) {
		TypedQuery<Usuario> query=em.createNamedQuery(Usuario.QUERY_GETALL, Usuario.class);
		if(inicio!=null && total!=null){
			query.setFirstResult(inicio);
			query.setMaxResults(total);
		}
		return query.getResultList();
	}

	@Override
	public int getTotalFilter(Usuario u) {
		TypedQuery<Long> query=em.createNamedQuery(Usuario.QUERY_GETTOTALBYUSERNAME, Long.class);
		query.setParameter(1, u.getUsername());
		return query.getSingleResult().intValue();
	}

	@Override
	public List<Usuario> getAllFilter(Usuario u, Integer inicio, Integer total) {
		TypedQuery<Usuario> query=em.createNamedQuery(Usuario.QUERY_GETBYUSERNAME, Usuario.class);
		if(inicio!=null && total!=null){
			query.setFirstResult(inicio);
			query.setMaxResults(total);
		}
		query.setParameter(1, u.getUsername());
		return query.getResultList();
	}

	
}
