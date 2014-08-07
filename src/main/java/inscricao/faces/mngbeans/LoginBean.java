package inscricao.faces.mngbeans;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utfpr.faces.support.PageBean;
import inscricao.faces.entity.UsuarioLogado;

/**
 *
 * @author a743062
 */
@ManagedBean
@SessionScoped
public class LoginBean extends PageBean implements Serializable 
{
    private ListaUsuariosLogados listaUsuariosLogados = (ListaUsuariosLogados) getBean("listaUsuariosLogados");
    private static final long serialVersionUID = 1L;
    private String login;
    private String senha;
    private boolean administrador = false;
    private boolean logado = true;
   
    public String getLogin() 
    {
        return login;
    }

    public void setLogin(String login) 
    {
        this.login = login;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public boolean isLogado() 
    {
        return logado;
    }

    public void setLogado(boolean logado) 
    {
        this.logado = logado;
    }

    public boolean isAdministrador()
    {
        return administrador;
    }

    public void setAdministrador(boolean administrador) 
    {
        this.administrador = administrador;
    }

    public String realizarLogin() 
    {
        if (login.equals(senha)) 
        {
            this.logado = true;
            UsuarioLogado u = new UsuarioLogado();
            u.setNome(login);
            u.setDataLogin(new Date());
            listaUsuariosLogados.adicionarUsuario(u);
            if (administrador) 
            {
                return "admin";
            } else 
            {
                return "cadastro";
            }
            
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Login não obteve sucesso"));
        this.logado = false;
        return null;
    }
}
