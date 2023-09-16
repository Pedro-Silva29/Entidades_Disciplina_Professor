package Entidades;

public class Disciplina {

    //classe Professor deve ser criada antes da Displina. Porque cada Disciplina depende de um Professor.

    private int id;
    private String nome;
    private String ementa;
    private Professor professor;  //Não é para instanciar aqui!


    public Disciplina(int id, String nome, String ementa, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.ementa = ementa;
        this.professor = professor;
    }


    public Disciplina(int id, String nome, String ementa) {
        this.id = id;
        this.nome = nome;
        this.ementa = ementa;
        this.professor = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
