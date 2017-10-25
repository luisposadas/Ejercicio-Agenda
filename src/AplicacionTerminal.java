public class AplicacionTerminal {
    public static void main(String[] args)
    {
        Contacto c1 = new Contacto("Luis","UASLP",1414112111L);
        Contacto c2 = new Contacto("Juan","UASLP",1414131111L);
        Contacto c3 = new Contacto("PPe","UASLP",1414111111L);
        Agenda agenda = new Agenda();
        agenda.agregaContacto(c1);
        agenda.agregaContacto(c2);
        agenda.agregaContacto(c3);
        agenda.imprimeTodo();//regresaria la direccion de memoria hay que sobre escribir to string
    }



}

