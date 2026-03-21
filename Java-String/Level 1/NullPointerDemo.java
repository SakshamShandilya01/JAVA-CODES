class NullPointerDemo {

    static void handle() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}