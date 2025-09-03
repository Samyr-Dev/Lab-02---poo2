package Principal.Ex3;

public class Livro {
    public String titulo;
    private String autor;
    protected double preco;
    int paginas;

    public Livro(String titulo, String autor, double preco, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
    }

    public void detalhesDoLivro(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.preco);
        System.out.println(this.paginas);
    }
}
