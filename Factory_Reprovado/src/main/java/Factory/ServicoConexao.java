package Factory;

public class ServicoConexao implements IServico {

    public String executar() {
        return "Conexao Boa";
    }

    public String cancelar() {
        return "Conexao Ruim";
    }
}
