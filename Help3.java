/*
   Упражнение 3.3.
   Законченная справочная система по операторам Java,
   позволяющая обрабатывать множество запросов.
   Sorokoumov
*/
class Help3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;

        for (;;) {
            do {
                System.out.println("Справка по:");
                System.out.println("  1. if");
                System.out.println("  2. switch");
                System.out.println("  3. for");
                System.out.println("  4. while");
                System.out.println("  5. do-while");
                System.out.println("  6. break");
                System.out.println("  7. continue\n");
                System.out.print("Выберите вариант (или q для завершения): ");

                choice = (char) System.in.read();

              
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choice < '1' | choice > '7' & choice != 'q'); 
                                                                   

            if (choice == 'q')
                break; 

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) Инструкция;");
                    System.out.println("else Инструкция;");
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
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.print("for(инициализация; условие; итерация)");
                    System.out.println(" Инструкция;");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while(условие) Инструкция;");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n");
                    System.out.println("do {");
                    System.out.println("  Инструкция;");
                    System.out.println("} while (условие);");
                    break;
                case '6':
                    System.out.println("Инструкция break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("Инструкция continue:\n");
                    System.out.println("continue; или continue метка;");
                    break;
            }
            System.out.println(); 
        }
    }
}
