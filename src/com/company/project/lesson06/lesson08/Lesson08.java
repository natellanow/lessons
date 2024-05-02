package com.company.project.lesson06.lesson08;
/*
такая ситуация может быть, что в родительском классе нет конструктора без параметров, а в дочернем классе
есть конструктор с параметрами
 */

public class Lesson08 {
    public static void main(String[] args) {
        Unit unit = new Unit(22);
        unit.rest();

        BattleUnit battleUnit01 = new BattleUnit(10, 13, 20);
        battleUnit01.rest();

        BattleUnit battleUnit02 = new BattleUnit(10, 13, 20);
        battleUnit02.rest();

        battleUnit01.attack(unit); // при вызове мы можем передать указанный тип и все его подтипы, но внутри метода нам доступен функционал того юнита который указан
        battleUnit01.attack(battleUnit02); // тип unit является супертипом для battleUnit
        battleUnit01.attack(battleUnit01);

        /*
        массив заполненный null, каких юнитов можем добавить?
         */
        BattleUnit[] battleUnits = new BattleUnit[3];
        battleUnits[0] = battleUnit01;
        battleUnits[1] = battleUnit02;
        /*for (BattleUnit battleUnit : battleUnits) {
            battleUnit.attack(unit);
        }
         */
        Unit[] units = new Unit[3]; // можем добавить всех
        units[0] = unit;
        units[1] = battleUnit01;
        units[2] = battleUnit02;

        for (Unit unitElem : units) {
            unitElem.rest(); //можно вызвать


        }
    }
}
