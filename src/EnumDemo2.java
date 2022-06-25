enum Apple{
    Jonathan,GoldenDel,RedDel,Winesap,Cortland;
}

public class EnumDemo2 { public static void main(String args[]) {
    Apple ap;
    System.out.println("Перечисление констант");

    Apple allaples [] = Apple.values();
    for (Apple a: allaples){
        System.out.println(a);
    }
    System.out.println();
    ap = Apple.valueOf("Winesap");
    System.out.println("Содержит константу "+ ap);
}
}
