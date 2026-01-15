import java.util.Random;

public class Luta {
    //atributes
    private Lutador desafiado; //abstract type data
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //methods
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1.getNome() != l2.getNome()){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(this.isAprovada()){
            desafiante.apresentar();
            desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0: //empate
                    System.out.println("empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: //desafiado vence
                    System.out.println("o Lutador "+ desafiado.getNome() + " venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiante vence
                    System.out.println("o Lutador "+ desafiante.getNome() + " venceu");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

            }
        }else{
            System.out.println("Luta não aprovada");
        }
    }

    //getters and setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
