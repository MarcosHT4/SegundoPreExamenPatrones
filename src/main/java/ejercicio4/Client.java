package ejercicio4;

public class Client {

    public static void main(String[] args) {

        CanalWhatsappComunicacionIndividual canalWhatsappComunicacionIndividual = new CanalWhatsappComunicacionIndividual();
        CanalWhatsappComunicacionGrupal canalWhatsappComunicacionGrupal = new CanalWhatsappComunicacionGrupal();

        PersonaChat persona1 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona2 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona3 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona4 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona5 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona6 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona7 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona8 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona9 = new PersonaChat(canalWhatsappComunicacionIndividual);
        PersonaChat persona10 = new PersonaChat(canalWhatsappComunicacionIndividual);

        persona1.setCi("345234").setNombre("Dalas");
        persona2.setCi("269593").setNombre("Javi");
        persona3.setCi("893483").setNombre("Nauter");
        persona4.setCi("846534").setNombre("Lada");
        persona5.setCi("84234153").setNombre("Shur");
        persona6.setCi("8432183").setNombre("Antonio");
        persona7.setCi("2185486").setNombre("Pole");
        persona8.setCi("82186384").setNombre("Jose");
        persona9.setCi("1218756").setNombre("Yousef");
        persona10.setCi("845435").setNombre("Pedro");

        canalWhatsappComunicacionIndividual.addPersonaChat(persona1)
                        .addPersonaChat(persona2)
                                .addPersonaChat(persona3).addPersonaChat(persona4)
                        .addPersonaChat(persona5).addPersonaChat(persona6)
                        .addPersonaChat(persona7).addPersonaChat(persona8)
                        .addPersonaChat(persona9)
                                .addPersonaChat(persona10);

        persona1.addRemitentesDeseados(persona2);

        persona1.send("Esto es para la persona2");

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");


        persona1.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona2.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona3.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona4.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona5.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona6.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona7.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona8.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona9.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);
        persona10.setiCanalWhatsapp(canalWhatsappComunicacionGrupal);

        canalWhatsappComunicacionGrupal.addPersonaChat(persona1)
                .addPersonaChat(persona2)
                .addPersonaChat(persona3).addPersonaChat(persona4)
                .addPersonaChat(persona5).addPersonaChat(persona6)
                .addPersonaChat(persona7).addPersonaChat(persona8)
                .addPersonaChat(persona9)
                .addPersonaChat(persona10);

        persona10.addRemitentesDeseados(persona1).addRemitentesDeseados(persona2).addRemitentesDeseados(persona3).addRemitentesDeseados(persona4).addRemitentesDeseados(persona5)
                .addRemitentesDeseados(persona6).addRemitentesDeseados(persona7).addRemitentesDeseados(persona8)
                .addRemitentesDeseados(persona9);



        persona10.send("Mensaje para todos mis colegas");





















    }

}
