package inscricao.faces.entity;

import java.util.Date;

/**
 *
 * @author a743062
 */
public class UsuarioLogado {
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private Date dataLogin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLogin() {
        return dataLogin;
    }

    public void setDataLogin(Date dataLogin) {
        this.dataLogin = dataLogin;
    }
}
