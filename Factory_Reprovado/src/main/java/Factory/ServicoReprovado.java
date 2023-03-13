package Factory;

public class ServicoReprovado implements IServico {

    public String executar() {
        return "Reprovado por Classificao";
    }

    public String cancelar() {
        return "Reprovado por Kill";
    }
}
