package test;

public class Demo16_test {
/*
 * * A:��ϰ��,��ȫ����ﵽĿ��
        �����ڿ���̨���2��:��Java�����ࡰ
        �����ڿ���̨���7��:��Java�����ࡰ
        �����ڿ���̨���13��:��Java�����ࡰ   
 */
    public static void main(String[] args) {
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
                //�ڴ˴���д����
//                break;   //�����ڿ���̨���2��:��Java�����ࡰ
//                continue;//�����ڿ���̨���7��:��Java�����ࡰ
                System.out.println("Java������");
            }
            System.out.println("Java������");  //�����ڿ���̨���13��:��Java�����ࡰ 
        }

    }

}
