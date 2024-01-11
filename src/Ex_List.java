import java.util.LinkedList;

public class Ex_List {
    void explain(){
        //general data control
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list); //[] toString이 오버라이딩 되어있음
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); //1,2,3 list는 순서가 중요

        //1과 2사이에 값 추가
        list.add(1,5); //인덱스 1번째 앞에 5추가
        System.out.println(list); //1,5,2,3

        //인덱스 2번째를 삭제하고 싶다
        list.remove(2);
        System.out.println(list); //1,5,3

        //3이란 값을 꺼내오고 싶다
        list.get(2); //인덱스로 값을 가져옴
        System.out.println(list); //1,5,3

        //class data Control
        LinkedList<MyList> ml = new LinkedList<>();
        ml.add(new MyList().create(34));
        ml.add(new MyList().create(12));
        ml.add(new MyList().create(54));

        for(MyList m : ml){
            System.out.println(m.getNumber());
        }

        System.out.println("--- remove 1 ---");

        ml.remove(new MyList().create(34));
        System.out.println("--- remove 2 ---");
        ml.contains(new MyList().create(34));
        ml.indexOf(new MyList().create(34));
        //ml.contains(new MyList().create(34));

        for(MyList m : ml){
            //System.out.println(m.getNumber());
        }

        ml.stream().forEach(System.out::println);  //toString() 오버라이딩 사용
    }

    class MyList{

        int number;

        public MyList create(int num){
            this.number = num;
            System.out.println("---- create ----");
            return this;
        }

        public int getNumber(){
            return number;
        }

        public boolean equals(Object o1){
            System.out.println("--- equals ---");
            if(o1 instanceof MyList){
                MyList m1 = (MyList) o1;

                return this.getNumber() == m1.getNumber();
            }

            return false;
        }

        public String toString(){
            return "value:" + this.number;
        }
    }

}

