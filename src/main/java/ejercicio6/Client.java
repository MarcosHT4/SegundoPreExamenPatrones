package ejercicio6;

public class Client {

    public static void main(String [] args) {

        SalaChatIndividual salaChatIndividual = new SalaChatIndividual();
        SalaChatGrupal salaChatGrupal = new SalaChatGrupal();

        DesarrolladorSala desarrollador1 = new DesarrolladorSala(salaChatIndividual);
        DesarrolladorSala desarrollador2 = new DesarrolladorSala(salaChatIndividual);

        salaChatIndividual.addDesarrolador(desarrollador1).addDesarrolador(desarrollador2);

        desarrollador1.setNombre("Dalas").setIdDev("345830958");
        desarrollador2.setNombre("Javi").setIdDev("934509324");

        desarrollador1.setDesarrolladorAmigo(desarrollador2);

        desarrollador1.send("Realizando pull request...");

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        DesarrolladorSala desarrollador3 = new DesarrolladorSala(salaChatGrupal);
        DesarrolladorSala desarrollador4 = new DesarrolladorSala(salaChatGrupal);
        DesarrolladorSala desarrollador5 = new DesarrolladorSala(salaChatGrupal);
        DesarrolladorSala desarrollador6 = new DesarrolladorSala(salaChatGrupal);
        DesarrolladorSala desarrollador7 = new DesarrolladorSala(salaChatGrupal);
        DesarrolladorSala desarrollador8 = new DesarrolladorSala(salaChatGrupal);

        desarrollador3.setNombre("Jaime").setIdDev("4534343");
        desarrollador4.setNombre("Pol").setIdDev("54824243");
        desarrollador5.setNombre("Argos").setIdDev("0215486");
        desarrollador6.setNombre("Yousef").setIdDev("84241834");
        desarrollador7.setNombre("Wismichu").setIdDev("21848765");
        desarrollador8.setNombre("Nauter").setIdDev("884254535");

        salaChatGrupal.addDesarrolador(desarrollador3)
                .addDesarrolador(desarrollador4).addDesarrolador(desarrollador5).addDesarrolador(desarrollador6)
                .addDesarrolador(desarrollador7).addDesarrolador(desarrollador8);


        desarrollador4.send("Backlog actualizado...");











    }

}
