/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.lesson10.composite;

/**
 *
 * @author Andrey
 */
public class MenuTestDrive {

        public static void main(String args[]) {
                MenuComponent pancakeHouseMenu
                        = new Menu("БИННОЕ МЕНЮ", "Завтрак");
                MenuComponent dinerMenu
                        = new Menu("ОБЕДНЕЕ МЕНЮ", "Обед");
                MenuComponent cafeMenu
                        = new Menu("ВЕЧЕРНЕЕ МЕНЮ", "Ужин");
                MenuComponent dessertMenu
                        = new Menu("ДЕСЕРТНОЕ МЕНЮ", "Конечно же десерт!");
                MenuComponent coffeeMenu = new Menu("КОФЕЙНОЕ МЕНЮ", "Пора выпить кофе");

                MenuComponent allMenus = new Menu("ВСЕ МЕНЮ", "Все меню смешанные");

                allMenus.add(pancakeHouseMenu);
                allMenus.add(dinerMenu);
                allMenus.add(cafeMenu);

                pancakeHouseMenu.add(new MenuItem(
                        "K&B завтрак",
                        "Блинчики с яичницей и тостами",
                        true,
                        2.99));
                pancakeHouseMenu.add(new MenuItem(
                        "Обычный завтрак",
                        "Блинчики с яичницей, колбасой",
                        false,
                        2.99));
                pancakeHouseMenu.add(new MenuItem(
                        "Блины с черникой",
                        "Блины, приготовленные из свежей черники и голубичного сиропа",
                        true,
                        3.49));
                pancakeHouseMenu.add(new MenuItem(
                        "Вафли",
                        "Вафли, с выбором: голубика или клубника",
                        true,
                        3.59));

                dinerMenu.add(new MenuItem(
                        "Вегетарианский завтраак",
                        "Бекон с листьями салата и помидорами на цельной пшенице",
                        true,
                        2.99));
                dinerMenu.add(new MenuItem(
                        "Суп дня",
                        "Тарелка супа дня, со порцией картофельного салата",
                        false,
                        3.29));
                dinerMenu.add(new MenuItem(
                        "Хот-дог",
                        "Хот-дог, с квашеной капустой, приправленный луком, покрытый сыром",
                        false,
                        3.05));
                dinerMenu.add(new MenuItem(
                        "Вареные овощи и коричневый рис",
                        "Вареные овощи и коричневый рис",
                        true,
                        3.99));

                dinerMenu.add(new MenuItem(
                        "Паста",
                        "Спагетти с соусом Маринара и кусочек хлеба закваски",
                        true,
                        3.89));

                dinerMenu.add(dessertMenu);

                dessertMenu.add(new MenuItem(
                        "Яблочный пирог",
                        "Яблочный пирог с хрустящей корочкой, покрытый ванильным мороженым",
                        true,
                        1.59));

                dessertMenu.add(new MenuItem(
                        "Чизкейк",
                        "Сливочный Нью-йоркский чизкейк с шоколадной коркой",
                        true,
                        1.99));
                dessertMenu.add(new MenuItem(
                        "Фруктовое мороженое",
                        "Мус из малины и ложки лайма",
                        true,
                        1.89));

                cafeMenu.add(new MenuItem(
                        "Вегета",
                        "Булочка с вегетами на цельной пшеничной булочке, салатом, помидором и картофелем фри",
                        true,
                        3.99));
                cafeMenu.add(new MenuItem(
                        "Суп дня",
                        "Чашка супа, с порцией салата",
                        false,
                        3.69));
                cafeMenu.add(new MenuItem(
                        "Буррито",
                        "Большой буррито с целыми бобами, сальсой, гуакамоле",
                        true,
                        4.29));

                cafeMenu.add(coffeeMenu);

                coffeeMenu.add(new MenuItem(
                        "Кофейный торт",
                        "Торт с корицей и грецкими орехами",
                        true,
                        1.59));
                coffeeMenu.add(new MenuItem(
                        "Рогалик",
                        "Рогалик с начинкой включающей кунжут, мак, коричный изюм, тыкву",
                        false,
                        0.69));
                coffeeMenu.add(new MenuItem(
                        "Бискотти",
                        "Три миндальных или лесных орехов в  бисквите",
                        true,
                        0.89));

                
                allMenus.print();
        }
}
