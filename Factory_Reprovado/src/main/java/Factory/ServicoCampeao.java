package Factory;

public class ServicoCampeao implements IServico {

    public String executar() {
        return "Campeao Encontrado";
    }

    public String cancelar() {
        return "Campeao não Encontrado";
    }
}