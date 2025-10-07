public class PlanoDeSaude {
    private String nome;
    private double desconto;
    private String descricao;

    public PlanoDeSaude(String nome, double desconto,String descricao){
        this.nome = nome;
        this.desconto = desconto;
        this.descricao = descricao;

    }


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getDesconto() {
    return desconto;
}

public void setDesconto(double desconto) {
    this.desconto = desconto;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}


public void cadastrarPlano() {
        System.out.println("Plano " + getNome() + " cadastrado com sucesso.");
    }

    public double aplicarDesconto(double valor) {
        return valor - (valor * getDesconto());
    }

    public boolean podeTerInternacaoEspecial() {
        return getDesconto() > 0.3;
    }

    @Override
    public String toString() {
        return "\n Plano De Saude" +
                "\n Nome: " + getNome() + 
                "\n Desconto Base: " + getDesconto() +
                "\n Descrição: " + getDescricao();
    }
    
}