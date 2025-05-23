/*
   Упражнение 3.2.
   Улучшенная справочная система по управляющим операторам Java,
   в которой используется цикл do-while для обработки выбора
   варианта в меню.
   Sorokoumov
*/
class Help2 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;

        do {
            System.out.println("Справка по:");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3. for");
            System.out.println("  4. while");
            System.out.println("  5. do-while\n");
            System.out.print("Выберите вариант: ");

            choice = (char) System.in.read();

            
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choice < '1' | choice > '5'); 
              
        System.out.println("\n");  //пустая строка для читаемости 

        switch (choice) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) Инструкция ;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Инструкция  switch:\n");
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
                System.out.println(" Инструкция ;");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) Инструкция ;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println("  Инструкция ;");
                System.out.println("} while (условие);");
                break;
            
        }
    }
}
