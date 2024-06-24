package ClassStart2;

public class Memo {
    public static void main(String[] args) {


    Momo menu1 = new Momo();
    menu1.age = 3;
    menu1.name= "클래식";
    menu1.food= "사과";

    Momo menu2 = new Momo();
    menu2.age= 5;
    menu2.name="스텔라";
    menu2.food="피자";

    Momo[] menus = new Momo[]{menu1,menu2};


    for (int i = 0; i <menus.length; i++){
        Momo m = menus[i];
        System.out.println("이름 : "+m.name + "  나이 : " + m.age + " 음식 : " + m.food ) ;
    }
    for (Momo m : menus) {
        System.out.println("이름 : "+m.name + "  나이 : " + m.age + " 음식 : " + m.food);
    }
}
}