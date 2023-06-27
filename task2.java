// 2) К калькулятору из предыдущего ДЗ добавить логирование.
    public static void task2() {
        StringBuilder strbld = new StringBuilder();

        System.out.print("Введите первое число: ");
        String str_a = scaner.nextLine();
        double a = Double.parseDouble(str_a);

        System.out.print("Введите оператор: ");
        String op = scaner.nextLine();

        System.out.print("Введите второе число: ");
        String str_b = scaner.nextLine();
        double b = Double.parseDouble(str_b);

        double res = 0;

        strbld.append(str_a)
              .append(op)
              .append(str_b)
              .append("=");

        if (op.equals("+")) {
            res = a + b;
            strbld.append(res);
            logger.info(strbld.toString());
        }
        else if (op.equals("-")) {
            res = a - b;
            strbld.append(res);
            logger.info(strbld.toString());
        }
        else if (op.equals("*")) {
            res = a * b;
            strbld.append(res);
            logger.info(strbld.toString());
        }
        else if (op.equals("/")) {
            res = a / b;
            strbld.append(res);
            logger.info(strbld.toString());
        }
        else {
            logger.log(Level.WARNING, "unsupported operator " + op);
        }
        strbld.delete(0, strbld.length());
    }
}