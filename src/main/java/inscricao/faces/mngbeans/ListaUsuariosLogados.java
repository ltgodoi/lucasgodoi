package inscricao.faces.mngbeans;

import java.util.List;
import java.util.Vector;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import inscricao.faces.entity.UsuarioLogado;

/**
 *
 * @author a743062
 */
@ManagedBean
@ApplicationScoped
public class ListaUsuariosLogados 
{
    private static final long serialVersionUID = 1L;
    private List<UsuarioLogado> lista = new Vector<>();
    private DataModel<UsuarioLogado> listaDM = new ListDataModel<>(lista);
    
    public List<UsuarioLogado> getLista() 
    {
        return lista;
    }

    public void setLista(List<UsuarioLogado> lista) {
        this.lista = lista;
    }

    public DataModel<UsuarioLogado> getListaDM() {
        return listaDM;
    }

    public void setListaDM(DataModel<UsuarioLogado> listaDM) {
        this.listaDM = listaDM;
    }

    public void adicionarUsuario(UsuarioLogado usuario) {
        this.lista.add(usuario);
    }
    
}
