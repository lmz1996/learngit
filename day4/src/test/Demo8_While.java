package test;

public class Demo8_While {
/*
 * A:���˼��
    * ��1-100֮��
* B:ͳ��˼��
    * ͳ�ơ�ˮ�ɻ��������ж��ٸ�
 */
    public static void main(String[] args) {
        // ���˼��
        // getSum();
        // ͳ��˼��
        int count = 0;
        int i = 100;// ��Ϊˮ�ɻ���3λ�����Գ�ʼ����100
        while (i <= 999) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
            i++;
        }
        System.out.println(count);

    }

    private static void getSum() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;// sum = sum +i;
            i++;
        }
        System.out.println(sum);
    }

}
