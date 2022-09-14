public class Mouse1 extends FatherMouse implements Mouse{


    public Mouse1(String type, String model) {
     super(type,model);
    }

    @Override
    public void leftClick() {
        System.out.println("leftclick");
    }

    @Override
    public void rightClick() {
        System.out.println("rightclick");
    }
}
