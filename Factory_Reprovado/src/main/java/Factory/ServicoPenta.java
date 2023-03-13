package Factory;

public class ServicoPenta implements IServico {

    public String executar() {
        return "PentaKill";
    }

    public String cancelar() {
        return "Falhou PentaKill";
    }
}