package day07.inherit;

public class Mage extends Player {


    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }


    // 썬더볼트
    public void thunderBolt(Player... target) {
        System.out.println(this.nickName + "님 썬더볼트 시전\n===================================");
        for (Player player : target) {
            if (!this.nickName.equals(player.nickName)) {
                int damage = (int) (Math.random() * 6 + 10);
                System.out.println(player.nickName + "님이 " + damage + "피해를 입었습니다.(남은 체력 :" + (player.hp - damage) + ")");
            }
        }


    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana = " + this.mana);
    }
}
