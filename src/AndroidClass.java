public class AndroidClass implements Smartphones,LinuxOS{
    public AndroidClass() {
        call();
        sms();
        internet();
    }

    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }

    @Override
    public String systemInfo() {
        return "Linux OS";
    }
}
