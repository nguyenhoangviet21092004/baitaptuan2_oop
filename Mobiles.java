package baitaptuan2;

public abstract class Mobiles {
    abstract void downloadApp();
}

class Iphone extends Mobiles{
    @Override
    void downloadApp() {
        System.out.println("Iphone");
    }
}

class Nokias extends Mobiles{
    @Override
    void downloadApp() {
        System.out.println("Nokia");
    }
}

class TestMobiles{
    public static void main(String[] args) {
        Nokias nokias = new Nokias();
        Iphone iphone = new Iphone();

        nokias.downloadApp();
        iphone.downloadApp();
    }
}