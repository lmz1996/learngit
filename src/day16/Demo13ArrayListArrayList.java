package day16;

import java.util.ArrayList;

public class Demo13ArrayListArrayList {
//����Ƕ��֮ArrayListǶ��ArrayList
    /*
     * ����:
     * ����ѧ�ƣ�Ȼ��ѧ���зֳ����ɸ��༶
     * ����ѧ����һ����ļ��ϣ����ɸ��༶�ֳ�ÿһ��С���ϣ�С������������
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list = new ArrayList<>();
        ArrayList<Person> firstClass = new ArrayList<Person>();//������һ���༶
        //���༶�������
        firstClass.add(new Person("����",20));
        firstClass.add(new Person("����",21));
        firstClass.add(new Person("����",22));
        ArrayList<Person> secondClass = new ArrayList<Person>();
        secondClass.add(new Person("�ŷ�",20));
        secondClass.add(new Person("����",21));
        secondClass.add(new Person("����",22));
        //���༶��ӵ�ѧ�Ƶļ�����
        list.add(firstClass);
        list.add(secondClass);
        //����ѧ�Ƽ���
        for(ArrayList<Person> classGroup:list){
            //�����༶
            for(Person people:classGroup){
               System.out.println(people); 
            }
        }
    }

}
