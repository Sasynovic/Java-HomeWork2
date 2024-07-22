public class main {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int z = 4;

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

        System.out.println("\nCon append aggiungo un elemento alla fine della lista\n");

        linkedList.append(100);
        System.out.println("");

        linkedList.stampaDellaLista();

        System.out.println("\nCon il metodo di inserimento aggiungo un elemento in base al critario compareTo\n");
        linkedList.metodoInserimento(1000);
        System.out.println("");

        linkedList.stampaDellaLista();

        System.out.println("\nCon push aggiungo un elemento in testa alla lista\n");
        linkedList.push(10000);
        System.out.println("");

        linkedList.stampaDellaLista();

        System.out.println("\ncon pop rimuovo l'elemento in testa alla lista\n");
        linkedList.pop();
        System.out.println("");

        linkedList.stampaDellaLista();

        System.out.println("\ncon rimuovi rimuovo l'elemento che ha il valore passato come parametro\n");
        linkedList.rimuovi(3);
        System.out.println("");

        linkedList.stampaDellaLista();



    }
}