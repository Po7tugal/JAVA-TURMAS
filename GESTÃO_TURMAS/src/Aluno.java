import java.util.Calendar;

public class Aluno {
    private String codigo;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento; 
    private Turma turmaAluno = new Turma();
    int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
    
    public Aluno() {
        this.codigo = "";
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.turmaAluno = null;
    }  
    
    public Aluno(String codigo, String nomeProprio, String nomeApelido, int anoNascimento, Turma turmaAluno) {
        this.codigo = codigo;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turmaAluno = turmaAluno;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public Turma getTurmaAluno() {
        return turmaAluno;
    }
    public void setTurmaAluno(Turma turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turmaAluno=" + turmaAluno + "]";
    } 

    public String getNomeCompleto() {
        return nomeProprio + " " + nomeApelido;
    }

    public int getIdade() {
        return (anoAtual - anoNascimento);
    }
}
