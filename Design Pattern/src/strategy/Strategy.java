package strategy;

public class Strategy {

    public ClassSelector getInstance() {
        final boolean isWin = System.getProperty("os.name").startsWith(
                "Windows");
        final boolean isMac = System.getProperty("os.name").startsWith("Mac");
        final boolean isLinux = System.getProperty("os.name").startsWith(
                "Linux");

        if (isWin) {
            return new WinImpl();
        } else if (isMac) {
            return new MacImpl();
        } else if (isLinux) {
            return new LinuxImpl();
        } else {
            System.out.println("OS nicht feststellbar");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("- " + System.getProperty("os.name"));
        System.out.println("--------------------------------------");
        Strategy str = new Strategy();
        ClassSelector inter = str.getInstance();
        inter.printOS();
    }
}

//class WinImpl implements ClassSelector {
//
//    public void printOS() {
//        System.out.println("Windows");
//    }
//}
//
//class MacImpl implements ClassSelector {
//
//    public void printOS() {
//        System.out.println("Mac OS X");
//    }
//}
//
//class LinuxImpl implements ClassSelector {
//
//    public void printOS() {
//        System.out.println("Linux");
//    }
//}
//
//interface ClassSelector {
//
//    public void printOS();
//}
