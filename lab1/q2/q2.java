package lab1.q2;

class Mother {
    int x;
    void show() {
        System.out.println("Hello World from Mother class");
    }
}

class Child extends Mother {
    void show() {
        System.out.println("Hello JUET from Child class");
    }
}

class q2 {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 
        lab1.q2.Child ch = new lab1.q2.Child();
        ch.show(); 
    }
}