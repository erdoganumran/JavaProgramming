package Day45_Exceptions;

public class CheckedVSUncheckedException {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
