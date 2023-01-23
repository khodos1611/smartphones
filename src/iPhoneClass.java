public class iPhoneClass implements Smartphones, iOS{
    public iPhoneClass() {
        call();
        sms();
        internet();
    }

    @Override
    public void call() {
        System.out.println("iOS call");
    }

    @Override
    public void sms() {
        System.out.println("iOS sms");
    }

    @Override
    public void internet() {
        System.out.println("iOS internet");
    }

    @Override
    public String systemInfo() {
        return "iOS system";
    }
}
