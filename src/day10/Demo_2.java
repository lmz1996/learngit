package day10;

public class Demo_2 {
    /*
     * �o�B�Ȳ�Č����Űl :  �ⲿ����.�ڲ����� ������ = �ⲿ����.�ڲ������
     * ����˼ά Outer.Inner oi = Outer.new Inner();
     * ������Ҫд�� Outer.Inner oi = new Outer.Inner();
     */
    public static void main(String[] args) {
        //�o�B�Ȳ��
        Outer1.Inner1 oi = new Outer1.Inner1();
        oi.show();
        //�o�B�Ȳ���е��o�B����
        Outer1.Inner1.print();
    }

}
class Outer1 {
    static class Inner1 {
        public void show() {
            System.out.println("չʾ");
        }
        
        public static void print() {
            System.out.println("��ӡ");
        }
    }
    
}
