public class MainApp {

    public static void main(String[] args) {

        AndroidClass androidCell = new AndroidClass();
        iPhoneClass iPhoneCell = new iPhoneClass();

        System.out.println(androidCell.systemInfo());
        System.out.println(iPhoneCell.systemInfo());

    }


}
