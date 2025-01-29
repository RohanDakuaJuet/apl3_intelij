//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int val = Integer.parseInt(args[0]) ;
        for (int i = 1; i <= 10; i++) {
            System.out.println(val + " x " +i+" = " + val*i);
        }
    }
}