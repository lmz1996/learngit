package test;

public class Demo6 {
    /*
     * ����ͳ�ơ�ˮ�ɻ��������ж��ٸ�
     * ����:
     * 1:��Ҫ��һ��������¼ˮ�ɻ��ĸ���
     * 2:��ȡ�����е�3λ��
     * 3:�ж��Ƿ�����ˮ�ɻ���
     * 4:����������������ͼ�һ
     */
    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
        }
        System.out.println(count);
    }

}
