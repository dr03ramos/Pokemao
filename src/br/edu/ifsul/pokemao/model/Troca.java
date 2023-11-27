package br.edu.ifsul.pokemao.model;

public class Troca extends Acontecimento {
    private PokemaoTreinador pokemaoOfertado;
    private PokemaoTreinador pokemaoResposta;

    public Troca(PokemaoTreinador pokemaoOfertado, PokemaoTreinador pokemaoResposta) {
        super(pokemaoOfertado.getTreinador(), pokemaoResposta.getTreinador());
        this.pokemaoOfertado = pokemaoOfertado;
        this.pokemaoResposta = pokemaoResposta;
    }

    public PokemaoTreinador getPokemaoOfertado() {
        return pokemaoOfertado;
    }

    public void setPokemaoOfertado(PokemaoTreinador pokemaoOfertado) {
        this.pokemaoOfertado = pokemaoOfertado;
    }

    public PokemaoTreinador getPokemaoResposta() {
        return pokemaoResposta;
    }

    public void setPokemaoResposta(PokemaoTreinador pokemaoResposta) {
        this.pokemaoResposta = pokemaoResposta;
    }
    
}