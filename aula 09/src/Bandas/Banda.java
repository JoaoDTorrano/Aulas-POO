package Bandas;

public class Banda {
    String nome;
    String genero;
    Empresario emp = new Empresario("Roger Zakein", 123572028);
    Membro[] membros = new Membro[10];
    Musica[] musicas = new Musica[10];


    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void addMembro(Membro membro) {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = membro;
                break;
            }
        }
    }

    public void addMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                break;
            }
        }
    }

    public void mostrarInfo(){
        System.out.println("Empresario : " + emp.getNome());
        System.out.println("Genero : " + getGenero());
        System.out.println("Nome da banda : " + getNome());
        System.out.println("Membros da banda :");
        for(int i = 0; i < membros.length; i++){
            if(membros[i] != null){
                System.out.println(membros[i].getNome() + " função: " + membros[i].getFuncao());
            }
        }
        System.out.println("Discografia: ");
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null){
                System.out.println(musicas[i].getNome() + " Tempo: " + musicas[i].getDuracao() + " minutos");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Membro[] getMembros() {
        return membros;
    }

    public Musica[] getMusicas() {
        return musicas;
    }
}
