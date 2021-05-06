package classTest;

public class screenshot {
    Object mess1(){
        return "hello";
    }

    public static void main(String[] args) {

        //  TakeScreenshot sk = (TakeScreenshot)Web.getDriver;
        //  File source = sk.getScreenshotAs(OutputType.FILE);
        //  FileUtils.copyFile(source , new File ("./Screenshots/pageName.png"));

       ///String mess = "Hello";
        System.out.print(new screenshot().mess1());
        System.out.print(new Main2().mass2());
        System.out.println();

    }

}
class Main2 extends screenshot {
    String mass2(){
        return "world!";
    }
}
