public class App {
    public static void main(String[] args) throws Exception {

        Professor prof1 = new Professor();
        prof1.setNomeProprio("Luis");
        prof1.setNomeApelido("Santos");

        Turma turmaProg = new Turma();
        turmaProg.setCodigo("p131x24");
        turmaProg.setNomeCurso("Programação");
        turmaProg.setAnoInicio(2025);
        turmaProg.setAnoFim(2026);
        
        Aluno al1 = new Aluno();
        al1.setCodigo("a14812");
        al1.setNomeProprio("Filipe");
        al1.setNomeApelido("Portugal");
        al1.setAnoNascimento(2010);
        al1.setTurmaAluno(turmaProg);

        Aluno al2 = new Aluno();
        al2.setCodigo("a14794");
        al2.setNomeProprio("Davi");
        al2.setNomeApelido("Marques");
        al2.setAnoNascimento(2010);
        al2.setTurmaAluno(turmaProg);

        Aluno al3 = new Aluno();
        al3.setCodigo("a14859");
        al3.setNomeProprio("Tiago");
        al3.setNomeApelido("Dias");
        al3.setAnoNascimento(2010);
        al3.setTurmaAluno(turmaProg);

        System.out.println("************ TURMA ************\n");
        System.out.println(turmaProg.getInfoTurma());

        System.out.println("\n****** Professor ******\n");
        System.out.print("-> Professor : ");
        System.out.println(prof1.getNomeCompleto());

        System.out.println("\n****** ALUNOS ******");

        System.out.print("\n-> Nome completo : ");
        System.out.println(al1.getNomeCompleto());

        System.out.print("-> O aluno tem ");
        System.out.print(al1.getIdade());
        System.out.println(" Anos");

        System.out.print("\n-> Nome completo : ");
        System.out.println(al2.getNomeCompleto());

        System.out.print("-> O aluno tem ");
        System.out.print(al2.getIdade());
        System.out.println(" Anos");

        System.out.print("\n-> Nome completo : ");
        System.out.println(al3.getNomeCompleto());

        System.out.print("-> O aluno tem ");
        System.out.print(al3.getIdade());
        System.out.println(" Anos");
    }
}
