/*
   Упражнение 3.1.
   Простая справочная система 
   Sorokoumov
*/
class Help1 {
    public static void main(String[] args)
            throws java.io.IOException { 

        char choice;

        System.out.println("Справка:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.print("Выберите: ");
        choice = (char) System.in.read(); 

        System.out.println("\n"); //пустая строка для читаемости 

        switch (choice) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else интсрукция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("  case константа:");
                System.out.println("    последовательность Инструкций");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Вариант не найден.");
        }
    }
}
