package day16;

public class Tool<Q> {
    // ��ķ���һ�㶼��һ����ĸ��E����elementԪ��T����type����Ȼ������Լ�����û�����⺬���
    private Q q;

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

    public void show(Q q) { // ��һ��������ĕr��ͽo�Q�xֵ��,���Է���������ø�ķ���һ��
        System.out.println(q);
    }

    public<T> void print(T t){//�������һ�¿����Լ����x�Լ������ķ���
        System.out.println(t);//�Լ��ķ������巺�ͣ��൱�ڷ���ӵ�����Լ��ķ���
    }
    public static<Q> void show1(Q q){//��̬�������������Լ��ķ��ͣ���Ϊ��ķ��������Ŵ�������ű���ֵ��
        System.out.println(q);//��̬�����Ǳ���ʱ��Ҫ�е����Բ�����Ҫ�Լ����巺��
    }
}
