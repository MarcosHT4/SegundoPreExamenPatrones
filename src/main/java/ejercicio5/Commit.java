package ejercicio5;

import java.util.Random;

public class Commit {

    private Codigo state;
    private String commitID;

    public Commit(Codigo codigo) {

        state = codigo;
        commitID = new Random().ints(48, 123).filter( x -> (x <= 57 || x>=65) && (x<=90 || x >=97))
                .limit(15).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

    }

    public String getCommitID() {
        return commitID;
    }

    public void setCommitID(String commitID) {
        this.commitID = commitID;
    }

    public Codigo getCodigo() {

        return state;

    }

}
