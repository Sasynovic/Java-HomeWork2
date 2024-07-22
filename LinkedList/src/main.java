public class main {
    public static void main(String[] args) {

        int x = 7;
        int y = 4;
        int z = 12;

        Lista linkedList = new Lista();

        linkedList.metodoInserimento(x);
        linkedList.metodoInserimento(y);
        linkedList.metodoInserimento(z);
        linkedList.metodoInserimento(x);
        linkedList.metodoInserimento(x);

        linkedList.stampaDellaLista();

        System.out.println("");

        if(linkedList.isEmpty()){
            System.out.println("E' vuota");
        }else{
            System.out.println("Non e' vuota");
        }

        linkedList.append(55);
        System.out.println("");

        linkedList.stampaDellaLista();

        linkedList.push(50);
        System.out.println("");

        linkedList.stampaDellaLista();

        linkedList.pop();
        System.out.println("");

        linkedList.stampaDellaLista();

        linkedList.rimuovi(4);
        System.out.println("");

        linkedList.stampaDellaLista();

    }
}