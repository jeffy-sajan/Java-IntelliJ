interface Configurable {
    void configure();
}

abstract class Plugin {
    abstract void execute();
}

class MyPlugin extends Plugin implements Configurable {
    public void configure() {
        System.out.println("Configuring plugin...");
    }
    public void execute() {
        System.out.println("Executing plugin...");
    }
}

public class PluginSystem {
    public static void main(String[] args) {
        MyPlugin plugin = new MyPlugin();
        plugin.configure();
        plugin.execute();
    }
}
