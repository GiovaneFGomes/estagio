package br.com.apresentacoes.sprint01.enumerator.outsideofclass;

public enum Turno {

    MANHA("Manhã."),
    TARDE("Tarde."),
    NOITE("Noite.");

    private final String descricao;

    Turno(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
