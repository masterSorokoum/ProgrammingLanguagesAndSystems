/*
   Упражнение 4.1.
   Преобразование справочной системы из упражнения 3.3 в класс Help.
   Sorokoumov
*/

class Help {
    void helpOn(int what) {
        switch (what) {
            case '1':
                System.out.println("Иснструкция if:\n");
                System.out.println("if(условие) Иснструкция;");
                System.out.println("else Иснструкция;");
                break;
            case '2':
                System.out.println("Традиционная Иснструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("  case константа:");
                System.out.println("    последовательность Иснструкций");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" Иснструкция;");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) Иснструкция;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println("  Иснструкция;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Иснструкция break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Иснструкция continue:\n");
                System.out.println("continue; или continue метка;");
                break;
            
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Справка по:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");
        System.out.println("  6. break");
        System.out.println("  7. continue\n");
        System.out.print("Выберите вариант (или q для завершения): ");
    }

    boolean isValid(int ch) {
       
        if ((ch >= '1' & ch <= '7') | ch == 'q')
            return true;
        else
            return false;
    }
}


class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;
        Help hlpobj = new Help(); 

        for (;;) {
            do {
                hlpobj.showMenu(); 

                choice = (char) System.in.read();

                
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpobj.isValid(choice)); 

            if (choice == 'q')
                break; 

            System.out.println("\n");

            hlpobj.helpOn(choice); 
        }
    }
}
