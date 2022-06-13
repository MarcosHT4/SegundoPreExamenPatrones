package ejercicio5;

public class Git {

    private Codigo codigo;

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public Commit createCommit() {

        return new Commit(codigo);

    }

    public Codigo restoreCommit(Commit commit, IRepositorio repositorio) {

        System.out.println("*****RESTAURANDO COMMIT");

        this.codigo = commit.getCodigo();
        repositorio.notifyDesarrolladores(commit);
        return this.codigo;

    }
}
