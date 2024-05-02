package com.company.project.lesson06.lesson08;
/*
прежде, чем наследоваться нам нужно будет импортировать Unit, если они будут
в разных пакетах.
BattleUnit получает в наследство все что у Unit есть,
т.е. тут фактически есть healthPoint и speedPoint.
 */
public class BattleUnit extends Unit {
    // healthPoint можно менять только в методе rest и attack
    private int attackPoint; // обязательное свойство, должно быть доступно для чтения,
    // вне unit иерархии не меняется
public BattleUnit(int attackPoint, int healthPoint, int speedPoint) {
    // super(7,34); //вызов конструктора родителя
    super(healthPoint, speedPoint);
    this.attackPoint=attackPoint;
}


    public int getAttackPoint() {
        return attackPoint;
    }


    // переопределить метод родителя
    // можно понижать тип данных возвращаемого значения
    // можно повышать модификатор доступа (например, было private стало public), понижать нельзя

    /*
    Аннотация @Override используется в Java для указания того, что поданнотированный метод является
    переопределенным методом из суперкласса. Это служит предупреждением для компилятора,
    чтобы он проверил, является ли этот метод действительно переопределением.
    Если без override, то можно метод неправильно назвать или передать какие-то аргументы, но тогда это уже
    не переопределение, тогда у battleUnit метод rest как был с увеличением на 1 так и останется
    а это получится новый метод.
    с override можно легко исправить ошибки переопределения
     */



//текущий юнит атакует другого юнита и он атакует в ответ.
    //метод атаки
    public void attack(BattleUnit unit) {
        if (getSpeedPoint()< unit.getSpeedPoint()) {
            unit.attack(this);
        }
    }


    public void attack(Unit unit) {}



@Override
    public void rest() {
        if (healthPoint > 0 && healthPoint<initialHealthPoint) {
            healthPoint+=2;
    }
}
}

/*
Методы, переопределенные методы, getter, setter, конструкторы и т.д. можно объявлять в любой последовательности.
Но принято:
1. свойства 2. конструкторы (чем больше аргументов, тем ниже находится)
3. сеттеры и геттеры 4. собственные методы (без override)
5. переопределенные методы
 */