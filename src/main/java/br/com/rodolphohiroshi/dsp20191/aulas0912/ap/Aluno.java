package br.com.rodolphohiroshi.dsp20191.aulas0912.ap;

public class Aluno {

    private Long matricula;
    private String firstname;
    private String lastname;
    private String nickname;

    public Aluno() {
    }

    public Aluno(Long matricula, String firstname, String lastname, String nickname) {
        this.matricula = matricula;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}