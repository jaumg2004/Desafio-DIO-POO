package org.example;

import java.time.LocalDate;
public class Formacao {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso C#");
        curso2.setDescricao("descricao curso C#");
        curso2.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de C#");
        mentoria.setDescricao("descricao mentoria C#");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


        System.out.println("---------------");

        Dev devRenzo = new Dev();
        devRenzo.setNome("Renzo");
        devRenzo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renzo" + devRenzo.getConteudosInscritos());
        devRenzo.progredir();
        devRenzo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Renzo" + devRenzo.getConteudosInscritos());
        System.out.println("Conteúdos Cocluidos Renzo" + devRenzo.getConteudosConcluidos());
        System.out.println("XP: " + devRenzo.calcularTotalXp());

    }
}