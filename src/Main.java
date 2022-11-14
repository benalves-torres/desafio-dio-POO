import br.com.dio.desafio.dominio.*;

import javax.xml.transform.stream.StreamSource;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBen = new Dev();
        devBen.setNome("Ben");
        devBen.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ben" + devBen.getConteudoInscritos());
        devBen.progredir();
        System.out.println("Conteúdos concluídos Ben" + devBen.getConteudoConcluidos());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos concluídos João" + devJoao.getConteudoConcluidos());


    }

}