package App;

import Entidades.Disciplina;
import Entidades.Professor;

public class Main {

    public static void main(String[] args) {
        Professor p1 = new Professor(0,"Iago","123");

        Disciplina d1 = new Disciplina(0,"POO","OK",p1);

        Disciplina d2 = new Disciplina(1,"Libras","Ensinar a linguagem br de sinais");

        Disciplina d3 = new Disciplina(2,"APS","OK!",)

        System.out.println(d1.getNome());
        System.out.println(d1.getEmenta());

        System.out.println(d1.getProfessor().getNome());

        System.out.println(d2.getNome());
    }
}
