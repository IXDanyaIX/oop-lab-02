package org.laba;

public class Hero {

    private String name;
    private int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }


    public void sayHello(String message) {
        System.out.println(name + ": " + message);
    }

    public void showLevel() {
        System.out.println(name + " имеет уровень " + level);
    }

    public void addExperience(int experience) {
        System.out.println(name + " получил " + experience + " опыта");
    }


    @Repeat(2)
    protected void attack(String enemy) {
        System.out.println(name + " атакует " + enemy);
    }


    protected void heal(int points, String source) {
        System.out.println(
                name + " восстанавливает " + points +
                        " HP с помощью " + source
        );
    }

    protected void useSkill(String skill, int mana, double power) {
        System.out.println(
                name + " использует " + skill +
                        ", мана: " + mana +
                        ", сила: " + power
        );
    }

    @Repeat(3)
    private void takeDamage(int damage) {
        System.out.println(name + " получил " + damage + " урона");
    }


    private void changeName(String newName, String reason) {
        System.out.println(
                "Имя героя изменено на " + newName +
                        ". Причина: " + reason
        );
    }


    private void restoreMana(int amount) {
        System.out.println(name + " восстановил " + amount + " маны");
    }
}

