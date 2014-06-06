#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.io.Serializable;
import java.util.List;

import ${package}.dao.IUsuarioDAO;
import ${package}.domain.Usuario;
import ${package}.exception.BusinessException;

public interface IUsuarioService extends Serializable{

	public void setDao(IUsuarioDAO dao);
	public Usuario crear(Usuario u) throws BusinessException;
	public Usuario actualizar(Usuario u);
	public void borrar(Usuario u);
	public Usuario get(Long id);
	public Usuario get(String username) throws BusinessException;
	public int getSizeAll();
	public List<Usuario> getAll(Integer inicio,Integer total);
	public List<Usuario> getAll();
	public int getTotalFilter(Usuario u);
	public List<Usuario> getAllFilter(Usuario u, Integer inicio, Integer total);
}
