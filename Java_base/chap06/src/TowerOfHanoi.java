public class TowerOfHanoi {
    public static void main(String[] args) {
        HanoiFunc obj = new HanoiFunc();
        obj.Hanoi(5, 'A', 'B', 'C');
    }
}

class HanoiFunc {

    int count = 0;

    /**
     * move方法将某一个盘子从一个位置(pos1)移动到另一个位置(pos2).
     * 
     * @param disk 盘子编号
     * @param pos1 从pos1
     * @param pos2 移动至pos2
     */
    public void move(int disk, char pos1, char pos2) {
        count++;
        System.out.println("第" + count + "次移动\t" + "盘子" + disk + " " + pos1 + "-->" + pos2);
    }

    /**
     * Hanoi方法表示将num个盘子从A柱子借助B柱子移动到C柱子.
     * Hanoi方法采用了递归思想:
     * 当num == 1时，将盘子直接从A柱移动到C柱.
     * 当num > 1时，可拆分成3个步骤：
     * 1. 将前num-1个盘子按顺序从A柱子借助C柱子移动到B柱子.
     * 2. 将最底下的盘子从A柱子移动到C柱子.
     * 3. 将前num-1个盘子从从B柱子借助A柱子移动到C柱子.
     * 
     * @param num 盘子个数
     * @param a A柱子
     * @param b B柱子
     * @param c C柱子
     */
    public void Hanoi(int num, char a, char b, char c) {

        if(num == 1) {
            move(num, a, c);
        } else {
            Hanoi(num - 1, a, c, b);
            move(num, a, c);
            Hanoi(num - 1, b, a, c);
        }

    }
}
