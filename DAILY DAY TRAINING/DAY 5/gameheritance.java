class thatha{
    int balance = 10000;
    void identify(){
        System.out.println("I am your thatha, my balance is: " + balance);
    }
}

class appa extends thatha{
    int balance = 5000;
    void identify(){
        System.out.println("I am your appa, my balance is: " + balance);
    }
}

class chithappa extends thatha{
    int balance = 2000;
    void identify(){
        System.out.println("I am your chithappa, my balance is: " + balance);
    }
}

class myself extends appa{
    int balance = 1000;
    void identify(){
        System.out.println("I am myself, my balance is: " + balance);
    }
}

class cousin extends chithappa{
    int balance = 500;
    void identify(){
        System.out.println("I am your cousin, my balance is: " + balance);
    }
}

class periappa extends thatha{
    int balance = 8000;
    void identify(){
        System.out.println("I am your periappa, my balance is: " + balance);
    }
}




public class gameheritance {
    public static void main(String[] args) {
        thatha t = new thatha();
        appa a = new appa();
        chithappa c = new chithappa();
        myself m = new myself();
        cousin co = new cousin();
        periappa p = new periappa();

        t.identify();
        a.identify();
        c.identify();
        m.identify();
        co.identify();
        p.identify();
        
    }
}
