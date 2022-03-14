public class MyException extends Exception {

    String message;
    Main m = new Main();

    public MyException(String message) {
        this.message = message;
    }

    public void errMessage() {
        System.out.println(this.message);
    }
}
