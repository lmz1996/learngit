package day8;

public class Demo1 {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println("=================");
        Student stu1 = new Student();
        
    }
}

// ���췽����:ÿ������һ�ζ���ͻ�ִ��һ��,�����ڹ��캯��ִ��
class Student {
    {
        show("����");
    }
//������ļ��ض����أ���ִֻ��һ��
//����:����������г�ʼ����,һ��������������
//������������ִ��
static {
        show("��̬");
}

    private static void show(String a) {
        System.out.println("����" + a + "�����");
    }
}
