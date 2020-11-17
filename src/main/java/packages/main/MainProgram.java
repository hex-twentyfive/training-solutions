package packages.main;



public class MainProgram {
    public static void main(String[] args) {
        greetings.Greeter transferGreeter = new greetings.Greeter();
        transferGreeter.sayHello();     // vagy
        new greetings.Greeter().sayHello();
    }
}

