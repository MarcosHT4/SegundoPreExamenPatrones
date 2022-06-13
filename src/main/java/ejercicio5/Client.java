package ejercicio5;

public class Client {

    public static void main(String[] args) {

        Git git = new Git();
        Repositorio repositorio = new Repositorio();

        repositorio.attach(new Desarrollador("Pepe"));
        repositorio.attach(new Desarrollador("Jose"));
        repositorio.attach(new Desarrollador("Dalas"));

        Codigo codigo;

        codigo = new Codigo("public static void...");

        git.setCodigo(codigo);
        repositorio.createCommit("Primer commit", git.createCommit());

        codigo = new Codigo("main(String[] args) {...");

        git.setCodigo(codigo);
        repositorio.createCommit("Segundo commit", git.createCommit());

        codigo = new Codigo("int x = 0...");

        git.setCodigo(codigo);
        repositorio.createCommit("Tercer commit", git.createCommit());

        codigo = new Codigo("System.out.println(x)");

        git.setCodigo(codigo);
        repositorio.createCommit("Cuarto commit", git.createCommit());

        codigo = new Codigo("} System.out.println(Terminado)");

        git.setCodigo(codigo);
        repositorio.createCommit("Quinto commit", git.createCommit());

        codigo.showInfo();

        codigo = git.restoreCommit(repositorio.getCommit("Primer commit"), repositorio);

        codigo.showInfo();

        repositorio.dettachAll();

        repositorio.attach(new Desarrollador("Ana"));
        repositorio.attach(new Desarrollador("Pole"));
        repositorio.attach(new Desarrollador("Sonic"));

        codigo = git.restoreCommit(repositorio.getCommit("Quinto commit"), repositorio);

        codigo.showInfo();

    }

}
