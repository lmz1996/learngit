package day10;

public class Demo_3 {
    /*
     * ��ԇ�} ʹ��һֱ׃���ڿ���̨ݔ��30,20,10
     */
    public static void main(String[] args) {
        TestOuter.TestInner p =new TestOuter.TestInner();
        p.show();
    }

}

class TestOuter {
    private static int num = 10;

   static class TestInner {
        private int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(TestOuter.num);
        }
    }
}
